package com.ironsource;

/* renamed from: com.ironsource.bb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2972bb {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Se f6158a;

    public C2972bb(com.ironsource.Se response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        this.f6158a = response;
    }

    private final com.ironsource.C3185n9 b(com.ironsource.C3185n9 c3185n9, java.util.Map<java.lang.String, com.ironsource.C3185n9> map) {
        java.lang.String m;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(c3185n9.l(), java.lang.Boolean.TRUE) || (m = c3185n9.m()) == null || m.length() == 0 || kotlin.jvm.internal.Intrinsics.areEqual(c3185n9.m(), c3185n9.j())) {
            return null;
        }
        return map.get(c3185n9.m());
    }

    public final com.ironsource.C2954ab a() {
        com.ironsource.P3.a.c f;
        com.ironsource.P3.a.g h;
        com.ironsource.P3.a e = this.f6158a.d().e();
        return new com.ironsource.C2954ab((e == null || (h = e.h()) == null) ? null : a(h, this.f6158a.e().h()), (e == null || (f = e.f()) == null) ? null : a(f, this.f6158a.e().f()), null, a(this.f6158a.f()));
    }

    private final com.ironsource.C3057g6 a(com.ironsource.P3.a.g gVar, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        com.ironsource.P3.c g = this.f6158a.d().g();
        com.ironsource.P3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map2 = map;
        java.lang.Integer A = gVar.A();
        int intValue = A != null ? A.intValue() : 2;
        java.lang.Integer s = gVar.s();
        boolean z = s == null || s.intValue() == 1;
        java.lang.Long v = gVar.v();
        long longValue = v != null ? v.longValue() : 3000L;
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        com.ironsource.C3211p a2 = a(k, k != null ? k.A() : null);
        java.lang.Integer r = gVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        java.lang.Integer x = gVar.x();
        return new com.ironsource.C3057g6(map2, intValue, z, longValue, emptyList, a2, intValue2, java.lang.Integer.valueOf(x != null ? x.intValue() : -1));
    }

    private final com.ironsource.C3057g6 a(com.ironsource.P3.a.c cVar, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        com.ironsource.P3.c g = this.f6158a.d().g();
        com.ironsource.P3.c.a k = g != null ? g.k() : null;
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map2 = map;
        java.lang.Integer A = cVar.A();
        int intValue = A != null ? A.intValue() : 2;
        java.lang.Integer s = cVar.s();
        boolean z = s != null && s.intValue() == 1;
        java.lang.Long v = cVar.v();
        long longValue = v != null ? v.longValue() : 3000L;
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        com.ironsource.C3211p a2 = a(k, k != null ? k.y() : null);
        java.lang.Integer r = cVar.r();
        int intValue2 = r != null ? r.intValue() : 60;
        java.lang.Integer y = cVar.y();
        return new com.ironsource.C3057g6(map2, intValue, z, longValue, emptyList, a2, intValue2, java.lang.Integer.valueOf(y != null ? y.intValue() : -1));
    }

    private final com.ironsource.C3211p a(com.ironsource.P3.c.a aVar, com.ironsource.P3.c.a.C0123a c0123a) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Boolean l;
        java.lang.Boolean B;
        java.lang.Integer w;
        java.lang.Boolean v;
        java.lang.Boolean u;
        java.lang.Integer p;
        java.lang.Long q;
        java.lang.Integer r;
        if (aVar == null || (str = aVar.o()) == null) {
            str = "";
        }
        if (aVar == null || (str2 = aVar.s()) == null) {
            str2 = "";
        }
        if (aVar == null || (str3 = aVar.x()) == null) {
            str3 = "";
        }
        return new com.ironsource.C3211p(str, str2, str3, (aVar == null || (r = aVar.r()) == null) ? 2 : r.intValue(), (aVar == null || (q = aVar.q()) == null) ? 10000L : q.longValue(), (aVar == null || (p = aVar.p()) == null) ? 15 : p.intValue(), (aVar == null || (u = aVar.u()) == null) ? false : u.booleanValue(), (aVar == null || (v = aVar.v()) == null) ? false : v.booleanValue(), (aVar == null || (w = aVar.w()) == null) ? 2 : w.intValue(), (aVar == null || (B = aVar.B()) == null) ? true : B.booleanValue(), (c0123a == null || (l = c0123a.l()) == null) ? true : l.booleanValue());
    }

    private final java.util.Map<java.lang.String, com.ironsource.Bd> a(java.util.Map<java.lang.String, com.ironsource.C3185n9> map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, com.ironsource.C3185n9> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue(), map));
        }
        return linkedHashMap;
    }

    private final com.ironsource.Bd a(com.ironsource.C3185n9 c3185n9, java.util.Map<java.lang.String, com.ironsource.C3185n9> map) {
        com.ironsource.C3185n9.a i;
        com.ironsource.C3185n9.a i2;
        com.ironsource.C3185n9.a i3;
        com.ironsource.C3185n9.a i4;
        com.ironsource.C3185n9 b = b(c3185n9, map);
        org.json.JSONObject jSONObject = null;
        org.json.JSONObject a2 = a(c3185n9.k(), b != null ? b.k() : null);
        com.ironsource.C3185n9.a i5 = c3185n9.i();
        org.json.JSONObject a3 = a(i5 != null ? i5.h() : null, (b == null || (i4 = b.i()) == null) ? null : i4.h(), a2);
        com.ironsource.C3185n9.a i6 = c3185n9.i();
        org.json.JSONObject a4 = a(i6 != null ? i6.f() : null, (b == null || (i3 = b.i()) == null) ? null : i3.f(), a2);
        com.ironsource.C3185n9.a i7 = c3185n9.i();
        org.json.JSONObject a5 = a(i7 != null ? i7.e() : null, (b == null || (i2 = b.i()) == null) ? null : i2.e(), a2);
        com.ironsource.C3185n9.a i8 = c3185n9.i();
        org.json.JSONObject g = i8 != null ? i8.g() : null;
        if (b != null && (i = b.i()) != null) {
            jSONObject = i.g();
        }
        return new com.ironsource.Bd(a3, a4, a5, a(g, jSONObject, a2));
    }

    private final org.json.JSONObject a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(jSONObject3, jSONObject);
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(jSONObject3, jSONObject2);
        return jSONObject3;
    }

    private final org.json.JSONObject a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(jSONObject4, jSONObject);
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(jSONObject4, jSONObject2);
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(jSONObject4, jSONObject3);
        return jSONObject4;
    }
}
