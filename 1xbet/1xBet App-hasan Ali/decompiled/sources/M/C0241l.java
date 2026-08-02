package M;

import n.AbstractC2107A;

/* renamed from: M.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241l {

    /* renamed from: a, reason: collision with root package name */
    public final float f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3378b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3379c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3380d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3381e;
    public final float f;

    public C0241l(float f, float f5, float f6, float f7, float f8, float f9) {
        this.f3377a = f;
        this.f3378b = f5;
        this.f3379c = f6;
        this.f3380d = f7;
        this.f3381e = f8;
        this.f = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0241l)) {
            return false;
        }
        C0241l c0241l = (C0241l) obj;
        return W0.f.a(this.f3377a, c0241l.f3377a) && W0.f.a(this.f3378b, c0241l.f3378b) && W0.f.a(this.f3379c, c0241l.f3379c) && W0.f.a(this.f3380d, c0241l.f3380d) && W0.f.a(this.f, c0241l.f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f) + AbstractC2107A.n(this.f3380d, AbstractC2107A.n(this.f3379c, AbstractC2107A.n(this.f3378b, Float.floatToIntBits(this.f3377a) * 31, 31), 31), 31);
    }
}
