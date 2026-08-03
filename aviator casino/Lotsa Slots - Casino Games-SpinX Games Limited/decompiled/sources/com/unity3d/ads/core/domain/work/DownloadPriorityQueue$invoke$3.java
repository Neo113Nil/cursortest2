package com.unity3d.ads.core.domain.work;

/* compiled from: DownloadPriorityQueue.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class DownloadPriorityQueue$invoke$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem $priorityItem;
    /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadPriorityQueue$invoke$3(com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem priorityItem, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3> continuation) {
        super(2, continuation);
        this.$priorityItem = priorityItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3 = new com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3(this.$priorityItem, continuation);
        downloadPriorityQueue$invoke$3.L$0 = obj;
        return downloadPriorityQueue$invoke$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem priorityItem, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3) create(priorityItem, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem) this.L$0) == this.$priorityItem);
    }
}
