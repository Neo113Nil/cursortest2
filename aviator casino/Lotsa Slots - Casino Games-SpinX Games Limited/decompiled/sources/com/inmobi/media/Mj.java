package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Mj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4839a;
    public final /* synthetic */ com.inmobi.media.ads.network.inmobiJson.model.Image b;
    public final /* synthetic */ com.inmobi.media.Nj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mj(com.inmobi.media.ads.network.inmobiJson.model.Image image, com.inmobi.media.Nj nj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = image;
        this.c = nj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Mj(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Mj(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4839a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList a2 = com.inmobi.media.D4.a(com.ironsource.Y3.d, this.b.getTrackers());
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.c.d;
            com.inmobi.media.ads.network.inmobiJson.model.Link link = this.b.getLink();
            com.inmobi.media.C2937zj c2937zj = new com.inmobi.media.C2937zj(link != null ? link.getUrl() : null, a2);
            this.f4839a = 1;
            if (mutableSharedFlow.emit(c2937zj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
