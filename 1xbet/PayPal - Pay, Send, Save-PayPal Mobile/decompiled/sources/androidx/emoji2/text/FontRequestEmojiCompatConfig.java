package androidx.emoji2.text;

/* loaded from: classes7.dex */
public class FontRequestEmojiCompatConfig extends androidx.emoji2.text.EmojiCompat.Config {
    private static final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper getOutputSizes = new androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper();

    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    public static class ExponentialBackoffRetryPolicy extends androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy {
        private final long getHighSpeedVideoFpsRangesFor;
        private long getHighSpeedVideoSizes;

        public ExponentialBackoffRetryPolicy(long j) {
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            if (this.getHighSpeedVideoSizes == 0) {
                this.getHighSpeedVideoSizes = android.os.SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.getHighSpeedVideoSizes;
            if (uptimeMillis > this.getHighSpeedVideoFpsRangesFor) {
                return -1L;
            }
            return java.lang.Math.min(java.lang.Math.max(uptimeMillis, 1000L), this.getHighSpeedVideoFpsRangesFor - uptimeMillis);
        }
    }

    public FontRequestEmojiCompatConfig(android.content.Context context, androidx.core.provider.FontRequest fontRequest) {
        super(new androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader(context, fontRequest, getOutputSizes));
    }

    public FontRequestEmojiCompatConfig(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper) {
        super(new androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader(context, fontRequest, fontProviderHelper));
    }

    public androidx.emoji2.text.FontRequestEmojiCompatConfig setLoadingExecutor(java.util.concurrent.Executor executor) {
        ((androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) getMetadataRepoLoader()).getHighResolutionOutputSizeshNQ4ISI(executor);
        return this;
    }

    @java.lang.Deprecated
    public androidx.emoji2.text.FontRequestEmojiCompatConfig setHandler(android.os.Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(androidx.emoji2.text.ConcurrencyHelpers.getHighResolutionOutputSizeshNQ4ISI(handler));
        return this;
    }

    public androidx.emoji2.text.FontRequestEmojiCompatConfig setRetryPolicy(androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy retryPolicy) {
        ((androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) getMetadataRepoLoader()).getHighResolutionOutputSizeshNQ4ISI(retryPolicy);
        return this;
    }

    static class FontRequestMetadataLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper Camera2StreamConfigurationMap;
        private java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
        androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback getHighSpeedVideoFpsRangesFor;
        private final android.content.Context getHighSpeedVideoSizes;
        private java.util.concurrent.ThreadPoolExecutor getHighSpeedVideoSizesFor;
        private final androidx.core.provider.FontRequest getInputFormats;
        private java.lang.Runnable getInputSizeshNQ4ISI;
        private android.os.Handler getOutputFormats;
        private android.database.ContentObserver getOutputMinFrameDuration;
        private androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy getOutputMinFrameDurationlomOqCM;

        FontRequestMetadataLoader(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper) {
            androidx.core.util.Preconditions.checkNotNull(context, "Context cannot be null");
            androidx.core.util.Preconditions.checkNotNull(fontRequest, "FontRequest cannot be null");
            this.getHighSpeedVideoSizes = context.getApplicationContext();
            this.getInputFormats = fontRequest;
            this.Camera2StreamConfigurationMap = fontProviderHelper;
        }

        public void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                this.getHighResolutionOutputSizeshNQ4ISI = executor;
            }
        }

        public void getHighResolutionOutputSizeshNQ4ISI(androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy retryPolicy) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                this.getOutputMinFrameDurationlomOqCM = retryPolicy;
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            androidx.core.util.Preconditions.checkNotNull(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRangesFor = metadataRepoLoaderCallback;
            }
            Camera2StreamConfigurationMap();
        }

        void Camera2StreamConfigurationMap() {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    return;
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    java.util.concurrent.ThreadPoolExecutor highSpeedVideoFpsRanges = androidx.emoji2.text.ConcurrencyHelpers.getHighSpeedVideoFpsRanges("emojiCompat");
                    this.getHighSpeedVideoSizesFor = highSpeedVideoFpsRanges;
                    this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRanges;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.getHighSpeedVideoFpsRangesFor();
                    }
                });
            }
        }

        private androidx.core.provider.FontsContractCompat.FontInfo getHighResolutionOutputSizeshNQ4ISI() {
            try {
                androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts = this.Camera2StreamConfigurationMap.fetchFonts(this.getHighSpeedVideoSizes, this.getInputFormats);
                if (fetchFonts.getStatusCode() != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("fetchFonts failed (");
                    sb.append(fetchFonts.getStatusCode());
                    sb.append(")");
                    throw new java.lang.RuntimeException(sb.toString());
                }
                androidx.core.provider.FontsContractCompat.FontInfo[] fonts = fetchFonts.getFonts();
                if (fonts == null || fonts.length == 0) {
                    throw new java.lang.RuntimeException("fetchFonts failed (empty result)");
                }
                return fonts[0];
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new java.lang.RuntimeException("provider not found", e);
            }
        }

        private void getHighSpeedVideoSizes(android.net.Uri uri, long j) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                android.os.Handler handler = this.getOutputFormats;
                if (handler == null) {
                    handler = androidx.emoji2.text.ConcurrencyHelpers.Camera2StreamConfigurationMap();
                    this.getOutputFormats = handler;
                }
                if (this.getOutputMinFrameDuration == null) {
                    android.database.ContentObserver contentObserver = new android.database.ContentObserver(handler) { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z, android.net.Uri uri2) {
                            androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.Camera2StreamConfigurationMap();
                        }
                    };
                    this.getOutputMinFrameDuration = contentObserver;
                    this.Camera2StreamConfigurationMap.registerObserver(this.getHighSpeedVideoSizes, uri, contentObserver);
                }
                if (this.getInputSizeshNQ4ISI == null) {
                    this.getInputSizeshNQ4ISI = new java.lang.Runnable() { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.Camera2StreamConfigurationMap();
                        }
                    };
                }
                handler.postDelayed(this.getInputSizeshNQ4ISI, j);
            }
        }

        private void getHighSpeedVideoFpsRanges() {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRangesFor = null;
                android.database.ContentObserver contentObserver = this.getOutputMinFrameDuration;
                if (contentObserver != null) {
                    this.Camera2StreamConfigurationMap.unregisterObserver(this.getHighSpeedVideoSizes, contentObserver);
                    this.getOutputMinFrameDuration = null;
                }
                android.os.Handler handler = this.getOutputFormats;
                if (handler != null) {
                    handler.removeCallbacks(this.getInputSizeshNQ4ISI);
                }
                this.getOutputFormats = null;
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.getHighSpeedVideoSizesFor;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoSizesFor = null;
            }
        }

        void getHighSpeedVideoFpsRangesFor() {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    return;
                }
                try {
                    androidx.core.provider.FontsContractCompat.FontInfo highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                    int resultCode = highResolutionOutputSizeshNQ4ISI.getResultCode();
                    if (resultCode == 2) {
                        synchronized (this.getHighSpeedVideoFpsRanges) {
                            androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy retryPolicy = this.getOutputMinFrameDurationlomOqCM;
                            if (retryPolicy != null) {
                                long retryDelay = retryPolicy.getRetryDelay();
                                if (retryDelay >= 0) {
                                    getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI.getUri(), retryDelay);
                                    return;
                                }
                            }
                        }
                    }
                    if (resultCode != 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("fetchFonts result is not OK. (");
                        sb.append(resultCode);
                        sb.append(")");
                        throw new java.lang.RuntimeException(sb.toString());
                    }
                    try {
                        androidx.core.os.TraceCompat.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        android.graphics.Typeface buildTypeface = this.Camera2StreamConfigurationMap.buildTypeface(this.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI);
                        java.nio.ByteBuffer mmap = androidx.core.graphics.TypefaceCompatUtil.mmap(this.getHighSpeedVideoSizes, null, highResolutionOutputSizeshNQ4ISI.getUri());
                        if (mmap == null || buildTypeface == null) {
                            throw new java.lang.RuntimeException("Unable to open file.");
                        }
                        androidx.emoji2.text.MetadataRepo create = androidx.emoji2.text.MetadataRepo.create(buildTypeface, mmap);
                        androidx.core.os.TraceCompat.endSection();
                        synchronized (this.getHighSpeedVideoFpsRanges) {
                            androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.getHighSpeedVideoFpsRangesFor;
                            if (metadataRepoLoaderCallback != null) {
                                metadataRepoLoaderCallback.onLoaded(create);
                            }
                        }
                        getHighSpeedVideoFpsRanges();
                    } catch (java.lang.Throwable th) {
                        androidx.core.os.TraceCompat.endSection();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    synchronized (this.getHighSpeedVideoFpsRanges) {
                        androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = this.getHighSpeedVideoFpsRangesFor;
                        if (metadataRepoLoaderCallback2 != null) {
                            metadataRepoLoaderCallback2.onFailed(th2);
                        }
                        getHighSpeedVideoFpsRanges();
                    }
                }
            }
        }
    }

    public static class FontProviderHelper {
        public androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(android.content.Context context, androidx.core.provider.FontRequest fontRequest) throws android.content.pm.PackageManager.NameNotFoundException {
            return androidx.core.provider.FontsContractCompat.fetchFonts(context, null, fontRequest);
        }

        public android.graphics.Typeface buildTypeface(android.content.Context context, androidx.core.provider.FontsContractCompat.FontInfo fontInfo) throws android.content.pm.PackageManager.NameNotFoundException {
            return androidx.core.provider.FontsContractCompat.buildTypeface(context, null, new androidx.core.provider.FontsContractCompat.FontInfo[]{fontInfo});
        }

        public void registerObserver(android.content.Context context, android.net.Uri uri, android.database.ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void unregisterObserver(android.content.Context context, android.database.ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }
}
