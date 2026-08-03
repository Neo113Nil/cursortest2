package com.inmobi.media;

/* renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2629o extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {
    public C2629o(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2629o(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2629o((kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.inmobi.media.C2682q.d.get()) {
            com.inmobi.media.C2682q c2682q = com.inmobi.media.C2682q.f5400a;
            if (com.inmobi.media.C2682q.b()) {
                com.inmobi.media.C2682q.a(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
