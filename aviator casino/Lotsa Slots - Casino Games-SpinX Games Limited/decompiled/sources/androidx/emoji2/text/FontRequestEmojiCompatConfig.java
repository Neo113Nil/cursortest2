package androidx.emoji2.text;

/* loaded from: classes2.dex */
public class FontRequestEmojiCompatConfig extends androidx.emoji2.text.EmojiCompat.Config {
    private static final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper DEFAULT_FONTS_CONTRACT = new androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper();

    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    public static class ExponentialBackoffRetryPolicy extends androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long j) {
            this.mTotalMs = j;
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            if (this.mRetryOrigin == 0) {
                this.mRetryOrigin = android.os.SystemClock.uptimeMillis();
                return 0L;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.mRetryOrigin;
            if (uptimeMillis > this.mTotalMs) {
                return -1L;
            }
            return java.lang.Math.min(java.lang.Math.max(uptimeMillis, 1000L), this.mTotalMs - uptimeMillis);
        }
    }

    public FontRequestEmojiCompatConfig(android.content.Context context, androidx.core.provider.FontRequest fontRequest) {
        super(new androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader(context, fontRequest, DEFAULT_FONTS_CONTRACT));
    }

    public FontRequestEmojiCompatConfig(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper) {
        super(new androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader(context, fontRequest, fontProviderHelper));
    }

    public androidx.emoji2.text.FontRequestEmojiCompatConfig setLoadingExecutor(java.util.concurrent.Executor executor) {
        ((androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) getMetadataRepoLoader()).setExecutor(executor);
        return this;
    }

    @java.lang.Deprecated
    public androidx.emoji2.text.FontRequestEmojiCompatConfig setHandler(android.os.Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(androidx.emoji2.text.ConcurrencyHelpers.convertHandlerToExecutor(handler));
        return this;
    }

    public androidx.emoji2.text.FontRequestEmojiCompatConfig setRetryPolicy(androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy retryPolicy) {
        ((androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) getMetadataRepoLoader()).setRetryPolicy(retryPolicy);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class FontRequestMetadataLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private static final java.lang.String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback mCallback;
        private final android.content.Context mContext;
        private java.util.concurrent.Executor mExecutor;
        private final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper mFontProviderHelper;
        private final java.lang.Object mLock = new java.lang.Object();
        private android.os.Handler mMainHandler;
        private java.lang.Runnable mMainHandlerLoadCallback;
        private java.util.concurrent.ThreadPoolExecutor mMyThreadPoolExecutor;
        private android.database.ContentObserver mObserver;
        private final androidx.core.provider.FontRequest mRequest;
        private androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy mRetryPolicy;

        FontRequestMetadataLoader(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper) {
            androidx.core.util.Preconditions.checkNotNull(context, "Context cannot be null");
            androidx.core.util.Preconditions.checkNotNull(fontRequest, "FontRequest cannot be null");
            this.mContext = context.getApplicationContext();
            this.mRequest = fontRequest;
            this.mFontProviderHelper = fontProviderHelper;
        }

        public void setExecutor(java.util.concurrent.Executor executor) {
            synchronized (this.mLock) {
                this.mExecutor = executor;
            }
        }

        public void setRetryPolicy(androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy retryPolicy) {
            synchronized (this.mLock) {
                this.mRetryPolicy = retryPolicy;
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            androidx.core.util.Preconditions.checkNotNull(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.mLock) {
                this.mCallback = metadataRepoLoaderCallback;
            }
            loadInternal();
        }

        void loadInternal() {
            synchronized (this.mLock) {
                if (this.mCallback == null) {
                    return;
                }
                if (this.mExecutor == null) {
                    java.util.concurrent.ThreadPoolExecutor createBackgroundPriorityExecutor = androidx.emoji2.text.ConcurrencyHelpers.createBackgroundPriorityExecutor("emojiCompat");
                    this.mMyThreadPoolExecutor = createBackgroundPriorityExecutor;
                    this.mExecutor = createBackgroundPriorityExecutor;
                }
                this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.createMetadata();
                    }
                });
            }
        }

        private androidx.core.provider.FontsContractCompat.FontInfo retrieveFontInfo() {
            try {
                androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts = this.mFontProviderHelper.fetchFonts(this.mContext, this.mRequest);
                if (fetchFonts.getStatusCode() != 0) {
                    throw new java.lang.RuntimeException("fetchFonts failed (" + fetchFonts.getStatusCode() + ")");
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

        private void scheduleRetry(android.net.Uri uri, long j) {
            synchronized (this.mLock) {
                android.os.Handler handler = this.mMainHandler;
                if (handler == null) {
                    handler = androidx.emoji2.text.ConcurrencyHelpers.mainHandlerAsync();
                    this.mMainHandler = handler;
                }
                if (this.mObserver == null) {
                    android.database.ContentObserver contentObserver = new android.database.ContentObserver(handler) { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z, android.net.Uri uri2) {
                            androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.loadInternal();
                        }
                    };
                    this.mObserver = contentObserver;
                    this.mFontProviderHelper.registerObserver(this.mContext, uri, contentObserver);
                }
                if (this.mMainHandlerLoadCallback == null) {
                    this.mMainHandlerLoadCallback = new java.lang.Runnable() { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.this.loadInternal();
                        }
                    };
                }
                handler.postDelayed(this.mMainHandlerLoadCallback, j);
            }
        }

        private void cleanUp() {
            synchronized (this.mLock) {
                this.mCallback = null;
                android.database.ContentObserver contentObserver = this.mObserver;
                if (contentObserver != null) {
                    this.mFontProviderHelper.unregisterObserver(this.mContext, contentObserver);
                    this.mObserver = null;
                }
                android.os.Handler handler = this.mMainHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.mMainHandlerLoadCallback);
                }
                this.mMainHandler = null;
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.mMyThreadPoolExecutor;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.mExecutor = null;
                this.mMyThreadPoolExecutor = null;
            }
        }

        void createMetadata() {
            synchronized (this.mLock) {
                if (this.mCallback == null) {
                    return;
                }
                try {
                    androidx.core.provider.FontsContractCompat.FontInfo retrieveFontInfo = retrieveFontInfo();
                    int resultCode = retrieveFontInfo.getResultCode();
                    if (resultCode == 2) {
                        synchronized (this.mLock) {
                            androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy retryPolicy = this.mRetryPolicy;
                            if (retryPolicy != null) {
                                long retryDelay = retryPolicy.getRetryDelay();
                                if (retryDelay >= 0) {
                                    scheduleRetry(retrieveFontInfo.getUri(), retryDelay);
                                    return;
                                }
                            }
                        }
                    }
                    if (resultCode != 0) {
                        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + resultCode + ")");
                    }
                    try {
                        androidx.core.os.TraceCompat.beginSection(S_TRACE_BUILD_TYPEFACE);
                        android.graphics.Typeface buildTypeface = this.mFontProviderHelper.buildTypeface(this.mContext, retrieveFontInfo);
                        java.nio.ByteBuffer mmap = androidx.core.graphics.TypefaceCompatUtil.mmap(this.mContext, null, retrieveFontInfo.getUri());
                        if (mmap == null || buildTypeface == null) {
                            throw new java.lang.RuntimeException("Unable to open file.");
                        }
                        androidx.emoji2.text.MetadataRepo create = androidx.emoji2.text.MetadataRepo.create(buildTypeface, mmap);
                        androidx.core.os.TraceCompat.endSection();
                        synchronized (this.mLock) {
                            androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.mCallback;
                            if (metadataRepoLoaderCallback != null) {
                                metadataRepoLoaderCallback.onLoaded(create);
                            }
                        }
                        cleanUp();
                    } catch (java.lang.Throwable th) {
                        androidx.core.os.TraceCompat.endSection();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    synchronized (this.mLock) {
                        androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = this.mCallback;
                        if (metadataRepoLoaderCallback2 != null) {
                            metadataRepoLoaderCallback2.onFailed(th2);
                        }
                        cleanUp();
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
