package com.inmobi.media;

/* renamed from: com.inmobi.media.c1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2314c1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.AbstractC2367e1 f5132a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314c1(com.inmobi.media.AbstractC2367e1 abstractC2367e1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5132a = abstractC2367e1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2314c1(this.f5132a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2314c1(this.f5132a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.iab.omid.library.inmobi.adsession.AdSession adSession = this.f5132a.c;
        if (adSession != null) {
            adSession.finish();
        }
        this.f5132a.c = null;
        return kotlin.Unit.INSTANCE;
    }
}
