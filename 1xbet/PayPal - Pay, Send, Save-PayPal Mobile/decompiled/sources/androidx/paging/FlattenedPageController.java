package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00050\u000bH\u0086@¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Landroidx/paging/FlattenedPageController;", "", "T", "<init>", "()V", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/FlattenedPageEventStorage;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/paging/FlattenedPageEventStorage;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizes", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FlattenedPageController<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final androidx.paging.FlattenedPageEventStorage<T> getHighSpeedVideoFpsRangesFor = new androidx.paging.FlattenedPageEventStorage<>();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizes = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges = -1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>> indexedValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.FlattenedPageController$record$1 flattenedPageController$record$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof androidx.paging.FlattenedPageController$record$1) {
                flattenedPageController$record$1 = (androidx.paging.FlattenedPageController$record$1) continuation;
                if ((flattenedPageController$record$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    flattenedPageController$record$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = flattenedPageController$record$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flattenedPageController$record$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.getHighSpeedVideoSizes;
                        flattenedPageController$record$1.Camera2StreamConfigurationMap = indexedValue;
                        flattenedPageController$record$1.getHighSpeedVideoSizes = mutex;
                        flattenedPageController$record$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, flattenedPageController$record$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) flattenedPageController$record$1.getHighSpeedVideoSizes;
                        kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>> indexedValue2 = (kotlin.collections.IndexedValue) flattenedPageController$record$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        indexedValue = indexedValue2;
                    }
                    this.getHighSpeedVideoFpsRanges = indexedValue.getIndex();
                    this.getHighSpeedVideoFpsRangesFor.add(indexedValue.getValue());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            this.getHighSpeedVideoFpsRanges = indexedValue.getIndex();
            this.getHighSpeedVideoFpsRangesFor.add(indexedValue.getValue());
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        flattenedPageController$record$1 = new androidx.paging.FlattenedPageController$record$1(this, continuation);
        java.lang.Object obj2 = flattenedPageController$record$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flattenedPageController$record$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:11:0x0048, B:12:0x0068, B:14:0x006e, B:16:0x0074, B:18:0x0077, B:21:0x0088), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super java.util.List<? extends kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>>>> continuation) {
        androidx.paging.FlattenedPageController$getStateAsEvents$1 flattenedPageController$getStateAsEvents$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof androidx.paging.FlattenedPageController$getStateAsEvents$1) {
                flattenedPageController$getStateAsEvents$1 = (androidx.paging.FlattenedPageController$getStateAsEvents$1) continuation;
                if ((flattenedPageController$getStateAsEvents$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    flattenedPageController$getStateAsEvents$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = flattenedPageController$getStateAsEvents$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flattenedPageController$getStateAsEvents$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.getHighSpeedVideoSizes;
                        flattenedPageController$getStateAsEvents$1.getHighSpeedVideoFpsRanges = mutex2;
                        flattenedPageController$getStateAsEvents$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (mutex2.lock(null, flattenedPageController$getStateAsEvents$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) flattenedPageController$getStateAsEvents$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    java.util.List<androidx.paging.PageEvent<T>> asEvents = this.getHighSpeedVideoFpsRangesFor.getAsEvents();
                    int i2 = this.getHighSpeedVideoFpsRanges;
                    int size = asEvents.size();
                    java.util.List<androidx.paging.PageEvent<T>> list = asEvents;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    int i3 = 0;
                    for (T t : list) {
                        if (i3 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(new kotlin.collections.IndexedValue((i2 - size) + 1 + i3, (androidx.paging.PageEvent) t));
                        i3++;
                    }
                    return arrayList;
                }
            }
            java.util.List<androidx.paging.PageEvent<T>> asEvents2 = this.getHighSpeedVideoFpsRangesFor.getAsEvents();
            int i22 = this.getHighSpeedVideoFpsRanges;
            int size2 = asEvents2.size();
            java.util.List<androidx.paging.PageEvent<T>> list2 = asEvents2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i32 = 0;
            while (r11.hasNext()) {
            }
            return arrayList2;
        } finally {
            mutex.unlock(null);
        }
        flattenedPageController$getStateAsEvents$1 = new androidx.paging.FlattenedPageController$getStateAsEvents$1(this, continuation);
        java.lang.Object obj2 = flattenedPageController$getStateAsEvents$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flattenedPageController$getStateAsEvents$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }
}
