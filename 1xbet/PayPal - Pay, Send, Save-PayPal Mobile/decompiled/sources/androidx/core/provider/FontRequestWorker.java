package androidx.core.provider;

/* loaded from: classes3.dex */
class FontRequestWorker {
    static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> Camera2StreamConfigurationMap = new androidx.collection.LruCache<>(16);
    private static final java.util.concurrent.ExecutorService getHighSpeedVideoFpsRangesFor = androidx.core.provider.RequestExecutor.getHighSpeedVideoFpsRanges("fonts-androidx");
    static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    static final androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>>> getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.SimpleArrayMap<>();

    private FontRequestWorker() {
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap.evictAll();
    }

    static android.graphics.Typeface getHighSpeedVideoFpsRanges(final android.content.Context context, final androidx.core.provider.FontRequest fontRequest, androidx.core.provider.CallbackWrapper callbackWrapper, final int i, int i2) {
        java.util.List m;
        java.util.List m2;
        m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{fontRequest});
        final java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(m, i);
        android.graphics.Typeface typeface = Camera2StreamConfigurationMap.get(highSpeedVideoSizes);
        if (typeface != null) {
            callbackWrapper.getHighResolutionOutputSizeshNQ4ISI(new androidx.core.provider.FontRequestWorker.TypefaceResult(typeface));
            return typeface;
        }
        if (i2 == -1) {
            m2 = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{fontRequest});
            androidx.core.provider.FontRequestWorker.TypefaceResult highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes, context, m2, i);
            callbackWrapper.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI);
            return highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        }
        try {
            androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult = (androidx.core.provider.FontRequestWorker.TypefaceResult) androidx.core.provider.RequestExecutor.getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor, new java.util.concurrent.Callable<androidx.core.provider.FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                @Override // java.util.concurrent.Callable
                public /* synthetic */ androidx.core.provider.FontRequestWorker.TypefaceResult call() throws java.lang.Exception {
                    java.util.List m3;
                    java.lang.String str = highSpeedVideoSizes;
                    android.content.Context context2 = context;
                    m3 = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(new java.lang.Object[]{fontRequest});
                    return androidx.core.provider.FontRequestWorker.getHighResolutionOutputSizeshNQ4ISI(str, context2, m3, i);
                }
            }, i2);
            callbackWrapper.getHighResolutionOutputSizeshNQ4ISI(typefaceResult);
            return typefaceResult.Camera2StreamConfigurationMap;
        } catch (java.lang.InterruptedException unused) {
            callbackWrapper.getHighResolutionOutputSizeshNQ4ISI(new androidx.core.provider.FontRequestWorker.TypefaceResult(-3));
            return null;
        }
    }

    static android.graphics.Typeface getHighSpeedVideoFpsRanges(final android.content.Context context, final java.util.List<androidx.core.provider.FontRequest> list, final int i, java.util.concurrent.Executor executor, final androidx.core.provider.CallbackWrapper callbackWrapper) {
        final java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(list, i);
        android.graphics.Typeface typeface = Camera2StreamConfigurationMap.get(highSpeedVideoSizes);
        if (typeface != null) {
            callbackWrapper.getHighResolutionOutputSizeshNQ4ISI(new androidx.core.provider.FontRequestWorker.TypefaceResult(typeface));
            return typeface;
        }
        androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult> consumer = new androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
            @Override // androidx.core.util.Consumer
            public /* synthetic */ void accept(androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult) {
                androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult2 = typefaceResult;
                if (typefaceResult2 == null) {
                    typefaceResult2 = new androidx.core.provider.FontRequestWorker.TypefaceResult(-3);
                }
                androidx.core.provider.CallbackWrapper.this.getHighResolutionOutputSizeshNQ4ISI(typefaceResult2);
            }
        };
        synchronized (getHighSpeedVideoFpsRanges) {
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>>> simpleArrayMap = getHighResolutionOutputSizeshNQ4ISI;
            java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>> arrayList = simpleArrayMap.get(highSpeedVideoSizes);
            if (arrayList != null) {
                arrayList.add(consumer);
                return null;
            }
            java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>> arrayList2 = new java.util.ArrayList<>();
            arrayList2.add(consumer);
            simpleArrayMap.put(highSpeedVideoSizes, arrayList2);
            java.util.concurrent.Callable<androidx.core.provider.FontRequestWorker.TypefaceResult> callable = new java.util.concurrent.Callable<androidx.core.provider.FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.3
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public androidx.core.provider.FontRequestWorker.TypefaceResult call() {
                    try {
                        return androidx.core.provider.FontRequestWorker.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes, context, list, i);
                    } catch (java.lang.Throwable unused) {
                        return new androidx.core.provider.FontRequestWorker.TypefaceResult(-3);
                    }
                }
            };
            if (executor == null) {
                executor = getHighSpeedVideoFpsRangesFor;
            }
            androidx.core.provider.RequestExecutor.getHighResolutionOutputSizeshNQ4ISI(executor, callable, new androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                @Override // androidx.core.util.Consumer
                public /* synthetic */ void accept(androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult) {
                    androidx.core.provider.FontRequestWorker.TypefaceResult typefaceResult2 = typefaceResult;
                    synchronized (androidx.core.provider.FontRequestWorker.getHighSpeedVideoFpsRanges) {
                        java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>> arrayList3 = androidx.core.provider.FontRequestWorker.getHighResolutionOutputSizeshNQ4ISI.get(highSpeedVideoSizes);
                        if (arrayList3 == null) {
                            return;
                        }
                        androidx.core.provider.FontRequestWorker.getHighResolutionOutputSizeshNQ4ISI.remove(highSpeedVideoSizes);
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            arrayList3.get(i2).accept(typefaceResult2);
                        }
                    }
                }
            });
            return null;
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.util.List<androidx.core.provider.FontRequest> list, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).getHighSpeedVideoSizes);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {all -> 0x0099, NameNotFoundException -> 0x008f, blocks: (B:3:0x0005, B:5:0x000f, B:11:0x0019, B:12:0x001d, B:14:0x0025, B:18:0x0052, B:21:0x005b, B:23:0x0061, B:25:0x0067, B:27:0x007a, B:30:0x0086, B:33:0x0070, B:35:0x002f, B:37:0x0035, B:40:0x0039, B:42:0x003e, B:44:0x004b, B:53:0x008f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #0 {all -> 0x0099, NameNotFoundException -> 0x008f, blocks: (B:3:0x0005, B:5:0x000f, B:11:0x0019, B:12:0x001d, B:14:0x0025, B:18:0x0052, B:21:0x005b, B:23:0x0061, B:25:0x0067, B:27:0x007a, B:30:0x0086, B:33:0x0070, B:35:0x002f, B:37:0x0035, B:40:0x0039, B:42:0x003e, B:44:0x004b, B:53:0x008f), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static androidx.core.provider.FontRequestWorker.TypefaceResult getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.Context context, java.util.List<androidx.core.provider.FontRequest> list, int i) {
        int i2;
        androidx.tracing.Trace.beginSection("getFontSync");
        try {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> lruCache = Camera2StreamConfigurationMap;
            android.graphics.Typeface typeface = lruCache.get(str);
            if (typeface != null) {
                return new androidx.core.provider.FontRequestWorker.TypefaceResult(typeface);
            }
            androidx.core.provider.FontsContractCompat.FontFamilyResult Camera2StreamConfigurationMap2 = androidx.core.provider.FontProvider.Camera2StreamConfigurationMap(context, list, (android.os.CancellationSignal) null);
            int i3 = 1;
            if (Camera2StreamConfigurationMap2.getStatusCode() != 0) {
                if (Camera2StreamConfigurationMap2.getStatusCode() == 1) {
                    i2 = -2;
                    if (i2 != 0) {
                        return new androidx.core.provider.FontRequestWorker.TypefaceResult(i2);
                    }
                    android.graphics.Typeface createFromFontInfo = (!Camera2StreamConfigurationMap2.getHighSpeedVideoSizes() || android.os.Build.VERSION.SDK_INT < 29) ? androidx.core.graphics.TypefaceCompat.createFromFontInfo(context, null, Camera2StreamConfigurationMap2.getFonts(), i) : androidx.core.graphics.TypefaceCompat.createFromFontInfoWithFallback(context, null, Camera2StreamConfigurationMap2.getFontsWithFallbacks(), i);
                    if (createFromFontInfo == null) {
                        return new androidx.core.provider.FontRequestWorker.TypefaceResult(-3);
                    }
                    lruCache.put(str, createFromFontInfo);
                    return new androidx.core.provider.FontRequestWorker.TypefaceResult(createFromFontInfo);
                }
                i2 = -3;
                if (i2 != 0) {
                }
            } else {
                androidx.core.provider.FontsContractCompat.FontInfo[] fonts = Camera2StreamConfigurationMap2.getFonts();
                if (fonts != null && fonts.length != 0) {
                    for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fonts) {
                        int resultCode = fontInfo.getResultCode();
                        if (resultCode != 0) {
                            if (resultCode < 0) {
                                i2 = -3;
                                if (i2 != 0) {
                                }
                            } else {
                                i2 = resultCode;
                                if (i2 != 0) {
                                }
                            }
                        }
                    }
                    i3 = 0;
                }
                i2 = i3;
                if (i2 != 0) {
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return new androidx.core.provider.FontRequestWorker.TypefaceResult(-1);
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    static final class TypefaceResult {
        final android.graphics.Typeface Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;

        TypefaceResult(int i) {
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        TypefaceResult(android.graphics.Typeface typeface) {
            this.Camera2StreamConfigurationMap = typeface;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }
    }
}
