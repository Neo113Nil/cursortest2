package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662g7 {

    /* renamed from: q, reason: collision with root package name */
    public static volatile C0662g7 f8234q;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8239e;

    /* renamed from: f, reason: collision with root package name */
    public C0636f7 f8240f;

    /* renamed from: g, reason: collision with root package name */
    public C0503a3 f8241g;

    /* renamed from: h, reason: collision with root package name */
    public C0529b3 f8242h;

    /* renamed from: i, reason: collision with root package name */
    public C1156zb f8243i;

    /* renamed from: j, reason: collision with root package name */
    public Ab f8244j;

    /* renamed from: k, reason: collision with root package name */
    public C1040un f8245k;

    /* renamed from: l, reason: collision with root package name */
    public C1066vn f8246l;

    /* renamed from: m, reason: collision with root package name */
    public C1156zb f8247m;

    /* renamed from: n, reason: collision with root package name */
    public Ab f8248n;

    /* renamed from: o, reason: collision with root package name */
    public C0667gc f8249o;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8235a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8236b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8237c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final T6 f8238d = D5.a();

    /* renamed from: p, reason: collision with root package name */
    public final C0714i7 f8250p = new C0714i7();

    public C0662g7(Context context) {
        this.f8239e = context;
    }

    public static C0662g7 a(Context context) {
        if (f8234q == null) {
            synchronized (C0662g7.class) {
                try {
                    if (f8234q == null) {
                        f8234q = new C0662g7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f8234q;
    }

    public final synchronized Oa b(X4 x42) {
        Oa oa;
        String str = new O4(x42).f7207a;
        oa = (Oa) this.f8236b.get(str);
        if (oa == null) {
            oa = new C1156zb(new C1038ul(c(x42)));
            this.f8236b.put(str, oa);
        }
        return oa;
    }

    public final synchronized C0636f7 c(X4 x42) {
        C0636f7 c0636f7;
        try {
            O4 o42 = new O4(x42);
            c0636f7 = (C0636f7) this.f8235a.get(o42.f7207a);
            if (c0636f7 == null) {
                Context context = this.f8239e;
                C0714i7 c0714i7 = this.f8250p;
                String a6 = new C0688h7(c0714i7.f8393a, c0714i7.f8394b, false).a(context, o42);
                T6 t6 = this.f8238d;
                t6.getClass();
                String str = x42.f7698b;
                if (str == null) {
                    str = "main";
                }
                String concat = "component-".concat(str);
                C0781kn c0781kn = t6.f7517c;
                C0585d7 c0585d7 = t6.f7515a;
                V6 v6 = c0585d7.f8032a;
                W6 w6 = c0585d7.f8033b;
                C1079wa c1079wa = new C1079wa(false);
                c1079wa.a(112, new R4());
                C0859nn c0859nn = new C0859nn(concat, t6.f7516b.f6621a);
                c0781kn.getClass();
                c0636f7 = new C0636f7(context, a6, new C0807ln(v6, w6, c1079wa, c0859nn), PublicLogger.getAnonymousInstance());
                this.f8235a.put(o42.f7207a, c0636f7);
            }
        } finally {
        }
        return c0636f7;
    }

    public final synchronized Oa d() {
        try {
            if (this.f8243i == null) {
                this.f8243i = new C1156zb(new C1038ul(h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8243i;
    }

    public final Oa e() {
        C0667gc c0667gc;
        if (this.f8247m == null) {
            synchronized (this) {
                try {
                    if (this.f8249o == null) {
                        C0714i7 c0714i7 = this.f8250p;
                        String a6 = new C0688h7(c0714i7.f8393a, c0714i7.f8394b, true).a(this.f8239e, new V3());
                        Context context = this.f8239e;
                        T6 t6 = this.f8238d;
                        t6.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("preferences", A5.f6500a);
                        C0781kn c0781kn = t6.f7517c;
                        C0585d7 c0585d7 = t6.f7515a;
                        Z6 z6 = c0585d7.f8034c;
                        C0507a7 c0507a7 = c0585d7.f8035d;
                        C1079wa c1079wa = new C1079wa(false);
                        c1079wa.a(112, new W3());
                        C0859nn c0859nn = new C0859nn("service database", hashMap);
                        c0781kn.getClass();
                        this.f8249o = new C0667gc(context, a6, new C0639fa(a6), new C0807ln(z6, c0507a7, c1079wa, c0859nn));
                    }
                    c0667gc = this.f8249o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f8247m = new C1156zb(c0667gc);
        }
        return this.f8247m;
    }

    public final IBinaryDataHelper f() {
        if (this.f8241g == null) {
            this.f8241g = new C0503a3(new C1038ul(h()), "binary_data");
        }
        return this.f8241g;
    }

    public final synchronized IBinaryDataHelper g() {
        try {
            if (this.f8242h == null) {
                this.f8242h = new C0529b3(f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8242h;
    }

    public final synchronized C0636f7 h() {
        try {
            if (this.f8240f == null) {
                Context context = this.f8239e;
                C0714i7 c0714i7 = this.f8250p;
                String a6 = new C0688h7(c0714i7.f8393a, c0714i7.f8394b, true).a(context, new C0778kk());
                T6 t6 = this.f8238d;
                t6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", A5.f6500a);
                hashMap.put("binary_data", AbstractC1125y5.f9589a);
                hashMap.put("temp_cache", AbstractC1118xn.f9583a);
                Iterator<ModuleServicesDatabase> it = C1027ua.f9366H.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C0781kn c0781kn = t6.f7517c;
                C0585d7 c0585d7 = t6.f7515a;
                C0533b7 c0533b7 = c0585d7.f8036e;
                C0559c7 c0559c7 = c0585d7.f8037f;
                C1079wa c1079wa = new C1079wa(false);
                c1079wa.a(114, new C0804lk());
                Iterator<ModuleServicesDatabase> it2 = C1027ua.f9366H.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c1079wa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C0859nn c0859nn = new C0859nn("service database", hashMap);
                c0781kn.getClass();
                this.f8240f = new C0636f7(context, a6, new C0807ln(c0533b7, c0559c7, c1079wa, c0859nn), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8240f;
    }

    public final synchronized IBinaryDataHelper a(X4 x42) {
        IBinaryDataHelper iBinaryDataHelper;
        String str = new O4(x42).f7207a;
        iBinaryDataHelper = (IBinaryDataHelper) this.f8237c.get(str);
        if (iBinaryDataHelper == null) {
            iBinaryDataHelper = new C0503a3(new C1038ul(c(x42)), "binary_data");
            this.f8237c.put(str, iBinaryDataHelper);
        }
        return iBinaryDataHelper;
    }

    public final synchronized Oa b() {
        return e();
    }

    public final synchronized Oa a() {
        try {
            if (this.f8248n == null) {
                this.f8248n = new Ab(e());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8248n;
    }

    public final synchronized Oa c() {
        try {
            if (this.f8244j == null) {
                if (this.f8243i == null) {
                    this.f8243i = new C1156zb(new C1038ul(h()));
                }
                this.f8244j = new Ab(this.f8243i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8244j;
    }
}
