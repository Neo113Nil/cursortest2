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
public final class C0513g7 {

    /* renamed from: q, reason: collision with root package name */
    public static volatile C0513g7 f7336q;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7341e;
    public C0487f7 f;

    /* renamed from: g, reason: collision with root package name */
    public C0354a3 f7342g;

    /* renamed from: h, reason: collision with root package name */
    public C0380b3 f7343h;

    /* renamed from: i, reason: collision with root package name */
    public C1007zb f7344i;

    /* renamed from: j, reason: collision with root package name */
    public Ab f7345j;

    /* renamed from: k, reason: collision with root package name */
    public C0891un f7346k;

    /* renamed from: l, reason: collision with root package name */
    public C0917vn f7347l;

    /* renamed from: m, reason: collision with root package name */
    public C1007zb f7348m;

    /* renamed from: n, reason: collision with root package name */
    public Ab f7349n;

    /* renamed from: o, reason: collision with root package name */
    public C0518gc f7350o;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7337a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7338b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7339c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final T6 f7340d = D5.a();

    /* renamed from: p, reason: collision with root package name */
    public final C0565i7 f7351p = new C0565i7();

    public C0513g7(Context context) {
        this.f7341e = context;
    }

    public static C0513g7 a(Context context) {
        if (f7336q == null) {
            synchronized (C0513g7.class) {
                try {
                    if (f7336q == null) {
                        f7336q = new C0513g7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f7336q;
    }

    public final synchronized Oa b(X4 x4) {
        Oa oa;
        String str = new O4(x4).f6348a;
        oa = (Oa) this.f7338b.get(str);
        if (oa == null) {
            oa = new C1007zb(new C0889ul(c(x4)));
            this.f7338b.put(str, oa);
        }
        return oa;
    }

    public final synchronized C0487f7 c(X4 x4) {
        C0487f7 c0487f7;
        try {
            O4 o4 = new O4(x4);
            c0487f7 = (C0487f7) this.f7337a.get(o4.f6348a);
            if (c0487f7 == null) {
                Context context = this.f7341e;
                C0565i7 c0565i7 = this.f7351p;
                String a3 = new C0539h7(c0565i7.f7485a, c0565i7.f7486b, false).a(context, o4);
                T6 t6 = this.f7340d;
                t6.getClass();
                String str = x4.f6823b;
                if (str == null) {
                    str = "main";
                }
                String concat = "component-".concat(str);
                C0632kn c0632kn = t6.f6646c;
                C0436d7 c0436d7 = t6.f6644a;
                V6 v6 = c0436d7.f7143a;
                W6 w6 = c0436d7.f7144b;
                C0930wa c0930wa = new C0930wa(false);
                c0930wa.a(112, new R4());
                C0710nn c0710nn = new C0710nn(concat, t6.f6645b.f5787a);
                c0632kn.getClass();
                c0487f7 = new C0487f7(context, a3, new C0658ln(v6, w6, c0930wa, c0710nn), PublicLogger.getAnonymousInstance());
                this.f7337a.put(o4.f6348a, c0487f7);
            }
        } finally {
        }
        return c0487f7;
    }

    public final synchronized Oa d() {
        try {
            if (this.f7344i == null) {
                this.f7344i = new C1007zb(new C0889ul(h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7344i;
    }

    public final Oa e() {
        C0518gc c0518gc;
        if (this.f7348m == null) {
            synchronized (this) {
                try {
                    if (this.f7350o == null) {
                        C0565i7 c0565i7 = this.f7351p;
                        String a3 = new C0539h7(c0565i7.f7485a, c0565i7.f7486b, true).a(this.f7341e, new V3());
                        Context context = this.f7341e;
                        T6 t6 = this.f7340d;
                        t6.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("preferences", A5.f5670a);
                        C0632kn c0632kn = t6.f6646c;
                        C0436d7 c0436d7 = t6.f6644a;
                        Z6 z6 = c0436d7.f7145c;
                        C0358a7 c0358a7 = c0436d7.f7146d;
                        C0930wa c0930wa = new C0930wa(false);
                        c0930wa.a(112, new W3());
                        C0710nn c0710nn = new C0710nn("service database", hashMap);
                        c0632kn.getClass();
                        this.f7350o = new C0518gc(context, a3, new C0490fa(a3), new C0658ln(z6, c0358a7, c0930wa, c0710nn));
                    }
                    c0518gc = this.f7350o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f7348m = new C1007zb(c0518gc);
        }
        return this.f7348m;
    }

    public final IBinaryDataHelper f() {
        if (this.f7342g == null) {
            this.f7342g = new C0354a3(new C0889ul(h()), "binary_data");
        }
        return this.f7342g;
    }

    public final synchronized IBinaryDataHelper g() {
        try {
            if (this.f7343h == null) {
                this.f7343h = new C0380b3(f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7343h;
    }

    public final synchronized C0487f7 h() {
        try {
            if (this.f == null) {
                Context context = this.f7341e;
                C0565i7 c0565i7 = this.f7351p;
                String a3 = new C0539h7(c0565i7.f7485a, c0565i7.f7486b, true).a(context, new C0629kk());
                T6 t6 = this.f7340d;
                t6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", A5.f5670a);
                hashMap.put("binary_data", AbstractC0976y5.f8630a);
                hashMap.put("temp_cache", AbstractC0969xn.f8624a);
                Iterator<ModuleServicesDatabase> it = C0878ua.f8414H.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C0632kn c0632kn = t6.f6646c;
                C0436d7 c0436d7 = t6.f6644a;
                C0384b7 c0384b7 = c0436d7.f7147e;
                C0410c7 c0410c7 = c0436d7.f;
                C0930wa c0930wa = new C0930wa(false);
                c0930wa.a(114, new C0655lk());
                Iterator<ModuleServicesDatabase> it2 = C0878ua.f8414H.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c0930wa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C0710nn c0710nn = new C0710nn("service database", hashMap);
                c0632kn.getClass();
                this.f = new C0487f7(context, a3, new C0658ln(c0384b7, c0410c7, c0930wa, c0710nn), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    public final synchronized IBinaryDataHelper a(X4 x4) {
        IBinaryDataHelper iBinaryDataHelper;
        String str = new O4(x4).f6348a;
        iBinaryDataHelper = (IBinaryDataHelper) this.f7339c.get(str);
        if (iBinaryDataHelper == null) {
            iBinaryDataHelper = new C0354a3(new C0889ul(c(x4)), "binary_data");
            this.f7339c.put(str, iBinaryDataHelper);
        }
        return iBinaryDataHelper;
    }

    public final synchronized Oa b() {
        return e();
    }

    public final synchronized Oa a() {
        try {
            if (this.f7349n == null) {
                this.f7349n = new Ab(e());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7349n;
    }

    public final synchronized Oa c() {
        try {
            if (this.f7345j == null) {
                if (this.f7344i == null) {
                    this.f7344i = new C1007zb(new C0889ul(h()));
                }
                this.f7345j = new Ab(this.f7344i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7345j;
    }
}
