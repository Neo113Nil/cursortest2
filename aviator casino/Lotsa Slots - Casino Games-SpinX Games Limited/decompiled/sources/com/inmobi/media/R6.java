package com.inmobi.media;

/* loaded from: classes5.dex */
public final class R6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2433gd f4932a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(com.inmobi.media.C2433gd c2433gd, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4932a = c2433gd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.R6(this.f4932a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.R6(this.f4932a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2433gd c2433gd = this.f4932a;
        com.inmobi.media.Pc pc = c2433gd.d;
        com.inmobi.media.G g = c2433gd.f5559a.b;
        pc.onAdFetchSuccessful(new com.inmobi.ads.AdMetaInfo(g.e, g.l));
        return kotlin.Unit.INSTANCE;
    }
}
