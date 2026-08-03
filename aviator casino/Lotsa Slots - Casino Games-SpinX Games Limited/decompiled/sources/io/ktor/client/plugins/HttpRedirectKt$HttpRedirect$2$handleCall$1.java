package io.ktor.client.plugins;

/* compiled from: HttpRedirect.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpRedirectKt", f = "HttpRedirect.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {97}, m = "HttpRedirect$lambda$2$handleCall", n = {"$this$HttpRedirect_u24lambda_u242_u24handleCall", "context", "client", "call", "requestBuilder", "originProtocol", "originAuthority", "allowHttpsDowngrade"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"})
/* loaded from: classes6.dex */
final class HttpRedirectKt$HttpRedirect$2$handleCall$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;

    HttpRedirectKt$HttpRedirect$2$handleCall$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$handleCall$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object HttpRedirect$lambda$2$handleCall;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        HttpRedirect$lambda$2$handleCall = io.ktor.client.plugins.HttpRedirectKt.HttpRedirect$lambda$2$handleCall(null, null, null, false, null, this);
        return HttpRedirect$lambda$2$handleCall;
    }
}
