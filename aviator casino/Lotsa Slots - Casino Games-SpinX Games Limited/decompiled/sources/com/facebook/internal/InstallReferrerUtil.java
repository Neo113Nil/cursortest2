package com.facebook.internal;

/* compiled from: InstallReferrerUtil.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/InstallReferrerUtil;", "", "()V", "IS_REFERRER_UPDATED", "", "isUpdated", "", "()Z", "tryConnectReferrerInfo", "", "callback", "Lcom/facebook/internal/InstallReferrerUtil$Callback;", "tryUpdateReferrerInfo", "updateReferrer", "Callback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InstallReferrerUtil {
    public static final com.facebook.internal.InstallReferrerUtil INSTANCE = new com.facebook.internal.InstallReferrerUtil();
    private static final java.lang.String IS_REFERRER_UPDATED = "is_referrer_updated";

    /* compiled from: InstallReferrerUtil.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/InstallReferrerUtil$Callback;", "", "onReceiveReferrerUrl", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onReceiveReferrerUrl(java.lang.String s);
    }

    private InstallReferrerUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final void tryUpdateReferrerInfo(com.facebook.internal.InstallReferrerUtil.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.facebook.internal.InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (installReferrerUtil.isUpdated()) {
            return;
        }
        installReferrerUtil.tryConnectReferrerInfo(callback);
    }

    private final void tryConnectReferrerInfo(final com.facebook.internal.InstallReferrerUtil.Callback callback) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        final com.android.installreferrer.api.InstallReferrerClient build = com.android.installreferrer.api.InstallReferrerClient.newBuilder(com.facebook.FacebookSdk.getApplicationContext()).build();
        try {
            build.startConnection(new com.android.installreferrer.api.InstallReferrerStateListener() { // from class: com.facebook.internal.InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int responseCode) {
                    if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        if (responseCode == 0) {
                            try {
                                com.android.installreferrer.api.ReferrerDetails installReferrer = com.android.installreferrer.api.InstallReferrerClient.this.getInstallReferrer();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                                java.lang.String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null && (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) installReferrer2, (java.lang.CharSequence) "fb", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) installReferrer2, (java.lang.CharSequence) com.facebook.AccessToken.DEFAULT_GRAPH_DOMAIN, false, 2, (java.lang.Object) null))) {
                                    callback.onReceiveReferrerUrl(installReferrer2);
                                }
                                com.facebook.internal.InstallReferrerUtil.INSTANCE.updateReferrer();
                            } catch (android.os.RemoteException unused) {
                                return;
                            }
                        } else if (responseCode == 2) {
                            com.facebook.internal.InstallReferrerUtil.INSTANCE.updateReferrer();
                        }
                        try {
                            com.android.installreferrer.api.InstallReferrerClient.this.endConnection();
                        } catch (java.lang.Exception unused2) {
                        }
                    } catch (java.lang.Throwable th) {
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReferrer() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(com.facebook.FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean(IS_REFERRER_UPDATED, true).apply();
    }

    private final boolean isUpdated() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        return com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(com.facebook.FacebookSdk.APP_EVENT_PREFERENCES, 0).getBoolean(IS_REFERRER_UPDATED, false);
    }
}
