package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputEventSmoother;", "", "<init>", "()V", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "change", "Landroidx/compose/ui/geometry/Offset;", "smoothEventPosition-tuRUvjQ", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;)J", "smoothEventPosition", "", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "", "Ljava/util/List;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IndirectPointerInputEventSmoother {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> Camera2StreamConfigurationMap = new java.util.ArrayList();
    public static final int $stable = 8;

    /* renamed from: smoothEventPosition-tuRUvjQ, reason: not valid java name */
    public final long m1488smoothEventPositiontuRUvjQ(androidx.compose.ui.input.indirect.IndirectPointerInputChange change) {
        boolean highSpeedVideoFpsRangesFor;
        boolean Camera2StreamConfigurationMap;
        boolean highSpeedVideoFpsRangesFor2;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (change.getPosition() >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (change.getPosition() & 4294967295L));
        highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighSpeedVideoFpsRangesFor(change);
        if (highSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap.clear();
        }
        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.Camera2StreamConfigurationMap(change);
        if (!Camera2StreamConfigurationMap) {
            highSpeedVideoFpsRangesFor2 = androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt.getHighSpeedVideoFpsRangesFor(change);
            if (!highSpeedVideoFpsRangesFor2) {
                if (this.Camera2StreamConfigurationMap.size() == 3) {
                    java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> list = this.Camera2StreamConfigurationMap;
                    int i = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRanges = i + 1;
                    list.set(i, change);
                } else {
                    this.Camera2StreamConfigurationMap.add(change);
                }
                if (this.getHighSpeedVideoFpsRanges == 3) {
                    this.getHighSpeedVideoFpsRanges = 0;
                }
                java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> list2 = this.Camera2StreamConfigurationMap;
                java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (list2.get(i2).getPosition() >> 32))));
                }
                intBitsToFloat = (float) kotlin.collections.CollectionsKt.averageOfFloat(arrayList);
                java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> list3 = this.Camera2StreamConfigurationMap;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list3.size());
                int size2 = list3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (list3.get(i3).getPosition() & 4294967295L))));
                }
                intBitsToFloat2 = (float) kotlin.collections.CollectionsKt.averageOfFloat(arrayList2);
            }
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32));
    }
}
