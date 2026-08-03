package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Y0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2367e1 f5056a;
    public final /* synthetic */ android.view.ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(com.inmobi.media.AbstractC2367e1 abstractC2367e1, android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5056a = abstractC2367e1;
        this.b = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Y0(this.f5056a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Y0(this.f5056a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.iab.omid.library.inmobi.adsession.AdSession adSession = this.f5056a.c;
            if (adSession != null) {
                adSession.registerAdView(this.b);
            }
        } catch (java.lang.IllegalArgumentException e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5056a.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(com.inmobi.media.AbstractC2367e1.f, "Failed to registerAdView. " + android.util.Log.getStackTraceString(e));
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
