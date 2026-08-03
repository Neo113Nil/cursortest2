package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Lh extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ph f4821a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lh(com.inmobi.media.Ph ph, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f4821a = ph;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Lh(this.f4821a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.Lh(this.f4821a, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f4821a.k.getAndIncrement();
        this.f4821a.getClass();
        this.f4821a.a(false);
        return kotlin.Unit.INSTANCE;
    }
}
