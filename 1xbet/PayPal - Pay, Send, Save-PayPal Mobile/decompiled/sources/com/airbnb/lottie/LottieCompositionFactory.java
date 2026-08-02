package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class LottieCompositionFactory {
    private static final java.util.Map<java.lang.String, com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition>> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    private static final java.util.Set<com.airbnb.lottie.LottieTaskIdleListener> getHighSpeedVideoFpsRanges = new java.util.HashSet();
    private static final byte[] getHighSpeedVideoSizes = {80, 75, 3, 4};
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {com.google.common.base.Ascii.US, -117, 8};

    private LottieCompositionFactory() {
    }

    public static void setMaxCacheSize(int i) {
        com.airbnb.lottie.model.LottieCompositionCache.getInstance().resize(i);
    }

    public static void clearCache(android.content.Context context) {
        clearCache(context, true);
    }

    public static void clearCache(android.content.Context context, boolean z) {
        com.airbnb.lottie.network.NetworkCache networkCache;
        getHighSpeedVideoFpsRangesFor.clear();
        com.airbnb.lottie.model.LottieCompositionCache.getInstance().clear();
        if (!z || (networkCache = com.airbnb.lottie.L.networkCache(context)) == null) {
            return;
        }
        networkCache.clear();
    }

    public static void registerLottieTaskIdleListener(com.airbnb.lottie.LottieTaskIdleListener lottieTaskIdleListener) {
        getHighSpeedVideoFpsRanges.add(lottieTaskIdleListener);
        lottieTaskIdleListener.onIdleChanged(getHighSpeedVideoFpsRangesFor.size() == 0);
    }

    public static void unregisterLottieTaskIdleListener(com.airbnb.lottie.LottieTaskIdleListener lottieTaskIdleListener) {
        getHighSpeedVideoFpsRanges.remove(lottieTaskIdleListener);
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromUrl(android.content.Context context, java.lang.String str) {
        return fromUrl(context, str, "url_".concat(java.lang.String.valueOf(str)));
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromUrl(final android.content.Context context, final java.lang.String str, final java.lang.String str2) {
        return getHighSpeedVideoFpsRangesFor(str2, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda14
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.airbnb.lottie.LottieCompositionFactory.getHighSpeedVideoSizes(context, str, str2);
            }
        }, (java.lang.Runnable) null);
    }

    static /* synthetic */ com.airbnb.lottie.LottieResult getHighSpeedVideoSizes(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fetchSync = com.airbnb.lottie.L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && fetchSync.getValue() != null) {
            com.airbnb.lottie.model.LottieCompositionCache.getInstance().put(str2, fetchSync.getValue());
        }
        return fetchSync;
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromUrlSync(android.content.Context context, java.lang.String str) {
        return fromUrlSync(context, str, str);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromUrlSync(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.airbnb.lottie.LottieComposition lottieComposition = str2 == null ? null : com.airbnb.lottie.model.LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new com.airbnb.lottie.LottieResult<>(lottieComposition);
        }
        com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fetchSync = com.airbnb.lottie.L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && fetchSync.getValue() != null) {
            com.airbnb.lottie.model.LottieCompositionCache.getInstance().put(str2, fetchSync.getValue());
        }
        return fetchSync;
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromAsset(android.content.Context context, java.lang.String str) {
        return fromAsset(context, str, "asset_".concat(java.lang.String.valueOf(str)));
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromAsset(android.content.Context context, final java.lang.String str, final java.lang.String str2) {
        final android.content.Context applicationContext = context.getApplicationContext();
        return getHighSpeedVideoFpsRangesFor(str2, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda5
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromAssetSync;
                fromAssetSync = com.airbnb.lottie.LottieCompositionFactory.fromAssetSync(applicationContext, str, str2);
                return fromAssetSync;
            }
        }, (java.lang.Runnable) null);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromAssetSync(android.content.Context context, java.lang.String str) {
        return fromAssetSync(context, str, "asset_".concat(java.lang.String.valueOf(str)));
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromAssetSync(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.airbnb.lottie.LottieComposition lottieComposition = str2 == null ? null : com.airbnb.lottie.model.LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new com.airbnb.lottie.LottieResult<>(lottieComposition);
        }
        try {
            return fromInputStreamSync(context, context.getAssets().open(str), str2);
        } catch (java.io.IOException e) {
            return new com.airbnb.lottie.LottieResult<>((java.lang.Throwable) e);
        }
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromInputStream(android.content.Context context, final java.io.InputStream inputStream, final java.lang.String str) {
        final android.content.Context applicationContext = context == null ? null : context.getApplicationContext();
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda15
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromInputStreamSync;
                fromInputStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromInputStreamSync(applicationContext, inputStream, str);
                return fromInputStreamSync;
            }
        }, (java.lang.Runnable) null);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromInputStreamSync(android.content.Context context, java.io.InputStream inputStream, java.lang.String str) {
        com.airbnb.lottie.LottieComposition lottieComposition = str == null ? null : com.airbnb.lottie.model.LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new com.airbnb.lottie.LottieResult<>(lottieComposition);
        }
        try {
            okio.BufferedSource buffer = okio.Okio.buffer(okio.Okio.source(inputStream));
            if (Camera2StreamConfigurationMap(buffer, getHighSpeedVideoSizes).booleanValue()) {
                return fromZipStreamSync(context, new java.util.zip.ZipInputStream(buffer.inputStream()), str);
            }
            if (Camera2StreamConfigurationMap(buffer, getHighResolutionOutputSizeshNQ4ISI).booleanValue()) {
                return fromJsonInputStreamSync(new java.util.zip.GZIPInputStream(buffer.inputStream()), str);
            }
            return fromJsonReaderSync(com.airbnb.lottie.parser.moshi.JsonReader.of(buffer), str);
        } catch (java.io.IOException e) {
            return new com.airbnb.lottie.LottieResult<>((java.lang.Throwable) e);
        }
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromRawRes(android.content.Context context, int i) {
        return fromRawRes(context, i, Camera2StreamConfigurationMap(context, i));
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromRawRes(android.content.Context context, final int i, final java.lang.String str) {
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        final android.content.Context applicationContext = context.getApplicationContext();
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.airbnb.lottie.LottieCompositionFactory.Camera2StreamConfigurationMap(weakReference, applicationContext, i, str);
            }
        }, (java.lang.Runnable) null);
    }

    static /* synthetic */ com.airbnb.lottie.LottieResult Camera2StreamConfigurationMap(java.lang.ref.WeakReference weakReference, android.content.Context context, int i, java.lang.String str) throws java.lang.Exception {
        android.content.Context context2 = (android.content.Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fromRawResSync(context, i, str);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromRawResSync(android.content.Context context, int i) {
        return fromRawResSync(context, i, Camera2StreamConfigurationMap(context, i));
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromRawResSync(android.content.Context context, int i, java.lang.String str) {
        com.airbnb.lottie.LottieComposition lottieComposition = str == null ? null : com.airbnb.lottie.model.LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new com.airbnb.lottie.LottieResult<>(lottieComposition);
        }
        try {
            okio.BufferedSource buffer = okio.Okio.buffer(okio.Okio.source(context.getResources().openRawResource(i)));
            if (Camera2StreamConfigurationMap(buffer, getHighSpeedVideoSizes).booleanValue()) {
                return fromZipStreamSync(context, new java.util.zip.ZipInputStream(buffer.inputStream()), str);
            }
            if (Camera2StreamConfigurationMap(buffer, getHighResolutionOutputSizeshNQ4ISI).booleanValue()) {
                try {
                    return fromJsonInputStreamSync(new java.util.zip.GZIPInputStream(buffer.inputStream()), str);
                } catch (java.io.IOException e) {
                    return new com.airbnb.lottie.LottieResult<>((java.lang.Throwable) e);
                }
            }
            return fromJsonReaderSync(com.airbnb.lottie.parser.moshi.JsonReader.of(buffer), str);
        } catch (android.content.res.Resources.NotFoundException e2) {
            return new com.airbnb.lottie.LottieResult<>((java.lang.Throwable) e2);
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap(android.content.Context context, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromJsonInputStream(final java.io.InputStream inputStream, final java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda16
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromJsonInputStreamSync;
                fromJsonInputStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str);
                return fromJsonInputStreamSync;
            }
        }, new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.Utils.closeQuietly(inputStream);
            }
        });
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromJsonInputStream(final java.io.InputStream inputStream, final java.lang.String str, final boolean z) {
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda19
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromJsonInputStreamSync;
                fromJsonInputStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str, z);
                return fromJsonInputStreamSync;
            }
        }, new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.LottieCompositionFactory.getHighSpeedVideoFpsRanges(z, inputStream);
            }
        });
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(boolean z, java.io.InputStream inputStream) {
        if (z) {
            com.airbnb.lottie.utils.Utils.closeQuietly(inputStream);
        }
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromJsonInputStreamSync(java.io.InputStream inputStream, java.lang.String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromJsonInputStreamSync(java.io.InputStream inputStream, java.lang.String str, boolean z) {
        return fromJsonSourceSync(okio.Okio.source(inputStream), str, z);
    }

    @java.lang.Deprecated
    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromJson(final org.json.JSONObject jSONObject, final java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda18
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromJsonSync;
                fromJsonSync = com.airbnb.lottie.LottieCompositionFactory.fromJsonSync(jSONObject, str);
                return fromJsonSync;
            }
        }, (java.lang.Runnable) null);
    }

    @java.lang.Deprecated
    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromJsonSync(org.json.JSONObject jSONObject, java.lang.String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromJsonString(final java.lang.String str, final java.lang.String str2) {
        return getHighSpeedVideoFpsRangesFor(str2, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromJsonStringSync;
                fromJsonStringSync = com.airbnb.lottie.LottieCompositionFactory.fromJsonStringSync(str, str2);
                return fromJsonStringSync;
            }
        }, (java.lang.Runnable) null);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromJsonStringSync(java.lang.String str, java.lang.String str2) {
        return fromJsonSourceSync(okio.Okio.source(new java.io.ByteArrayInputStream(str.getBytes())), str2);
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromJsonSource(final okio.Source source, final java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromJsonSourceSync;
                fromJsonSourceSync = com.airbnb.lottie.LottieCompositionFactory.fromJsonSourceSync(okio.Source.this, str);
                return fromJsonSourceSync;
            }
        }, new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.Utils.closeQuietly(okio.Source.this);
            }
        });
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromJsonSourceSync(okio.Source source, java.lang.String str) {
        return fromJsonSourceSync(source, str, true);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromJsonSourceSync(okio.Source source, java.lang.String str, boolean z) {
        return getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader.of(okio.Okio.buffer(source)), str, z);
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromJsonReader(final com.airbnb.lottie.parser.moshi.JsonReader jsonReader, final java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromJsonReaderSync;
                fromJsonReaderSync = com.airbnb.lottie.LottieCompositionFactory.fromJsonReaderSync(com.airbnb.lottie.parser.moshi.JsonReader.this, str);
                return fromJsonReaderSync;
            }
        }, new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.Utils.closeQuietly(com.airbnb.lottie.parser.moshi.JsonReader.this);
            }
        });
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromJsonReaderSync(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, java.lang.String str) {
        return fromJsonReaderSync(jsonReader, str, true);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromJsonReaderSync(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, java.lang.String str, boolean z) {
        return getHighSpeedVideoSizes(jsonReader, str, z);
    }

    private static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, java.lang.String str, boolean z) {
        com.airbnb.lottie.LottieComposition lottieComposition;
        try {
            if (str == null) {
                lottieComposition = null;
            } else {
                try {
                    lottieComposition = com.airbnb.lottie.model.LottieCompositionCache.getInstance().get(str);
                } catch (java.lang.Exception e) {
                    com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> lottieResult = new com.airbnb.lottie.LottieResult<>(e);
                    if (z) {
                        com.airbnb.lottie.utils.Utils.closeQuietly(jsonReader);
                    }
                    return lottieResult;
                }
            }
            if (lottieComposition != null) {
                com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> lottieResult2 = new com.airbnb.lottie.LottieResult<>(lottieComposition);
                if (z) {
                    com.airbnb.lottie.utils.Utils.closeQuietly(jsonReader);
                }
                return lottieResult2;
            }
            com.airbnb.lottie.LottieComposition parse = com.airbnb.lottie.parser.LottieCompositionMoshiParser.parse(jsonReader);
            if (str != null) {
                com.airbnb.lottie.model.LottieCompositionCache.getInstance().put(str, parse);
            }
            com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> lottieResult3 = new com.airbnb.lottie.LottieResult<>(parse);
            if (z) {
                com.airbnb.lottie.utils.Utils.closeQuietly(jsonReader);
            }
            return lottieResult3;
        } catch (java.lang.Throwable th) {
            if (z) {
                com.airbnb.lottie.utils.Utils.closeQuietly(jsonReader);
            }
            throw th;
        }
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromZipStream(java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        return fromZipStream((android.content.Context) null, zipInputStream, str);
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromZipStream(java.util.zip.ZipInputStream zipInputStream, java.lang.String str, boolean z) {
        return fromZipStream(null, zipInputStream, str, z);
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromZipStream(final android.content.Context context, final java.util.zip.ZipInputStream zipInputStream, final java.lang.String str) {
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda6
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromZipStreamSync;
                fromZipStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromZipStreamSync(context, zipInputStream, str);
                return fromZipStreamSync;
            }
        }, new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.Utils.closeQuietly(zipInputStream);
            }
        });
    }

    public static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> fromZipStream(final android.content.Context context, final java.util.zip.ZipInputStream zipInputStream, final java.lang.String str, boolean z) {
        return getHighSpeedVideoFpsRangesFor(str, (java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>>) new java.util.concurrent.Callable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda12
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.airbnb.lottie.LottieResult fromZipStreamSync;
                fromZipStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromZipStreamSync(context, zipInputStream, str);
                return fromZipStreamSync;
            }
        }, z ? new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.Utils.closeQuietly(zipInputStream);
            }
        } : null);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromZipStreamSync(java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        return fromZipStreamSync(zipInputStream, str, true);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromZipStreamSync(java.util.zip.ZipInputStream zipInputStream, java.lang.String str, boolean z) {
        return fromZipStreamSync(null, zipInputStream, str, z);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromZipStreamSync(android.content.Context context, java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        return fromZipStreamSync(context, zipInputStream, str, true);
    }

    public static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromZipStreamSync(android.content.Context context, java.util.zip.ZipInputStream zipInputStream, java.lang.String str, boolean z) {
        try {
            return getHighSpeedVideoSizes(context, zipInputStream, str);
        } finally {
            if (z) {
                com.airbnb.lottie.utils.Utils.closeQuietly(zipInputStream);
            }
        }
    }

    private static com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> getHighSpeedVideoSizes(android.content.Context context, java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        com.airbnb.lottie.LottieComposition lottieComposition;
        com.airbnb.lottie.LottieImageAsset lottieImageAsset;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (str == null) {
            lottieComposition = null;
        } else {
            try {
                lottieComposition = com.airbnb.lottie.model.LottieCompositionCache.getInstance().get(str);
            } catch (java.io.IOException e) {
                return new com.airbnb.lottie.LottieResult<>((java.lang.Throwable) e);
            }
        }
        if (lottieComposition != null) {
            return new com.airbnb.lottie.LottieResult<>(lottieComposition);
        }
        java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
        com.airbnb.lottie.LottieComposition lottieComposition2 = null;
        while (nextEntry != null) {
            java.lang.String name2 = nextEntry.getName();
            if (name2.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                lottieComposition2 = getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader.of(okio.Okio.buffer(okio.Okio.source(zipInputStream))), (java.lang.String) null, false).getValue();
            } else {
                if (!name2.contains(".png") && !name2.contains(".webp") && !name2.contains(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX) && !name2.contains(".jpeg")) {
                    if (!name2.contains(".ttf") && !name2.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    java.lang.String[] split = name2.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    java.lang.String str2 = split[split.length - 1];
                    java.lang.String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Unable to extract font ");
                        sb.append(str3);
                        sb.append(" please pass a non-null Context parameter");
                        return new com.airbnb.lottie.LottieResult<>((java.lang.Throwable) new java.lang.IllegalStateException(sb.toString()));
                    }
                    java.io.File file = new java.io.File(context.getCacheDir(), str2);
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                        try {
                            java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                                fileOutputStream.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    fileOutputStream2.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (java.lang.Throwable th5) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Unable to save font ");
                        sb2.append(str3);
                        sb2.append(" to the temporary file: ");
                        sb2.append(str2);
                        sb2.append(". ");
                        com.airbnb.lottie.utils.Logger.warning(sb2.toString(), th5);
                    }
                    android.graphics.Typeface createFromFile = android.graphics.Typeface.createFromFile(file);
                    if (!file.delete()) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append("Failed to delete temp font file ");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(".");
                        com.airbnb.lottie.utils.Logger.warning(sb3.toString());
                    }
                    hashMap2.put(str3, createFromFile);
                }
                java.lang.String[] split2 = name2.split(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                hashMap.put(split2[split2.length - 1], android.graphics.BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (lottieComposition2 == null) {
            return new com.airbnb.lottie.LottieResult<>((java.lang.Throwable) new java.lang.IllegalArgumentException("Unable to parse composition"));
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry.getKey();
            java.util.Iterator<com.airbnb.lottie.LottieImageAsset> it = lottieComposition2.getImages().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    lottieImageAsset = null;
                    break;
                }
                lottieImageAsset = it.next();
                if (lottieImageAsset.getFileName().equals(str4)) {
                    break;
                }
            }
            if (lottieImageAsset != null) {
                lottieImageAsset.setBitmap(com.airbnb.lottie.utils.Utils.resizeBitmapIfNeeded((android.graphics.Bitmap) entry.getValue(), lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
            }
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z = false;
            for (com.airbnb.lottie.model.Font font : lottieComposition2.getFonts().values()) {
                if (font.getFamily().equals(entry2.getKey())) {
                    font.setTypeface((android.graphics.Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Parsed font for ");
                sb4.append((java.lang.String) entry2.getKey());
                sb4.append(" however it was not found in the animation.");
                com.airbnb.lottie.utils.Logger.warning(sb4.toString());
            }
        }
        if (hashMap.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.airbnb.lottie.LottieImageAsset>> it2 = lottieComposition2.getImages().entrySet().iterator();
            while (it2.hasNext()) {
                com.airbnb.lottie.LottieImageAsset value = it2.next().getValue();
                if (value == null) {
                    return null;
                }
                java.lang.String fileName = value.getFileName();
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = android.util.Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            value.setBitmap(com.airbnb.lottie.utils.Utils.resizeBitmapIfNeeded(decodeByteArray, value.getWidth(), value.getHeight()));
                        }
                    } catch (java.lang.IllegalArgumentException e2) {
                        com.airbnb.lottie.utils.Logger.warning("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            com.airbnb.lottie.model.LottieCompositionCache.getInstance().put(str, lottieComposition2);
        }
        return new com.airbnb.lottie.LottieResult<>(lottieComposition2);
    }

    private static java.lang.Boolean Camera2StreamConfigurationMap(okio.BufferedSource bufferedSource, byte[] bArr) {
        try {
            okio.BufferedSource peek = bufferedSource.peek();
            for (byte b : bArr) {
                if (peek.readByte() != b) {
                    return java.lang.Boolean.FALSE;
                }
            }
            peek.close();
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e) {
            com.airbnb.lottie.utils.Logger.error("Failed to check zip file header", e);
            return java.lang.Boolean.FALSE;
        } catch (java.lang.NoSuchMethodError unused) {
            return java.lang.Boolean.FALSE;
        }
    }

    private static com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> getHighSpeedVideoFpsRangesFor(final java.lang.String str, java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>> callable, java.lang.Runnable runnable) {
        com.airbnb.lottie.LottieComposition lottieComposition = str == null ? null : com.airbnb.lottie.model.LottieCompositionCache.getInstance().get(str);
        com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> lottieTask = lottieComposition != null ? new com.airbnb.lottie.LottieTask<>(lottieComposition) : null;
        if (str != null) {
            java.util.Map<java.lang.String, com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition>> map = getHighSpeedVideoFpsRangesFor;
            if (map.containsKey(str)) {
                lottieTask = map.get(str);
            }
        }
        if (lottieTask != null) {
            if (runnable != null) {
                runnable.run();
            }
            return lottieTask;
        }
        com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition> lottieTask2 = new com.airbnb.lottie.LottieTask<>(callable);
        if (str != null) {
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            lottieTask2.addListener(new com.airbnb.lottie.LottieListener() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda8
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    com.airbnb.lottie.LottieCompositionFactory.Camera2StreamConfigurationMap(str, atomicBoolean);
                }
            });
            lottieTask2.addFailureListener(new com.airbnb.lottie.LottieListener() { // from class: com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda9
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    com.airbnb.lottie.LottieCompositionFactory.getHighSpeedVideoSizes(str, atomicBoolean);
                }
            });
            if (!atomicBoolean.get()) {
                java.util.Map<java.lang.String, com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition>> map2 = getHighSpeedVideoFpsRangesFor;
                map2.put(str, lottieTask2);
                if (map2.size() == 1) {
                    getHighSpeedVideoFpsRangesFor(false);
                }
            }
        }
        return lottieTask2;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(java.lang.String str, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        java.util.Map<java.lang.String, com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition>> map = getHighSpeedVideoFpsRangesFor;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            getHighSpeedVideoFpsRangesFor(true);
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(java.lang.String str, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        java.util.Map<java.lang.String, com.airbnb.lottie.LottieTask<com.airbnb.lottie.LottieComposition>> map = getHighSpeedVideoFpsRangesFor;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            getHighSpeedVideoFpsRangesFor(true);
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(getHighSpeedVideoFpsRanges);
        for (int i = 0; i < arrayList.size(); i++) {
            ((com.airbnb.lottie.LottieTaskIdleListener) arrayList.get(i)).onIdleChanged(z);
        }
    }
}
