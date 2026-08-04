package p039f1;

import D6.y0;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p023d1.n;
import p031e1.a;
import p031e1.c;
import p031e1.l;
import p088m1.i;
import p096n1.g;
import p155w1.C1050x1;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c, p060i1.b, a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f12776z = n.g("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f12778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p060i1.c f12779c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f12781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12782f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f12784y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f12780d = new HashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f12783x = new Object();

    public b(Context context, p023d1.b bVar, C1050x1 c1050x1, l lVar) {
        this.f12777a = context;
        this.f12778b = lVar;
        this.f12779c = new p060i1.c(context, c1050x1, this);
        this.f12781e = new a(this, bVar.f12344e);
    }

    @Override // p031e1.c
    public final boolean a() {
        return false;
    }

    @Override // p031e1.a
    public final void b(String str, boolean z4) {
        synchronized (this.f12783x) {
            try {
                for (i iVar : this.f12780d) {
                    if (iVar.f15222a.equals(str)) {
                        n.d().b(f12776z, "Stopping tracking for " + str, new Throwable[0]);
                        this.f12780d.remove(iVar);
                        this.f12779c.b(this.f12780d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p031e1.c
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.f12784y;
        l lVar = this.f12778b;
        if (bool == null) {
            this.f12784y = Boolean.valueOf(g.a(this.f12777a, lVar.f12551e));
        }
        boolean zBooleanValue = this.f12784y.booleanValue();
        String str2 = f12776z;
        if (!zBooleanValue) {
            n.d().e(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f12782f) {
            lVar.f12555z.a(this);
            this.f12782f = true;
        }
        n.d().b(str2, L.i("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f12781e;
        if (aVar != null && (runnable = (Runnable) aVar.f12775c.remove(str)) != null) {
            ((Handler) aVar.f12774b.f6064b).removeCallbacks(runnable);
        }
        lVar.r0(str);
    }

    @Override // p060i1.b
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.d().b(f12776z, L.i("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f12778b.r0(str);
        }
    }

    @Override // p031e1.c
    public final void e(i... iVarArr) {
        if (this.f12784y == null) {
            this.f12784y = Boolean.valueOf(g.a(this.f12777a, this.f12778b.f12551e));
        }
        if (!this.f12784y.booleanValue()) {
            n.d().e(f12776z, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f12782f) {
            this.f12778b.f12555z.a(this);
            this.f12782f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long jA = iVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (iVar.f15223b == 1) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f12781e;
                    if (aVar != null) {
                        HashMap map = aVar.f12775c;
                        Runnable runnable = (Runnable) map.remove(iVar.f15222a);
                        R4.c cVar = aVar.f12774b;
                        if (runnable != null) {
                            ((Handler) cVar.f6064b).removeCallbacks(runnable);
                        }
                        y0 y0Var = new y0(24, aVar, iVar, false);
                        map.put(iVar.f15222a, y0Var);
                        ((Handler) cVar.f6064b).postDelayed(y0Var, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    p023d1.c cVar2 = iVar.j;
                    if (cVar2.f12351c) {
                        n.d().b(f12776z, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (cVar2.f12356h.f12359a.size() > 0) {
                        n.d().b(f12776z, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f15222a);
                    }
                } else {
                    n.d().b(f12776z, L.i("Starting work for ", iVar.f15222a), new Throwable[0]);
                    this.f12778b.q0(iVar.f15222a, null);
                }
            }
        }
        synchronized (this.f12783x) {
            try {
                if (!hashSet.isEmpty()) {
                    n.d().b(f12776z, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f12780d.addAll(hashSet);
                    this.f12779c.b(this.f12780d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p060i1.b
    public final void f(List list) {
        for (String str : (ArrayList) list) {
            n.d().b(f12776z, L.i("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f12778b.q0(str, null);
        }
    }
}
