package V0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f5932b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5933c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5934d;

    /* renamed from: a, reason: collision with root package name */
    public final float f5935a;

    static {
        a(0.0f);
        a(0.5f);
        f5932b = 0.5f;
        a(-1.0f);
        f5933c = -1.0f;
        a(1.0f);
        f5934d = 1.0f;
    }

    public static void a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            Q0.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f5932b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f5933c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f5934d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f5935a, ((f) obj).f5935a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f5935a);
    }

    public final String toString() {
        return b(this.f5935a);
    }
}
