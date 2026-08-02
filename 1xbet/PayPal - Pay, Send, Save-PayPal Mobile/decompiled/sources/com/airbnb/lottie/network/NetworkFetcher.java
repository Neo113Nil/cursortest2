package com.airbnb.lottie.network;

/* loaded from: classes7.dex */
public class NetworkFetcher {
    private final com.airbnb.lottie.network.NetworkCache getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.network.LottieNetworkFetcher getHighSpeedVideoSizes;

    public NetworkFetcher(com.airbnb.lottie.network.NetworkCache networkCache, com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher) {
        this.getHighSpeedVideoFpsRangesFor = networkCache;
        this.getHighSpeedVideoSizes = lottieNetworkFetcher;
    }

    public com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fetchSync(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.airbnb.lottie.LottieComposition Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context, str, str2);
        if (Camera2StreamConfigurationMap != null) {
            return new com.airbnb.lottie.LottieResult<>(Camera2StreamConfigurationMap);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Animation for ");
        sb.append(str);
        sb.append(" not found in cache. Fetching from network.");
        com.airbnb.lottie.utils.Logger.debug(sb.toString());
        return getHighSpeedVideoFpsRanges(context, str, str2);
    }

    private com.airbnb.lottie.LottieComposition Camera2StreamConfigurationMap(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.airbnb.lottie.network.NetworkCache networkCache;
        android.util.Pair<com.airbnb.lottie.network.FileExtension, java.io.InputStream> Camera2StreamConfigurationMap;
        com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromZipStreamSync;
        if (str2 == null || (networkCache = this.getHighSpeedVideoFpsRangesFor) == null || (Camera2StreamConfigurationMap = networkCache.Camera2StreamConfigurationMap(str)) == null) {
            return null;
        }
        com.airbnb.lottie.network.FileExtension fileExtension = (com.airbnb.lottie.network.FileExtension) Camera2StreamConfigurationMap.first;
        java.io.InputStream inputStream = (java.io.InputStream) Camera2StreamConfigurationMap.second;
        int i = com.airbnb.lottie.network.NetworkFetcher.AnonymousClass1.getHighSpeedVideoSizes[fileExtension.ordinal()];
        if (i == 1) {
            fromZipStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromZipStreamSync(context, new java.util.zip.ZipInputStream(inputStream), str2);
        } else if (i == 2) {
            try {
                fromZipStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(new java.util.zip.GZIPInputStream(inputStream), str2);
            } catch (java.io.IOException e) {
                fromZipStreamSync = new com.airbnb.lottie.LottieResult<>(e);
            }
        } else {
            fromZipStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str2);
        }
        if (fromZipStreamSync.getValue() != null) {
            return fromZipStreamSync.getValue();
        }
        return null;
    }

    /* renamed from: com.airbnb.lottie.network.NetworkFetcher$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.airbnb.lottie.network.FileExtension.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.airbnb.lottie.network.FileExtension.ZIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.airbnb.lottie.network.FileExtension.GZIP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.airbnb.lottie.network.LottieFetchResult fetchSync;
        com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> lottieResult;
        com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> fromZipStreamSync;
        com.airbnb.lottie.network.FileExtension fileExtension;
        com.airbnb.lottie.network.NetworkCache networkCache;
        com.airbnb.lottie.network.NetworkCache networkCache2;
        com.airbnb.lottie.network.NetworkCache networkCache3;
        com.airbnb.lottie.network.NetworkCache networkCache4;
        com.airbnb.lottie.utils.Logger.debug("Fetching ".concat(java.lang.String.valueOf(str)));
        com.airbnb.lottie.network.LottieFetchResult lottieFetchResult = null;
        try {
            try {
                fetchSync = this.getHighSpeedVideoSizes.fetchSync(str);
            } catch (java.lang.Exception e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            if (fetchSync.isSuccessful()) {
                java.io.InputStream bodyByteStream = fetchSync.bodyByteStream();
                java.lang.String contentType = fetchSync.contentType();
                if (contentType == null) {
                    contentType = "application/json";
                }
                if (contentType.contains("application/zip") || contentType.contains("application/x-zip") || contentType.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
                    com.airbnb.lottie.utils.Logger.debug("Handling zip response.");
                    com.airbnb.lottie.network.FileExtension fileExtension2 = com.airbnb.lottie.network.FileExtension.ZIP;
                    if (str2 == null || (networkCache = this.getHighSpeedVideoFpsRangesFor) == null) {
                        fromZipStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromZipStreamSync(context, new java.util.zip.ZipInputStream(bodyByteStream), (java.lang.String) null);
                    } else {
                        fromZipStreamSync = com.airbnb.lottie.LottieCompositionFactory.fromZipStreamSync(context, new java.util.zip.ZipInputStream(new java.io.FileInputStream(networkCache.getHighSpeedVideoFpsRanges(str, bodyByteStream, com.airbnb.lottie.network.FileExtension.ZIP))), str);
                    }
                    lottieResult = fromZipStreamSync;
                    fileExtension = fileExtension2;
                } else if (contentType.contains("application/gzip") || contentType.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
                    com.airbnb.lottie.utils.Logger.debug("Handling gzip response.");
                    fileExtension = com.airbnb.lottie.network.FileExtension.GZIP;
                    if (str2 == null || (networkCache3 = this.getHighSpeedVideoFpsRangesFor) == null) {
                        lottieResult = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(new java.util.zip.GZIPInputStream(bodyByteStream), null);
                    } else {
                        lottieResult = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(new java.util.zip.GZIPInputStream(new java.io.FileInputStream(networkCache3.getHighSpeedVideoFpsRanges(str, bodyByteStream, com.airbnb.lottie.network.FileExtension.GZIP))), str);
                    }
                } else {
                    com.airbnb.lottie.utils.Logger.debug("Received json response.");
                    fileExtension = com.airbnb.lottie.network.FileExtension.JSON;
                    if (str2 == null || (networkCache4 = this.getHighSpeedVideoFpsRangesFor) == null) {
                        lottieResult = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(bodyByteStream, null);
                    } else {
                        lottieResult = com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(new java.io.FileInputStream(networkCache4.getHighSpeedVideoFpsRanges(str, bodyByteStream, com.airbnb.lottie.network.FileExtension.JSON).getAbsolutePath()), str);
                    }
                }
                if (str2 != null && lottieResult.getValue() != null && (networkCache2 = this.getHighSpeedVideoFpsRangesFor) != null) {
                    java.io.File file = new java.io.File(networkCache2.getHighSpeedVideoSizes(), com.airbnb.lottie.network.NetworkCache.getHighSpeedVideoSizes(str, fileExtension, true));
                    java.io.File file2 = new java.io.File(file.getAbsolutePath().replace(".temp", ""));
                    boolean renameTo = file.renameTo(file2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Copying temp file to real file (");
                    sb.append(file2);
                    sb.append(")");
                    com.airbnb.lottie.utils.Logger.debug(sb.toString());
                    if (!renameTo) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to rename cache file ");
                        sb2.append(file.getAbsolutePath());
                        sb2.append(" to ");
                        sb2.append(file2.getAbsolutePath());
                        sb2.append(".");
                        com.airbnb.lottie.utils.Logger.warning(sb2.toString());
                    }
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Completed fetch from network. Success: ");
                sb3.append(lottieResult.getValue() != null);
                com.airbnb.lottie.utils.Logger.debug(sb3.toString());
                if (fetchSync != null) {
                }
                return lottieResult;
            }
            com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> lottieResult2 = new com.airbnb.lottie.LottieResult<>(new java.lang.IllegalArgumentException(fetchSync.error()));
            if (fetchSync == null) {
                return lottieResult2;
            }
            lottieResult = lottieResult2;
            try {
                fetchSync.close();
                return lottieResult;
            } catch (java.io.IOException e2) {
                com.airbnb.lottie.utils.Logger.warning("LottieFetchResult close failed ", e2);
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            lottieFetchResult = fetchSync;
            com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition> lottieResult3 = new com.airbnb.lottie.LottieResult<>(e);
            if (lottieFetchResult != null) {
                try {
                    lottieFetchResult.close();
                } catch (java.io.IOException e4) {
                    com.airbnb.lottie.utils.Logger.warning("LottieFetchResult close failed ", e4);
                }
            }
            return lottieResult3;
        } catch (java.lang.Throwable th2) {
            th = th2;
            lottieFetchResult = fetchSync;
            if (lottieFetchResult != null) {
                try {
                    lottieFetchResult.close();
                } catch (java.io.IOException e5) {
                    com.airbnb.lottie.utils.Logger.warning("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }
}
