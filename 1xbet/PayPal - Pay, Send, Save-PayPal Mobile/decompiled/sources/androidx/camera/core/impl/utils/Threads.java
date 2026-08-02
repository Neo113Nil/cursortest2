package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class Threads {
    private Threads() {
    }

    public static boolean isMainThread() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static void checkMainThread() {
        androidx.core.util.Preconditions.checkState(isMainThread(), "Not in application's main thread");
    }

    public static void checkBackgroundThread() {
        androidx.core.util.Preconditions.checkState(isBackgroundThread(), "In application's main thread");
    }

    public static void runOnMain(java.lang.Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            androidx.core.util.Preconditions.checkState(new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable), "Unable to post to main thread");
        }
    }

    public static void runOnMainSync(final java.lang.Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        androidx.core.util.Preconditions.checkState(new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.Threads$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.impl.utils.Threads.getHighSpeedVideoSizes(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(30000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            } else {
                throw new java.lang.IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (java.lang.InterruptedException e) {
            throw new androidx.camera.core.impl.utils.InterruptedRuntimeException(e);
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }
}
