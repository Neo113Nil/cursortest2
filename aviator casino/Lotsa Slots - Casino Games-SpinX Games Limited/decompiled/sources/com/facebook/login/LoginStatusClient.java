package com.facebook.login;

/* compiled from: LoginStatusClient.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/login/LoginStatusClient;", "Lcom/facebook/internal/PlatformServiceClient;", "context", "Landroid/content/Context;", "applicationId", "", "loggerRef", "graphApiVersion", "toastDurationMs", "", "nonce", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "populateRequestBundle", "", "data", "Landroid/os/Bundle;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginStatusClient extends com.facebook.internal.PlatformServiceClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.LoginStatusClient.Companion INSTANCE = new com.facebook.login.LoginStatusClient.Companion(null);
    public static final long DEFAULT_TOAST_DURATION_MS = 5000;
    private final java.lang.String graphApiVersion;
    private final java.lang.String loggerRef;
    private final long toastDurationMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginStatusClient(android.content.Context context, java.lang.String applicationId, java.lang.String loggerRef, java.lang.String graphApiVersion, long j, java.lang.String str) {
        super(context, com.facebook.internal.NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REQUEST, com.facebook.internal.NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REPLY, com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20170411, applicationId, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerRef, "loggerRef");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
        this.loggerRef = loggerRef;
        this.graphApiVersion = graphApiVersion;
        this.toastDurationMs = j;
    }

    @Override // com.facebook.internal.PlatformServiceClient
    protected void populateRequestBundle(android.os.Bundle data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        data.putString(com.facebook.internal.NativeProtocol.EXTRA_LOGGER_REF, this.loggerRef);
        data.putString(com.facebook.internal.NativeProtocol.EXTRA_GRAPH_API_VERSION, this.graphApiVersion);
        data.putLong(com.facebook.internal.NativeProtocol.EXTRA_TOAST_DURATION_MS, this.toastDurationMs);
    }

    /* compiled from: LoginStatusClient.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/login/LoginStatusClient$Companion;", "", "()V", "DEFAULT_TOAST_DURATION_MS", "", "newInstance", "Lcom/facebook/login/LoginStatusClient;", "context", "Landroid/content/Context;", "applicationId", "", "loggerRef", "graphApiVersion", "toastDurationMs", "nonce", "newInstance$facebook_common_release", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.facebook.login.LoginStatusClient newInstance$facebook_common_release(android.content.Context context, java.lang.String applicationId, java.lang.String loggerRef, java.lang.String graphApiVersion, long toastDurationMs, java.lang.String nonce) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerRef, "loggerRef");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
            return new com.facebook.login.LoginStatusClient(context, applicationId, loggerRef, graphApiVersion, toastDurationMs, nonce);
        }
    }
}
