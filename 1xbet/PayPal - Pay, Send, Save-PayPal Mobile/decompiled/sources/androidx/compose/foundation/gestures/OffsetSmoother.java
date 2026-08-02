package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/gestures/OffsetSmoother;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "offset", "smoothEventPosition-MK-Hz9U", "(J)J", "smoothEventPosition", "", "reset", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OffsetSmoother {
    public static final int $stable = 8;
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<androidx.compose.ui.geometry.Offset> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

    /* renamed from: smoothEventPosition-MK-Hz9U, reason: not valid java name */
    public final long m1492smoothEventPositionMKHz9U(long offset) {
        if (this.getHighSpeedVideoFpsRangesFor.size() == 3) {
            java.util.List<androidx.compose.ui.geometry.Offset> list = this.getHighSpeedVideoFpsRangesFor;
            int i = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = i + 1;
            list.set(i, androidx.compose.ui.geometry.Offset.m5741boximpl(offset));
        } else {
            this.getHighSpeedVideoFpsRangesFor.add(androidx.compose.ui.geometry.Offset.m5741boximpl(offset));
        }
        if (this.Camera2StreamConfigurationMap == 3) {
            this.Camera2StreamConfigurationMap = 0;
        }
        java.util.List<androidx.compose.ui.geometry.Offset> list2 = this.getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (list2.get(i2).m5762unboximpl() >> 32))));
        }
        float averageOfFloat = (float) kotlin.collections.CollectionsKt.averageOfFloat(arrayList);
        java.util.List<androidx.compose.ui.geometry.Offset> list3 = this.getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list3.size());
        int size2 = list3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (4294967295L & list3.get(i3).m5762unboximpl()))));
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits((float) kotlin.collections.CollectionsKt.averageOfFloat(arrayList2)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(averageOfFloat) << 32));
    }

    public final void reset() {
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor.clear();
    }
}
