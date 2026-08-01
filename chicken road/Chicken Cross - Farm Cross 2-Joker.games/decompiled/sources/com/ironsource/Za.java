package com.ironsource;

import com.ironsource.C4568o9;
import com.ironsource.M3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Za {

    /* renamed from: a, reason: collision with root package name */
    private final Qe f8049a;

    public Za(Qe response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f8049a = response;
    }

    private final C4568o9 b(C4568o9 c4568o9, Map<String, C4568o9> map) {
        String m;
        if (!Intrinsics.areEqual(c4568o9.l(), Boolean.TRUE) || (m = c4568o9.m()) == null || m.length() == 0 || Intrinsics.areEqual(c4568o9.m(), c4568o9.j())) {
            return null;
        }
        return map.get(c4568o9.m());
    }

    public final Ya a() {
        M3.a.c f;
        M3.a.g h;
        M3.a e = this.f8049a.d().e();
        return new Ya((e == null || (h = e.h()) == null) ? null : a(h, this.f8049a.e().h()), (e == null || (f = e.f()) == null) ? null : a(f, this.f8049a.e().f()), null, a(this.f8049a.f()));
    }

    private final C4404f6 a(M3.a.g gVar, Map<String, ? extends List<String>> map) {
        M3.c g = this.f8049a.d().g();
        M3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer A = gVar.A();
        int intValue = A != null ? A.intValue() : 2;
        Integer s = gVar.s();
        boolean z = s == null || s.intValue() == 1;
        Long v = gVar.v();
        long longValue = v != null ? v.longValue() : 3000L;
        List emptyList = CollectionsKt.emptyList();
        C4576p a2 = a(k, k != null ? k.A() : null);
        Integer r = gVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        Integer x = gVar.x();
        return new C4404f6(map2, intValue, z, longValue, emptyList, a2, intValue2, Integer.valueOf(x != null ? x.intValue() : -1));
    }

    private final C4404f6 a(M3.a.c cVar, Map<String, ? extends List<String>> map) {
        M3.c g = this.f8049a.d().g();
        M3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer A = cVar.A();
        int intValue = A != null ? A.intValue() : 2;
        Integer s = cVar.s();
        boolean z = s != null && s.intValue() == 1;
        Long v = cVar.v();
        long longValue = v != null ? v.longValue() : 3000L;
        List emptyList = CollectionsKt.emptyList();
        C4576p a2 = a(k, k != null ? k.y() : null);
        Integer r = cVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        Integer y = cVar.y();
        return new C4404f6(map2, intValue, z, longValue, emptyList, a2, intValue2, Integer.valueOf(y != null ? y.intValue() : -1));
    }

    private final C4576p a(M3.c.a aVar, M3.c.a.C0312a c0312a) {
        String str;
        String str2;
        String str3;
        Boolean l;
        Boolean B;
        Integer w;
        Boolean v;
        Boolean u;
        Integer p;
        Long q;
        Integer r;
        if (aVar == null || (str = aVar.o()) == null) {
            str = "";
        }
        if (aVar == null || (str2 = aVar.s()) == null) {
            str2 = "";
        }
        if (aVar == null || (str3 = aVar.x()) == null) {
            str3 = "";
        }
        int i = 2;
        int intValue = (aVar == null || (r = aVar.r()) == null) ? 2 : r.intValue();
        long longValue = (aVar == null || (q = aVar.q()) == null) ? 10000L : q.longValue();
        int intValue2 = (aVar == null || (p = aVar.p()) == null) ? 15 : p.intValue();
        boolean z = false;
        boolean booleanValue = (aVar == null || (u = aVar.u()) == null) ? false : u.booleanValue();
        if (aVar != null && (v = aVar.v()) != null) {
            z = v.booleanValue();
        }
        boolean z2 = z;
        if (aVar != null && (w = aVar.w()) != null) {
            i = w.intValue();
        }
        int i2 = i;
        boolean z3 = true;
        boolean booleanValue2 = (aVar == null || (B = aVar.B()) == null) ? true : B.booleanValue();
        if (c0312a != null && (l = c0312a.l()) != null) {
            z3 = l.booleanValue();
        }
        return new C4576p(str, str2, str3, intValue, longValue, intValue2, booleanValue, z2, i2, booleanValue2, z3);
    }

    private final Map<String, Ad> a(Map<String, C4568o9> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C4568o9> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue(), map));
        }
        return linkedHashMap;
    }

    private final Ad a(C4568o9 c4568o9, Map<String, C4568o9> map) {
        C4568o9.a i;
        C4568o9.a i2;
        C4568o9.a i3;
        C4568o9.a i4;
        C4568o9 b = b(c4568o9, map);
        JSONObject jSONObject = null;
        JSONObject a2 = a(c4568o9.k(), b != null ? b.k() : null);
        C4568o9.a i5 = c4568o9.i();
        JSONObject a3 = a(i5 != null ? i5.h() : null, (b == null || (i4 = b.i()) == null) ? null : i4.h(), a2);
        C4568o9.a i6 = c4568o9.i();
        JSONObject a4 = a(i6 != null ? i6.f() : null, (b == null || (i3 = b.i()) == null) ? null : i3.f(), a2);
        C4568o9.a i7 = c4568o9.i();
        JSONObject a5 = a(i7 != null ? i7.e() : null, (b == null || (i2 = b.i()) == null) ? null : i2.e(), a2);
        C4568o9.a i8 = c4568o9.i();
        JSONObject g = i8 != null ? i8.g() : null;
        if (b != null && (i = b.i()) != null) {
            jSONObject = i.g();
        }
        return new Ad(a3, a4, a5, a(g, jSONObject, a2));
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        IronSourceUtils.b(jSONObject3, jSONObject);
        IronSourceUtils.b(jSONObject3, jSONObject2);
        return jSONObject3;
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = new JSONObject();
        IronSourceUtils.b(jSONObject4, jSONObject);
        IronSourceUtils.b(jSONObject4, jSONObject2);
        IronSourceUtils.b(jSONObject4, jSONObject3);
        return jSONObject4;
    }
}
