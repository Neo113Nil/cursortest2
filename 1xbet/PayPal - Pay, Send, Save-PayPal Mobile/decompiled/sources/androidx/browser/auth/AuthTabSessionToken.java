package androidx.browser.auth;

/* loaded from: classes5.dex */
public final class AuthTabSessionToken {
    private final androidx.browser.auth.AuthTabCallback Camera2StreamConfigurationMap;
    private final android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI;
    private final android.support.customtabs.IAuthTabCallback getHighSpeedVideoFpsRanges;

    public AuthTabSessionToken(android.support.customtabs.IAuthTabCallback iAuthTabCallback, android.app.PendingIntent pendingIntent) {
        if (iAuthTabCallback == null && pendingIntent == null) {
            throw new java.lang.IllegalStateException("AuthTabSessionToken must have either a session id or a callback (or both).");
        }
        this.getHighSpeedVideoFpsRanges = iAuthTabCallback;
        this.getHighResolutionOutputSizeshNQ4ISI = pendingIntent;
        this.Camera2StreamConfigurationMap = iAuthTabCallback == null ? null : new androidx.browser.auth.AuthTabCallback() { // from class: androidx.browser.auth.AuthTabSessionToken.1
            @Override // androidx.browser.auth.AuthTabCallback
            public void onNavigationEvent(int i, android.os.Bundle bundle) {
                try {
                    androidx.browser.auth.AuthTabSessionToken.this.getHighSpeedVideoFpsRanges.onNavigationEvent(i, bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public void onExtraCallback(java.lang.String str, android.os.Bundle bundle) {
                try {
                    androidx.browser.auth.AuthTabSessionToken.this.getHighSpeedVideoFpsRanges.onExtraCallback(str, bundle);
                } catch (android.os.RemoteException unused) {
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public android.os.Bundle onExtraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) {
                try {
                    return androidx.browser.auth.AuthTabSessionToken.this.getHighSpeedVideoFpsRanges.onExtraCallbackWithResult(str, bundle);
                } catch (android.os.RemoteException unused) {
                    return android.os.Bundle.EMPTY;
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public void onWarmupCompleted(android.os.Bundle bundle) {
                try {
                    androidx.browser.auth.AuthTabSessionToken.this.getHighSpeedVideoFpsRanges.onWarmupCompleted(bundle);
                } catch (android.os.RemoteException unused) {
                }
            }
        };
    }

    public static androidx.browser.auth.AuthTabSessionToken createSessionTokenFromIntent(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        android.os.IBinder binder = extras.getBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) androidx.core.content.IntentCompat.getParcelableExtra(intent, androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION_ID, android.app.PendingIntent.class);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new androidx.browser.auth.AuthTabSessionToken(binder != null ? android.support.customtabs.IAuthTabCallback.Stub.asInterface(binder) : null, pendingIntent);
    }

    public final androidx.browser.auth.AuthTabCallback getCallback() {
        return this.Camera2StreamConfigurationMap;
    }

    public final android.os.IBinder getCallbackBinder() {
        android.support.customtabs.IAuthTabCallback iAuthTabCallback = this.getHighSpeedVideoFpsRanges;
        if (iAuthTabCallback == null) {
            return null;
        }
        return iAuthTabCallback.asBinder();
    }

    public final android.app.PendingIntent getId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean hasId() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public final int hashCode() {
        android.app.PendingIntent pendingIntent = this.getHighResolutionOutputSizeshNQ4ISI;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        android.support.customtabs.IAuthTabCallback iAuthTabCallback = this.getHighSpeedVideoFpsRanges;
        if (iAuthTabCallback != null) {
            return iAuthTabCallback.asBinder().hashCode();
        }
        throw new java.lang.IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.browser.auth.AuthTabSessionToken)) {
            return false;
        }
        androidx.browser.auth.AuthTabSessionToken authTabSessionToken = (androidx.browser.auth.AuthTabSessionToken) obj;
        android.app.PendingIntent id = authTabSessionToken.getId();
        android.app.PendingIntent pendingIntent = this.getHighResolutionOutputSizeshNQ4ISI;
        if ((pendingIntent == null) != (id == null)) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(id);
        }
        android.support.customtabs.IAuthTabCallback iAuthTabCallback = this.getHighSpeedVideoFpsRanges;
        if (iAuthTabCallback == null) {
            throw new java.lang.IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
        }
        android.os.IBinder asBinder = iAuthTabCallback.asBinder();
        android.support.customtabs.IAuthTabCallback iAuthTabCallback2 = authTabSessionToken.getHighSpeedVideoFpsRanges;
        if (iAuthTabCallback2 != null) {
            return asBinder.equals(iAuthTabCallback2.asBinder());
        }
        throw new java.lang.IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
    }

    static class MockCallback extends android.support.customtabs.IAuthTabCallback.Stub {
        @Override // android.support.customtabs.IAuthTabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        MockCallback() {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public android.os.Bundle onExtraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return android.os.Bundle.EMPTY;
        }
    }

    public final boolean isAssociatedWith(androidx.browser.auth.AuthTabSession authTabSession) {
        return authTabSession.getHighSpeedVideoSizes.asBinder().equals(this.getHighSpeedVideoFpsRanges);
    }
}
