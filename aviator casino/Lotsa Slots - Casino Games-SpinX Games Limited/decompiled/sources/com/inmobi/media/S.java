package com.inmobi.media;

/* loaded from: classes5.dex */
public final class S extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.U f4946a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(com.inmobi.media.U u, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f4946a = u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.S(this.f4946a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.S(this.f4946a, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object a2 = com.inmobi.media.L3.a(new com.inmobi.media.Q(this.f4946a));
        com.inmobi.media.U u = this.f4946a;
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a2);
        if (m10801exceptionOrNullimpl != null) {
            u.a(m10801exceptionOrNullimpl);
        }
        return kotlin.Unit.INSTANCE;
    }
}
