package y2;

/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: a, reason: collision with root package name */
    public final v2.m f21217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21218b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.e f21219c;

    public m(v2.m mVar, String str, v2.e eVar) {
        this.f21217a = mVar;
        this.f21218b = str;
        this.f21219c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l.a(this.f21217a, mVar.f21217a) && kotlin.jvm.internal.l.a(this.f21218b, mVar.f21218b) && this.f21219c == mVar.f21219c;
    }

    public final int hashCode() {
        int hashCode = this.f21217a.hashCode() * 31;
        String str = this.f21218b;
        return this.f21219c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
