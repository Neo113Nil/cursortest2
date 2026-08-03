package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Xk extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {
    public Xk(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Xk(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.Xk((kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred deferred;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2282al c2282al = com.inmobi.media.C2282al.f5108a;
        if (com.inmobi.media.C2282al.b.b.get() != null && (deferred = com.inmobi.media.C2282al.d) != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
