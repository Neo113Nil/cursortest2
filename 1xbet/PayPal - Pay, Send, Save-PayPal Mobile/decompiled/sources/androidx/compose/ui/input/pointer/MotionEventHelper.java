package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventHelper;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "p0", "", "p1", "Landroidx/compose/ui/geometry/Offset;", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/MotionEvent;I)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MotionEventHelper {
    public static final androidx.compose.ui.input.pointer.MotionEventHelper INSTANCE = new androidx.compose.ui.input.pointer.MotionEventHelper();

    private MotionEventHelper() {
    }

    public static long getHighSpeedVideoFpsRangesFor(android.view.MotionEvent p0, int p1) {
        float rawX = p0.getRawX(p1);
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(p0.getRawY(p1)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(rawX) << 32));
    }
}
