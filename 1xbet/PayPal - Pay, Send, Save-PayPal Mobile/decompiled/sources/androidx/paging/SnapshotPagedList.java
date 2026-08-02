package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00178\u0017X\u0097D¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001a"}, d2 = {"Landroidx/paging/SnapshotPagedList;", "", "T", "Landroidx/paging/PagedList;", "pagedList", "<init>", "(Landroidx/paging/PagedList;)V", "", "detach", "()V", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", com.sun.jna.Callback.METHOD_NAME, "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "", "index", "loadAroundInternal", "(I)V", "Camera2StreamConfigurationMap", "Landroidx/paging/PagedList;", "getHighResolutionOutputSizeshNQ4ISI", "", "isImmutable", "Z", "()Z", "getLastKey", "()Ljava/lang/Object;", "lastKey", "isDetached"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotPagedList<T> extends androidx.paging.PagedList<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.paging.PagedList<T> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean isDetached;
    private final boolean isImmutable;

    @Override // androidx.paging.PagedList
    public final void detach() {
    }

    @Override // androidx.paging.PagedList
    public final void loadAroundInternal(int index) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotPagedList(androidx.paging.PagedList<T> pagedList) {
        super(pagedList.getPagingSource(), pagedList.getCoroutineScope(), pagedList.getNotifyDispatcher(), pagedList.getStorage$paging_common().snapshot(), pagedList.getConfig());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagedList, "");
        this.getHighResolutionOutputSizeshNQ4ISI = pagedList;
        this.isImmutable = true;
        this.isDetached = true;
    }

    @Override // androidx.paging.PagedList
    /* renamed from: isImmutable, reason: from getter */
    public final boolean getIsImmutable() {
        return this.isImmutable;
    }

    @Override // androidx.paging.PagedList
    public final java.lang.Object getLastKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLastKey();
    }

    @Override // androidx.paging.PagedList
    /* renamed from: isDetached, reason: from getter */
    public final boolean getIsDetached() {
        return this.isDetached;
    }

    @Override // androidx.paging.PagedList
    public final void dispatchCurrentLoadState(kotlin.jvm.functions.Function2<? super androidx.paging.LoadType, ? super androidx.paging.LoadState, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }
}
