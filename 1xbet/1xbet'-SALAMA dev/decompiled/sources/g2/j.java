package g2;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13160d;

    public j(String str, long j, long j3) {
        this.f13159c = str == null ? "" : str;
        this.f13157a = j;
        this.f13158b = j3;
    }

    public final j a(j jVar, String str) {
        String strC = p151v2.a.C(str, this.f13159c);
        if (jVar == null || !strC.equals(p151v2.a.C(str, jVar.f13159c))) {
            return null;
        }
        long j = this.f13158b;
        long j3 = jVar.f13158b;
        if (j != -1) {
            long j7 = this.f13157a;
            if (j7 + j == jVar.f13157a) {
                return new j(strC, j7, j3 != -1 ? j + j3 : -1L);
            }
        }
        if (j3 != -1) {
            long j8 = jVar.f13157a;
            if (j8 + j3 == this.f13157a) {
                return new j(strC, j8, j != -1 ? j3 + j : -1L);
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
        return this.f13157a == jVar.f13157a && this.f13158b == jVar.f13158b && this.f13159c.equals(jVar.f13159c);
    }

    public final int hashCode() {
        if (this.f13160d == 0) {
            this.f13160d = this.f13159c.hashCode() + ((((527 + ((int) this.f13157a)) * 31) + ((int) this.f13158b)) * 31);
        }
        return this.f13160d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f13159c);
        sb.append(", start=");
        sb.append(this.f13157a);
        sb.append(", length=");
        return AbstractC0486a1.i(sb, this.f13158b, ")");
    }
}
