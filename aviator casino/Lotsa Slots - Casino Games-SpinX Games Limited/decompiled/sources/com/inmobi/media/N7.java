package com.inmobi.media;

/* loaded from: classes5.dex */
public final class N7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f4849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N7(kotlin.coroutines.Continuation continuation, com.inmobi.media.R7 r7) {
        super(2, continuation);
        this.f4849a = r7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.N7(continuation, this.f4849a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.N7((kotlin.coroutines.Continuation) obj2, this.f4849a).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.R7 r7 = this.f4849a;
        r7.n.addView(r7.o, 0);
        return kotlin.Unit.INSTANCE;
    }
}
