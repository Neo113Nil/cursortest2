package androidx.paging;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018"}, d2 = {"Landroidx/paging/InvalidatingPagingSourceFactory;", "", "Key", "Value", "Landroidx/paging/PagingSourceFactory;", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "pagingSources$paging_common", "()Ljava/util/List;", "invoke", "()Landroidx/paging/PagingSource;", "", "invalidate", "()V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Landroidx/paging/internal/SynchronizedLock;", "getHighSpeedVideoFpsRanges", "Landroidx/paging/internal/SynchronizedLock;", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InvalidatingPagingSourceFactory<Key, Value> implements androidx.paging.PagingSourceFactory<Key, Value> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.List<? extends androidx.paging.PagingSource<Key, Value>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.paging.internal.SynchronizedLock getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.paging.PagingSource<Key, Value>> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidatingPagingSourceFactory(kotlin.jvm.functions.Function0<? extends androidx.paging.PagingSource<Key, Value>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRangesFor = new androidx.paging.internal.SynchronizedLock();
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
    }

    public final java.util.List<androidx.paging.PagingSource<Key, Value>> pagingSources$paging_common() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.jvm.functions.Function0
    public final androidx.paging.PagingSource<Key, Value> invoke() {
        androidx.paging.PagingSource<Key, Value> invoke = this.Camera2StreamConfigurationMap.invoke();
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends androidx.paging.PagingSource<Key, Value>>) this.getHighSpeedVideoFpsRanges, invoke);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return invoke;
    }

    public final void invalidate() {
        java.util.List<? extends androidx.paging.PagingSource<Key, Value>> list;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            list = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
        }
        for (androidx.paging.PagingSource<Key, Value> pagingSource : list) {
            if (!pagingSource.getInvalid()) {
                pagingSource.invalidate();
            }
        }
    }
}
