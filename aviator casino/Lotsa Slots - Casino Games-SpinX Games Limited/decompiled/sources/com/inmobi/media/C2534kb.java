package com.inmobi.media;

/* renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2534kb extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2561lb f5293a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2534kb(com.inmobi.media.C2561lb c2561lb, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5293a = c2561lb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2534kb(this.f5293a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2534kb(this.f5293a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2561lb c2561lb = this.f5293a;
        com.inmobi.media.Pc pc = c2561lb.f;
        com.inmobi.ads.InMobiAdRequestStatus status = c2561lb.e;
        pc.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        pc.onAdLoadFailed(status);
        return kotlin.Unit.INSTANCE;
    }
}
