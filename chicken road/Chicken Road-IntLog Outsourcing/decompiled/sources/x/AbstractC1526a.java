package x;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1526a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12230a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(int i2, int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int i6 = 255 - (((255 - alpha2) * (255 - alpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(i6, b(Color.red(i2), alpha2, Color.red(i3), alpha, i6), b(Color.green(i2), alpha2, Color.green(i3), alpha, i6), b(Color.blue(i2), alpha2, Color.blue(i3), alpha, i6));
    }

    public static int b(int i2, int i3, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((255 - i3) * (i6 * i7)) + ((i2 * KotlinVersion.MAX_COMPONENT_VALUE) * i3)) / (i8 * KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
