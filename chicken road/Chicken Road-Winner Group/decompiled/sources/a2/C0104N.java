package a2;

import e2.AbstractC0293h;

/* renamed from: a2.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104N {

    /* renamed from: a, reason: collision with root package name */
    public final String f1828a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0102L f1829b;

    public C0104N(String str, EnumC0102L enumC0102L) {
        this.f1828a = str;
        this.f1829b = enumC0102L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0104N)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0104N c0104n = (C0104N) obj;
        return X0.a.q(AbstractC0293h.S(this.f1828a, this.f1829b), AbstractC0293h.S(c0104n.f1828a, c0104n.f1829b));
    }

    public final int hashCode() {
        return AbstractC0293h.S(this.f1828a, this.f1829b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f1828a + ", type=" + this.f1829b + ")";
    }
}
