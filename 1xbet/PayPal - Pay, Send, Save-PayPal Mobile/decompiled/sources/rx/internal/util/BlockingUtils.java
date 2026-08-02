package rx.internal.util;

/* loaded from: classes18.dex */
public final class BlockingUtils {
    private BlockingUtils() {
    }

    public static void awaitForComplete(java.util.concurrent.CountDownLatch countDownLatch, rx.Subscription subscription) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException e) {
            subscription.unsubscribe();
            java.lang.Thread.currentThread().interrupt();
            throw new java.lang.IllegalStateException("Interrupted while waiting for subscription to complete.", e);
        }
    }
}
