package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "p0", "p1", "", "getHighSpeedVideoSizes", "(JJ)F", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentScaleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoSizes(long j, long j2) {
        return java.lang.Math.max(java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(long j, long j2) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
