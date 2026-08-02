package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/DataIterator;", "", "", "", "Landroidx/compose/runtime/SlotTable;", "p0", "", "p1", "<init>", "(Landroidx/compose/runtime/SlotTable;I)V", "iterator", "()Ljava/util/Iterator;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/SlotTable;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DataIterator implements java.lang.Iterable<java.lang.Object>, java.util.Iterator<java.lang.Object>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.SlotTable getHighResolutionOutputSizeshNQ4ISI;

    public DataIterator(androidx.compose.runtime.SlotTable slotTable, int i) {
        int slotsSize;
        this.getHighResolutionOutputSizeshNQ4ISI = slotTable;
        int i2 = slotTable.getGroups()[(i * 5) + 4];
        this.getHighSpeedVideoSizes = i2;
        int i3 = i + 1;
        if (i3 >= slotTable.getGroupsSize()) {
            slotsSize = slotTable.getSlotsSize();
        } else {
            slotsSize = slotTable.getGroups()[(i3 * 5) + 4];
        }
        this.getHighSpeedVideoFpsRanges = slotsSize;
        this.Camera2StreamConfigurationMap = i2;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Camera2StreamConfigurationMap < this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.Camera2StreamConfigurationMap;
        java.lang.Object obj = (i < 0 || i >= this.getHighResolutionOutputSizeshNQ4ISI.getSlots().length) ? null : this.getHighResolutionOutputSizeshNQ4ISI.getSlots()[this.Camera2StreamConfigurationMap];
        this.Camera2StreamConfigurationMap++;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
