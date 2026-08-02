package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/MotionEventVerifierApi29;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "p0", "", "p1", "", "getHighSpeedVideoSizes", "(Landroid/view/MotionEvent;I)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class MotionEventVerifierApi29 {
    public static final androidx.compose.ui.platform.MotionEventVerifierApi29 INSTANCE = new androidx.compose.ui.platform.MotionEventVerifierApi29();

    private MotionEventVerifierApi29() {
    }

    public final boolean getHighSpeedVideoSizes(android.view.MotionEvent p0, int p1) {
        return (java.lang.Float.floatToRawIntBits(p0.getRawX(p1)) & Integer.MAX_VALUE) < 2139095040 && (java.lang.Float.floatToRawIntBits(p0.getRawY(p1)) & Integer.MAX_VALUE) < 2139095040;
    }
}
