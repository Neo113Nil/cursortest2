package B4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2551a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2552b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2553c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2554d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2555e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2556f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2557g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2558h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2559i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2560a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2561b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2563d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2564e;

        /* renamed from: c, reason: collision with root package name */
        private int f2562c = -1;

        /* renamed from: f, reason: collision with root package name */
        private int f2565f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f2566g = -1;

        /* renamed from: h, reason: collision with root package name */
        private int f2567h = -1;

        /* renamed from: i, reason: collision with root package name */
        private int f2568i = -1;

        @NotNull
        public final S a() {
            return new S(this.f2560a, this.f2561b, this.f2562c, this.f2563d, this.f2564e, this.f2565f, this.f2566g, this.f2567h, this.f2568i);
        }

        @NotNull
        public final void b(int i11) {
            this.f2565f = i11;
        }

        @NotNull
        public final void c(int i11) {
            this.f2566g = i11;
        }

        @NotNull
        public final void d(boolean z11) {
            this.f2560a = z11;
        }

        @NotNull
        public final void e(int i11) {
            this.f2567h = i11;
        }

        @NotNull
        public final void f(int i11) {
            this.f2568i = i11;
        }

        @NotNull
        public final void g(int i11, boolean z11, boolean z12) {
            this.f2562c = i11;
            this.f2563d = z11;
            this.f2564e = z12;
        }

        @NotNull
        public final void h(boolean z11) {
            this.f2561b = z11;
        }
    }

    public S(boolean z11, boolean z12, int i11, boolean z13, boolean z14, int i12, int i13, int i14, int i15) {
        this.f2551a = z11;
        this.f2552b = z12;
        this.f2553c = i11;
        this.f2554d = z13;
        this.f2555e = z14;
        this.f2556f = i12;
        this.f2557g = i13;
        this.f2558h = i14;
        this.f2559i = i15;
    }

    public final int a() {
        return this.f2556f;
    }

    public final int b() {
        return this.f2557g;
    }

    public final int c() {
        return this.f2558h;
    }

    public final int d() {
        return this.f2559i;
    }

    public final int e() {
        return this.f2553c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S)) {
            return false;
        }
        S s11 = (S) obj;
        return this.f2551a == s11.f2551a && this.f2552b == s11.f2552b && this.f2553c == s11.f2553c && this.f2554d == s11.f2554d && this.f2555e == s11.f2555e && this.f2556f == s11.f2556f && this.f2557g == s11.f2557g && this.f2558h == s11.f2558h && this.f2559i == s11.f2559i;
    }

    public final boolean f() {
        return this.f2554d;
    }

    public final boolean g() {
        return this.f2551a;
    }

    public final boolean h() {
        return this.f2555e;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f2551a ? 1 : 0) * 31) + (this.f2552b ? 1 : 0)) * 31) + this.f2553c) * 923521) + (this.f2554d ? 1 : 0)) * 31) + (this.f2555e ? 1 : 0)) * 31) + this.f2556f) * 31) + this.f2557g) * 31) + this.f2558h) * 31) + this.f2559i;
    }

    public final boolean i() {
        return this.f2552b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(S.class.getSimpleName());
        sb2.append("(");
        if (this.f2551a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f2552b) {
            sb2.append("restoreState ");
        }
        int i11 = this.f2559i;
        int i12 = this.f2558h;
        int i13 = this.f2557g;
        int i14 = this.f2556f;
        if (i14 != -1 || i13 != -1 || i12 != -1 || i11 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i14));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i13));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
