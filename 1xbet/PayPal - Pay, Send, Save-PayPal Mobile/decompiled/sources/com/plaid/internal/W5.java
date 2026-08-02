package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1$2$1", f = "PlaidWebview.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class W5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.P5 f5964a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5(com.plaid.internal.P5 p5, java.lang.String str, kotlin.coroutines.Continuation<? super com.plaid.internal.W5> continuation) {
        super(2, continuation);
        this.f5964a = p5;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.W5(this.f5964a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.W5(this.f5964a, this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f5964a.a().get()) {
            com.plaid.internal.Y6.a.a("Webview is destroyed, cannot submit data");
            return kotlin.Unit.INSTANCE;
        }
        com.plaid.internal.P5 p5 = this.f5964a;
        java.lang.String str = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("javascript:window.SdkJsBridge.send('");
        sb.append(str);
        sb.append("')");
        p5.loadUrl(sb.toString());
        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "JSBridge - sent submit");
        return kotlin.Unit.INSTANCE;
    }
}
