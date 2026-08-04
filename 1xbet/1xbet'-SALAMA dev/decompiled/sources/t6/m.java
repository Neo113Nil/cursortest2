package t6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends b implements A6.d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f16475x;

    public m(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f16475x = false;
    }

    public final A6.a d() {
        if (this.f16475x) {
            return this;
        }
        A6.a aVar = this.f16461a;
        if (aVar != null) {
            return aVar;
        }
        A6.a aVarB = b();
        this.f16461a = aVarB;
        return aVarB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return c().equals(mVar.c()) && this.f16464d.equals(mVar.f16464d) && this.f16465e.equals(mVar.f16465e) && this.f16462b.equals(mVar.f16462b);
        }
        if (obj instanceof A6.d) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f16465e.hashCode() + p150v0.a.d(c().hashCode() * 31, 31, this.f16464d);
    }

    public final String toString() {
        A6.a aVarD = d();
        return aVarD != this ? aVarD.toString() : p031e1.k.i(new StringBuilder("property "), this.f16464d, " (Kotlin reflection is not available)");
    }
}
