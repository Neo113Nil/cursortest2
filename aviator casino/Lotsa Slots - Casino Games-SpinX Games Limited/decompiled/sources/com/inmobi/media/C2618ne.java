package com.inmobi.media;

/* renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2618ne extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5356a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow c;
    public final /* synthetic */ com.inmobi.media.Be d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2618ne(kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow, kotlin.coroutines.Continuation continuation, com.inmobi.media.Be be) {
        super(2, continuation);
        this.c = mutableSharedFlow;
        this.d = be;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2618ne c2618ne = new com.inmobi.media.C2618ne(this.c, continuation, this.d);
        c2618ne.b = obj;
        return c2618ne;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2618ne) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5356a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.c;
            com.inmobi.media.C2590me c2590me = new com.inmobi.media.C2590me(coroutineScope, this.d);
            this.f5356a = 1;
            if (mutableSharedFlow.collect(c2590me, this) == coroutine_suspended) {
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
