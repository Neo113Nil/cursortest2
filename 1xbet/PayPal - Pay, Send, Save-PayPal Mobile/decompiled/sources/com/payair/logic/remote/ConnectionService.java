package com.payair.logic.remote;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001d*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u001e\u001dJ\r\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/payair/logic/remote/ConnectionService;", "Lcom/payair/hce/communication/JsonResponse;", "T", "", "sendRequest", "()Lcom/payair/hce/communication/JsonResponse;", "Lcom/payair/logic/remote/HTTPmethod;", "a", "Lcom/payair/logic/remote/HTTPmethod;", "getMethod", "()Lcom/payair/logic/remote/HTTPmethod;", "method", "", util.h.xy.cb.b.f1091, "Ljava/lang/String;", "getEndpoint", "()Ljava/lang/String;", "endpoint", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "getResponse", "()Ljava/lang/Class;", "response", "d", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "payload", "Companion", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConnectionService<T extends com.payair.hce.communication.JsonResponse> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.remote.ConnectionService.Companion INSTANCE = new com.payair.logic.remote.ConnectionService.Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final com.payair.logic.remote.HTTPmethod method;

    /* renamed from: b, reason: from kotlin metadata */
    public final java.lang.String endpoint;

    /* renamed from: c, reason: from kotlin metadata */
    public final java.lang.Class response;

    /* renamed from: d, reason: from kotlin metadata */
    public final java.lang.Object payload;
    public final com.payair.logic.implementation.HceSDKInterface e;

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Lcom/payair/logic/remote/ConnectionService$Builder;", "Lcom/payair/hce/communication/JsonResponse;", "T", "", "Ljava/lang/Class;", "response", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSdk", "<init>", "(Ljava/lang/Class;Lcom/payair/logic/implementation/HceSDKInterface;)V", "Lcom/payair/logic/remote/HTTPmethod;", "method", "(Lcom/payair/logic/remote/HTTPmethod;)Lcom/payair/logic/remote/ConnectionService$Builder;", "payload", "(Ljava/lang/Object;)Lcom/payair/logic/remote/ConnectionService$Builder;", "", "endpoint", "(Ljava/lang/String;)Lcom/payair/logic/remote/ConnectionService$Builder;", "Lcom/payair/logic/remote/ConnectionService;", "build", "()Lcom/payair/logic/remote/ConnectionService;", "sendRequest", "()Lcom/payair/hce/communication/JsonResponse;", "a", "Ljava/lang/Class;", "getResponse", "()Ljava/lang/Class;", util.h.xy.cb.b.f1091, "Lcom/payair/logic/implementation/HceSDKInterface;", "getHceSdk", "()Lcom/payair/logic/implementation/HceSDKInterface;", "p0", "c", "Ljava/lang/String;", "getEndpoint", "()Ljava/lang/String;", "d", "Lcom/payair/logic/remote/HTTPmethod;", "getMethod", "()Lcom/payair/logic/remote/HTTPmethod;", "e", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder<T extends com.payair.hce.communication.JsonResponse> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final java.lang.Class response;

        /* renamed from: b, reason: from kotlin metadata */
        public final com.payair.logic.implementation.HceSDKInterface hceSdk;

        /* renamed from: c, reason: from kotlin metadata */
        public java.lang.String endpoint;

        /* renamed from: d, reason: from kotlin metadata */
        public com.payair.logic.remote.HTTPmethod method;

        /* renamed from: e, reason: from kotlin metadata */
        public java.lang.Object payload;

        public Builder(java.lang.Class<T> cls, com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
            this.response = cls;
            this.hceSdk = hceSDKInterface;
            this.endpoint = "";
            this.method = com.payair.logic.remote.HTTPmethod.GET;
        }

        public final com.payair.logic.remote.ConnectionService<T> build() {
            return new com.payair.logic.remote.ConnectionService<>(this, null);
        }

        public final com.payair.logic.remote.ConnectionService.Builder<T> endpoint(java.lang.String endpoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "");
            this.endpoint = endpoint;
            return this;
        }

        public final java.lang.String getEndpoint() {
            return this.endpoint;
        }

        public final com.payair.logic.implementation.HceSDKInterface getHceSdk() {
            return this.hceSdk;
        }

        public final com.payair.logic.remote.HTTPmethod getMethod() {
            return this.method;
        }

        public final java.lang.Object getPayload() {
            return this.payload;
        }

        public final java.lang.Class<T> getResponse() {
            return this.response;
        }

        public final com.payair.logic.remote.ConnectionService.Builder<T> method(com.payair.logic.remote.HTTPmethod method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            this.method = method;
            return this;
        }

        public final com.payair.logic.remote.ConnectionService.Builder<T> payload(java.lang.Object payload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            this.payload = payload;
            return this;
        }

        public final T sendRequest() {
            return build().sendRequest();
        }
    }

    public ConnectionService(com.payair.logic.remote.ConnectionService.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this.e = builder.getHceSdk();
        this.method = builder.getMethod();
        this.endpoint = builder.getEndpoint();
        this.response = builder.getResponse();
        this.payload = builder.getPayload();
    }

    public final java.lang.String getEndpoint() {
        return this.endpoint;
    }

    public final com.payair.logic.remote.HTTPmethod getMethod() {
        return this.method;
    }

    public final java.lang.Object getPayload() {
        return this.payload;
    }

    public final java.lang.Class<T> getResponse() {
        return this.response;
    }

    public final T sendRequest() {
        T t = (T) this.response.getDeclaredConstructor(null).newInstance(null);
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface = this.e;
        java.lang.String str = this.endpoint;
        java.lang.Object obj = this.payload;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
        T t2 = (T) hceSDKInterface.sendConnectionRequest(str, obj, t, this.method);
        if (t2.isSuccessful()) {
            com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
            boolean isSuccessful = t2.isSuccessful();
            java.lang.Integer statusCode = t2.getStatusCode();
            java.lang.Integer statusCodeFromServer = t2.getStatusCodeFromServer();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("actualRequestResponse: ");
            sb.append(isSuccessful);
            sb.append(" statusCode:");
            sb.append(statusCode);
            sb.append(" statusCodeFromServer:");
            sb.append(statusCodeFromServer);
            com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
            kotlin.jvm.internal.Intrinsics.checkNotNull(t2, "");
            return t2;
        }
        t.setSuccessful(t2.isSuccessful());
        t.setErrors(t2.getErrors());
        t.setStatusCode(t2.getStatusCode());
        t.setStatusCodeFromServer(t2.getStatusCodeFromServer());
        t.setStatusMessage(t2.getStatusMessage());
        t.setNetworkError(t2.isNetworkError());
        com.paypal.android.logger.Logger log2 = com.payair.logging.LoggerKt.getLog();
        boolean isSuccessful2 = t.isSuccessful();
        java.lang.Integer statusCode2 = t.getStatusCode();
        java.lang.Integer statusCodeFromServer2 = t.getStatusCodeFromServer();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("response:  ");
        sb2.append(isSuccessful2);
        sb2.append(" statusCode:");
        sb2.append(statusCode2);
        sb2.append(" statusCodeFromServer:");
        sb2.append(statusCodeFromServer2);
        com.paypal.android.logger.Logger.e$default(log2, sb2.toString(), null, null, null, 14, null);
        if (t.getErrors() != null) {
            com.paypal.android.logger.Logger log3 = com.payair.logging.LoggerKt.getLog();
            java.util.List<com.payair.hce.ErrorModel> errors = t.getErrors();
            com.paypal.android.logger.Logger.e$default(log3, java.lang.String.valueOf(errors != null ? kotlin.collections.CollectionsKt.joinToString$default(errors, null, null, null, 0, null, com.payair.csdk.h.f4256a, 31, null) : null), null, null, null, 14, null);
        }
        t.setSuccessful(false);
        return t;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/logic/remote/ConnectionService$Companion;", "", "Lcom/payair/hce/communication/JsonResponse;", "T", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSdk", "Lcom/payair/logic/remote/ConnectionService$Builder;", "Builder", "(Lcom/payair/logic/implementation/HceSDKInterface;)Lcom/payair/logic/remote/ConnectionService$Builder;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final /* synthetic */ <T extends com.payair.hce.communication.JsonResponse> com.payair.logic.remote.ConnectionService.Builder<T> Builder(com.payair.logic.implementation.HceSDKInterface hceSdk) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSdk, "");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return new com.payair.logic.remote.ConnectionService.Builder<>(com.payair.hce.communication.JsonResponse.class, hceSdk);
        }
    }
}
