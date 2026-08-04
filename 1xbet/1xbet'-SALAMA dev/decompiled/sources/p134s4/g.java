package p134s4;

import java.util.HashMap;
import p136t.e;
import v4.a;
import v4.c;
import v4.i;
import v4.j;
import v4.k;
import v4.o;
import v4.r;
import v4.t;
import v4.v;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f16169i = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f16170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f16172c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f16173d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f16174e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f16175f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f16176g = t.f17205a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16177h = null;

    public static r i(r rVar) {
        if ((rVar instanceof v) || (rVar instanceof a) || (rVar instanceof i) || (rVar instanceof j)) {
            return rVar;
        }
        if (rVar instanceof o) {
            return new i(Double.valueOf(Long.valueOf(((o) rVar).f17198c).doubleValue()), j.f17190e);
        }
        throw new IllegalStateException("Unexpected value passed to normalizeValue: " + rVar.getValue());
    }

    public final g a() {
        g gVar = new g();
        gVar.f16170a = this.f16170a;
        gVar.f16172c = this.f16172c;
        gVar.f16173d = this.f16173d;
        gVar.f16174e = this.f16174e;
        gVar.f16175f = this.f16175f;
        gVar.f16171b = this.f16171b;
        gVar.f16176g = this.f16176g;
        return gVar;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        if (e()) {
            map.put("sp", this.f16172c.getValue());
            c cVar = this.f16173d;
            if (cVar != null) {
                map.put("sn", cVar.f17179a);
            }
        }
        if (c()) {
            map.put("ep", this.f16174e.getValue());
            c cVar2 = this.f16175f;
            if (cVar2 != null) {
                map.put("en", cVar2.f17179a);
            }
        }
        Integer num = this.f16170a;
        if (num != null) {
            map.put("l", num);
            int i7 = this.f16171b;
            if (i7 == 0) {
                i7 = e() ? 1 : 2;
            }
            int iE = e.e(i7);
            if (iE == 0) {
                map.put("vf", "l");
            } else if (iE == 1) {
                map.put("vf", "r");
            }
        }
        if (!this.f16176g.equals(t.f17205a)) {
            map.put("i", this.f16176g.a());
        }
        return map;
    }

    public final boolean c() {
        return this.f16174e != null;
    }

    public final boolean d() {
        return this.f16170a != null;
    }

    public final boolean e() {
        return this.f16172c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        Integer num = this.f16170a;
        if (num == null ? gVar.f16170a != null : !num.equals(gVar.f16170a)) {
            return false;
        }
        k kVar = this.f16176g;
        if (kVar == null ? gVar.f16176g != null : !kVar.equals(gVar.f16176g)) {
            return false;
        }
        c cVar = this.f16175f;
        if (cVar == null ? gVar.f16175f != null : !cVar.equals(gVar.f16175f)) {
            return false;
        }
        r rVar = this.f16174e;
        if (rVar == null ? gVar.f16174e != null : !rVar.equals(gVar.f16174e)) {
            return false;
        }
        c cVar2 = this.f16173d;
        if (cVar2 == null ? gVar.f16173d != null : !cVar2.equals(gVar.f16173d)) {
            return false;
        }
        r rVar2 = this.f16172c;
        if (rVar2 == null ? gVar.f16172c == null : rVar2.equals(gVar.f16172c)) {
            return g() == gVar.g();
        }
        return false;
    }

    public final boolean f() {
        return (e() && c() && d() && (!d() || this.f16171b == 0)) ? false : true;
    }

    public final boolean g() {
        int i7 = this.f16171b;
        if (i7 != 0) {
            return i7 == 1;
        }
        return e();
    }

    public final boolean h() {
        return (e() || c() || d()) ? false : true;
    }

    public final int hashCode() {
        Integer num = this.f16170a;
        int iIntValue = (((num != null ? num.intValue() : 0) * 31) + (g() ? 1231 : 1237)) * 31;
        r rVar = this.f16172c;
        int iHashCode = (iIntValue + (rVar != null ? rVar.hashCode() : 0)) * 31;
        c cVar = this.f16173d;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.f17179a.hashCode() : 0)) * 31;
        r rVar2 = this.f16174e;
        int iHashCode3 = (iHashCode2 + (rVar2 != null ? rVar2.hashCode() : 0)) * 31;
        c cVar2 = this.f16175f;
        int iHashCode4 = (iHashCode3 + (cVar2 != null ? cVar2.f17179a.hashCode() : 0)) * 31;
        k kVar = this.f16176g;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return b().toString();
    }
}
