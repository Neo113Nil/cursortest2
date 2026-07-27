package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: DownloadPriorityQueue.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086B¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "nextTurn", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "queue", "Ljava/util/PriorityQueue;", "invoke", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "downloadAction", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PriorityItem", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadPriorityQueue {
    private final Mutex mutex;
    private final MutableStateFlow<PriorityItem> nextTurn;
    private final PriorityQueue<PriorityItem> queue;
    private final SessionRepository sessionRepository;

    public DownloadPriorityQueue(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.mutex = MutexKt.Mutex(false);
        this.nextTurn = StateFlowKt.MutableStateFlow(null);
        this.queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t2).getPriority()));
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|17)(2:23|24))(7:25|26|27|28|(1:30)|31|(1:33)(5:34|14|15|16|17)))(8:36|37|(1:39)|27|28|(0)|31|(0)(0)))(1:40))(2:51|(1:53)(1:54))|41|42|43|(1:45)(8:46|37|(0)|27|28|(0)|31|(0)(0))))|59|6|7|(0)(0)|41|42|43|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0051, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011d, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004e, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
    
        r12 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r11));
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(int i, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        DownloadPriorityQueue$invoke$1 downloadPriorityQueue$invoke$1;
        Object coroutine_suspended;
        int i2;
        Mutex mutex;
        PriorityItem priorityItem;
        Mutex mutex2;
        Mutex mutex3;
        Function1<? super Continuation<? super Unit>, ? extends Object> function12;
        PriorityItem priorityItem2;
        MutableStateFlow<PriorityItem> mutableStateFlow;
        DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3;
        ?? r10;
        Function1<? super Continuation<? super Unit>, ? extends Object> function13;
        try {
            if (continuation instanceof DownloadPriorityQueue$invoke$1) {
                downloadPriorityQueue$invoke$1 = (DownloadPriorityQueue$invoke$1) continuation;
                if ((downloadPriorityQueue$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    downloadPriorityQueue$invoke$1.label -= Integer.MIN_VALUE;
                    Object obj = downloadPriorityQueue$invoke$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = downloadPriorityQueue$invoke$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        PriorityItem priorityItem3 = new PriorityItem(i);
                        mutex3 = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = function1;
                        downloadPriorityQueue$invoke$1.L$1 = priorityItem3;
                        downloadPriorityQueue$invoke$1.L$2 = mutex3;
                        downloadPriorityQueue$invoke$1.label = 1;
                        if (mutex3.lock(null, downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function12 = function1;
                        priorityItem2 = priorityItem3;
                    } else if (i2 == 1) {
                        mutex3 = (Mutex) downloadPriorityQueue$invoke$1.L$2;
                        priorityItem2 = (PriorityItem) downloadPriorityQueue$invoke$1.L$1;
                        function12 = (Function1) downloadPriorityQueue$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex2 = (Mutex) downloadPriorityQueue$invoke$1.L$1;
                                priorityItem = (PriorityItem) downloadPriorityQueue$invoke$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                try {
                                    this.queue.remove(priorityItem);
                                    this.nextTurn.setValue(this.queue.peek());
                                    Unit unit = Unit.INSTANCE;
                                    mutex2.unlock(null);
                                    return Unit.INSTANCE;
                                } finally {
                                }
                            }
                            ?? r102 = (PriorityItem) downloadPriorityQueue$invoke$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            i = r102;
                            Object m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
                            ?? r103 = i;
                            if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                                ResultKt.throwOnFailure(m8079constructorimpl);
                            }
                            mutex = this.mutex;
                            downloadPriorityQueue$invoke$1.L$0 = r103;
                            downloadPriorityQueue$invoke$1.L$1 = mutex;
                            downloadPriorityQueue$invoke$1.label = 4;
                            if (mutex.lock(null, downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            priorityItem = r103;
                            mutex2 = mutex;
                            this.queue.remove(priorityItem);
                            this.nextTurn.setValue(this.queue.peek());
                            Unit unit2 = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return Unit.INSTANCE;
                        }
                        PriorityItem priorityItem4 = (PriorityItem) downloadPriorityQueue$invoke$1.L$1;
                        function13 = (Function1) downloadPriorityQueue$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r10 = priorityItem4;
                        Result.Companion companion = Result.INSTANCE;
                        DownloadPriorityQueue$invoke$1 downloadPriorityQueue$invoke$12 = downloadPriorityQueue$invoke$1;
                        downloadPriorityQueue$invoke$1.L$0 = r10;
                        downloadPriorityQueue$invoke$1.L$1 = null;
                        downloadPriorityQueue$invoke$1.label = 3;
                        i = r10;
                        if (function13.invoke(downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object m8079constructorimpl2 = Result.m8079constructorimpl(Unit.INSTANCE);
                        ?? r1032 = i;
                        if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                        }
                        mutex = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = r1032;
                        downloadPriorityQueue$invoke$1.L$1 = mutex;
                        downloadPriorityQueue$invoke$1.label = 4;
                        if (mutex.lock(null, downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                        }
                    }
                    this.queue.offer(priorityItem2);
                    this.nextTurn.setValue(this.queue.peek());
                    Unit unit3 = Unit.INSTANCE;
                    mutex3.unlock(null);
                    mutableStateFlow = this.nextTurn;
                    downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(priorityItem2, null);
                    downloadPriorityQueue$invoke$1.L$0 = function12;
                    downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
                    downloadPriorityQueue$invoke$1.L$2 = null;
                    downloadPriorityQueue$invoke$1.label = 2;
                    if (FlowKt.first(mutableStateFlow, downloadPriorityQueue$invoke$3, downloadPriorityQueue$invoke$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r10 = priorityItem2;
                    function13 = function12;
                    Result.Companion companion2 = Result.INSTANCE;
                    DownloadPriorityQueue$invoke$1 downloadPriorityQueue$invoke$122 = downloadPriorityQueue$invoke$1;
                    downloadPriorityQueue$invoke$1.L$0 = r10;
                    downloadPriorityQueue$invoke$1.L$1 = null;
                    downloadPriorityQueue$invoke$1.label = 3;
                    i = r10;
                    if (function13.invoke(downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                    }
                    Object m8079constructorimpl22 = Result.m8079constructorimpl(Unit.INSTANCE);
                    ?? r10322 = i;
                    if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                    }
                    mutex = this.mutex;
                    downloadPriorityQueue$invoke$1.L$0 = r10322;
                    downloadPriorityQueue$invoke$1.L$1 = mutex;
                    downloadPriorityQueue$invoke$1.label = 4;
                    if (mutex.lock(null, downloadPriorityQueue$invoke$1) == coroutine_suspended) {
                    }
                }
            }
            this.queue.offer(priorityItem2);
            this.nextTurn.setValue(this.queue.peek());
            Unit unit32 = Unit.INSTANCE;
            mutex3.unlock(null);
            mutableStateFlow = this.nextTurn;
            downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(priorityItem2, null);
            downloadPriorityQueue$invoke$1.L$0 = function12;
            downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
            downloadPriorityQueue$invoke$1.L$2 = null;
            downloadPriorityQueue$invoke$1.label = 2;
            if (FlowKt.first(mutableStateFlow, downloadPriorityQueue$invoke$3, downloadPriorityQueue$invoke$1) != coroutine_suspended) {
            }
        } finally {
        }
        downloadPriorityQueue$invoke$1 = new DownloadPriorityQueue$invoke$1(this, continuation);
        Object obj2 = downloadPriorityQueue$invoke$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = downloadPriorityQueue$invoke$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DownloadPriorityQueue.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "<init>", "(I)V", "getPriority", "()I", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }
}
