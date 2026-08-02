package androidx.emoji2.text;

/* loaded from: classes7.dex */
public class EmojiCompatInitializer implements androidx.startup.Initializer<java.lang.Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public java.lang.Boolean create(android.content.Context context) {
        androidx.emoji2.text.EmojiCompat.init(new androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultConfig(context));
        getHighSpeedVideoFpsRangesFor(context);
        return java.lang.Boolean.TRUE;
    }

    void getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        final androidx.view.Lifecycle lifecycleRegistry = ((androidx.view.LifecycleOwner) androidx.startup.AppInitializer.getInstance(context).initializeComponent(androidx.view.ProcessLifecycleInitializer.class)).getLifecycleRegistry();
        lifecycleRegistry.addObserver(new androidx.view.DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.view.DefaultLifecycleObserver
            public void onResume(androidx.view.LifecycleOwner lifecycleOwner) {
                androidx.emoji2.text.EmojiCompatInitializer.this.getHighResolutionOutputSizeshNQ4ISI();
                lifecycleRegistry.removeObserver(this);
            }
        });
    }

    void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.emoji2.text.ConcurrencyHelpers.Camera2StreamConfigurationMap().postDelayed(new androidx.emoji2.text.EmojiCompatInitializer.LoadEmojiCompatRunnable(), 500L);
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return java.util.Collections.singletonList(androidx.view.ProcessLifecycleInitializer.class);
    }

    static class LoadEmojiCompatRunnable implements java.lang.Runnable {
        LoadEmojiCompatRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.EmojiCompat.isConfigured()) {
                    androidx.emoji2.text.EmojiCompat.get().load();
                }
            } finally {
                androidx.core.os.TraceCompat.endSection();
            }
        }
    }

    static class BackgroundDefaultConfig extends androidx.emoji2.text.EmojiCompat.Config {
        protected BackgroundDefaultConfig(android.content.Context context) {
            super(new androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader(context));
            setMetadataLoadStrategy(1);
        }
    }

    static class BackgroundDefaultLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

        BackgroundDefaultLoader(android.content.Context context) {
            this.getHighResolutionOutputSizeshNQ4ISI = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(final androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final java.util.concurrent.ThreadPoolExecutor highSpeedVideoFpsRanges = androidx.emoji2.text.ConcurrencyHelpers.getHighSpeedVideoFpsRanges("EmojiCompatInitializer");
            highSpeedVideoFpsRanges.execute(new java.lang.Runnable() { // from class: androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.this.getHighSpeedVideoFpsRanges(metadataRepoLoaderCallback, highSpeedVideoFpsRanges);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public void getHighSpeedVideoFpsRanges(final androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, final java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            try {
                androidx.emoji2.text.FontRequestEmojiCompatConfig create = androidx.emoji2.text.DefaultEmojiCompatConfig.create(this.getHighResolutionOutputSizeshNQ4ISI);
                if (create == null) {
                    throw new java.lang.RuntimeException("EmojiCompat font provider not available on this device.");
                }
                create.setLoadingExecutor(threadPoolExecutor);
                create.getMetadataRepoLoader().load(new androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onLoaded(androidx.emoji2.text.MetadataRepo metadataRepo) {
                        try {
                            metadataRepoLoaderCallback.onLoaded(metadataRepo);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onFailed(java.lang.Throwable th) {
                        try {
                            metadataRepoLoaderCallback.onFailed(th);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }
                });
            } catch (java.lang.Throwable th) {
                metadataRepoLoaderCallback.onFailed(th);
                threadPoolExecutor.shutdown();
            }
        }
    }
}
