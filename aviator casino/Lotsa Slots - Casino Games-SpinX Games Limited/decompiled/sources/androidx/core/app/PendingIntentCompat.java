package androidx.core.app;

/* loaded from: classes.dex */
public final class PendingIntentCompat {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static android.app.PendingIntent getActivities(android.content.Context context, int i, android.content.Intent[] intentArr, int i2, android.os.Bundle bundle, boolean z) {
        return android.app.PendingIntent.getActivities(context, i, intentArr, addMutabilityFlags(z, i2), bundle);
    }

    public static android.app.PendingIntent getActivities(android.content.Context context, int i, android.content.Intent[] intentArr, int i2, boolean z) {
        return android.app.PendingIntent.getActivities(context, i, intentArr, addMutabilityFlags(z, i2));
    }

    public static android.app.PendingIntent getActivity(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        return android.app.PendingIntent.getActivity(context, i, intent, addMutabilityFlags(z, i2));
    }

    public static android.app.PendingIntent getActivity(android.content.Context context, int i, android.content.Intent intent, int i2, android.os.Bundle bundle, boolean z) {
        return android.app.PendingIntent.getActivity(context, i, intent, addMutabilityFlags(z, i2), bundle);
    }

    public static android.app.PendingIntent getBroadcast(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        return android.app.PendingIntent.getBroadcast(context, i, intent, addMutabilityFlags(z, i2));
    }

    public static android.app.PendingIntent getForegroundService(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        return androidx.core.app.PendingIntentCompat.Api26Impl.getForegroundService(context, i, intent, addMutabilityFlags(z, i2));
    }

    public static android.app.PendingIntent getService(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        return android.app.PendingIntent.getService(context, i, intent, addMutabilityFlags(z, i2));
    }

    public static void send(android.app.PendingIntent pendingIntent, int i, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler) throws android.app.PendingIntent.CanceledException {
        androidx.core.app.PendingIntentCompat.GatedCallback gatedCallback = new androidx.core.app.PendingIntentCompat.GatedCallback(onFinished);
        try {
            pendingIntent.send(i, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
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
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                androidx.core.app.PendingIntentCompat.Api23Impl.send(pendingIntent, context, i, intent, onFinished, handler, str, bundle);
            } else {
                pendingIntent.send(context, i, intent, gatedCallback.getCallback(), handler, str);
            }
            gatedCallback.complete();
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

    private static int addMutabilityFlags(boolean z, int i) {
        int i2;
        if (z) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                return i;
            }
            i2 = 33554432;
        } else {
            if (android.os.Build.VERSION.SDK_INT < 23) {
                return i;
            }
            i2 = androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        return i | i2;
    }

    private PendingIntentCompat() {
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        public static void send(android.app.PendingIntent pendingIntent, android.content.Context context, int i, android.content.Intent intent, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler, java.lang.String str, android.os.Bundle bundle) throws android.app.PendingIntent.CanceledException {
            pendingIntent.send(context, i, intent, onFinished, handler, str, bundle);
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        public static android.app.PendingIntent getForegroundService(android.content.Context context, int i, android.content.Intent intent, int i2) {
            return android.app.PendingIntent.getForegroundService(context, i, intent, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GatedCallback implements java.io.Closeable {
        private android.app.PendingIntent.OnFinished mCallback;
        private final java.util.concurrent.CountDownLatch mComplete = new java.util.concurrent.CountDownLatch(1);
        private boolean mSuccess = false;

        GatedCallback(android.app.PendingIntent.OnFinished onFinished) {
            this.mCallback = onFinished;
        }

        public android.app.PendingIntent.OnFinished getCallback() {
            if (this.mCallback == null) {
                return null;
            }
            return new android.app.PendingIntent.OnFinished() { // from class: androidx.core.app.PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i, java.lang.String str, android.os.Bundle bundle) {
                    androidx.core.app.PendingIntentCompat.GatedCallback.this.onSendFinished(pendingIntent, intent, i, str, bundle);
                }
            };
        }

        public void complete() {
            this.mSuccess = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i, java.lang.String str, android.os.Bundle bundle) {
            boolean z = false;
            while (true) {
                try {
                    this.mComplete.await();
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
            android.app.PendingIntent.OnFinished onFinished = this.mCallback;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i, str, bundle);
                this.mCallback = null;
            }
        }
    }
}
