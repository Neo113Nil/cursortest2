package com.facebook;

/* compiled from: AuthenticationTokenTracker.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH$J\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/AuthenticationTokenTracker;", "", "()V", "broadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "<set-?>", "", "isTracking", "()Z", "receiver", "Landroid/content/BroadcastReceiver;", "addBroadcastReceiver", "", "onCurrentAuthenticationTokenChanged", "oldAuthenticationToken", "Lcom/facebook/AuthenticationToken;", "currentAuthenticationToken", "startTracking", "stopTracking", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "CurrentAuthenticationTokenBroadcastReceiver", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AuthenticationTokenTracker {
    private static final java.lang.String TAG = "AuthenticationTokenTracker";
    private final androidx.localbroadcastmanager.content.LocalBroadcastManager broadcastManager;
    private boolean isTracking;
    private final android.content.BroadcastReceiver receiver;

    protected abstract void onCurrentAuthenticationTokenChanged(com.facebook.AuthenticationToken oldAuthenticationToken, com.facebook.AuthenticationToken currentAuthenticationToken);

    public AuthenticationTokenTracker() {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.sdkInitialized();
        this.receiver = new com.facebook.AuthenticationTokenTracker.CurrentAuthenticationTokenBroadcastReceiver(this);
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(com.facebook.FacebookSdk.getApplicationContext());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(FacebookSdk.getApplicationContext())");
        this.broadcastManager = localBroadcastManager;
        startTracking();
    }

    /* renamed from: isTracking, reason: from getter */
    public final boolean getIsTracking() {
        return this.isTracking;
    }

    public final void startTracking() {
        if (this.isTracking) {
            return;
        }
        addBroadcastReceiver();
        this.isTracking = true;
    }

    public final void stopTracking() {
        if (this.isTracking) {
            this.broadcastManager.unregisterReceiver(this.receiver);
            this.isTracking = false;
        }
    }

    /* compiled from: AuthenticationTokenTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/facebook/AuthenticationTokenTracker$CurrentAuthenticationTokenBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/facebook/AuthenticationTokenTracker;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class CurrentAuthenticationTokenBroadcastReceiver extends android.content.BroadcastReceiver {
        final /* synthetic */ com.facebook.AuthenticationTokenTracker this$0;

        public CurrentAuthenticationTokenBroadcastReceiver(com.facebook.AuthenticationTokenTracker this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.facebook.AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED, intent.getAction())) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(com.facebook.AuthenticationTokenTracker.TAG, "AuthenticationTokenChanged");
                this.this$0.onCurrentAuthenticationTokenChanged((com.facebook.AuthenticationToken) intent.getParcelableExtra(com.facebook.AuthenticationTokenManager.EXTRA_OLD_AUTHENTICATION_TOKEN), (com.facebook.AuthenticationToken) intent.getParcelableExtra(com.facebook.AuthenticationTokenManager.EXTRA_NEW_AUTHENTICATION_TOKEN));
            }
        }
    }

    private final void addBroadcastReceiver() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(com.facebook.AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        this.broadcastManager.registerReceiver(this.receiver, intentFilter);
    }
}
