package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupDataIterator;", "", "", "", "Landroidx/compose/runtime/SlotTable;", "p0", "", "p1", "Landroidx/compose/runtime/GroupSourceInformation;", "p2", "<init>", "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;)V", "iterator", "()Ljava/util/Iterator;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "getInputFormats", "Landroidx/compose/runtime/SlotTable;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/BitVector;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/BitVector;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SourceInformationGroupDataIterator implements java.lang.Iterable<java.lang.Object>, java.util.Iterator<java.lang.Object>, kotlin.jvm.internal.markers.KMappedMarker {
    private final androidx.compose.runtime.BitVector Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.SlotTable getHighResolutionOutputSizeshNQ4ISI;

    public SourceInformationGroupDataIterator(androidx.compose.runtime.SlotTable slotTable, int i, androidx.compose.runtime.GroupSourceInformation groupSourceInformation) {
        int slotsSize;
        this.getHighResolutionOutputSizeshNQ4ISI = slotTable;
        int i2 = slotTable.getGroups()[(i * 5) + 4];
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRanges = groupSourceInformation.getDataStartOffset();
        int dataEndOffset = groupSourceInformation.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i3 = i + 1;
            if (i3 >= slotTable.getGroupsSize()) {
                slotsSize = slotTable.getSlotsSize();
            } else {
                slotsSize = slotTable.getGroups()[(i3 * 5) + 4];
            }
            dataEndOffset = slotsSize - i2;
        }
        this.getHighSpeedVideoFpsRangesFor = dataEndOffset;
        androidx.compose.runtime.BitVector bitVector = new androidx.compose.runtime.BitVector();
        java.util.ArrayList<java.lang.Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            java.util.ArrayList<java.lang.Object> arrayList = groups;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                java.lang.Object obj = arrayList.get(i4);
                if (obj instanceof androidx.compose.runtime.GroupSourceInformation) {
                    androidx.compose.runtime.GroupSourceInformation groupSourceInformation2 = (androidx.compose.runtime.GroupSourceInformation) obj;
                    bitVector.setRange(groupSourceInformation2.getDataStartOffset(), groupSourceInformation2.getDataEndOffset());
                }
            }
        }
        this.Camera2StreamConfigurationMap = bitVector;
        this.getOutputMinFrameDuration = bitVector.nextClear(this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getOutputMinFrameDuration < this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getOutputMinFrameDuration;
        java.lang.Object obj = (i2 < 0 || i2 >= i) ? null : this.getHighResolutionOutputSizeshNQ4ISI.getSlots()[this.getHighSpeedVideoSizes + this.getOutputMinFrameDuration];
        this.getOutputMinFrameDuration = this.Camera2StreamConfigurationMap.nextClear(this.getOutputMinFrameDuration + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
