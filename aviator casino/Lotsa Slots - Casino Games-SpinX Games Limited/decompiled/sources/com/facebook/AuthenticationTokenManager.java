package com.facebook;

/* compiled from: AuthenticationTokenManager.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/AuthenticationTokenManager;", "", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "authenticationTokenCache", "Lcom/facebook/AuthenticationTokenCache;", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/AuthenticationTokenCache;)V", "value", "Lcom/facebook/AuthenticationToken;", "currentAuthenticationToken", "getCurrentAuthenticationToken", "()Lcom/facebook/AuthenticationToken;", "setCurrentAuthenticationToken", "(Lcom/facebook/AuthenticationToken;)V", "currentAuthenticationTokenField", "currentAuthenticationTokenChanged", "", "loadCurrentAuthenticationToken", "", "sendCurrentAuthenticationTokenChangedBroadcastIntent", "oldAuthenticationToken", "saveToCache", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "CurrentAuthenticationTokenChangedBroadcastReceiver", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationTokenManager {
    public static final java.lang.String ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.AuthenticationTokenManager.Companion INSTANCE = new com.facebook.AuthenticationTokenManager.Companion(null);
    public static final java.lang.String EXTRA_NEW_AUTHENTICATION_TOKEN = "com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN";
    public static final java.lang.String EXTRA_OLD_AUTHENTICATION_TOKEN = "com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN";
    public static final java.lang.String SHARED_PREFERENCES_NAME = "com.facebook.AuthenticationTokenManager.SharedPreferences";
    public static final java.lang.String TAG = "AuthenticationTokenManager";
    private static com.facebook.AuthenticationTokenManager instanceField;
    private final com.facebook.AuthenticationTokenCache authenticationTokenCache;
    private com.facebook.AuthenticationToken currentAuthenticationTokenField;
    private final androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager;

    /* compiled from: AuthenticationTokenManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AuthenticationTokenManager getInstance() {
        return INSTANCE.getInstance();
    }

    public AuthenticationTokenManager(androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager, com.facebook.AuthenticationTokenCache authenticationTokenCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationTokenCache, "authenticationTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.authenticationTokenCache = authenticationTokenCache;
    }

    /* renamed from: getCurrentAuthenticationToken, reason: from getter */
    public final com.facebook.AuthenticationToken getCurrentAuthenticationTokenField() {
        return this.currentAuthenticationTokenField;
    }

    public final void setCurrentAuthenticationToken(com.facebook.AuthenticationToken authenticationToken) {
        setCurrentAuthenticationToken(authenticationToken, true);
    }

    public final boolean loadCurrentAuthenticationToken() {
        com.facebook.AuthenticationToken load = this.authenticationTokenCache.load();
        if (load == null) {
            return false;
        }
        setCurrentAuthenticationToken(load, false);
        return true;
    }

    public final void currentAuthenticationTokenChanged() {
        sendCurrentAuthenticationTokenChangedBroadcastIntent(getCurrentAuthenticationTokenField(), getCurrentAuthenticationTokenField());
    }

    private final void setCurrentAuthenticationToken(com.facebook.AuthenticationToken currentAuthenticationToken, boolean saveToCache) {
        com.facebook.AuthenticationToken currentAuthenticationTokenField = getCurrentAuthenticationTokenField();
        this.currentAuthenticationTokenField = currentAuthenticationToken;
        if (saveToCache) {
            if (currentAuthenticationToken != null) {
                this.authenticationTokenCache.save(currentAuthenticationToken);
            } else {
                this.authenticationTokenCache.clear();
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.internal.Utility.clearFacebookCookies(com.facebook.FacebookSdk.getApplicationContext());
            }
        }
        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.areObjectsEqual(currentAuthenticationTokenField, currentAuthenticationToken)) {
            return;
        }
        sendCurrentAuthenticationTokenChangedBroadcastIntent(currentAuthenticationTokenField, currentAuthenticationToken);
    }

    private final void sendCurrentAuthenticationTokenChangedBroadcastIntent(com.facebook.AuthenticationToken oldAuthenticationToken, com.facebook.AuthenticationToken currentAuthenticationToken) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Intent intent = new android.content.Intent(com.facebook.FacebookSdk.getApplicationContext(), (java.lang.Class<?>) com.facebook.AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_AUTHENTICATION_TOKEN, oldAuthenticationToken);
        intent.putExtra(EXTRA_NEW_AUTHENTICATION_TOKEN, currentAuthenticationToken);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    /* compiled from: AuthenticationTokenManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$Companion;", "", "()V", "ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED", "", "EXTRA_NEW_AUTHENTICATION_TOKEN", "EXTRA_OLD_AUTHENTICATION_TOKEN", "SHARED_PREFERENCES_NAME", "TAG", "instanceField", "Lcom/facebook/AuthenticationTokenManager;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AuthenticationTokenManager getInstance() {
            com.facebook.AuthenticationTokenManager authenticationTokenManager;
            com.facebook.AuthenticationTokenManager authenticationTokenManager2 = com.facebook.AuthenticationTokenManager.instanceField;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = com.facebook.AuthenticationTokenManager.instanceField;
                if (authenticationTokenManager == null) {
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(com.facebook.FacebookSdk.getApplicationContext());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                    com.facebook.AuthenticationTokenManager authenticationTokenManager3 = new com.facebook.AuthenticationTokenManager(localBroadcastManager, new com.facebook.AuthenticationTokenCache());
                    com.facebook.AuthenticationTokenManager.Companion companion = com.facebook.AuthenticationTokenManager.INSTANCE;
                    com.facebook.AuthenticationTokenManager.instanceField = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }
    }
}
