package com.facebook.login;

/* compiled from: GetTokenClient.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/facebook/login/GetTokenClient;", "Lcom/facebook/internal/PlatformServiceClient;", "context", "Landroid/content/Context;", "request", "Lcom/facebook/login/LoginClient$Request;", "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V", "populateRequestBundle", "", "data", "Landroid/os/Bundle;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GetTokenClient extends com.facebook.internal.PlatformServiceClient {
    @Override // com.facebook.internal.PlatformServiceClient
    protected void populateRequestBundle(android.os.Bundle data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenClient(android.content.Context context, com.facebook.login.LoginClient.Request request) {
        super(context, 65536, com.facebook.internal.NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, com.facebook.internal.NativeProtocol.PROTOCOL_VERSION_20121101, request.getApplicationId(), request.getNonce());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
    }
}
