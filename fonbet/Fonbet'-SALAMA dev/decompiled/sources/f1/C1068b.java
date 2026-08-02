package f1;

import D6.y0;
import R4.c;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import d1.C0949b;
import d1.C0950c;
import d1.n;
import e1.InterfaceC0994a;
import e1.InterfaceC0996c;
import e1.l;
import i1.C1244c;
import i1.InterfaceC1243b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m1.i;
import n1.AbstractC1452g;
import w1.C1759x1;
import w1.L;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068b implements InterfaceC0996c, InterfaceC1243b, InterfaceC0994a {

    /* renamed from: z, reason: collision with root package name */
    public static final String f12770z = n.g("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f12771a;

    /* renamed from: b, reason: collision with root package name */
    public final l f12772b;

    /* renamed from: c, reason: collision with root package name */
    public final C1244c f12773c;

    /* renamed from: e, reason: collision with root package name */
    public final C1067a f12775e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12776f;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f12778y;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f12774d = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final Object f12777x = new Object();

    public C1068b(Context context, C0949b c0949b, C1759x1 c1759x1, l lVar) {
        this.f12771a = context;
        this.f12772b = lVar;
        this.f12773c = new C1244c(context, c1759x1, this);
        this.f12775e = new C1067a(this, c0949b.f12338e);
    }

    @Override // e1.InterfaceC0996c
    public final boolean a() {
        return false;
    }

    @Override // e1.InterfaceC0994a
    public final void b(String str, boolean z4) {
        synchronized (this.f12777x) {
            try {
                Iterator it = this.f12774d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i iVar = (i) it.next();
                    if (iVar.f15216a.equals(str)) {
                        n.d().b(f12770z, "Stopping tracking for " + str, new Throwable[0]);
                        this.f12774d.remove(iVar);
                        this.f12773c.b(this.f12774d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e1.InterfaceC0996c
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.f12778y;
        l lVar = this.f12772b;
        if (bool == null) {
            this.f12778y = Boolean.valueOf(AbstractC1452g.a(this.f12771a, lVar.f12545e));
        }
        boolean booleanValue = this.f12778y.booleanValue();
        String str2 = f12770z;
        if (!booleanValue) {
            n.d().e(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f12776f) {
            lVar.f12549z.a(this);
            this.f12776f = true;
        }
        n.d().b(str2, L.i("Cancelling work ID ", str), new Throwable[0]);
        C1067a c1067a = this.f12775e;
        if (c1067a != null && (runnable = (Runnable) c1067a.f12769c.remove(str)) != null) {
            ((Handler) c1067a.f12768b.f6064b).removeCallbacks(runnable);
        }
        lVar.r0(str);
    }

    @Override // i1.InterfaceC1243b
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.d().b(f12770z, L.i("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f12772b.r0(str);
        }
    }

    @Override // e1.InterfaceC0996c
    public final void e(i... iVarArr) {
        if (this.f12778y == null) {
            this.f12778y = Boolean.valueOf(AbstractC1452g.a(this.f12771a, this.f12772b.f12545e));
        }
        if (!this.f12778y.booleanValue()) {
            n.d().e(f12770z, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f12776f) {
            this.f12772b.f12549z.a(this);
            this.f12776f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long a2 = iVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (iVar.f15217b == 1) {
                if (currentTimeMillis < a2) {
                    C1067a c1067a = this.f12775e;
                    if (c1067a != null) {
                        HashMap hashMap = c1067a.f12769c;
                        Runnable runnable = (Runnable) hashMap.remove(iVar.f15216a);
                        c cVar = c1067a.f12768b;
                        if (runnable != null) {
                            ((Handler) cVar.f6064b).removeCallbacks(runnable);
                        }
                        y0 y0Var = new y0(24, c1067a, iVar, false);
                        hashMap.put(iVar.f15216a, y0Var);
                        ((Handler) cVar.f6064b).postDelayed(y0Var, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    C0950c c0950c = iVar.j;
                    if (c0950c.f12345c) {
                        n.d().b(f12770z, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (c0950c.f12350h.f12353a.size() > 0) {
                        n.d().b(f12770z, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f15216a);
                    }
                } else {
                    n.d().b(f12770z, L.i("Starting work for ", iVar.f15216a), new Throwable[0]);
                    this.f12772b.q0(iVar.f15216a, null);
                }
            }
        }
        synchronized (this.f12777x) {
            try {
                if (!hashSet.isEmpty()) {
                    n.d().b(f12770z, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f12774d.addAll(hashSet);
                    this.f12773c.b(this.f12774d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.InterfaceC1243b
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.d().b(f12770z, L.i("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f12772b.q0(str, null);
        }
    }
}
