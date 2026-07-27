package q;

import android.graphics.drawable.Drawable;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1387c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f11662a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f3, float f6, boolean z) {
        if (!z) {
            return f3;
        }
        return (float) (((1.0d - f11662a) * f6) + f3);
    }

    public static float b(float f3, float f6, boolean z) {
        if (!z) {
            return f3 * 1.5f;
        }
        return (float) (((1.0d - f11662a) * f6) + (f3 * 1.5f));
    }
}
