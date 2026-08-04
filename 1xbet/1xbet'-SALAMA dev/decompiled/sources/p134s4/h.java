package p134s4;

import java.util.HashMap;
import p098n4.C0934g;
import p115p6.a;
import v4.c;
import v4.j;
import v4.k;
import v4.m;
import v4.s;
import v4.t;
import v4.w;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0934g f16178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16179b;

    public h(C0934g c0934g, g gVar) {
        this.f16178a = c0934g;
        this.f16179b = gVar;
    }

    public static h a(C0934g c0934g) {
        return new h(c0934g, g.f16169i);
    }

    public static h b(C0934g c0934g, HashMap map) {
        k sVar;
        g gVar = new g();
        gVar.f16170a = (Integer) map.get("l");
        if (map.containsKey("sp")) {
            gVar.f16172c = g.i(a.a(map.get("sp"), j.f17190e));
            String str = (String) map.get("sn");
            if (str != null) {
                gVar.f16173d = c.b(str);
            }
        }
        if (map.containsKey("ep")) {
            gVar.f16174e = g.i(a.a(map.get("ep"), j.f17190e));
            String str2 = (String) map.get("en");
            if (str2 != null) {
                gVar.f16175f = c.b(str2);
            }
        }
        String str3 = (String) map.get("vf");
        if (str3 != null) {
            gVar.f16171b = str3.equals("l") ? 1 : 2;
        }
        String str4 = (String) map.get("i");
        if (str4 != null) {
            if (str4.equals(".value")) {
                sVar = w.f17210a;
            } else if (str4.equals(".key")) {
                sVar = m.f17195a;
            } else {
                if (str4.equals(".priority")) {
                    throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
                }
                sVar = new s(new C0934g(str4));
            }
            gVar.f16176g = sVar;
        }
        return new h(c0934g, gVar);
    }

    public final boolean c() {
        g gVar = this.f16179b;
        return gVar.h() && gVar.f16176g.equals(t.f17205a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f16178a.equals(hVar.f16178a) && this.f16179b.equals(hVar.f16179b);
    }

    public final int hashCode() {
        return this.f16179b.hashCode() + (this.f16178a.hashCode() * 31);
    }

    public final String toString() {
        return this.f16178a + ":" + this.f16179b;
    }
}
