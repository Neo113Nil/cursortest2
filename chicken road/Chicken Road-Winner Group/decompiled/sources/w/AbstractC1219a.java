package w;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1219a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10432a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(int i3, int i4) {
        int alpha = Color.alpha(i4);
        int alpha2 = Color.alpha(i3);
        int i5 = 255 - (((255 - alpha2) * (255 - alpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(i5, b(Color.red(i3), alpha2, Color.red(i4), alpha, i5), b(Color.green(i3), alpha2, Color.green(i4), alpha, i5), b(Color.blue(i3), alpha2, Color.blue(i4), alpha, i5));
    }

    public static int b(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        return (((255 - i4) * (i5 * i6)) + ((i3 * KotlinVersion.MAX_COMPONENT_VALUE) * i4)) / (i7 * KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
