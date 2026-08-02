package androidx.browser.auth;

/* loaded from: classes5.dex */
public final class AuthTabSession {
    final android.app.PendingIntent Camera2StreamConfigurationMap;
    final android.content.ComponentName getHighSpeedVideoFpsRanges;
    final android.support.customtabs.IAuthTabCallback getHighSpeedVideoSizes;

    public AuthTabSession(android.support.customtabs.IAuthTabCallback iAuthTabCallback, android.content.ComponentName componentName, android.app.PendingIntent pendingIntent) {
        this.getHighSpeedVideoSizes = iAuthTabCallback;
        this.getHighSpeedVideoFpsRanges = componentName;
        this.Camera2StreamConfigurationMap = pendingIntent;
    }

    public static class PendingSession {
        private final android.app.PendingIntent Camera2StreamConfigurationMap;
        private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.browser.auth.AuthTabCallback getHighSpeedVideoFpsRanges;

        public PendingSession(android.app.PendingIntent pendingIntent, java.util.concurrent.Executor executor, androidx.browser.auth.AuthTabCallback authTabCallback) {
            this.Camera2StreamConfigurationMap = pendingIntent;
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
            this.getHighSpeedVideoFpsRanges = authTabCallback;
        }

        public android.app.PendingIntent getId() {
            return this.Camera2StreamConfigurationMap;
        }

        public java.util.concurrent.Executor getExecutor() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public androidx.browser.auth.AuthTabCallback getCallback() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }
}
