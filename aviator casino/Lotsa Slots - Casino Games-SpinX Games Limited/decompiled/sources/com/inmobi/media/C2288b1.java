package com.inmobi.media;

/* renamed from: com.inmobi.media.b1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2288b1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2367e1 f5112a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2288b1(com.inmobi.media.AbstractC2367e1 abstractC2367e1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5112a = abstractC2367e1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2288b1(this.f5112a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2288b1(this.f5112a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.iab.omid.library.inmobi.adsession.AdSession adSession = this.f5112a.c;
            if (adSession != null) {
                adSession.start();
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.AbstractC2367e1 abstractC2367e1 = this.f5112a;
            abstractC2367e1.c = null;
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = abstractC2367e1.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(com.inmobi.media.AbstractC2367e1.f, "AdSession start error " + e);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
