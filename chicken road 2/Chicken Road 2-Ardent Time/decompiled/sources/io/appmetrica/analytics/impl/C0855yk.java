package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855yk {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0221a7 f7150a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Y6 f7151b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.S2 f7152c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.T2 f7153d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0690sb f7154e;

    /* renamed from: f, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0716tb f7155f;

    /* renamed from: g, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0702sn f7156g;

    /* renamed from: h, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0728tn f7157h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedHashMap f7158i = new java.util.LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedHashMap f7159j = new java.util.LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedHashMap f7160k = new java.util.LinkedHashMap();

    public C0855yk(java.io.File file) {
        this.f7150a = new io.appmetrica.analytics.impl.C0221a7(file);
    }

    public final io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper a(android.content.Context context) {
        io.appmetrica.analytics.impl.S2 s2 = this.f7152c;
        if (s2 != null) {
            return s2;
        }
        io.appmetrica.analytics.impl.S2 s22 = new io.appmetrica.analytics.impl.S2(new io.appmetrica.analytics.impl.C0649ql(f(context)), "binary_data");
        this.f7152c = s22;
        return s22;
    }

    public final synchronized io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper b(android.content.Context context) {
        io.appmetrica.analytics.impl.T2 t2;
        t2 = this.f7153d;
        if (t2 == null) {
            t2 = new io.appmetrica.analytics.impl.T2(a(context));
            this.f7153d = t2;
        }
        return t2;
    }

    public final synchronized io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper c(android.content.Context context) {
        return a(context);
    }

    public final synchronized io.appmetrica.analytics.impl.Ha d(android.content.Context context) {
        io.appmetrica.analytics.impl.C0716tb c0716tb;
        try {
            c0716tb = this.f7155f;
            if (c0716tb == null) {
                io.appmetrica.analytics.impl.C0690sb c0690sb = this.f7154e;
                if (c0690sb == null) {
                    c0690sb = new io.appmetrica.analytics.impl.C0690sb(new io.appmetrica.analytics.impl.C0649ql(f(context)));
                    this.f7154e = c0690sb;
                }
                c0716tb = new io.appmetrica.analytics.impl.C0716tb(c0690sb);
                this.f7155f = c0716tb;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return c0716tb;
    }

    public final synchronized io.appmetrica.analytics.impl.Ha e(android.content.Context context) {
        io.appmetrica.analytics.impl.C0690sb c0690sb;
        c0690sb = this.f7154e;
        if (c0690sb == null) {
            c0690sb = new io.appmetrica.analytics.impl.C0690sb(new io.appmetrica.analytics.impl.C0649ql(f(context)));
            this.f7154e = c0690sb;
        }
        return c0690sb;
    }

    public final synchronized io.appmetrica.analytics.impl.Y6 f(android.content.Context context) {
        io.appmetrica.analytics.impl.Y6 y6;
        try {
            y6 = this.f7151b;
            if (y6 == null) {
                io.appmetrica.analytics.impl.C0221a7 c0221a7 = this.f7150a;
                java.lang.String a2 = new io.appmetrica.analytics.impl.Z6(c0221a7.f5468a, c0221a7.f5469b, true).a(context, new io.appmetrica.analytics.impl.C0363fk());
                io.appmetrica.analytics.impl.M6 m6 = io.appmetrica.analytics.impl.AbstractC0788w5.f7002c;
                m6.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("preferences", io.appmetrica.analytics.impl.InterfaceC0710t5.f6842a);
                hashMap.put("binary_data", io.appmetrica.analytics.impl.AbstractC0658r5.f6718a);
                hashMap.put("temp_cache", io.appmetrica.analytics.impl.AbstractC0780vn.f6986a);
                java.util.Iterator<io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase> it = io.appmetrica.analytics.impl.C0560na.f6484I.p().b().iterator();
                while (it.hasNext()) {
                    for (io.appmetrica.analytics.modulesapi.internal.common.TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                io.appmetrica.analytics.impl.C0418hn c0418hn = m6.f4647c;
                io.appmetrica.analytics.impl.W6 w6 = m6.f4645a;
                io.appmetrica.analytics.impl.U6 u6 = w6.f5195e;
                io.appmetrica.analytics.impl.V6 v6 = w6.f5196f;
                io.appmetrica.analytics.impl.C0612pa c0612pa = new io.appmetrica.analytics.impl.C0612pa(false);
                c0612pa.a(114, new io.appmetrica.analytics.impl.C0389gk());
                java.util.Iterator<io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase> it2 = io.appmetrica.analytics.impl.C0560na.f6484I.p().b().iterator();
                while (it2.hasNext()) {
                    java.util.Iterator<io.appmetrica.analytics.modulesapi.internal.common.TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (java.util.Map.Entry<java.lang.Integer, io.appmetrica.analytics.coreapi.internal.db.DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c0612pa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                io.appmetrica.analytics.impl.C0495kn c0495kn = new io.appmetrica.analytics.impl.C0495kn("service database", hashMap);
                c0418hn.getClass();
                y6 = new io.appmetrica.analytics.impl.Y6(context, a2, new io.appmetrica.analytics.impl.C0443in(u6, v6, c0612pa, c0495kn), io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance());
                this.f7151b = y6;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return y6;
    }

    public final synchronized io.appmetrica.analytics.impl.Y6 c(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4) {
        java.lang.Object obj;
        try {
            java.lang.String str = new io.appmetrica.analytics.impl.H4(q4).f4369a;
            java.util.LinkedHashMap linkedHashMap = this.f7158i;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                io.appmetrica.analytics.impl.C0221a7 c0221a7 = this.f7150a;
                java.lang.String a2 = new io.appmetrica.analytics.impl.Z6(c0221a7.f5468a, c0221a7.f5469b, false).a(context, new io.appmetrica.analytics.impl.H4(q4));
                io.appmetrica.analytics.impl.M6 m6 = io.appmetrica.analytics.impl.AbstractC0788w5.f7002c;
                m6.getClass();
                java.lang.String str2 = q4.f4860b;
                if (str2 == null) {
                    str2 = "main";
                }
                java.lang.String concat = "component-".concat(str2);
                io.appmetrica.analytics.impl.C0418hn c0418hn = m6.f4647c;
                io.appmetrica.analytics.impl.W6 w6 = m6.f4645a;
                io.appmetrica.analytics.impl.O6 o6 = w6.f5191a;
                io.appmetrica.analytics.impl.P6 p6 = w6.f5192b;
                io.appmetrica.analytics.impl.C0612pa c0612pa = new io.appmetrica.analytics.impl.C0612pa(false);
                c0612pa.a(112, new io.appmetrica.analytics.impl.K4());
                io.appmetrica.analytics.impl.C0495kn c0495kn = new io.appmetrica.analytics.impl.C0495kn(concat, m6.f4646b.f6883a);
                c0418hn.getClass();
                obj = new io.appmetrica.analytics.impl.Y6(context, a2, new io.appmetrica.analytics.impl.C0443in(o6, p6, c0612pa, c0495kn), io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, obj);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (io.appmetrica.analytics.impl.Y6) obj;
    }

    public final synchronized io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper a(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4) {
        java.lang.Object obj;
        try {
            java.lang.String str = new io.appmetrica.analytics.impl.H4(q4).f4369a;
            java.util.LinkedHashMap linkedHashMap = this.f7160k;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new io.appmetrica.analytics.impl.S2(new io.appmetrica.analytics.impl.C0649ql(c(context, q4)), "binary_data");
                linkedHashMap.put(str, obj);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper) obj;
    }

    public final synchronized io.appmetrica.analytics.impl.Ha b(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4) {
        java.lang.Object obj;
        try {
            java.lang.String str = new io.appmetrica.analytics.impl.H4(q4).f4369a;
            java.util.LinkedHashMap linkedHashMap = this.f7159j;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new io.appmetrica.analytics.impl.C0690sb(new io.appmetrica.analytics.impl.C0649ql(c(context, q4)));
                linkedHashMap.put(str, obj);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (io.appmetrica.analytics.impl.Ha) obj;
    }
}
