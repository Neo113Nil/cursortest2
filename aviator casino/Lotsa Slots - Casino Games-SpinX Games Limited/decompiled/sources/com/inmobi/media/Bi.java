package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bi extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ei f4626a;
    public final /* synthetic */ java.util.Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bi(com.inmobi.media.Ei ei, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4626a = ei;
        this.b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Bi(this.f4626a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Bi(this.f4626a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Ei ei = this.f4626a;
        if (ei.a(ei.c.b)) {
            com.inmobi.media.InterfaceC2772t9 l = this.f4626a.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).b("AUM-RenderedState", "onAdClicked callback blocked.");
            }
        } else {
            this.f4626a.d.onAdClicked(this.b);
        }
        return kotlin.Unit.INSTANCE;
    }
}
