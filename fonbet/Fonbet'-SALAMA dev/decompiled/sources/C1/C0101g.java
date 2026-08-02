package C1;

import A1.InterfaceC0027k;

/* renamed from: C1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101g implements InterfaceC0027k {

    /* renamed from: x, reason: collision with root package name */
    public static final C0101g f1484x = new C0101g(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1486b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1487c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1488d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1489e;

    /* renamed from: f, reason: collision with root package name */
    public u1.c f1490f;

    public C0101g(int i7, int i8, int i9, int i10, int i11) {
        this.f1485a = i7;
        this.f1486b = i8;
        this.f1487c = i9;
        this.f1488d = i10;
        this.f1489e = i11;
    }

    public final u1.c a() {
        if (this.f1490f == null) {
            this.f1490f = new u1.c(this);
        }
        return this.f1490f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0101g.class != obj.getClass()) {
            return false;
        }
        C0101g c0101g = (C0101g) obj;
        return this.f1485a == c0101g.f1485a && this.f1486b == c0101g.f1486b && this.f1487c == c0101g.f1487c && this.f1488d == c0101g.f1488d && this.f1489e == c0101g.f1489e;
    }

    public final int hashCode() {
        return ((((((((527 + this.f1485a) * 31) + this.f1486b) * 31) + this.f1487c) * 31) + this.f1488d) * 31) + this.f1489e;
    }
}
