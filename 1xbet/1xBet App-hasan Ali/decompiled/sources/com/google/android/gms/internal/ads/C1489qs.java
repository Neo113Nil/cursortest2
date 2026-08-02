package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.qs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1489qs {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f15177a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f15178b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final C1713vs f15179c;

    /* renamed from: d, reason: collision with root package name */
    public final U4 f15180d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f15181e;
    public volatile ConnectivityManager f;

    /* renamed from: g, reason: collision with root package name */
    public final C2308a f15182g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f15183h;

    public C1489qs(C1713vs c1713vs, U4 u42, Context context, C2308a c2308a) {
        this.f15179c = c1713vs;
        this.f15180d = u42;
        this.f15181e = context;
        this.f15182g = c2308a;
    }

    public static String a(String str, J2.c cVar) {
        return AbstractC0467k.v(str, "#", cVar == null ? "NULL" : cVar.name());
    }

    public static void b(C1489qs c1489qs, boolean z3) {
        synchronized (c1489qs) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8899t)).booleanValue()) {
                c1489qs.g(z3);
            }
        }
    }

    public final synchronized C1174js c(String str, J2.c cVar) {
        return (C1174js) this.f15177a.get(a(str, cVar));
    }

    public final synchronized ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2;
        try {
            HashSet hashSet = new HashSet();
            arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Q2.R0 r02 = (Q2.R0) obj;
                String a5 = a(r02.f4935k, J2.c.a(r02.f4936l));
                hashSet.add(a5);
                C1174js c1174js = (C1174js) this.f15177a.get(a5);
                if (c1174js != null) {
                    if (c1174js.f14177e.equals(r02)) {
                        c1174js.m(r02.f4938n);
                    } else {
                        this.f15178b.put(a5, c1174js);
                        this.f15177a.remove(a5);
                    }
                } else if (this.f15178b.containsKey(a5)) {
                    C1174js c1174js2 = (C1174js) this.f15178b.get(a5);
                    if (c1174js2.f14177e.equals(r02)) {
                        c1174js2.m(r02.f4938n);
                        c1174js2.l();
                        this.f15177a.put(a5, c1174js2);
                        this.f15178b.remove(a5);
                    }
                } else {
                    arrayList2.add(r02);
                }
            }
            Iterator it = this.f15177a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f15178b.put((String) entry.getKey(), (C1174js) entry.getValue());
                    it.remove();
                }
            }
            Iterator it2 = this.f15178b.entrySet().iterator();
            while (it2.hasNext()) {
                C1174js c1174js3 = (C1174js) ((Map.Entry) it2.next()).getValue();
                c1174js3.f.set(false);
                c1174js3.f14182l.set(false);
                if (!c1174js3.n()) {
                    it2.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.os] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.ps] */
    public final synchronized Optional e(final Class cls, String str, final J2.c cVar) {
        Optional of;
        Optional empty;
        Optional empty2;
        Optional ofNullable;
        Optional map;
        Optional empty3;
        this.f15182g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        U4 u42 = this.f15180d;
        u42.getClass();
        of = Optional.of("poll_ad");
        empty = Optional.empty();
        u42.r(cVar, of, "ppac_ts", currentTimeMillis, empty);
        C1174js c5 = c(str, cVar);
        if (c5 == null) {
            empty3 = Optional.empty();
            return empty3;
        }
        try {
            final Optional h3 = c5.h();
            ofNullable = Optional.ofNullable(c5.g());
            map = ofNullable.map(new Function() { // from class: com.google.android.gms.internal.ads.os
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }
            });
            map.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.ps
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Optional of2;
                    C1489qs c1489qs = C1489qs.this;
                    J2.c cVar2 = cVar;
                    Optional optional = h3;
                    c1489qs.f15182g.getClass();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    U4 u43 = c1489qs.f15180d;
                    u43.getClass();
                    of2 = Optional.of("poll_ad");
                    u43.r(cVar2, of2, "ppla_ts", currentTimeMillis2, optional);
                }
            });
            return map;
        } catch (ClassCastException e3) {
            P2.o.f4767B.f4774g.i("PreloadAdManager.pollAd", e3);
            T2.G.n("Unable to cast ad to the requested type:".concat(cls.getName()), e3);
            empty2 = Optional.empty();
            return empty2;
        }
    }

    public final synchronized void f(String str, C1174js c1174js) {
        c1174js.e();
        this.f15177a.put(str, c1174js);
    }

    public final synchronized void g(boolean z3) {
        try {
            if (z3) {
                Iterator it = this.f15177a.values().iterator();
                while (it.hasNext()) {
                    ((C1174js) it.next()).l();
                }
            } else {
                Iterator it2 = this.f15177a.values().iterator();
                while (it2.hasNext()) {
                    ((C1174js) it2.next()).f.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h(String str, J2.c cVar) {
        boolean z3;
        Optional empty;
        try {
            this.f15182g.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C1174js c5 = c(str, cVar);
            z3 = false;
            if (c5 != null && c5.n()) {
                z3 = true;
            }
            if (z3) {
                this.f15182g.getClass();
                empty = Optional.of(Long.valueOf(System.currentTimeMillis()));
            } else {
                empty = Optional.empty();
            }
            this.f15180d.b(cVar, currentTimeMillis, empty, c5 == null ? Optional.empty() : c5.h());
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }
}
