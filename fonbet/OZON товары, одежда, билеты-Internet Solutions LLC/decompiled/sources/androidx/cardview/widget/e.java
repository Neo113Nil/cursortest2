package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
final class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final double f38606a = Math.cos(Math.toRadians(45.0d));

    static float a(float f7, float f11, boolean z11) {
        if (!z11) {
            return f7;
        }
        return (float) (((1.0d - f38606a) * f11) + f7);
    }

    static float b(float f7, float f11, boolean z11) {
        if (!z11) {
            return f7 * 1.5f;
        }
        return (float) (((1.0d - f38606a) * f11) + (f7 * 1.5f));
    }
}
