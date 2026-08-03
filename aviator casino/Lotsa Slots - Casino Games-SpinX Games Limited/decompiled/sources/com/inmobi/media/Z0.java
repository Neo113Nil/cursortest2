package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Z0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2367e1 f5075a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(com.inmobi.media.AbstractC2367e1 abstractC2367e1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5075a = abstractC2367e1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Z0(this.f5075a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Z0(this.f5075a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.iab.omid.library.inmobi.adsession.AdEvents adEvents = this.f5075a.e;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
        return kotlin.Unit.INSTANCE;
    }
}
