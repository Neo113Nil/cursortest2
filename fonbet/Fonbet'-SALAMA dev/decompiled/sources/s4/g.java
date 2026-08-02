package s4;

import java.util.HashMap;
import v4.k;
import v4.o;
import v4.r;
import v4.t;
import v4.v;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final g f16163i = new g();

    /* renamed from: a, reason: collision with root package name */
    public Integer f16164a;

    /* renamed from: b, reason: collision with root package name */
    public int f16165b;

    /* renamed from: c, reason: collision with root package name */
    public r f16166c = null;

    /* renamed from: d, reason: collision with root package name */
    public v4.c f16167d = null;

    /* renamed from: e, reason: collision with root package name */
    public r f16168e = null;

    /* renamed from: f, reason: collision with root package name */
    public v4.c f16169f = null;

    /* renamed from: g, reason: collision with root package name */
    public k f16170g = t.f17199a;

    /* renamed from: h, reason: collision with root package name */
    public String f16171h = null;

    public static r i(r rVar) {
        if ((rVar instanceof v) || (rVar instanceof v4.a) || (rVar instanceof v4.i) || (rVar instanceof v4.j)) {
            return rVar;
        }
        if (rVar instanceof o) {
            return new v4.i(Double.valueOf(Long.valueOf(((o) rVar).f17192c).doubleValue()), v4.j.f17184e);
        }
        throw new IllegalStateException("Unexpected value passed to normalizeValue: " + rVar.getValue());
    }

    public final g a() {
        g gVar = new g();
        gVar.f16164a = this.f16164a;
        gVar.f16166c = this.f16166c;
        gVar.f16167d = this.f16167d;
        gVar.f16168e = this.f16168e;
        gVar.f16169f = this.f16169f;
        gVar.f16165b = this.f16165b;
        gVar.f16170g = this.f16170g;
        return gVar;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        if (e()) {
            hashMap.put("sp", this.f16166c.getValue());
            v4.c cVar = this.f16167d;
            if (cVar != null) {
                hashMap.put("sn", cVar.f17173a);
            }
        }
        if (c()) {
            hashMap.put("ep", this.f16168e.getValue());
            v4.c cVar2 = this.f16169f;
            if (cVar2 != null) {
                hashMap.put("en", cVar2.f17173a);
            }
        }
        Integer num = this.f16164a;
        if (num != null) {
            hashMap.put("l", num);
            int i7 = this.f16165b;
            if (i7 == 0) {
                i7 = e() ? 1 : 2;
            }
            int e7 = t.e.e(i7);
            if (e7 == 0) {
                hashMap.put("vf", "l");
            } else if (e7 == 1) {
                hashMap.put("vf", "r");
            }
        }
        if (!this.f16170g.equals(t.f17199a)) {
            hashMap.put("i", this.f16170g.a());
        }
        return hashMap;
    }

    public final boolean c() {
        return this.f16168e != null;
    }

    public final boolean d() {
        return this.f16164a != null;
    }

    public final boolean e() {
        return this.f16166c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        Integer num = this.f16164a;
        if (num == null ? gVar.f16164a != null : !num.equals(gVar.f16164a)) {
            return false;
        }
        k kVar = this.f16170g;
        if (kVar == null ? gVar.f16170g != null : !kVar.equals(gVar.f16170g)) {
            return false;
        }
        v4.c cVar = this.f16169f;
        if (cVar == null ? gVar.f16169f != null : !cVar.equals(gVar.f16169f)) {
            return false;
        }
        r rVar = this.f16168e;
        if (rVar == null ? gVar.f16168e != null : !rVar.equals(gVar.f16168e)) {
            return false;
        }
        v4.c cVar2 = this.f16167d;
        if (cVar2 == null ? gVar.f16167d != null : !cVar2.equals(gVar.f16167d)) {
            return false;
        }
        r rVar2 = this.f16166c;
        if (rVar2 == null ? gVar.f16166c == null : rVar2.equals(gVar.f16166c)) {
            return g() == gVar.g();
        }
        return false;
    }

    public final boolean f() {
        return (e() && c() && d() && (!d() || this.f16165b == 0)) ? false : true;
    }

    public final boolean g() {
        int i7 = this.f16165b;
        return i7 != 0 ? i7 == 1 : e();
    }

    public final boolean h() {
        return (e() || c() || d()) ? false : true;
    }

    public final int hashCode() {
        Integer num = this.f16164a;
        int intValue = (((num != null ? num.intValue() : 0) * 31) + (g() ? 1231 : 1237)) * 31;
        r rVar = this.f16166c;
        int hashCode = (intValue + (rVar != null ? rVar.hashCode() : 0)) * 31;
        v4.c cVar = this.f16167d;
        int hashCode2 = (hashCode + (cVar != null ? cVar.f17173a.hashCode() : 0)) * 31;
        r rVar2 = this.f16168e;
        int hashCode3 = (hashCode2 + (rVar2 != null ? rVar2.hashCode() : 0)) * 31;
        v4.c cVar2 = this.f16169f;
        int hashCode4 = (hashCode3 + (cVar2 != null ? cVar2.f17173a.hashCode() : 0)) * 31;
        k kVar = this.f16170g;
        return hashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return b().toString();
    }
}
