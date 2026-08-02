package D4;

import H4.n;

/* loaded from: classes2.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1750b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1751c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1752d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1753e;

    public e(String str, int i7, n nVar, int i8, long j) {
        this.f1749a = str;
        this.f1750b = i7;
        this.f1751c = nVar;
        this.f1752d = i8;
        this.f1753e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1750b == eVar.f1750b && this.f1752d == eVar.f1752d && this.f1753e == eVar.f1753e && this.f1749a.equals(eVar.f1749a)) {
            return this.f1751c.equals(eVar.f1751c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f1749a.hashCode() * 31) + this.f1750b) * 31) + this.f1752d) * 31;
        long j = this.f1753e;
        return this.f1751c.f3333a.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }
}
