package com.inmobi.media;

/* renamed from: com.inmobi.media.q8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2691q8 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2742s8 f5407a;
    public final /* synthetic */ com.inmobi.media.Zj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2691q8(com.inmobi.media.C2742s8 c2742s8, com.inmobi.media.Zj zj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5407a = c2742s8;
        this.b = zj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2691q8(this.f5407a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2691q8(this.f5407a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2742s8 c2742s8 = this.f5407a;
        c2742s8.f = this.b;
        c2742s8.d.a(c2742s8.h);
        return kotlin.Unit.INSTANCE;
    }
}
