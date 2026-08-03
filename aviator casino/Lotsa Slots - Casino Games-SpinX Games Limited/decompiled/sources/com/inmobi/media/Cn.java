package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Cn extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Gn f4649a;
    public final /* synthetic */ com.inmobi.media.Zj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cn(com.inmobi.media.Gn gn, com.inmobi.media.Zj zj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4649a = gn;
        this.b = zj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Cn(this.f4649a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Cn(this.f4649a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Gn gn = this.f4649a;
        gn.h = this.b;
        gn.f.a(gn.j);
        return kotlin.Unit.INSTANCE;
    }
}
