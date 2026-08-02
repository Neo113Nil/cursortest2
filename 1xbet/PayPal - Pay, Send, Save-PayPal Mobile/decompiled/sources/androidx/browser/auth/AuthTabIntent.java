package androidx.browser.auth;

/* loaded from: classes5.dex */
public class AuthTabIntent {
    public static final java.lang.String EXTRA_HTTPS_REDIRECT_HOST = "androidx.browser.auth.extra.HTTPS_REDIRECT_HOST";
    public static final java.lang.String EXTRA_HTTPS_REDIRECT_PATH = "androidx.browser.auth.extra.HTTPS_REDIRECT_PATH";
    public static final java.lang.String EXTRA_LAUNCH_AUTH_TAB = "androidx.browser.auth.extra.LAUNCH_AUTH_TAB";
    public static final java.lang.String EXTRA_REDIRECT_SCHEME = "androidx.browser.auth.extra.REDIRECT_SCHEME";
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_OK = -1;
    public static final int RESULT_UNKNOWN_CODE = -2;
    public static final int RESULT_VERIFICATION_FAILED = 2;
    public static final int RESULT_VERIFICATION_TIMED_OUT = 3;
    private final androidx.browser.auth.AuthTabSession.PendingSession getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.browser.auth.AuthTabSession getHighSpeedVideoFpsRangesFor;
    public final android.content.Intent intent;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ResultCode {
    }

    /* synthetic */ AuthTabIntent(android.content.Intent intent, androidx.browser.auth.AuthTabSession authTabSession, androidx.browser.auth.AuthTabSession.PendingSession pendingSession, byte b) {
        this(intent, authTabSession, pendingSession);
    }

    public void launch(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher, android.net.Uri uri, java.lang.String str) {
        this.intent.setData(uri);
        this.intent.putExtra(EXTRA_REDIRECT_SCHEME, str);
        activityResultLauncher.launch(this.intent);
    }

    public void launch(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.intent.setData(uri);
        this.intent.putExtra(EXTRA_HTTPS_REDIRECT_HOST, str);
        this.intent.putExtra(EXTRA_HTTPS_REDIRECT_PATH, str2);
        activityResultLauncher.launch(this.intent);
    }

