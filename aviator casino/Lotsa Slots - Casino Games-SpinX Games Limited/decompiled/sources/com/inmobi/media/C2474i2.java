package com.inmobi.media;

/* renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2474i2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Kc f5250a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2474i2(com.inmobi.media.Kc kc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5250a = kc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2474i2(this.f5250a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2474i2(this.f5250a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.iab.omid.library.inmobi.adsession.AdEvents adEvents = this.f5250a.e;
        if (adEvents != null) {
            adEvents.loaded();
        }
        return kotlin.Unit.INSTANCE;
    }
}
