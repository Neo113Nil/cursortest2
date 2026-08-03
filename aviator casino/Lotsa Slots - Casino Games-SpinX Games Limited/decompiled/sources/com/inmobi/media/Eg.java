package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Eg extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Fg f4686a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eg(com.inmobi.media.Fg fg, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4686a = fg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Eg(this.f4686a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Eg(this.f4686a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Fg fg = this.f4686a;
        fg.b.setValue(fg.f4708a.a());
        return kotlin.Unit.INSTANCE;
    }
}
