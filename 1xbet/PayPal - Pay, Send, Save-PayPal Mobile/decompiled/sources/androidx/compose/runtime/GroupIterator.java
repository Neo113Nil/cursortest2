package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\r\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/SlotTable;", "p0", "", "p1", "p2", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "", "hasNext", "()Z", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/SlotTable;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class GroupIterator implements java.util.Iterator<androidx.compose.runtime.tooling.CompositionGroup>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.SlotTable Camera2StreamConfigurationMap;

    public GroupIterator(androidx.compose.runtime.SlotTable slotTable, int i, int i2) {
        this.Camera2StreamConfigurationMap = slotTable;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = slotTable.getVersion();
        if (slotTable.getWriter()) {
            androidx.compose.runtime.SlotTableKt.throwConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRangesFor < this.getHighSpeedVideoSizes;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ androidx.compose.runtime.tooling.CompositionGroup next() {
        int highSpeedVideoSizes;
        if (this.Camera2StreamConfigurationMap.getVersion() != this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.compose.runtime.SlotTableKt.throwConcurrentModificationException();
        }
        int i = this.getHighSpeedVideoFpsRangesFor;
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.getGroups(), i);
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoSizes + i;
        return new androidx.compose.runtime.SlotTableGroup(this.Camera2StreamConfigurationMap, i, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
