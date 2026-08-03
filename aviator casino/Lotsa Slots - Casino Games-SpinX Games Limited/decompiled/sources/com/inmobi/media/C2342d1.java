package com.inmobi.media;

/* renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2342d1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2367e1 f5149a;
    public final /* synthetic */ com.iab.omid.library.inmobi.adsession.media.InteractionType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2342d1(com.inmobi.media.AbstractC2367e1 abstractC2367e1, com.iab.omid.library.inmobi.adsession.media.InteractionType interactionType, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5149a = abstractC2367e1;
        this.b = interactionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2342d1(this.f5149a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2342d1(this.f5149a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents = this.f5149a.d;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(this.b);
        }
        return kotlin.Unit.INSTANCE;
    }
}
