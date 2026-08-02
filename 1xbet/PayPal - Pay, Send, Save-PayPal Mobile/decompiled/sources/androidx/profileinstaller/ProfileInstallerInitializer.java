package androidx.profileinstaller;

/* loaded from: classes7.dex */
public class ProfileInstallerInitializer implements androidx.startup.Initializer<androidx.profileinstaller.ProfileInstallerInitializer.Result> {

    public static class Result {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public androidx.profileinstaller.ProfileInstallerInitializer.Result create(android.content.Context context) {
        final android.content.Context applicationContext = context.getApplicationContext();
        android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                final android.content.Context context2 = applicationContext;
                (android.os.Build.VERSION.SDK_INT >= 28 ? androidx.profileinstaller.ProfileInstallerInitializer.Handler28Impl.getHighResolutionOutputSizeshNQ4ISI(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper())).postDelayed(new java.lang.Runnable() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new java.lang.Runnable() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.profileinstaller.ProfileInstaller.writeProfile(r1);
                            }
                        });
                    }
                }, new java.util.Random().nextInt(java.lang.Math.max(1000, 1)) + 5000);
            }
        });
        return new androidx.profileinstaller.ProfileInstallerInitializer.Result();
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return java.util.Collections.emptyList();
    }

    static class Handler28Impl {
        private Handler28Impl() {
        }

        public static android.os.Handler getHighResolutionOutputSizeshNQ4ISI(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }
}
