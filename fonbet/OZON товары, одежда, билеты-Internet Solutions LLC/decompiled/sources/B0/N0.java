package B0;

import Q1.C3848q;
import Q1.C3852v;
import Q1.C3853w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final N0 f1448g;

    /* renamed from: a, reason: collision with root package name */
    private final int f1449a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f1450b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1451c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1452d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f1453e;

    /* renamed from: f, reason: collision with root package name */
    private final R1.c f1454f;

    static {
        int i11 = 0;
        f1448g = new N0(i11, i11, 127);
    }

    public N0(int i11, Boolean bool, int i12, int i13, Boolean bool2, R1.c cVar) {
        this.f1449a = i11;
        this.f1450b = bool;
        this.f1451c = i12;
        this.f1452d = i13;
        this.f1453e = bool2;
        this.f1454f = cVar;
    }

    public static N0 b(int i11, int i12) {
        N0 n02 = f1448g;
        return new N0((i12 & 1) != 0 ? n02.f1449a : 3, n02.f1450b, i11, n02.f1452d, null, null);
    }

    private final boolean g() {
        return this.f1449a == -1 && this.f1450b == null && this.f1451c == 0 && this.f1452d == -1 && this.f1453e == null && this.f1454f == null;
    }

    @NotNull
    public final N0 c(N0 n02) {
        if (n02 == null || n02.g() || n02.equals(this)) {
            return this;
        }
        if (g()) {
            return n02;
        }
        C3852v a11 = C3852v.a(this.f1449a);
        if (a11.c() == -1) {
            a11 = null;
        }
        int c11 = a11 != null ? a11.c() : n02.f1449a;
        Boolean bool = this.f1450b;
        if (bool == null) {
            bool = n02.f1450b;
        }
        Boolean bool2 = bool;
        C3853w a12 = C3853w.a(this.f1451c);
        if (a12.c() == 0) {
            a12 = null;
        }
        int c12 = a12 != null ? a12.c() : n02.f1451c;
        C3848q a13 = C3848q.a(this.f1452d);
        C3848q c3848q = a13.c() != -1 ? a13 : null;
        int c13 = c3848q != null ? c3848q.c() : n02.f1452d;
        Boolean bool3 = this.f1453e;
        if (bool3 == null) {
            bool3 = n02.f1453e;
        }
        Boolean bool4 = bool3;
        R1.c cVar = this.f1454f;
        if (cVar == null) {
            cVar = n02.f1454f;
        }
        return new N0(c11, bool2, c12, c13, bool4, cVar);
    }

    public final int d() {
        C3848q a11 = C3848q.a(this.f1452d);
        if (a11.c() == -1) {
            a11 = null;
        }
        if (a11 != null) {
            return a11.c();
        }
        return 1;
    }

    public final int e() {
        return this.f1451c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        if (this.f1449a != n02.f1449a || !Intrinsics.d(this.f1450b, n02.f1450b)) {
            return false;
        }
        if (this.f1451c == n02.f1451c) {
            if (this.f1452d == n02.f1452d) {
                n02.getClass();
                return Intrinsics.d(this.f1453e, n02.f1453e) && Intrinsics.d(this.f1454f, n02.f1454f);
            }
        }
        return false;
    }

    public final boolean f() {
        Boolean bool = this.f1453e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @NotNull
    public final Q1.r h(boolean z11) {
        C3852v a11 = C3852v.a(this.f1449a);
        if (a11.c() == -1) {
            a11 = null;
        }
        int c11 = a11 != null ? a11.c() : 0;
        Boolean bool = this.f1450b;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        C3853w a12 = C3853w.a(this.f1451c);
        C3853w c3853w = a12.c() != 0 ? a12 : null;
        int c12 = c3853w != null ? c3853w.c() : 1;
        int d11 = d();
        R1.c cVar = this.f1454f;
        if (cVar == null) {
            cVar = R1.c.f24233c;
        }
        return new Q1.r(z11, c11, booleanValue, c12, d11, cVar);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f1449a) * 31;
        Boolean bool = this.f1450b;
        int a11 = C2454a.a(this.f1452d, C2454a.a(this.f1451c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f1453e;
        int hashCode2 = (a11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        R1.c cVar = this.f1454f;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C3852v.b(this.f1449a)) + ", autoCorrectEnabled=" + this.f1450b + ", keyboardType=" + ((Object) C3853w.b(this.f1451c)) + ", imeAction=" + ((Object) C3848q.b(this.f1452d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f1453e + ", hintLocales=" + this.f1454f + ')';
    }

    public /* synthetic */ N0(int i11, int i12, int i13) {
        this((i13 & 1) != 0 ? -1 : i11, (i13 & 2) != 0 ? null : Boolean.FALSE, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) == 0 ? 7 : -1, null, null);
    }
}
