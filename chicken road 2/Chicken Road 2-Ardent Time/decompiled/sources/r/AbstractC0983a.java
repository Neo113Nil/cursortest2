package r;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0983a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8324a = 0;

    static {
        new java.lang.ThreadLocal();
    }

    public static int a(int i2, int i3) {
        int alpha = android.graphics.Color.alpha(i3);
        int alpha2 = android.graphics.Color.alpha(i2);
        int i4 = 255 - (((255 - alpha2) * (255 - alpha)) / kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        return android.graphics.Color.argb(i4, b(android.graphics.Color.red(i2), alpha2, android.graphics.Color.red(i3), alpha, i4), b(android.graphics.Color.green(i2), alpha2, android.graphics.Color.green(i3), alpha, i4), b(android.graphics.Color.blue(i2), alpha2, android.graphics.Color.blue(i3), alpha, i4));
    }

    public static int b(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((255 - i3) * (i4 * i5)) + ((i2 * kotlin.KotlinVersion.MAX_COMPONENT_VALUE) * i3)) / (i6 * kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
