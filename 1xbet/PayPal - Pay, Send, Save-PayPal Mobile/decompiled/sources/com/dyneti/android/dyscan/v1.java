package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class v1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3347a;
    public final /* synthetic */ com.dyneti.android.dyscan.w1 b;
    public final /* synthetic */ com.dyneti.android.dyscan.n2 c;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.dyneti.android.dyscan.v1(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3347a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.dyneti.android.dyscan.w1 w1Var = this.b;
            com.dyneti.android.dyscan.n2 n2Var = this.c;
            this.f3347a = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.dyneti.android.dyscan.u1(w1Var, n2Var, null), this);
            if (obj == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.dyneti.android.dyscan.v1(this.b, this.c, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.dyneti.android.dyscan.w1 w1Var, com.dyneti.android.dyscan.n2 n2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = w1Var;
        this.c = n2Var;
    }
}
