package s4;

import java.util.HashMap;
import n4.C1473g;
import p6.AbstractC1539a;
import v4.k;
import v4.m;
import v4.s;
import v4.t;
import v4.w;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final C1473g f16172a;

    /* renamed from: b, reason: collision with root package name */
    public final g f16173b;

    public h(C1473g c1473g, g gVar) {
        this.f16172a = c1473g;
        this.f16173b = gVar;
    }

    public static h a(C1473g c1473g) {
        return new h(c1473g, g.f16163i);
    }

    public static h b(C1473g c1473g, HashMap hashMap) {
        k sVar;
        g gVar = new g();
        gVar.f16164a = (Integer) hashMap.get("l");
        if (hashMap.containsKey("sp")) {
            gVar.f16166c = g.i(AbstractC1539a.a(hashMap.get("sp"), v4.j.f17184e));
            String str = (String) hashMap.get("sn");
            if (str != null) {
                gVar.f16167d = v4.c.b(str);
            }
        }
        if (hashMap.containsKey("ep")) {
            gVar.f16168e = g.i(AbstractC1539a.a(hashMap.get("ep"), v4.j.f17184e));
            String str2 = (String) hashMap.get("en");
            if (str2 != null) {
                gVar.f16169f = v4.c.b(str2);
            }
        }
        String str3 = (String) hashMap.get("vf");
        if (str3 != null) {
            gVar.f16165b = str3.equals("l") ? 1 : 2;
        }
        String str4 = (String) hashMap.get("i");
        if (str4 != null) {
            if (str4.equals(".value")) {
                sVar = w.f17204a;
            } else if (str4.equals(".key")) {
                sVar = m.f17189a;
            } else {
                if (str4.equals(".priority")) {
                    throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
                }
                sVar = new s(new C1473g(str4));
            }
            gVar.f16170g = sVar;
        }
        return new h(c1473g, gVar);
    }

    public final boolean c() {
        g gVar = this.f16173b;
        return gVar.h() && gVar.f16170g.equals(t.f17199a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f16172a.equals(hVar.f16172a) && this.f16173b.equals(hVar.f16173b);
    }

    public final int hashCode() {
        return this.f16173b.hashCode() + (this.f16172a.hashCode() * 31);
    }

    public final String toString() {
        return this.f16172a + ":" + this.f16173b;
    }
}
