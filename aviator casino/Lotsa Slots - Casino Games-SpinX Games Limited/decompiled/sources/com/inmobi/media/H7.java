package com.inmobi.media;

/* loaded from: classes5.dex */
public final class H7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f4740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(kotlin.coroutines.Continuation continuation, com.inmobi.media.R7 r7) {
        super(2, continuation);
        this.f4740a = r7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.H7(continuation, this.f4740a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.H7((kotlin.coroutines.Continuation) obj2, this.f4740a).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f4740a.p.pause();
        this.f4740a.x.a();
        com.inmobi.media.W7 w7 = this.f4740a.y;
        w7.b.setVolume(0.0f);
        w7.d.a();
        com.inmobi.media.R7 r7 = this.f4740a;
        r7.l.set(com.inmobi.media.Bg.e);
        com.inmobi.media.R7 r72 = this.f4740a;
        r72.a(new com.inmobi.media.C2417fn(r72.p.getCurrentPosition()));
        return kotlin.Unit.INSTANCE;
    }
}
