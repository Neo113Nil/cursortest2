package V1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f f27907c = new f(a.f27911b, 17);

    /* renamed from: a, reason: collision with root package name */
    private final float f27908a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27909b;

    @InterfaceC6346b
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final float f27910a;

        /* renamed from: b, reason: collision with root package name */
        private static final float f27911b;

        /* renamed from: c, reason: collision with root package name */
        private static final float f27912c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f27913d = 0;

        /* renamed from: V1.f$a$a, reason: collision with other inner class name */
        public static final class C0570a {
            public static float a() {
                return a.f27910a;
            }
        }

        static {
            c(0.0f);
            c(0.5f);
            f27910a = 0.5f;
            c(-1.0f);
            f27911b = -1.0f;
            c(1.0f);
            f27912c = 1.0f;
        }

        public static void c(float f7) {
            if ((0.0f > f7 || f7 > 1.0f) && f7 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
        }

        @NotNull
        public static String d(float f7) {
            if (f7 == 0.0f) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f7 == f27910a) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f7 == f27911b) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f7 == f27912c) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f7 + ')';
        }
    }

    public f(float f7, int i11) {
        this.f27908a = f7;
        this.f27909b = i11;
    }

    public final float b() {
        return this.f27908a;
    }

    public final int c() {
        return this.f27909b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        float f7 = fVar.f27908a;
        int i11 = a.f27913d;
        return Float.compare(this.f27908a, f7) == 0 && this.f27909b == fVar.f27909b;
    }

    public final int hashCode() {
        int i11 = a.f27913d;
        return Integer.hashCode(this.f27909b) + (Float.hashCode(this.f27908a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) a.d(this.f27908a));
        sb2.append(", trim=");
        int i11 = this.f27909b;
        sb2.append((Object) (i11 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i11 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i11 == 17 ? "LineHeightStyle.Trim.Both" : i11 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb2.append(')');
        return sb2.toString();
    }
}
