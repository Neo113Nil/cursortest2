package g2;

import W5.AbstractC0486a1;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f13151a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13152b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13153c;

    /* renamed from: d, reason: collision with root package name */
    public int f13154d;

    public j(String str, long j, long j3) {
        this.f13153c = str == null ? "" : str;
        this.f13151a = j;
        this.f13152b = j3;
    }

    public final j a(j jVar, String str) {
        String C3 = AbstractC1664a.C(str, this.f13153c);
        if (jVar == null || !C3.equals(AbstractC1664a.C(str, jVar.f13153c))) {
            return null;
        }
        long j = this.f13152b;
        long j3 = jVar.f13152b;
        if (j != -1) {
            long j7 = this.f13151a;
            if (j7 + j == jVar.f13151a) {
                return new j(C3, j7, j3 != -1 ? j + j3 : -1L);
            }
        }
        if (j3 != -1) {
            long j8 = jVar.f13151a;
            if (j8 + j3 == this.f13151a) {
                return new j(C3, j8, j != -1 ? j3 + j : -1L);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13151a == jVar.f13151a && this.f13152b == jVar.f13152b && this.f13153c.equals(jVar.f13153c);
    }

    public final int hashCode() {
        if (this.f13154d == 0) {
            this.f13154d = this.f13153c.hashCode() + ((((527 + ((int) this.f13151a)) * 31) + ((int) this.f13152b)) * 31);
        }
        return this.f13154d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f13153c);
        sb.append(", start=");
        sb.append(this.f13151a);
        sb.append(", length=");
        return AbstractC0486a1.i(sb, this.f13152b, ")");
    }
}
