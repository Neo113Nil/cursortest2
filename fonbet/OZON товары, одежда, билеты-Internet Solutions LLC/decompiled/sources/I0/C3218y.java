package I0;

import I0.C3220z;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3218y {

    /* renamed from: a, reason: collision with root package name */
    private final long f11658a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11659b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11660c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11661d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11662e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final K1.K f11663f;

    public C3218y(long j11, int i11, int i12, int i13, int i14, @NotNull K1.K k11) {
        this.f11658a = j11;
        this.f11659b = i11;
        this.f11660c = i12;
        this.f11661d = i13;
        this.f11662e = i14;
        this.f11663f = k11;
    }

    @NotNull
    public final C3220z.a a(int i11) {
        V1.g b11;
        b11 = C3202p0.b(this.f11663f, i11);
        return new C3220z.a(b11, i11, this.f11658a);
    }

    @NotNull
    public final String b() {
        return this.f11663f.k().j().h();
    }

    @NotNull
    public final EnumC3195m c() {
        int i11 = this.f11660c;
        int i12 = this.f11661d;
        return i11 < i12 ? EnumC3195m.NOT_CROSSED : i11 > i12 ? EnumC3195m.CROSSED : EnumC3195m.COLLAPSED;
    }

    public final int d() {
        return this.f11661d;
    }

    public final int e() {
        return this.f11662e;
    }

    public final int f() {
        return this.f11660c;
    }

    public final long g() {
        return this.f11658a;
    }

    public final int h() {
        return this.f11659b;
    }

    @NotNull
    public final K1.K i() {
        return this.f11663f;
    }

    public final boolean j(@NotNull C3218y c3218y) {
        return (this.f11658a == c3218y.f11658a && this.f11660c == c3218y.f11660c && this.f11661d == c3218y.f11661d) ? false : true;
    }

    @NotNull
    public final String toString() {
        V1.g b11;
        V1.g b12;
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f11658a);
        sb2.append(", range=(");
        int i11 = this.f11660c;
        sb2.append(i11);
        sb2.append('-');
        K1.K k11 = this.f11663f;
        b11 = C3202p0.b(k11, i11);
        sb2.append(b11);
        sb2.append(',');
        int i12 = this.f11661d;
        sb2.append(i12);
        sb2.append('-');
        b12 = C3202p0.b(k11, i12);
        sb2.append(b12);
        sb2.append("), prevOffset=");
        return Ek.a.d(sb2, this.f11662e, ')');
    }
}
