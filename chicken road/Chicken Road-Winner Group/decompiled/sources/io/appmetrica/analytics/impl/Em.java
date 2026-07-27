package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class Em {

    /* renamed from: a, reason: collision with root package name */
    public final Fm f5916a;

    /* renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f5917b;

    public Em(Fm fm) {
        this.f5916a = fm;
    }

    public final Context b() {
        return this.f5916a.f5953a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.f5917b;
                    if (networkTask != null && !networkTask.isRemoved()) {
                    }
                    C0502fm d3 = d();
                    C0417ce c0417ce = C0417ce.f7106a;
                    C0399bm c0399bm = new C0399bm(new C0701ne(), C0878ua.f8414H.p());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d3);
                    try {
                        NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new C0925w5(this.f5916a.f5953a), new AllHostsExponentialBackoffPolicy(C0417ce.f7106a.a(EnumC0365ae.STARTUP)), new Cm(this, new Vl(), new FullUrlFormer(c0399bm, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), e2.o.f4877a, C0417ce.f7108c);
                        this.f5917b = networkTask2;
                        networkTask = networkTask2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    networkTask = null;
                }
                return networkTask;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final C0502fm d() {
        return (C0502fm) this.f5916a.f5963l.a();
    }

    public final C0605jm e() {
        C0605jm c0605jm;
        Ml ml = this.f5916a.f5963l;
        synchronized (ml) {
            c0605jm = ml.f8489c.f6552a;
        }
        return c0605jm;
    }

    public final void f() {
        C0605jm c0605jm;
        Ml ml = this.f5916a.f5963l;
        synchronized (ml) {
            c0605jm = ml.f8489c.f6552a;
        }
        C0709nm c0709nm = c0605jm.f7644c;
        C0683mm a3 = c0709nm.a(c0709nm.f7955m);
        String str = c0605jm.f7642a;
        String str2 = c0605jm.f7643b;
        C0814ro c0814ro = this.f5916a.f5965n;
        String str3 = c0605jm.f7645d;
        c0814ro.getClass();
        if (!C0814ro.a(str3)) {
            a3.f7874a = this.f5916a.f5964m.a().id;
        }
        String str4 = c0605jm.f7642a;
        if (str4 == null || str4.length() == 0) {
            str = this.f5916a.f5959h.a();
            str2 = "";
        }
        List<String> list = this.f5916a.f5955c.f7168e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a3.f7879g = list;
        C0605jm c0605jm2 = new C0605jm(str, str2, new C0709nm(a3));
        b(c0605jm2);
        a(c0605jm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r1 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0002, B:10:0x0011, B:12:0x001b, B:17:0x0035, B:19:0x003d, B:21:0x0045, B:24:0x004e), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z3;
        boolean z4 = true;
        synchronized (this) {
            try {
                boolean z5 = false;
                if (C0878ua.f8414H.h().isRestrictedForSdk()) {
                    return false;
                }
                C0605jm e3 = e();
                Set set = AbstractC0528gm.f7390a;
                if (!e3.f7663w) {
                    if (AbstractC0528gm.f7391b.currentTimeSeconds() <= e3.f7655o + e3.f7665z.f6002a) {
                        z3 = false;
                        if (!z3) {
                            if (AbstractC0528gm.a(e3.f7645d) && AbstractC0528gm.a(e3.f7642a) && AbstractC0528gm.a(e3.f7643b)) {
                                z5 = true;
                            }
                            z3 = !z5;
                            K3 k3 = this.f5916a.f5962k;
                            Map map = d().f7303h;
                            H3 h3 = this.f5916a.f5961j;
                            k3.getClass();
                            boolean a3 = K3.a(map, e3, h3);
                            if (z5) {
                            }
                        }
                        z4 = z3;
                        return z4;
                    }
                }
                z3 = true;
                if (!z3) {
                }
                z4 = z3;
                return z4;
            } finally {
            }
        }
    }

    public final synchronized void h() {
        this.f5917b = null;
    }

    public final X4 a() {
        return this.f5916a.f;
    }

    public final synchronized void b(C0605jm c0605jm) {
        this.f5916a.f5963l.a(c0605jm);
        C0579im c0579im = this.f5916a.f5958g;
        c0579im.f7551b.a(c0605jm.f7642a);
        c0579im.f7551b.b(c0605jm.f7643b);
        c0579im.f7550a.save(c0605jm.f7644c);
        this.f5916a.f5957e.a(c0605jm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC0528gm.a(e(), list, map, new Dm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0605jm a(C0554hm c0554hm, C0502fm c0502fm, long j3) {
        String str;
        boolean equals;
        String a3 = Jm.a(c0502fm.f7303h);
        Map map = c0502fm.f7304i.f8657a;
        String str2 = c0554hm.f7445j;
        String str3 = e().f7651k;
        if (!Jm.a(Jm.a(str2))) {
            str2 = Jm.a(Jm.a(str3)) ? str3 : null;
        }
        String str4 = e().f7642a;
        if (str4 != null) {
            str = v2.m.n0(str4) ? null : str4;
        }
        str = c0554hm.f7443h;
        C0683mm c0683mm = new C0683mm(c0554hm.f7438b);
        String str5 = c0554hm.f7444i;
        c0683mm.f7887o = this.f5916a.f5960i.currentTimeSeconds();
        c0683mm.f7874a = e().f7645d;
        c0683mm.f7876c = c0554hm.f7440d;
        c0683mm.f = c0554hm.f7439c;
        c0683mm.f7879g = c0502fm.f7301e;
        c0683mm.f7875b = c0554hm.f7441e;
        c0683mm.f7877d = c0554hm.f;
        c0683mm.f7878e = c0554hm.f7442g;
        c0683mm.f7880h = c0554hm.f7449n;
        c0683mm.f7881i = c0554hm.f7450o;
        c0683mm.f7882j = str2;
        c0683mm.f7883k = a3;
        this.f5916a.f5962k.getClass();
        HashMap a4 = Jm.a(str2);
        if (AbstractC0711no.a(map)) {
            equals = AbstractC0711no.a((Map) a4);
        } else {
            equals = a4.equals(map);
        }
        c0683mm.f7889q = equals;
        c0683mm.f7884l = Jm.a(map);
        c0683mm.f7890r = c0554hm.f7448m;
        c0683mm.f7886n = c0554hm.f7446k;
        c0683mm.f7891s = c0554hm.f7451p;
        c0683mm.f7888p = true;
        c0683mm.f7892t = j3;
        C0502fm d3 = d();
        if (d3.f7309n == 0) {
            d3.f7309n = j3;
        }
        c0683mm.f7893u = d3.f7309n;
        c0683mm.f7894v = false;
        c0683mm.f7895w = c0554hm.f7452q;
        c0683mm.f7896x = c0554hm.f7453r;
        c0683mm.y = c0554hm.f7454s;
        c0683mm.f7897z = c0554hm.f7455t;
        c0683mm.f7872A = c0554hm.f7456u;
        c0683mm.f7873B = c0554hm.f7457v;
        return new C0605jm(str, str5, new C0709nm(c0683mm));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0554hm c0554hm, C0502fm c0502fm, Map<String, ? extends List<String>> map) {
        Long l3;
        C0605jm a3;
        synchronized (this) {
            if (!AbstractC0711no.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!AbstractC0711no.a((Collection) list)) {
                    try {
                        l3 = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l3 == null ? l3.longValue() : 0L;
                    AbstractC0397bk.f7063a.a(longValue, c0554hm.f7447l);
                    a3 = a(c0554hm, c0502fm, longValue);
                    h();
                    b(a3);
                }
            }
            l3 = null;
            if (l3 == null) {
            }
            AbstractC0397bk.f7063a.a(longValue, c0554hm.f7447l);
            a3 = a(c0554hm, c0502fm, longValue);
            h();
            b(a3);
        }
        a(a3);
    }

    public final void a(C0605jm c0605jm) {
        ArrayList arrayList;
        Fm fm = this.f5916a;
        Jl jl = fm.f5956d;
        String str = fm.f5954b;
        synchronized (jl.f6168a.f6250b) {
            try {
                Ll ll = jl.f6168a;
                ll.f6251c = c0605jm;
                Collection collection = (Collection) ll.f6249a.f8557a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ul) it.next()).a(c0605jm);
        }
    }

    public final void a(Nl nl) {
        synchronized (this) {
            this.f5917b = null;
        }
        Fm fm = this.f5916a;
        fm.f5956d.a(fm.f.f6822a, nl, e());
    }

    public final synchronized void a(C0451dm c0451dm) {
        try {
            this.f5916a.f5963l.a(c0451dm);
            C0502fm d3 = d();
            if (d3.f7306k) {
                List list = d3.f7305j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC0711no.a(list, d3.f7301e)) {
                        C0605jm e3 = e();
                        C0709nm c0709nm = e3.f7644c;
                        C0683mm a3 = c0709nm.a(c0709nm.f7955m);
                        String str = e3.f7642a;
                        String str2 = e3.f7643b;
                        a3.f7879g = list;
                        C0605jm c0605jm = new C0605jm(str, str2, new C0709nm(a3));
                        b(c0605jm);
                        a(c0605jm);
                    }
                }
                if (d3.f7301e != null && (!r5.isEmpty())) {
                    C0605jm e4 = e();
                    C0709nm c0709nm2 = e4.f7644c;
                    C0683mm a4 = c0709nm2.a(c0709nm2.f7955m);
                    String str3 = e4.f7642a;
                    String str4 = e4.f7643b;
                    a4.f7879g = null;
                    C0605jm c0605jm2 = new C0605jm(str3, str4, new C0709nm(a4));
                    b(c0605jm2);
                    a(c0605jm2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
