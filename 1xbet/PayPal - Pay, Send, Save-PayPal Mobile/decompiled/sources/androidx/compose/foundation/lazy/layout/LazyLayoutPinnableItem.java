package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0013\u0010\u001cR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0016\u0010\u0014\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R/\u0010%\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00018C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b\u0018\u0010#\"\u0004\b\u0018\u0010$R(\u0010&\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010#\"\u0004\b\u000f\u0010$"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem;", "Landroidx/compose/ui/layout/PinnableContainer;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "", "p0", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "p1", "<init>", "(Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)V", "pin", "()Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "", "release", "()V", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "(I)V", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "", "Z", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/ui/layout/PinnableContainer;", "(Landroidx/compose/ui/layout/PinnableContainer;)V", "getInputFormats", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyLayoutPinnableItem implements androidx.compose.ui.layout.PinnableContainer, androidx.compose.ui.layout.PinnableContainer.PinnedHandle, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.layout.PinnableContainer.PinnedHandle getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI = -1;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getInputFormats = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public LazyLayoutPinnableItem(java.lang.Object obj, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges = lazyLayoutPinnedItemList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    /* renamed from: getKey, reason: from getter */
    public final java.lang.Object getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void Camera2StreamConfigurationMap(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    /* renamed from: getIndex, reason: from getter */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private final androidx.compose.ui.layout.PinnableContainer getHighSpeedVideoFpsRangesFor() {
        return (androidx.compose.ui.layout.PinnableContainer) this.getInputFormats.getValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.PinnableContainer pinnableContainer) {
        this.getInputFormats.setValue(pinnableContainer);
    }

    private androidx.compose.ui.layout.PinnableContainer getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoFpsRangesFor();
    }

    public final void getHighSpeedVideoSizes(androidx.compose.ui.layout.PinnableContainer pinnableContainer) {
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (pinnableContainer != getHighSpeedVideoFpsRangesFor()) {
                getHighSpeedVideoFpsRangesFor(pinnableContainer);
                if (this.getHighSpeedVideoFpsRangesFor > 0) {
                    androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinnedHandle = this.getHighSpeedVideoSizes;
                    if (pinnedHandle != null) {
                        pinnedHandle.release();
                    }
                    this.getHighSpeedVideoSizes = pinnableContainer != null ? pinnableContainer.pin() : null;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public final androidx.compose.ui.layout.PinnableContainer.PinnedHandle pin() {
        if (this.getInputSizeshNQ4ISI) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("Pin should not be called on an already disposed item ");
        }
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            this.getHighSpeedVideoFpsRanges.pin$foundation(this);
            androidx.compose.ui.layout.PinnableContainer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.pin() : null;
        }
        this.getHighSpeedVideoFpsRangesFor++;
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public final void release() {
        if (this.getInputSizeshNQ4ISI) {
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor <= 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("Release should only be called once");
        }
        int i = this.getHighSpeedVideoFpsRangesFor - 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i == 0) {
            this.getHighSpeedVideoFpsRanges.release$foundation(this);
            androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinnedHandle = this.getHighSpeedVideoSizes;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.getHighSpeedVideoSizes = null;
        }
    }

    public final void getHighSpeedVideoSizes() {
        this.getInputSizeshNQ4ISI = true;
    }
}
