package com.inmobi.media;

/* renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2844w2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2895y2 f5520a;
    public final /* synthetic */ com.iab.omid.library.inmobi.adsession.media.VastProperties b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2844w2(com.inmobi.media.AbstractC2895y2 abstractC2895y2, com.iab.omid.library.inmobi.adsession.media.VastProperties vastProperties, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5520a = abstractC2895y2;
        this.b = vastProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2844w2(this.f5520a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2844w2(this.f5520a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.iab.omid.library.inmobi.adsession.AdEvents adEvents = this.f5520a.e;
        if (adEvents != null) {
            adEvents.loaded(this.b);
        }
        return kotlin.Unit.INSTANCE;
    }
}
