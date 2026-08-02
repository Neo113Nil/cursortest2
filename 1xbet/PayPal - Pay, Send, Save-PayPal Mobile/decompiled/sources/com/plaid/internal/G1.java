package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.link.LinkActivity$openOutOfProcessWebview$1", f = "LinkActivity.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class G1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5791a;
    public final /* synthetic */ com.plaid.internal.link.LinkActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(com.plaid.internal.link.LinkActivity linkActivity, kotlin.coroutines.Continuation<? super com.plaid.internal.G1> continuation) {
        super(2, continuation);
        this.b = linkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.G1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.G1(this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5791a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0702z4 a2 = com.plaid.internal.link.LinkActivity.a(this.b);
            this.f5791a = 1;
            obj = a2.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str == null) {
            com.plaid.internal.Y6.a.a("No uri available in pane storage for Out Of Process WebView");
            com.plaid.internal.link.LinkActivity.a(this.b).a();
            return kotlin.Unit.INSTANCE;
        }
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Opening Custom Tab for ".concat(java.lang.String.valueOf(str)), true);
        this.b.a(str);
        com.plaid.internal.link.LinkActivity.a(this.b).c();
        com.plaid.internal.link.LinkActivity.c(this.b);
        return kotlin.Unit.INSTANCE;
    }
}
