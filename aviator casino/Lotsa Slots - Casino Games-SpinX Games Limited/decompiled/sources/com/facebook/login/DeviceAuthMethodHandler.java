package com.facebook.login;

/* compiled from: DeviceAuthMethodHandler.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J~\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u001a2\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u001a2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006("}, d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", "createDeviceAuthDialog", "Lcom/facebook/login/DeviceAuthDialog;", "describeContents", "", "onCancel", "", "onError", "ex", "Ljava/lang/Exception;", "onSuccess", "accessToken", "applicationId", "userId", "permissions", "", "declinedPermissions", "expiredPermissions", "accessTokenSource", "Lcom/facebook/AccessTokenSource;", "expirationTime", "Ljava/util/Date;", "lastRefreshTime", "dataAccessExpirationTime", "showDialog", "request", "Lcom/facebook/login/LoginClient$Request;", "tryAuthorize", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class DeviceAuthMethodHandler extends com.facebook.login.LoginMethodHandler {
    private static java.util.concurrent.ScheduledThreadPoolExecutor backgroundExecutor;
    private final java.lang.String nameForLogging;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.DeviceAuthMethodHandler.Companion INSTANCE = new com.facebook.login.DeviceAuthMethodHandler.Companion(null);
    public static final android.os.Parcelable.Creator<com.facebook.login.DeviceAuthMethodHandler> CREATOR = new android.os.Parcelable.Creator<com.facebook.login.DeviceAuthMethodHandler>() { // from class: com.facebook.login.DeviceAuthMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.DeviceAuthMethodHandler createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.login.DeviceAuthMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.login.DeviceAuthMethodHandler[] newArray(int size) {
            return new com.facebook.login.DeviceAuthMethodHandler[size];
        }
    };

    @kotlin.jvm.JvmStatic
    public static final synchronized java.util.concurrent.ScheduledThreadPoolExecutor getBackgroundExecutor() {
        java.util.concurrent.ScheduledThreadPoolExecutor backgroundExecutor2;
        synchronized (com.facebook.login.DeviceAuthMethodHandler.class) {
            backgroundExecutor2 = INSTANCE.getBackgroundExecutor();
        }
        return backgroundExecutor2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(com.facebook.login.LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "device_auth";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DeviceAuthMethodHandler(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.nameForLogging = "device_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(com.facebook.login.LoginClient.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        showDialog(request);
        return 1;
    }

    private final void showDialog(com.facebook.login.LoginClient.Request request) {
        androidx.fragment.app.FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.facebook.login.DeviceAuthDialog createDeviceAuthDialog = createDeviceAuthDialog();
        createDeviceAuthDialog.show(activity.getSupportFragmentManager(), "login_with_facebook");
        createDeviceAuthDialog.startLogin(request);
    }

    protected com.facebook.login.DeviceAuthDialog createDeviceAuthDialog() {
        return new com.facebook.login.DeviceAuthDialog();
    }

    public void onCancel() {
        getLoginClient().completeAndValidate(com.facebook.login.LoginClient.Result.INSTANCE.createCancelResult(getLoginClient().getPendingRequest(), com.facebook.login.LoginMethodHandler.USER_CANCELED_LOG_IN_ERROR_MESSAGE));
    }

    public void onError(java.lang.Exception ex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ex, "ex");
        getLoginClient().completeAndValidate(com.facebook.login.LoginClient.Result.Companion.createErrorResult$default(com.facebook.login.LoginClient.Result.INSTANCE, getLoginClient().getPendingRequest(), null, ex.getMessage(), null, 8, null));
    }

    public void onSuccess(java.lang.String accessToken, java.lang.String applicationId, java.lang.String userId, java.util.Collection<java.lang.String> permissions, java.util.Collection<java.lang.String> declinedPermissions, java.util.Collection<java.lang.String> expiredPermissions, com.facebook.AccessTokenSource accessTokenSource, java.util.Date expirationTime, java.util.Date lastRefreshTime, java.util.Date dataAccessExpirationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        getLoginClient().completeAndValidate(com.facebook.login.LoginClient.Result.INSTANCE.createTokenResult(getLoginClient().getPendingRequest(), new com.facebook.AccessToken(accessToken, applicationId, userId, permissions, declinedPermissions, expiredPermissions, accessTokenSource, expirationTime, lastRefreshTime, dataAccessExpirationTime, null, 1024, null)));
    }

    @Override // com.facebook.login.LoginMethodHandler
    public java.lang.String getNameForLogging() {
        return this.nameForLogging;
    }

    /* compiled from: DeviceAuthMethodHandler.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0007H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthMethodHandler;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "getBackgroundExecutor", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final synchronized java.util.concurrent.ScheduledThreadPoolExecutor getBackgroundExecutor() {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (com.facebook.login.DeviceAuthMethodHandler.backgroundExecutor == null) {
                com.facebook.login.DeviceAuthMethodHandler.backgroundExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = com.facebook.login.DeviceAuthMethodHandler.backgroundExecutor;
            if (scheduledThreadPoolExecutor == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("backgroundExecutor");
                throw null;
            }
            return scheduledThreadPoolExecutor;
        }
    }
}
