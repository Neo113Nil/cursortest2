package com.inmobi.media;

/* renamed from: com.inmobi.media.pm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2679pm extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5397a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ kotlinx.coroutines.flow.MutableStateFlow c;
    public final /* synthetic */ com.inmobi.media.Fm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2679pm(kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow, kotlin.coroutines.Continuation continuation, com.inmobi.media.Fm fm) {
        super(2, continuation);
        this.c = mutableStateFlow;
        this.d = fm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2679pm c2679pm = new com.inmobi.media.C2679pm(this.c, continuation, this.d);
        c2679pm.b = obj;
        return c2679pm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2679pm) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5397a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.c;
            com.inmobi.media.C2652om c2652om = new com.inmobi.media.C2652om(coroutineScope, this.d);
            this.f5397a = 1;
            if (mutableStateFlow.collect(c2652om, this) == coroutine_suspended) {
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
