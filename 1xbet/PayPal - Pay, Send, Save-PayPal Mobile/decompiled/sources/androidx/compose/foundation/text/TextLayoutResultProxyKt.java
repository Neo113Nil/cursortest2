package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "p0", "getHighSpeedVideoFpsRangesFor", "(JLandroidx/compose/ui/geometry/Rect;)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoFpsRangesFor(long j, androidx.compose.ui.geometry.Rect rect) {
        float right;
        float bottom;
        int i = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = java.lang.Float.intBitsToFloat(i) > rect.getRight() ? rect.getRight() : java.lang.Float.intBitsToFloat(i);
        }
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = java.lang.Float.intBitsToFloat(i2) > rect.getBottom() ? rect.getBottom() : java.lang.Float.intBitsToFloat(i2);
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(right) << 32) | (java.lang.Float.floatToRawIntBits(bottom) & 4294967295L));
    }
}
