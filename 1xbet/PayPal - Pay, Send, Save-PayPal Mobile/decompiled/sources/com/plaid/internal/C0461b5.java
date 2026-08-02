package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$sendTestCrash$1", f = "PlaidCrashReporter.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0461b5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6001a;
    public final /* synthetic */ com.plaid.internal.C0471c5 b;
    public final /* synthetic */ java.lang.RuntimeException c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461b5(com.plaid.internal.C0471c5 c0471c5, java.lang.RuntimeException runtimeException, kotlin.coroutines.Continuation<? super com.plaid.internal.C0461b5> continuation) {
        super(2, continuation);
        this.b = c0471c5;
        this.c = runtimeException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0461b5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.C0461b5(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6001a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0471c5 c0471c5 = this.b;
            com.plaid.internal.C0564k0 c0564k0 = c0471c5.c;
            com.plaid.internal.core.crashreporting.internal.models.Crash a2 = c0471c5.b.a(this.c);
            this.f6001a = 1;
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
