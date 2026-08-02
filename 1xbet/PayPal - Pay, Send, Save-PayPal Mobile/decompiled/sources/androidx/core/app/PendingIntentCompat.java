package androidx.core.app;

/* loaded from: classes3.dex */
public final class PendingIntentCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static android.app.PendingIntent getActivities(android.content.Context context, int i, android.content.Intent[] intentArr, int i2, android.os.Bundle bundle, boolean z) {
        return android.app.PendingIntent.getActivities(context, i, intentArr, getHighSpeedVideoFpsRangesFor(z, i2), bundle);
    }

    public static android.app.PendingIntent getActivities(android.content.Context context, int i, android.content.Intent[] intentArr, int i2, boolean z) {
        return android.app.PendingIntent.getActivities(context, i, intentArr, getHighSpeedVideoFpsRangesFor(z, i2));
    }

    public static android.app.PendingIntent getActivity(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        return android.app.PendingIntent.getActivity(context, i, intent, getHighSpeedVideoFpsRangesFor(z, i2));
    }

    public static android.app.PendingIntent getActivity(android.content.Context context, int i, android.content.Intent intent, int i2, android.os.Bundle bundle, boolean z) {
        return android.app.PendingIntent.getActivity(context, i, intent, getHighSpeedVideoFpsRangesFor(z, i2), bundle);
    }

    public static android.app.PendingIntent getBroadcast(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        return android.app.PendingIntent.getBroadcast(context, i, intent, getHighSpeedVideoFpsRangesFor(z, i2));
    }

    public static android.app.PendingIntent getForegroundService(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        return androidx.core.app.PendingIntentCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(context, i, intent, getHighSpeedVideoFpsRangesFor(z, i2));
    }

    public static android.app.PendingIntent getService(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        return android.app.PendingIntent.getService(context, i, intent, getHighSpeedVideoFpsRangesFor(z, i2));
    }

    public static void send(android.app.PendingIntent pendingIntent, int i, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler) throws android.app.PendingIntent.CanceledException {
        androidx.core.app.PendingIntentCompat.GatedCallback gatedCallback = new androidx.core.app.PendingIntentCompat.GatedCallback(onFinished);
        try {
            pendingIntent.send(i, gatedCallback.getHighResolutionOutputSizeshNQ4ISI(), handler);
            gatedCallback.getHighSpeedVideoFpsRanges();
            gatedCallback.close();
        } catch (java.lang.Throwable th) {
            try {
                gatedCallback.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void send(android.app.PendingIntent pendingIntent, android.content.Context context, int i, android.content.Intent intent, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler) throws android.app.PendingIntent.CanceledException {
        send(pendingIntent, context, i, intent, onFinished, handler, null, null);
    }

    public static void send(android.app.PendingIntent pendingIntent, android.content.Context context, int i, android.content.Intent intent, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler, java.lang.String str, android.os.Bundle bundle) throws android.app.PendingIntent.CanceledException {
        androidx.core.app.PendingIntentCompat.GatedCallback gatedCallback = new androidx.core.app.PendingIntentCompat.GatedCallback(onFinished);
        try {
            pendingIntent.send(context, i, intent, onFinished, handler, str, bundle);
            gatedCallback.getHighSpeedVideoFpsRanges();
            gatedCallback.close();
        } catch (java.lang.Throwable th) {
            try {
                gatedCallback.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static int getHighSpeedVideoFpsRangesFor(boolean z, int i) {
        int i2;
        if (!z) {
            i2 = 67108864;
        } else {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return i;
            }
            i2 = 33554432;
        }
        return i2 | i;
    }

    private PendingIntentCompat() {
    }

    /* loaded from: classes7.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        public static android.app.PendingIntent getHighSpeedVideoFpsRangesFor(android.content.Context context, int i, android.content.Intent intent, int i2) {
            return android.app.PendingIntent.getForegroundService(context, i, intent, i2);
        }
    }

    /* loaded from: classes7.dex */
    static class GatedCallback implements java.io.Closeable {
        private android.app.PendingIntent.OnFinished getHighSpeedVideoFpsRangesFor;
        private final java.util.concurrent.CountDownLatch getHighSpeedVideoFpsRanges = new java.util.concurrent.CountDownLatch(1);
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;

        GatedCallback(android.app.PendingIntent.OnFinished onFinished) {
            this.getHighSpeedVideoFpsRangesFor = onFinished;
        }

        public android.app.PendingIntent.OnFinished getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                return null;
            }
            return new android.app.PendingIntent.OnFinished() { // from class: androidx.core.app.PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i, java.lang.String str, android.os.Bundle bundle) {
                    androidx.core.app.PendingIntentCompat.GatedCallback.this.getHighSpeedVideoFpsRangesFor(pendingIntent, intent, i, str, bundle);
                }
            };
        }

        public void getHighSpeedVideoFpsRanges() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            this.getHighSpeedVideoFpsRanges.countDown();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getHighSpeedVideoFpsRangesFor(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i, java.lang.String str, android.os.Bundle bundle) {
            boolean z = false;
            while (true) {
                try {
                    this.getHighSpeedVideoFpsRanges.await();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                } catch (java.lang.Throwable th) {
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            android.app.PendingIntent.OnFinished onFinished = this.getHighSpeedVideoFpsRangesFor;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i, str, bundle);
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }
    }
}
