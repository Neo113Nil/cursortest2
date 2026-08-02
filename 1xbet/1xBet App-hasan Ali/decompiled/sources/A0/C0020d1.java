package A0;

import android.view.MotionEvent;

/* renamed from: A0.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0020d1 f488a = new C0020d1();

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if ((Float.floatToRawIntBits(rawX) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & Integer.MAX_VALUE) < 2139095040;
    }
}
