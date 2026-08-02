package K1;

import B0.C2454a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3440u {

    /* renamed from: a, reason: collision with root package name */
    private final int f15090a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15091b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15092c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.o f15093d;

    /* renamed from: e, reason: collision with root package name */
    private final y f15094e;

    /* renamed from: f, reason: collision with root package name */
    private final V1.f f15095f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15096g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15097h;

    /* renamed from: i, reason: collision with root package name */
    private final V1.q f15098i;

    public C3440u(int i11, int i12, long j11, V1.o oVar, y yVar, V1.f fVar, int i13, int i14, V1.q qVar) {
        long j12;
        this.f15090a = i11;
        this.f15091b = i12;
        this.f15092c = j11;
        this.f15093d = oVar;
        this.f15094e = yVar;
        this.f15095f = fVar;
        this.f15096g = i13;
        this.f15097h = i14;
        this.f15098i = qVar;
        j12 = Z1.u.f35334c;
        if (Z1.u.c(j11, j12) || Z1.u.e(j11) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + Z1.u.e(j11) + ')').toString());
    }

    public static C3440u a(C3440u c3440u, int i11) {
        return new C3440u(c3440u.f15090a, i11, c3440u.f15092c, c3440u.f15093d, c3440u.f15094e, c3440u.f15095f, c3440u.f15096g, c3440u.f15097h, c3440u.f15098i);
    }

    public final int b() {
        return this.f15097h;
    }

    public final int c() {
        return this.f15096g;
    }

    public final long d() {
        return this.f15092c;
    }

    public final V1.f e() {
        return this.f15095f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3440u)) {
            return false;
        }
        C3440u c3440u = (C3440u) obj;
        return this.f15090a == c3440u.f15090a && this.f15091b == c3440u.f15091b && Z1.u.c(this.f15092c, c3440u.f15092c) && Intrinsics.d(this.f15093d, c3440u.f15093d) && Intrinsics.d(this.f15094e, c3440u.f15094e) && Intrinsics.d(this.f15095f, c3440u.f15095f) && this.f15096g == c3440u.f15096g && this.f15097h == c3440u.f15097h && Intrinsics.d(this.f15098i, c3440u.f15098i);
    }

    public final y f() {
        return this.f15094e;
    }

    public final int g() {
        return this.f15090a;
    }

    public final int h() {
        return this.f15091b;
    }

    public final int hashCode() {
        int a11 = C2454a.a(this.f15091b, Integer.hashCode(this.f15090a) * 31, 31);
        int i11 = Z1.u.f35335d;
        int a12 = Pk0.c.a(a11, 31, this.f15092c);
        V1.o oVar = this.f15093d;
        int hashCode = (a12 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        y yVar = this.f15094e;
        int hashCode2 = (hashCode + (yVar != null ? yVar.hashCode() : 0)) * 31;
        V1.f fVar = this.f15095f;
        int a13 = C2454a.a(this.f15097h, C2454a.a(this.f15096g, (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31, 31), 31);
        V1.q qVar = this.f15098i;
        return a13 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final V1.o i() {
        return this.f15093d;
    }

    public final V1.q j() {
        return this.f15098i;
    }

    @NotNull
    public final C3440u k(C3440u c3440u) {
        if (c3440u == null) {
            return this;
        }
        return C3441v.a(this, c3440u.f15090a, c3440u.f15091b, c3440u.f15092c, c3440u.f15093d, c3440u.f15094e, c3440u.f15095f, c3440u.f15096g, c3440u.f15097h, c3440u.f15098i);
    }

    @NotNull
    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) V1.h.b(this.f15090a)) + ", textDirection=" + ((Object) V1.j.b(this.f15091b)) + ", lineHeight=" + ((Object) Z1.u.f(this.f15092c)) + ", textIndent=" + this.f15093d + ", platformStyle=" + this.f15094e + ", lineHeightStyle=" + this.f15095f + ", lineBreak=" + ((Object) V1.e.d(this.f15096g)) + ", hyphens=" + ((Object) V1.d.b(this.f15097h)) + ", textMotion=" + this.f15098i + ')';
    }

    public C3440u(int i11, int i12, long j11, V1.o oVar, int i13) {
        this((i13 & 1) != 0 ? Integer.MIN_VALUE : i11, (i13 & 2) != 0 ? Integer.MIN_VALUE : i12, j11, (i13 & 8) != 0 ? null : oVar, null, null, 0, LinearLayoutManager.INVALID_OFFSET, null);
    }
}
