package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.a;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.IntentCompat;

/* loaded from: classes.dex */
public final class AuthTabSessionToken {
    private static final String TAG = "AuthTabSessionToken";
    private final AuthTabCallback mCallback;
    private final a mCallbackBinder;
    private final PendingIntent mSessionId;

    public static class MockCallback extends a.AbstractBinderC0002a {
        @Override // android.support.customtabs.a
        public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
            return Bundle.EMPTY;
        }

        @Override // android.support.customtabs.a
        public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.a
        public void onWarmupCompleted(Bundle bundle) throws RemoteException {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AuthTabSessionToken(a aVar, PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("AuthTabSessionToken must have either a session id or a callback (or both).");
        }
        this.mCallbackBinder = aVar;
        this.mSessionId = pendingIntent;
        this.mCallback = aVar == null ? null : new AuthTabCallback() { // from class: androidx.browser.auth.AuthTabSessionToken.1
            @Override // androidx.browser.auth.AuthTabCallback
            public void onExtraCallback(String str, Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onExtraCallback(str, bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
                try {
                    return AuthTabSessionToken.this.mCallbackBinder.onExtraCallbackWithResult(str, bundle);
                } catch (RemoteException unused) {
                    return Bundle.EMPTY;
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public void onNavigationEvent(int i, Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onNavigationEvent(i, bundle);
                } catch (RemoteException unused) {
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public void onWarmupCompleted(Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onWarmupCompleted(bundle);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    public static AuthTabSessionToken createSessionTokenFromIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder(CustomTabsIntent.EXTRA_SESSION);
        PendingIntent pendingIntent = (PendingIntent) IntentCompat.getParcelableExtra(intent, CustomTabsIntent.EXTRA_SESSION_ID, PendingIntent.class);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new AuthTabSessionToken(binder != null ? a.AbstractBinderC0002a.asInterface(binder) : null, pendingIntent);
    }

    private IBinder getCallbackBinderAssertNotNull() {
        a aVar = this.mCallbackBinder;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthTabSessionToken)) {
            return false;
        }
        AuthTabSessionToken authTabSessionToken = (AuthTabSessionToken) obj;
        PendingIntent id2 = authTabSessionToken.getId();
        PendingIntent pendingIntent = this.mSessionId;
        if ((pendingIntent == null) != (id2 == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(id2) : getCallbackBinderAssertNotNull().equals(authTabSessionToken.getCallbackBinderAssertNotNull());
    }

    public AuthTabCallback getCallback() {
        return this.mCallback;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IBinder getCallbackBinder() {
        a aVar = this.mCallbackBinder;
        if (aVar == null) {
            return null;
        }
        return aVar.asBinder();
    }

    public PendingIntent getId() {
        return this.mSessionId;
    }

    public boolean hasId() {
        return this.mSessionId != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.mSessionId;
        return pendingIntent != null ? pendingIntent.hashCode() : getCallbackBinderAssertNotNull().hashCode();
    }

    public boolean isAssociatedWith(AuthTabSession authTabSession) {
        return authTabSession.getBinder().equals(this.mCallbackBinder);
    }
}
