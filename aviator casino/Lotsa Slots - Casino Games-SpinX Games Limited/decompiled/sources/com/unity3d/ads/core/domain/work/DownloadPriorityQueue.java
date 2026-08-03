package com.unity3d.ads.core.domain.work;

/* compiled from: DownloadPriorityQueue.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J7\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "", "()V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "nextTurn", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "queue", "Ljava/util/PriorityQueue;", "invoke", "", "priority", "", "downloadAction", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PriorityItem", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadPriorityQueue {
    private final kotlinx.coroutines.sync.Mutex mutex = kotlinx.coroutines.sync.MutexKt.Mutex(false);
    private final kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem> nextTurn = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
    private final java.util.PriorityQueue<com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem> queue = new java.util.PriorityQueue<>(50, new java.util.Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem) t).getPriority()), java.lang.Integer.valueOf(((com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem) t2).getPriority()));
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(int i, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1 downloadPriorityQueue$invoke$1;
        java.lang.Object coroutine_suspended;
        int i2;
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue downloadPriorityQueue;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function12;
        kotlinx.coroutines.sync.Mutex mutex;
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem priorityItem;
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem> mutableStateFlow;
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function13;
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue downloadPriorityQueue2;
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem priorityItem2;
        kotlinx.coroutines.sync.Mutex mutex2;
        com.unity3d.ads.core.domain.work.DownloadPriorityQueue downloadPriorityQueue3;
        try {
            if (continuation instanceof com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1) {
                downloadPriorityQueue$invoke$1 = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1) continuation;
                if ((downloadPriorityQueue$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    downloadPriorityQueue$invoke$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = downloadPriorityQueue$invoke$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = downloadPriorityQueue$invoke$1.label;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem priorityItem3 = new com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem(i);
                        kotlinx.coroutines.sync.Mutex mutex3 = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = this;
                        downloadPriorityQueue$invoke$1.L$1 = function1;
                        downloadPriorityQueue$invoke$1.L$2 = priorityItem3;
                        downloadPriorityQueue$invoke$1.L$3 = mutex3;
                        downloadPriorityQueue$invoke$1.label = 1;
                        if (mutex3.lock(null, downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        downloadPriorityQueue = this;
                        function12 = function1;
                        mutex = mutex3;
                        priorityItem = priorityItem3;
                    } else if (i2 == 1) {
                        kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) downloadPriorityQueue$invoke$1.L$3;
                        com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem priorityItem4 = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem) downloadPriorityQueue$invoke$1.L$2;
                        function12 = (kotlin.jvm.functions.Function1) downloadPriorityQueue$invoke$1.L$1;
                        downloadPriorityQueue = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue) downloadPriorityQueue$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex4;
                        priorityItem = priorityItem4;
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex2 = (kotlinx.coroutines.sync.Mutex) downloadPriorityQueue$invoke$1.L$2;
                                priorityItem2 = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem) downloadPriorityQueue$invoke$1.L$1;
                                downloadPriorityQueue3 = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue) downloadPriorityQueue$invoke$1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj);
                                try {
                                    downloadPriorityQueue3.queue.remove(priorityItem2);
                                    downloadPriorityQueue3.nextTurn.setValue(downloadPriorityQueue3.queue.peek());
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    mutex.unlock(null);
                                    return kotlin.Unit.INSTANCE;
                                } finally {
                                }
                            }
                            priorityItem = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem) downloadPriorityQueue$invoke$1.L$1;
                            com.unity3d.ads.core.domain.work.DownloadPriorityQueue downloadPriorityQueue4 = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue) downloadPriorityQueue$invoke$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            downloadPriorityQueue2 = downloadPriorityQueue4;
                            priorityItem2 = priorityItem;
                            mutex2 = downloadPriorityQueue2.mutex;
                            downloadPriorityQueue$invoke$1.L$0 = downloadPriorityQueue2;
                            downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
                            downloadPriorityQueue$invoke$1.L$2 = mutex2;
                            downloadPriorityQueue$invoke$1.label = 4;
                            if (mutex2.lock(null, downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            downloadPriorityQueue3 = downloadPriorityQueue2;
                            downloadPriorityQueue3.queue.remove(priorityItem2);
                            downloadPriorityQueue3.nextTurn.setValue(downloadPriorityQueue3.queue.peek());
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            mutex.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        }
                        priorityItem = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue.PriorityItem) downloadPriorityQueue$invoke$1.L$2;
                        function13 = (kotlin.jvm.functions.Function1) downloadPriorityQueue$invoke$1.L$1;
                        downloadPriorityQueue2 = (com.unity3d.ads.core.domain.work.DownloadPriorityQueue) downloadPriorityQueue$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadPriorityQueue$invoke$1.L$0 = downloadPriorityQueue2;
                        downloadPriorityQueue$invoke$1.L$1 = priorityItem;
                        downloadPriorityQueue$invoke$1.L$2 = null;
                        downloadPriorityQueue$invoke$1.label = 3;
                        if (function13.invoke(downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        priorityItem2 = priorityItem;
                        mutex2 = downloadPriorityQueue2.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = downloadPriorityQueue2;
                        downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
                        downloadPriorityQueue$invoke$1.L$2 = mutex2;
                        downloadPriorityQueue$invoke$1.label = 4;
                        if (mutex2.lock(null, downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                        }
                    }
                    downloadPriorityQueue.queue.offer(priorityItem);
                    downloadPriorityQueue.nextTurn.setValue(downloadPriorityQueue.queue.peek());
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    mutableStateFlow = downloadPriorityQueue.nextTurn;
                    downloadPriorityQueue$invoke$3 = new com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3(priorityItem, null);
                    downloadPriorityQueue$invoke$1.L$0 = downloadPriorityQueue;
                    downloadPriorityQueue$invoke$1.L$1 = function12;
                    downloadPriorityQueue$invoke$1.L$2 = priorityItem;
                    downloadPriorityQueue$invoke$1.L$3 = null;
                    downloadPriorityQueue$invoke$1.label = 2;
                    if (kotlinx.coroutines.flow.FlowKt.first(mutableStateFlow, downloadPriorityQueue$invoke$3, downloadPriorityQueue$invoke$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function13 = function12;
                    downloadPriorityQueue2 = downloadPriorityQueue;
                    downloadPriorityQueue$invoke$1.L$0 = downloadPriorityQueue2;
                    downloadPriorityQueue$invoke$1.L$1 = priorityItem;
                    downloadPriorityQueue$invoke$1.L$2 = null;
                    downloadPriorityQueue$invoke$1.label = 3;
                    if (function13.invoke(downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                    }
                    priorityItem2 = priorityItem;
                    mutex2 = downloadPriorityQueue2.mutex;
                    downloadPriorityQueue$invoke$1.L$0 = downloadPriorityQueue2;
                    downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
                    downloadPriorityQueue$invoke$1.L$2 = mutex2;
                    downloadPriorityQueue$invoke$1.label = 4;
                    if (mutex2.lock(null, downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                    }
                }
            }
            downloadPriorityQueue.queue.offer(priorityItem);
            downloadPriorityQueue.nextTurn.setValue(downloadPriorityQueue.queue.peek());
            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            mutableStateFlow = downloadPriorityQueue.nextTurn;
            downloadPriorityQueue$invoke$3 = new com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3(priorityItem, null);
            downloadPriorityQueue$invoke$1.L$0 = downloadPriorityQueue;
            downloadPriorityQueue$invoke$1.L$1 = function12;
            downloadPriorityQueue$invoke$1.L$2 = priorityItem;
            downloadPriorityQueue$invoke$1.L$3 = null;
            downloadPriorityQueue$invoke$1.label = 2;
            if (kotlinx.coroutines.flow.FlowKt.first(mutableStateFlow, downloadPriorityQueue$invoke$3, downloadPriorityQueue$invoke$1) != coroutine_suspended) {
            }
        } finally {
        }
        downloadPriorityQueue$invoke$1 = new com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1(this, continuation);
        java.lang.Object obj2 = downloadPriorityQueue$invoke$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = downloadPriorityQueue$invoke$1.label;
        if (i2 != 0) {
        }
    }

    /* compiled from: DownloadPriorityQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "", "priority", "", "(I)V", "getPriority", "()I", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }
}
