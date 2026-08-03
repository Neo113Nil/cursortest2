package com.inmobi.media;

/* loaded from: classes5.dex */
public final class He extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ie f4745a;
    public final /* synthetic */ com.iab.omid.library.inmobi.adsession.AdSessionConfiguration b;
    public final /* synthetic */ com.iab.omid.library.inmobi.adsession.AdSessionContext c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public He(com.inmobi.media.Ie ie, com.iab.omid.library.inmobi.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.inmobi.adsession.AdSessionContext adSessionContext, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4745a = ie;
        this.b = adSessionConfiguration;
        this.c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.He(this.f4745a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.He) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Ie ie = this.f4745a;
        com.iab.omid.library.inmobi.adsession.AdSessionConfiguration adSessionConfiguration = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNull(adSessionConfiguration);
        com.iab.omid.library.inmobi.adsession.AdSessionContext adSessionContext = this.c;
        int i = com.inmobi.media.Ie.i;
        ie.a(adSessionConfiguration, adSessionContext);
        this.f4745a.b();
        this.f4745a.c();
        return kotlin.Unit.INSTANCE;
    }
}
