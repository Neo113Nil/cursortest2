package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$clearStoredState$1", f = "WebviewViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 159, 160}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class S7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5921a;
    public final /* synthetic */ com.plaid.internal.U7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7(com.plaid.internal.U7 u7, kotlin.coroutines.Continuation<? super com.plaid.internal.S7> continuation) {
        super(2, continuation);
        this.b = u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.S7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.S7(this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r5.a(r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r8.a(r7) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        if (r8.a((kotlin.coroutines.jvm.internal.SuspendLambda) r7) != r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5921a;
        com.plaid.internal.InterfaceC0677w6 interfaceC0677w6 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.B6 b6 = this.b.e;
            if (b6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                b6 = null;
            }
            this.f5921a = 1;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.InterfaceC0677w6 interfaceC0677w62 = this.b.i;
            if (interfaceC0677w62 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                interfaceC0677w6 = interfaceC0677w62;
            }
            this.f5921a = 3;
        }
        com.plaid.internal.A6 a6 = this.b.f;
        if (a6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            a6 = null;
        }
        this.f5921a = 2;
    }
}
