package t6;

import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public abstract class m extends b implements A6.d {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f16469x;

    public m(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f16469x = false;
    }

    public final A6.a d() {
        if (this.f16469x) {
            return this;
        }
        A6.a aVar = this.f16455a;
        if (aVar != null) {
            return aVar;
        }
        A6.a b7 = b();
        this.f16455a = b7;
        return b7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return c().equals(mVar.c()) && this.f16458d.equals(mVar.f16458d) && this.f16459e.equals(mVar.f16459e) && this.f16456b.equals(mVar.f16456b);
        }
        if (obj instanceof A6.d) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f16459e.hashCode() + AbstractC1663a.d(c().hashCode() * 31, 31, this.f16458d);
    }

    public final String toString() {
        A6.a d7 = d();
        return d7 != this ? d7.toString() : e1.k.i(new StringBuilder("property "), this.f16458d, " (Kotlin reflection is not available)");
    }
}
