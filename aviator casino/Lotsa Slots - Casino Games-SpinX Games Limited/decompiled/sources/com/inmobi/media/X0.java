package com.inmobi.media;

/* loaded from: classes5.dex */
public final class X0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ie f5042a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(com.inmobi.media.Ie ie, android.view.View view, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5042a = ie;
        this.b = view;
        this.c = friendlyObstructionPurpose;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.X0(this.f5042a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.X0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.iab.omid.library.inmobi.adsession.AdSession adSession = this.f5042a.c;
            if (adSession != null) {
                adSession.addFriendlyObstruction(this.b, this.c, null);
            }
        } catch (java.lang.IllegalArgumentException e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5042a.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(com.inmobi.media.AbstractC2367e1.f, "Failed to addObstruction. Reason: " + android.util.Log.getStackTraceString(e));
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
