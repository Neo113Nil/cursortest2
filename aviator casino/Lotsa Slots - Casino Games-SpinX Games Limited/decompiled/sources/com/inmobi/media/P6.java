package com.inmobi.media;

/* loaded from: classes5.dex */
public final class P6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Q6 f4889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6(com.inmobi.media.Q6 q6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4889a = q6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.P6(this.f4889a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.P6(this.f4889a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Q6 q6 = this.f4889a;
        com.inmobi.media.Pc pc = q6.f;
        com.inmobi.ads.InMobiAdRequestStatus status = q6.e;
        pc.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        pc.onAdLoadFailed(status);
        return kotlin.Unit.INSTANCE;
    }
}
