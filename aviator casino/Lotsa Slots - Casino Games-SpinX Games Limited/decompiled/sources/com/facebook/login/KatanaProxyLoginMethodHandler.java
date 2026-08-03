package com.facebook.login;

/* compiled from: KatanaProxyLoginMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", "describeContents", "", "shouldKeepTrackOfMultipleIntents", "", "tryAuthorize", "request", "Lcom/facebook/login/LoginClient$Request;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KatanaProxyLoginMethodHandler extends com.facebook.login.NativeAppLoginMethodHandler {
    private final java.lang.String nameForLogging;
    public static final android.os.Parcelable.Creator<com.facebook.login.KatanaProxyLoginMethodHandler> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.KatanaProxyLoginMethodHandler>() { // from class: com.facebook.login.KatanaProxyLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.KatanaProxyLoginMethodHandler createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.login.KatanaProxyLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.KatanaProxyLoginMethodHandler[] newArray(int size) {
            return new com.facebook.login.KatanaProxyLoginMethodHandler[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean shouldKeepTrackOfMultipleIntents() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(com.facebook.login.LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "katana_proxy_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public java.lang.String getNameForLogging() {
        return this.nameForLogging;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int tryAuthorize(com.facebook.login.LoginClient.Request request) {
        boolean z;
        com.facebook.login.DefaultAudience defaultAudience;
        java.util.Iterator<android.content.Intent> it;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.facebook.login.LoginBehavior loginBehavior = request.getLoginBehavior();
        if (com.facebook.FacebookSdk.ignoreAppSwitchToLoggedOut) {
            com.facebook.internal.CustomTabUtils customTabUtils = com.facebook.internal.CustomTabUtils.INSTANCE;
            if (com.facebook.internal.CustomTabUtils.getChromePackage() != null && loginBehavior.getAllowsCustomTabAuth()) {
                z = true;
                java.lang.String e2e = com.facebook.login.LoginClient.INSTANCE.getE2E();
                com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
                androidx.fragment.app.FragmentActivity activity = getLoginClient().getActivity();
                java.lang.String applicationId = request.getApplicationId();
                java.util.Set<java.lang.String> permissions = request.getPermissions();
                boolean isRerequest = request.getIsRerequest();
                boolean hasPublishPermission = request.hasPublishPermission();
                defaultAudience = request.getDefaultAudience();
                if (defaultAudience == null) {
                    defaultAudience = com.facebook.login.DefaultAudience.NONE;
                }
                com.facebook.login.DefaultAudience defaultAudience2 = defaultAudience;
                java.lang.String clientState = getClientState(request.getAuthId());
                java.lang.String authType = request.getAuthType();
                java.lang.String messengerPageId = request.getMessengerPageId();
                boolean resetMessengerState = request.getResetMessengerState();
                boolean isFamilyLogin = request.getIsFamilyLogin();
                boolean shouldSkipAccountDeduplication = request.getShouldSkipAccountDeduplication();
                java.lang.String nonce = request.getNonce();
                java.lang.String codeChallenge = request.getCodeChallenge();
                com.facebook.login.CodeChallengeMethod codeChallengeMethod = request.getCodeChallengeMethod();
                java.util.List<android.content.Intent> createProxyAuthIntents = com.facebook.internal.NativeProtocol.createProxyAuthIntents(activity, applicationId, permissions, e2e, isRerequest, hasPublishPermission, defaultAudience2, clientState, authType, z, messengerPageId, resetMessengerState, isFamilyLogin, shouldSkipAccountDeduplication, nonce, codeChallenge, codeChallengeMethod != null ? null : codeChallengeMethod.name());
                addLoggingExtra("e2e", e2e);
                it = createProxyAuthIntents.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i++;
                    if (tryIntent(it.next(), com.facebook.login.LoginClient.INSTANCE.getLoginRequestCode())) {
                        return i;
                    }
                }
                return 0;
            }
        }
        z = false;
        java.lang.String e2e2 = com.facebook.login.LoginClient.INSTANCE.getE2E();
        com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
        androidx.fragment.app.FragmentActivity activity2 = getLoginClient().getActivity();
        java.lang.String applicationId2 = request.getApplicationId();
        java.util.Set<java.lang.String> permissions2 = request.getPermissions();
        boolean isRerequest2 = request.getIsRerequest();
        boolean hasPublishPermission2 = request.hasPublishPermission();
        defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
        }
        com.facebook.login.DefaultAudience defaultAudience22 = defaultAudience;
        java.lang.String clientState2 = getClientState(request.getAuthId());
        java.lang.String authType2 = request.getAuthType();
        java.lang.String messengerPageId2 = request.getMessengerPageId();
        boolean resetMessengerState2 = request.getResetMessengerState();
        boolean isFamilyLogin2 = request.getIsFamilyLogin();
        boolean shouldSkipAccountDeduplication2 = request.getShouldSkipAccountDeduplication();
        java.lang.String nonce2 = request.getNonce();
        java.lang.String codeChallenge2 = request.getCodeChallenge();
        com.facebook.login.CodeChallengeMethod codeChallengeMethod2 = request.getCodeChallengeMethod();
        java.util.List<android.content.Intent> createProxyAuthIntents2 = com.facebook.internal.NativeProtocol.createProxyAuthIntents(activity2, applicationId2, permissions2, e2e2, isRerequest2, hasPublishPermission2, defaultAudience22, clientState2, authType2, z, messengerPageId2, resetMessengerState2, isFamilyLogin2, shouldSkipAccountDeduplication2, nonce2, codeChallenge2, codeChallengeMethod2 != null ? null : codeChallengeMethod2.name());
        addLoggingExtra("e2e", e2e2);
        it = createProxyAuthIntents2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "katana_proxy_auth";
    }
}
