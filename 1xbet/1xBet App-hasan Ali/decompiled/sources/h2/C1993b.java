package h2;

import A0.J0;
import D3.h;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import f2.C1944b;
import f2.C1945c;
import f2.m;
import g2.InterfaceC1977a;
import g2.InterfaceC1979c;
import g2.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k2.C2032c;
import k2.InterfaceC2031b;
import o2.i;
import p2.AbstractC2250h;
import v3.e;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993b implements InterfaceC1979c, InterfaceC2031b, InterfaceC1977a {

    /* renamed from: s, reason: collision with root package name */
    public static final String f17209s = m.f("GreedyScheduler");

    /* renamed from: k, reason: collision with root package name */
    public final Context f17210k;

    /* renamed from: l, reason: collision with root package name */
    public final l f17211l;

    /* renamed from: m, reason: collision with root package name */
    public final C2032c f17212m;

    /* renamed from: o, reason: collision with root package name */
    public final C1992a f17214o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17215p;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f17217r;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f17213n = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final Object f17216q = new Object();

    public C1993b(Context context, C1944b c1944b, e eVar, l lVar) {
        this.f17210k = context;
        this.f17211l = lVar;
        this.f17212m = new C2032c(context, eVar, this);
        this.f17214o = new C1992a(this, c1944b.f16979e);
    }

    @Override // g2.InterfaceC1977a
    public final void a(String str, boolean z3) {
        synchronized (this.f17216q) {
            try {
                Iterator it = this.f17213n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i iVar = (i) it.next();
                    if (iVar.f18633a.equals(str)) {
                        m.d().a(f17209s, "Stopping tracking for " + str, new Throwable[0]);
                        this.f17213n.remove(iVar);
                        this.f17212m.c(this.f17213n);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g2.InterfaceC1979c
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.f17217r;
        l lVar = this.f17211l;
        if (bool == null) {
            this.f17217r = Boolean.valueOf(AbstractC2250h.a(this.f17210k, lVar.f17129l));
        }
        boolean booleanValue = this.f17217r.booleanValue();
        String str2 = f17209s;
        if (!booleanValue) {
            m.d().e(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f17215p) {
            lVar.f17133p.b(this);
            this.f17215p = true;
        }
        m.d().a(str2, L1.a.m("Cancelling work ID ", str), new Throwable[0]);
        C1992a c1992a = this.f17214o;
        if (c1992a != null && (runnable = (Runnable) c1992a.f17208c.remove(str)) != null) {
            ((Handler) c1992a.f17207b.f304k).removeCallbacks(runnable);
        }
        lVar.V(str);
    }

    @Override // k2.InterfaceC2031b
    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            m.d().a(f17209s, L1.a.m("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f17211l.V(str);
        }
    }

    @Override // g2.InterfaceC1979c
    public final void d(i... iVarArr) {
        if (this.f17217r == null) {
            this.f17217r = Boolean.valueOf(AbstractC2250h.a(this.f17210k, this.f17211l.f17129l));
        }
        if (!this.f17217r.booleanValue()) {
            m.d().e(f17209s, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f17215p) {
            this.f17211l.f17133p.b(this);
            this.f17215p = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long a5 = iVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (iVar.f18634b == 1) {
                if (currentTimeMillis < a5) {
                    C1992a c1992a = this.f17214o;
                    if (c1992a != null) {
                        HashMap hashMap = c1992a.f17208c;
                        Runnable runnable = (Runnable) hashMap.remove(iVar.f18633a);
                        J0 j02 = c1992a.f17207b;
                        if (runnable != null) {
                            ((Handler) j02.f304k).removeCallbacks(runnable);
                        }
                        h hVar = new h(16, c1992a, iVar);
                        hashMap.put(iVar.f18633a, hVar);
                        ((Handler) j02.f304k).postDelayed(hVar, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    int i = Build.VERSION.SDK_INT;
                    C1945c c1945c = iVar.f18640j;
                    if (c1945c.f16984c) {
                        m.d().a(f17209s, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (i < 24 || c1945c.f16988h.f16991a.size() <= 0) {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f18633a);
                    } else {
                        m.d().a(f17209s, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    }
                } else {
                    m.d().a(f17209s, L1.a.m("Starting work for ", iVar.f18633a), new Throwable[0]);
                    this.f17211l.U(iVar.f18633a, null);
                }
            }
        }
        synchronized (this.f17216q) {
            try {
                if (!hashSet.isEmpty()) {
                    m.d().a(f17209s, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f17213n.addAll(hashSet);
                    this.f17212m.c(this.f17213n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k2.InterfaceC2031b
    public final void e(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            m.d().a(f17209s, L1.a.m("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f17211l.U(str, null);
        }
    }

    @Override // g2.InterfaceC1979c
    public final boolean f() {
        return false;
    }
}