    public boolean isEphemeralBrowsingEnabled() {
        return this.intent.getBooleanExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_EPHEMERAL_BROWSING, false);
    }

    public static androidx.browser.auth.AuthTabColorSchemeParams getColorSchemeParams(android.content.Intent intent, int i) {
        android.os.Bundle bundle;
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return androidx.browser.auth.AuthTabColorSchemeParams.getHighSpeedVideoFpsRanges(null);
        }
        androidx.browser.auth.AuthTabColorSchemeParams highSpeedVideoFpsRanges = androidx.browser.auth.AuthTabColorSchemeParams.getHighSpeedVideoFpsRanges(extras);
        android.util.SparseArray sparseParcelableArray = androidx.core.os.BundleCompat.getSparseParcelableArray(extras, androidx.browser.customtabs.CustomTabsIntent.EXTRA_COLOR_SCHEME_PARAMS, android.os.Bundle.class);
        if (sparseParcelableArray == null || (bundle = (android.os.Bundle) sparseParcelableArray.get(i)) == null) {
            return highSpeedVideoFpsRanges;
        }
        androidx.browser.auth.AuthTabColorSchemeParams highSpeedVideoFpsRanges2 = androidx.browser.auth.AuthTabColorSchemeParams.getHighSpeedVideoFpsRanges(bundle);
        java.lang.Integer num = highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRangesFor;
        if (num == null) {
            num = highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        }
        java.lang.Integer num2 = highSpeedVideoFpsRanges2.getHighSpeedVideoFpsRanges;
        if (num2 == null) {
            num2 = highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        }
        java.lang.Integer num3 = highSpeedVideoFpsRanges2.getHighResolutionOutputSizeshNQ4ISI;
        if (num3 == null) {
            num3 = highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
        }
        return new androidx.browser.auth.AuthTabColorSchemeParams(num, num2, num3);
    }

    public androidx.browser.auth.AuthTabSession getSession() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public androidx.browser.auth.AuthTabSession.PendingSession getPendingSession() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public android.graphics.Bitmap getCloseButtonIcon() {
        return (android.graphics.Bitmap) androidx.core.content.IntentCompat.getParcelableExtra(this.intent, androidx.browser.customtabs.CustomTabsIntent.EXTRA_CLOSE_BUTTON_ICON, android.graphics.Bitmap.class);
    }

    private AuthTabIntent(android.content.Intent intent, androidx.browser.auth.AuthTabSession authTabSession, androidx.browser.auth.AuthTabSession.PendingSession pendingSession) {
        this.intent = intent;
        this.getHighSpeedVideoFpsRangesFor = authTabSession;
        this.getHighResolutionOutputSizeshNQ4ISI = pendingSession;
    }

    public static final class Builder {
        private final android.content.Intent Camera2StreamConfigurationMap = new android.content.Intent("android.intent.action.VIEW");
        private final androidx.browser.auth.AuthTabColorSchemeParams.Builder getHighResolutionOutputSizeshNQ4ISI = new androidx.browser.auth.AuthTabColorSchemeParams.Builder();
        private androidx.browser.auth.AuthTabSession.PendingSession getHighSpeedVideoFpsRanges;
        private android.os.Bundle getHighSpeedVideoFpsRangesFor;
        private android.util.SparseArray<android.os.Bundle> getHighSpeedVideoSizes;
        private androidx.browser.auth.AuthTabSession getHighSpeedVideoSizesFor;

        public final androidx.browser.auth.AuthTabIntent.Builder setSession(androidx.browser.auth.AuthTabSession authTabSession) {
            this.getHighSpeedVideoSizesFor = authTabSession;
            this.Camera2StreamConfigurationMap.setPackage(authTabSession.getHighSpeedVideoFpsRanges.getPackageName());
            Camera2StreamConfigurationMap(authTabSession.getHighSpeedVideoSizes.asBinder(), authTabSession.Camera2StreamConfigurationMap);
            return this;
        }

        public final androidx.browser.auth.AuthTabIntent.Builder setPendingSession(androidx.browser.auth.AuthTabSession.PendingSession pendingSession) {
            this.getHighSpeedVideoFpsRanges = pendingSession;
            Camera2StreamConfigurationMap(null, pendingSession.getId());
            return this;
        }

        private void Camera2StreamConfigurationMap(android.os.IBinder iBinder, android.app.PendingIntent pendingIntent) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            }
            this.Camera2StreamConfigurationMap.putExtras(bundle);
        }

        public final androidx.browser.auth.AuthTabIntent.Builder setEphemeralBrowsingEnabled(boolean z) {
            this.Camera2StreamConfigurationMap.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_ENABLE_EPHEMERAL_BROWSING, z);
            return this;
        }

        public final androidx.browser.auth.AuthTabIntent.Builder setColorScheme(int i) {
            this.Camera2StreamConfigurationMap.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_COLOR_SCHEME, i);
            return this;
        }

        public final androidx.browser.auth.AuthTabIntent.Builder setColorSchemeParams(int i, androidx.browser.auth.AuthTabColorSchemeParams authTabColorSchemeParams) {
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = new android.util.SparseArray<>();
            }
            this.getHighSpeedVideoSizes.put(i, authTabColorSchemeParams.getHighSpeedVideoFpsRanges());
            return this;
        }

        public final androidx.browser.auth.AuthTabIntent.Builder setDefaultColorSchemeParams(androidx.browser.auth.AuthTabColorSchemeParams authTabColorSchemeParams) {
            this.getHighSpeedVideoFpsRangesFor = authTabColorSchemeParams.getHighSpeedVideoFpsRanges();
            return this;
        }

        public final androidx.browser.auth.AuthTabIntent.Builder setCloseButtonIcon(android.graphics.Bitmap bitmap) {
            this.Camera2StreamConfigurationMap.putExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_CLOSE_BUTTON_ICON, bitmap);
            return this;
        }

        public final androidx.browser.auth.AuthTabIntent build() {
            this.Camera2StreamConfigurationMap.putExtra(androidx.browser.auth.AuthTabIntent.EXTRA_LAUNCH_AUTH_TAB, true);
            if (!this.Camera2StreamConfigurationMap.hasExtra(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION)) {
                Camera2StreamConfigurationMap(null, null);
            }
            this.Camera2StreamConfigurationMap.putExtras(this.getHighResolutionOutputSizeshNQ4ISI.build().getHighSpeedVideoFpsRanges());
            android.os.Bundle bundle = this.getHighSpeedVideoFpsRangesFor;
            if (bundle != null) {
                this.Camera2StreamConfigurationMap.putExtras(bundle);
            }
            if (this.getHighSpeedVideoSizes != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putSparseParcelableArray(androidx.browser.customtabs.CustomTabsIntent.EXTRA_COLOR_SCHEME_PARAMS, this.getHighSpeedVideoSizes);
                this.Camera2StreamConfigurationMap.putExtras(bundle2);
            }
            return new androidx.browser.auth.AuthTabIntent(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, (byte) 0);
        }
    }

    public static androidx.view.result.ActivityResultLauncher<android.content.Intent> registerActivityResultLauncher(androidx.view.result.ActivityResultCaller activityResultCaller, androidx.view.result.ActivityResultCallback<androidx.browser.auth.AuthTabIntent.AuthResult> activityResultCallback) {
        return activityResultCaller.registerForActivityResult(new androidx.browser.auth.AuthTabIntent.AuthenticateUserResultContract(), activityResultCallback);
    }

    public static final class AuthResult {
        public final int resultCode;
        public final android.net.Uri resultUri;

        AuthResult(int i, android.net.Uri uri) {
            this.resultCode = i;
            this.resultUri = uri;
        }
    }

    public static class AuthenticateUserResultContract extends androidx.view.result.contract.ActivityResultContract<android.content.Intent, androidx.browser.auth.AuthTabIntent.AuthResult> {
        @Override // androidx.view.result.contract.ActivityResultContract
        public android.content.Intent createIntent(android.content.Context context, android.content.Intent intent) {
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public androidx.browser.auth.AuthTabIntent.AuthResult parseResult(int i, android.content.Intent intent) {
            android.net.Uri uri = null;
            if (i != -1) {
                if (i != 0 && i != 2 && i != 3) {
                    i = -2;
                }
            } else if (intent != null) {
                uri = intent.getData();
            }
            return new androidx.browser.auth.AuthTabIntent.AuthResult(i, uri);
        }
    }
}
