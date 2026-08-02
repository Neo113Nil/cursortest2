package androidx.compose.ui.platform;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5260k1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5260k1 f40905a = new C5260k1();

    public final boolean a(@NotNull MotionEvent motionEvent, int i11) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i11);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        rawY = motionEvent.getRawY(i11);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
