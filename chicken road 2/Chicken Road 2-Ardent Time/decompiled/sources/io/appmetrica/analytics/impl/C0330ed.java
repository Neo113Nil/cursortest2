package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330ed implements io.appmetrica.analytics.impl.Tj {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0752ul f5838a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5839b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f5840c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f5841d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f5842e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5843f;

    public C0330ed(io.appmetrica.analytics.impl.InterfaceC0752ul interfaceC0752ul, java.lang.String str, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider, java.util.List<io.appmetrica.analytics.impl.C0253bd> list) {
        this.f5838a = interfaceC0752ul;
        this.f5839b = str;
        this.f5840c = systemTimeProvider;
        this.f5841d = list;
        this.f5842e = str.toUpperCase(java.util.Locale.ROOT) + "_STATUS";
        this.f5843f = java.util.concurrent.TimeUnit.DAYS.toMillis(1L);
    }

    public final io.appmetrica.analytics.impl.Sj a() {
        java.util.List J2;
        io.appmetrica.analytics.impl.C0718td c0718td;
        io.appmetrica.analytics.impl.C0253bd c0253bd;
        if (this.f5841d.isEmpty()) {
            return null;
        }
        java.util.List list = this.f5841d;
        io.appmetrica.analytics.impl.C0305dd c0305dd = new io.appmetrica.analytics.impl.C0305dd();
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.size() <= 1) {
            J2 = i1.AbstractC0190i.X(list);
        } else {
            java.lang.Object[] array = list.toArray(new java.lang.Object[0]);
            kotlin.jvm.internal.i.e(array, "<this>");
            if (array.length > 1) {
                java.util.Arrays.sort(array, c0305dd);
            }
            J2 = i1.AbstractC0189h.J(array);
        }
        java.lang.String c2 = ((io.appmetrica.analytics.impl.AbstractC0848yd) this.f5838a).c(this.f5842e, (java.lang.String) null);
        if (c2 != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(c2);
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                v1.C1002c F2 = u0.AbstractC0995a.F(0, jSONArray.length());
                java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(F2));
                java.util.Iterator it = F2.iterator();
                while (((v1.C1001b) it).f8392c) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(((v1.C1001b) it).a());
                    try {
                        c0253bd = new io.appmetrica.analytics.impl.C0253bd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                    } catch (java.lang.Throwable unused) {
                        c0253bd = new io.appmetrica.analytics.impl.C0253bd("", false);
                    }
                    arrayList.add(c0253bd);
                }
                c0718td = new io.appmetrica.analytics.impl.C0718td(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (java.lang.Throwable unused2) {
                c0718td = new io.appmetrica.analytics.impl.C0718td(i1.C0199r.f3325a, 0L);
            }
        } else {
            c0718td = null;
        }
        long currentTimeMillis = this.f5840c.currentTimeMillis();
        if (c0718td != null && currentTimeMillis - c0718td.f6855b <= this.f5843f && J2.equals(c0718td.f6854a)) {
            return null;
        }
        io.appmetrica.analytics.impl.C0718td c0718td2 = new io.appmetrica.analytics.impl.C0718td(J2, currentTimeMillis);
        io.appmetrica.analytics.impl.InterfaceC0752ul interfaceC0752ul = this.f5838a;
        io.appmetrica.analytics.impl.AbstractC0848yd abstractC0848yd = (io.appmetrica.analytics.impl.AbstractC0848yd) interfaceC0752ul;
        return new io.appmetrica.analytics.impl.Sj(B1.a.j(new java.lang.StringBuilder(), this.f5839b, "_status"), c0718td2.a());
    }

    public /* synthetic */ C0330ed(io.appmetrica.analytics.impl.InterfaceC0752ul interfaceC0752ul, java.lang.String str, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider, java.util.List list, int i2, kotlin.jvm.internal.e eVar) {
        this(interfaceC0752ul, str, (i2 & 4) != 0 ? new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider() : systemTimeProvider, list);
    }
}
