package com.facebook.login;

/* compiled from: InstagramAppLoginMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "describeContents", "", "tryAuthorize", "request", "Lcom/facebook/login/LoginClient$Request;", "writeToParcel", "", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InstagramAppLoginMethodHandler extends com.facebook.login.NativeAppLoginMethodHandler {
    private final java.lang.String nameForLogging;
    private final com.facebook.AccessTokenSource tokenSource;
    public static final android.os.Parcelable.Creator<com.facebook.login.InstagramAppLoginMethodHandler> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.InstagramAppLoginMethodHandler>() { // from class: com.facebook.login.InstagramAppLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.InstagramAppLoginMethodHandler createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.login.InstagramAppLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.InstagramAppLoginMethodHandler[] newArray(int size) {
            return new com.facebook.login.InstagramAppLoginMethodHandler[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(com.facebook.login.LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "instagram_login";
        this.tokenSource = com.facebook.AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public java.lang.String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    public com.facebook.AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    public int tryAuthorize(com.facebook.login.LoginClient.Request request) {
        androidx.fragment.app.FragmentActivity fragmentActivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        java.lang.String e2e = com.facebook.login.LoginClient.INSTANCE.getE2E();
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        androidx.fragment.app.FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            fragmentActivity = com.facebook.FacebookSdk.getApplicationContext();
        } else {
            fragmentActivity = activity;
        }
        java.lang.String applicationId = request.getApplicationId();
        java.util.Set<java.lang.String> permissions = request.getPermissions();
        boolean isRerequest = request.getIsRerequest();
        boolean hasPublishPermission = request.hasPublishPermission();
        com.facebook.login.DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = com.facebook.login.DefaultAudience.NONE;
        }
        android.content.Intent createInstagramIntent = com.facebook.internal.NativeProtocol.createInstagramIntent(fragmentActivity, applicationId, permissions, e2e, isRerequest, hasPublishPermission, defaultAudience, getClientState(request.getAuthId()), request.getAuthType(), request.getMessengerPageId(), request.getResetMessengerState(), request.getIsFamilyLogin(), request.getShouldSkipAccountDeduplication());
        addLoggingExtra("e2e", e2e);
        return tryIntent(createInstagramIntent, com.facebook.login.LoginClient.INSTANCE.getLoginRequestCode()) ? 1 : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "instagram_login";
        this.tokenSource = com.facebook.AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
    }
}
