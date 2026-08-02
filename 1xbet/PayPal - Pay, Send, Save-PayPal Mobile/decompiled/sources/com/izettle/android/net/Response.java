package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/izettle/android/net/Response;", "T", "", "", "code", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "", "errorBody", "Lcom/izettle/android/net/Headers;", "headers", "Lcom/izettle/android/net/Request;", "request", "priorResponse", "<init>", "(ILjava/lang/Object;Ljava/lang/String;Lcom/izettle/android/net/Headers;Lcom/izettle/android/net/Request;Lcom/izettle/android/net/Response;)V", "Ljava/lang/Object;", "getBody", "()Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getCode", "()I", "Ljava/lang/String;", "getErrorBody", "()Ljava/lang/String;", "Lcom/izettle/android/net/Headers;", "getHeaders", "()Lcom/izettle/android/net/Headers;", "", "isSuccessful", "()Z", "Lcom/izettle/android/net/Response;", "getPriorResponse", "()Lcom/izettle/android/net/Response;", "Lcom/izettle/android/net/Request;", "getRequest", "()Lcom/izettle/android/net/Request;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Response<T> {
    private final T body;
    private final int code;
    private final java.lang.String errorBody;
    private final com.izettle.android.net.Headers headers;
    private final com.izettle.android.net.Response<?> priorResponse;
    private final com.izettle.android.net.Request request;

    public Response(int i, T t, java.lang.String str, com.izettle.android.net.Headers headers, com.izettle.android.net.Request request, com.izettle.android.net.Response<?> response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.code = i;
        this.body = t;
        this.errorBody = str;
        this.headers = headers;
        this.request = request;
        this.priorResponse = response;
    }

    public /* synthetic */ Response(int i, java.lang.Object obj, java.lang.String str, com.izettle.android.net.Headers headers, com.izettle.android.net.Request request, com.izettle.android.net.Response response, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, str, headers, request, (i2 & 32) != 0 ? null : response);
    }

    public final int getCode() {
        return this.code;
    }

    public final T getBody() {
        return this.body;
    }

    public final java.lang.String getErrorBody() {
        return this.errorBody;
    }

    public final com.izettle.android.net.Headers getHeaders() {
        return this.headers;
    }

    public final com.izettle.android.net.Request getRequest() {
        return this.request;
    }

    public final com.izettle.android.net.Response<?> getPriorResponse() {
        return this.priorResponse;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i < 300;
    }
}
