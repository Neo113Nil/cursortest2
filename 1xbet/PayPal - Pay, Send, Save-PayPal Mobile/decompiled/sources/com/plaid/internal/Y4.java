package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.PlaidCrashHandler$handleCrash$1", f = "PlaidCrashHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class Y4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5980a;
    public final /* synthetic */ com.plaid.internal.Z4 b;
    public final /* synthetic */ java.lang.Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(com.plaid.internal.Z4 z4, java.lang.Throwable th, kotlin.coroutines.Continuation<? super com.plaid.internal.Y4> continuation) {
        super(2, continuation);
        this.b = z4;
        this.c = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.Y4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.Y4(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5980a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.Z4 z4 = this.b;
            com.plaid.internal.C0564k0 c0564k0 = z4.b;
            com.plaid.internal.core.crashreporting.internal.models.Crash a2 = z4.f5987a.a(this.c);
            this.f5980a = 1;
            if (c0564k0.a(a2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
