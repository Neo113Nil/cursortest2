package io.appmetrica.analytics.impl;

import android.content.Context;
import g4.C0471p;
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
    public final Fm f6757a;

    /* renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f6758b;

    public Em(Fm fm) {
        this.f6757a = fm;
    }

    public final Context b() {
        return this.f6757a.f6797a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            if (g()) {
                networkTask = this.f6758b;
                if (networkTask != null) {
                    if (networkTask.isRemoved()) {
                    }
                }
                C0651fm d6 = d();
                C0566ce c0566ce = C0566ce.f7994a;
                C0548bm c0548bm = new C0548bm(new C0850ne(), C1027ua.f9366H.p());
                FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d6);
                networkTask = new NetworkTask(new SynchronizedBlockingExecutor(), new C1074w5(this.f6757a.f6797a), new AllHostsExponentialBackoffPolicy(C0566ce.f7994a.a(EnumC0514ae.STARTUP)), new Cm(this, new Vl(), new FullUrlFormer(c0548bm, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), C0471p.f5750a, C0566ce.f7996c);
                this.f6758b = networkTask;
            } else {
                networkTask = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return networkTask;
    }

    public final C0651fm d() {
        return (C0651fm) this.f6757a.f6808l.a();
    }

    public final C0754jm e() {
        C0754jm c0754jm;
        Ml ml = this.f6757a.f6808l;
        synchronized (ml) {
            c0754jm = ml.f9443c.f7418a;
        }
        return c0754jm;
    }

    public final void f() {
        C0754jm c0754jm;
        Ml ml = this.f6757a.f6808l;
        synchronized (ml) {
            c0754jm = ml.f9443c.f7418a;
        }
        C0858nm c0858nm = c0754jm.f8561c;
        C0832mm a6 = c0858nm.a(c0858nm.f8886m);
        String str = c0754jm.f8559a;
        String str2 = c0754jm.f8560b;
        C0963ro c0963ro = this.f6757a.f6810n;
        String str3 = c0754jm.f8562d;
        c0963ro.getClass();
        if (!C0963ro.a(str3)) {
            a6.f8801a = this.f6757a.f6809m.a().id;
        }
        String str4 = c0754jm.f8559a;
        if (str4 == null || str4.length() == 0) {
            str = this.f6757a.f6804h.a();
            str2 = "";
        }
        List<String> list = this.f6757a.f6799c.f8058e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a6.f8807g = list;
        C0754jm c0754jm2 = new C0754jm(str, str2, new C0858nm(a6));
        b(c0754jm2);
        a(c0754jm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r1 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0002, B:10:0x0011, B:12:0x001b, B:17:0x0035, B:19:0x003d, B:21:0x0045, B:24:0x004e), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z;
        boolean z5 = true;
        synchronized (this) {
            try {
                boolean z6 = false;
                if (C1027ua.f9366H.h().isRestrictedForSdk()) {
                    return false;
                }
                C0754jm e3 = e();
                Set set = AbstractC0677gm.f8292a;
                if (!e3.f8581w) {
                    if (AbstractC0677gm.f8293b.currentTimeSeconds() <= e3.f8573o + e3.z.f6847a) {
                        z = false;
                        if (!z) {
                            if (AbstractC0677gm.a(e3.f8562d) && AbstractC0677gm.a(e3.f8559a) && AbstractC0677gm.a(e3.f8560b)) {
                                z6 = true;
                            }
                            z = !z6;
                            K3 k3 = this.f6757a.f6807k;
                            Map map = d().f8199h;
                            H3 h3 = this.f6757a.f6806j;
                            k3.getClass();
                            boolean a6 = K3.a(map, e3, h3);
                            if (z6) {
                            }
                        }
                        z5 = z;
                        return z5;
                    }
                }
                z = true;
                if (!z) {
                }
                z5 = z;
                return z5;
            } finally {
            }
        }
    }

    public final synchronized void h() {
        this.f6758b = null;
    }

    public final X4 a() {
        return this.f6757a.f6802f;
    }

    public final synchronized void b(C0754jm c0754jm) {
        this.f6757a.f6808l.a(c0754jm);
        C0728im c0728im = this.f6757a.f6803g;
        c0728im.f8462b.a(c0754jm.f8559a);
        c0728im.f8462b.b(c0754jm.f8560b);
        c0728im.f8461a.save(c0754jm.f8561c);
        this.f6757a.f6801e.a(c0754jm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC0677gm.a(e(), list, map, new Dm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0754jm a(C0703hm c0703hm, C0651fm c0651fm, long j2) {
        String str;
        boolean equals;
        String a6 = Jm.a(c0651fm.f8199h);
        Map map = c0651fm.f8200i.f9617a;
        String str2 = c0703hm.f8350j;
        String str3 = e().f8569k;
        if (!Jm.a(Jm.a(str2))) {
            str2 = Jm.a(Jm.a(str3)) ? str3 : null;
        }
        String str4 = e().f8559a;
        if (str4 != null) {
            str = B4.k.Z(str4) ? null : str4;
        }
        str = c0703hm.f8348h;
        C0832mm c0832mm = new C0832mm(c0703hm.f8342b);
        String str5 = c0703hm.f8349i;
        c0832mm.f8815o = this.f6757a.f6805i.currentTimeSeconds();
        c0832mm.f8801a = e().f8562d;
        c0832mm.f8803c = c0703hm.f8344d;
        c0832mm.f8806f = c0703hm.f8343c;
        c0832mm.f8807g = c0651fm.f8196e;
        c0832mm.f8802b = c0703hm.f8345e;
        c0832mm.f8804d = c0703hm.f8346f;
        c0832mm.f8805e = c0703hm.f8347g;
        c0832mm.f8808h = c0703hm.f8354n;
        c0832mm.f8809i = c0703hm.f8355o;
        c0832mm.f8810j = str2;
        c0832mm.f8811k = a6;
        this.f6757a.f6807k.getClass();
        HashMap a7 = Jm.a(str2);
        if (AbstractC0860no.a(map)) {
            equals = AbstractC0860no.a((Map) a7);
        } else {
            equals = a7.equals(map);
        }
        c0832mm.f8817q = equals;
        c0832mm.f8812l = Jm.a(map);
        c0832mm.f8818r = c0703hm.f8353m;
        c0832mm.f8814n = c0703hm.f8351k;
        c0832mm.f8819s = c0703hm.f8356p;
        c0832mm.f8816p = true;
        c0832mm.f8820t = j2;
        C0651fm d6 = d();
        if (d6.f8205n == 0) {
            d6.f8205n = j2;
        }
        c0832mm.f8821u = d6.f8205n;
        c0832mm.f8822v = false;
        c0832mm.f8823w = c0703hm.f8357q;
        c0832mm.f8824x = c0703hm.f8358r;
        c0832mm.f8825y = c0703hm.f8359s;
        c0832mm.z = c0703hm.f8360t;
        c0832mm.f8799A = c0703hm.f8361u;
        c0832mm.f8800B = c0703hm.f8362v;
        return new C0754jm(str, str5, new C0858nm(c0832mm));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0703hm c0703hm, C0651fm c0651fm, Map<String, ? extends List<String>> map) {
        Long l2;
        C0754jm a6;
        synchronized (this) {
            if (!AbstractC0860no.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!AbstractC0860no.a((Collection) list)) {
                    try {
                        l2 = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l2 == null ? l2.longValue() : 0L;
                    AbstractC0546bk.f7949a.a(longValue, c0703hm.f8352l);
                    a6 = a(c0703hm, c0651fm, longValue);
                    h();
                    b(a6);
                }
            }
            l2 = null;
            if (l2 == null) {
            }
            AbstractC0546bk.f7949a.a(longValue, c0703hm.f8352l);
            a6 = a(c0703hm, c0651fm, longValue);
            h();
            b(a6);
        }
        a(a6);
    }

    public final void a(C0754jm c0754jm) {
        ArrayList arrayList;
        Fm fm = this.f6757a;
        Jl jl = fm.f6800d;
        String str = fm.f6798b;
        synchronized (jl.f7021a.f7108b) {
            try {
                Ll ll = jl.f7021a;
                ll.f7109c = c0754jm;
                Collection collection = (Collection) ll.f7107a.f9514a.get(str);
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
            ((Ul) it.next()).a(c0754jm);
        }
    }

    public final void a(Nl nl) {
        synchronized (this) {
            this.f6758b = null;
        }
        Fm fm = this.f6757a;
        fm.f6800d.a(fm.f6802f.f7697a, nl, e());
    }

    public final synchronized void a(C0600dm c0600dm) {
        try {
            this.f6757a.f6808l.a(c0600dm);
            C0651fm d6 = d();
            if (d6.f8202k) {
                List list = d6.f8201j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC0860no.a(list, d6.f8196e)) {
                        C0754jm e3 = e();
                        C0858nm c0858nm = e3.f8561c;
                        C0832mm a6 = c0858nm.a(c0858nm.f8886m);
                        String str = e3.f8559a;
                        String str2 = e3.f8560b;
                        a6.f8807g = list;
                        C0754jm c0754jm = new C0754jm(str, str2, new C0858nm(a6));
                        b(c0754jm);
                        a(c0754jm);
                    }
                }
                if (d6.f8196e != null && (!r5.isEmpty())) {
                    C0754jm e6 = e();
                    C0858nm c0858nm2 = e6.f8561c;
                    C0832mm a7 = c0858nm2.a(c0858nm2.f8886m);
                    String str3 = e6.f8559a;
                    String str4 = e6.f8560b;
                    a7.f8807g = null;
                    C0754jm c0754jm2 = new C0754jm(str3, str4, new C0858nm(a7));
                    b(c0754jm2);
                    a(c0754jm2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
