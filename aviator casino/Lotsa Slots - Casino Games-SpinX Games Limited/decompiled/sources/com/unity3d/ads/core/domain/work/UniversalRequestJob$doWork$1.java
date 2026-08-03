package com.unity3d.ads.core.domain.work;

/* compiled from: UniversalRequestJob.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.work.UniversalRequestJob", f = "UniversalRequestJob.kt", i = {0, 0, 1, 1}, l = {27, 30, 33}, m = "doWork$suspendImpl", n = {"$this", com.unity3d.ads.core.domain.work.UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID, "$this", com.unity3d.ads.core.domain.work.UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class UniversalRequestJob$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.work.UniversalRequestJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniversalRequestJob$doWork$1(com.unity3d.ads.core.domain.work.UniversalRequestJob universalRequestJob, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1> continuation) {
        super(continuation);
        this.this$0 = universalRequestJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork$suspendImpl(this.this$0, this);
    }
}
