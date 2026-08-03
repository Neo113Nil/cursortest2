package com.inmobi.media;

/* renamed from: com.inmobi.media.qn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2706qn extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5413a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow c;
    public final /* synthetic */ com.inmobi.media.C2760sn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2706qn(kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow, kotlin.coroutines.Continuation continuation, com.inmobi.media.C2760sn c2760sn) {
        super(2, continuation);
        this.c = mutableSharedFlow;
        this.d = c2760sn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2706qn c2706qn = new com.inmobi.media.C2706qn(this.c, continuation, this.d);
        c2706qn.b = obj;
        return c2706qn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2706qn) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5413a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.c;
            com.inmobi.media.C2680pn c2680pn = new com.inmobi.media.C2680pn(coroutineScope, this.d);
            this.f5413a = 1;
            if (mutableSharedFlow.collect(c2680pn, this) == coroutine_suspended) {
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
