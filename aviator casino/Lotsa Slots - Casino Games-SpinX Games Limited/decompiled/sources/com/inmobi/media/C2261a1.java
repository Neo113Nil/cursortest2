package com.inmobi.media;

/* renamed from: com.inmobi.media.a1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2261a1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ie f5092a;
    public final /* synthetic */ android.view.View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261a1(com.inmobi.media.Ie ie, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5092a = ie;
        this.b = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2261a1(this.f5092a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2261a1(this.f5092a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.iab.omid.library.inmobi.adsession.AdSession adSession = this.f5092a.c;
            if (adSession != null) {
                adSession.removeFriendlyObstruction(this.b);
            }
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.String str = com.inmobi.media.AbstractC2367e1.f;
            android.util.Log.getStackTraceString(e);
        }
        return kotlin.Unit.INSTANCE;
    }
}
