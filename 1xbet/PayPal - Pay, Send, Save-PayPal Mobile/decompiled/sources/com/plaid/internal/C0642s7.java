package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.sna.TwilioAuthController$asyncAuthentication$result$1", f = "TwilioAuthController.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.s7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0642s7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.InterfaceC0624q6>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6569a;
    public final /* synthetic */ com.plaid.internal.C0651t7 b;
    public final /* synthetic */ com.plaid.internal.C0660u7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0642s7(com.plaid.internal.C0651t7 c0651t7, com.plaid.internal.C0660u7 c0660u7, kotlin.coroutines.Continuation<? super com.plaid.internal.C0642s7> continuation) {
        super(2, continuation);
        this.b = c0651t7;
        this.c = c0660u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0642s7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.InterfaceC0624q6> continuation) {
        return new com.plaid.internal.C0642s7(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6569a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.plaid.internal.InterfaceC0669v7 interfaceC0669v7 = this.b.f6583a;
        java.lang.String str = this.c.b;
        this.f6569a = 1;
        java.lang.Object a2 = interfaceC0669v7.a(str, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
