package R0;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import g1.C0315a;
import h1.C0325a;
import i1.C0335e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p.AbstractC1154d;
import p.C1152b;
import p.C1153c;

/* loaded from: classes.dex */
public final class l implements Q0.g, Q0.h {

    /* renamed from: d, reason: collision with root package name */
    public final Q0.c f1209d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1210e;
    public final a1.e f;

    /* renamed from: i, reason: collision with root package name */
    public final int f1213i;

    /* renamed from: j, reason: collision with root package name */
    public final u f1214j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1215k;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f1219o;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f1208a = new LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f1211g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f1212h = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1216l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public P0.b f1217m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f1218n = 0;

    public l(c cVar, Q0.f fVar) {
        this.f1219o = cVar;
        Looper looper = cVar.f1203m.getLooper();
        A0.j a3 = fVar.a();
        A0.h hVar = new A0.h((String) a3.f66b, (String) a3.f68d, (C1153c) a3.f67c);
        F2.b bVar = (F2.b) fVar.f1163c.f1788b;
        S0.r.c(bVar);
        Q0.c f = bVar.f(fVar.f1161a, looper, hVar, fVar.f1164d, this, this);
        String str = fVar.f1162b;
        if (str != null && (f instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) f).f2588r = str;
        }
        if (str != null && (f instanceof g)) {
            B0.c.n(f);
            throw null;
        }
        this.f1209d = f;
        this.f1210e = fVar.f1165e;
        this.f = new a1.e(14);
        this.f1213i = fVar.f;
        if (!f.j()) {
            this.f1214j = null;
            return;
        }
        Context context = cVar.f1196e;
        b1.e eVar = cVar.f1203m;
        A0.j a4 = fVar.a();
        this.f1214j = new u(context, eVar, new A0.h((String) a4.f66b, (String) a4.f68d, (C1153c) a4.f67c));
    }

    @Override // Q0.h
    public final void a(P0.b bVar) {
        o(bVar, null);
    }

    @Override // Q0.g
    public final void b(int i3) {
        Looper myLooper = Looper.myLooper();
        c cVar = this.f1219o;
        if (myLooper == cVar.f1203m.getLooper()) {
            i(i3);
        } else {
            cVar.f1203m.post(new k(this, i3));
        }
    }

    @Override // Q0.g
    public final void c() {
        Looper myLooper = Looper.myLooper();
        c cVar = this.f1219o;
        if (myLooper == cVar.f1203m.getLooper()) {
            h();
        } else {
            cVar.f1203m.post(new A.b(4, this));
        }
    }

    public final void d(P0.b bVar) {
        HashSet hashSet = this.f1211g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (S0.r.e(bVar, P0.b.f1120e)) {
                this.f1209d.g();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        S0.r.a(this.f1219o.f1203m);
        f(status, null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z3) {
        S0.r.a(this.f1219o.f1203m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f1208a.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (!z3 || qVar.f1229a == 2) {
                if (status != null) {
                    qVar.c(status);
                } else {
                    qVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.f1208a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList.get(i3);
            if (!this.f1209d.a()) {
                return;
            }
            if (k(qVar)) {
                linkedList.remove(qVar);
            }
        }
    }

    public final void h() {
        c cVar = this.f1219o;
        S0.r.a(cVar.f1203m);
        this.f1217m = null;
        d(P0.b.f1120e);
        if (this.f1215k) {
            b1.e eVar = cVar.f1203m;
            a aVar = this.f1210e;
            eVar.removeMessages(11, aVar);
            cVar.f1203m.removeMessages(9, aVar);
            this.f1215k = false;
        }
        Iterator it = this.f1212h.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i3) {
        c cVar = this.f1219o;
        S0.r.a(cVar.f1203m);
        this.f1217m = null;
        this.f1215k = true;
        String h3 = this.f1209d.h();
        a1.e eVar = this.f;
        eVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (h3 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(h3);
        }
        eVar.F(true, new Status(20, sb.toString(), null, null));
        b1.e eVar2 = cVar.f1203m;
        a aVar = this.f1210e;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, aVar), 5000L);
        b1.e eVar3 = cVar.f1203m;
        eVar3.sendMessageDelayed(Message.obtain(eVar3, 11, aVar), 120000L);
        ((SparseIntArray) cVar.f1197g.f1788b).clear();
        Iterator it = this.f1212h.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        c cVar = this.f1219o;
        b1.e eVar = cVar.f1203m;
        a aVar = this.f1210e;
        eVar.removeMessages(12, aVar);
        b1.e eVar2 = cVar.f1203m;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, aVar), cVar.f1192a);
    }

    public final boolean k(q qVar) {
        P0.d dVar;
        if (qVar == null) {
            Q0.c cVar = this.f1209d;
            qVar.f(this.f, cVar.j());
            try {
                qVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                b(1);
                cVar.c("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            P0.d[] b3 = qVar.b(this);
            if (b3 != null && b3.length != 0) {
                P0.d[] f = this.f1209d.f();
                if (f == null) {
                    f = new P0.d[0];
                }
                int length = f.length;
                C1152b c1152b = new C1152b();
                if (length == 0) {
                    c1152b.f10222a = AbstractC1154d.f10195a;
                    c1152b.f10223b = AbstractC1154d.f10196b;
                } else {
                    c1152b.a(length);
                }
                c1152b.f10224c = 0;
                for (P0.d dVar2 : f) {
                    c1152b.put(dVar2.f1128a, Long.valueOf(dVar2.a()));
                }
                int length2 = b3.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    dVar = b3[i3];
                    Long l3 = (Long) c1152b.getOrDefault(dVar.f1128a, null);
                    if (l3 == null || l3.longValue() < dVar.a()) {
                        break;
                    }
                }
            }
            dVar = null;
            if (dVar != null) {
                Log.w("GoogleApiManager", this.f1209d.getClass().getName() + " could not execute call because it requires feature (" + dVar.f1128a + ", " + dVar.a() + ").");
                if (!this.f1219o.f1204n || !qVar.a(this)) {
                    qVar.d(new Q0.k(dVar));
                    return true;
                }
                m mVar = new m(this.f1210e, dVar);
                int indexOf = this.f1216l.indexOf(mVar);
                if (indexOf >= 0) {
                    m mVar2 = (m) this.f1216l.get(indexOf);
                    this.f1219o.f1203m.removeMessages(15, mVar2);
                    b1.e eVar = this.f1219o.f1203m;
                    eVar.sendMessageDelayed(Message.obtain(eVar, 15, mVar2), 5000L);
                } else {
                    this.f1216l.add(mVar);
                    b1.e eVar2 = this.f1219o.f1203m;
                    eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, mVar), 5000L);
                    b1.e eVar3 = this.f1219o.f1203m;
                    eVar3.sendMessageDelayed(Message.obtain(eVar3, 16, mVar), 120000L);
                    P0.b bVar = new P0.b(2, null);
                    if (!l(bVar)) {
                        this.f1219o.b(bVar, this.f1213i);
                    }
                }
                return false;
            }
            Q0.c cVar2 = this.f1209d;
            qVar.f(this.f, cVar2.j());
            try {
                qVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                b(1);
                cVar2.c("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean l(P0.b bVar) {
        synchronized (c.f1190q) {
            this.f1219o.getClass();
        }
        return false;
    }

    public final void m() {
        c cVar = this.f1219o;
        S0.r.a(cVar.f1203m);
        Q0.c cVar2 = this.f1209d;
        if (cVar2.a() || cVar2.e()) {
            return;
        }
        try {
            a1.e eVar = cVar.f1197g;
            Context context = cVar.f1196e;
            eVar.getClass();
            S0.r.c(context);
            int d3 = cVar2.d();
            SparseIntArray sparseIntArray = (SparseIntArray) eVar.f1788b;
            int i3 = sparseIntArray.get(d3, -1);
            if (i3 == -1) {
                i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= sparseIntArray.size()) {
                        i3 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i4);
                    if (keyAt > d3 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i3 == -1) {
                    i3 = ((P0.e) eVar.f1789c).b(context, d3);
                }
                sparseIntArray.put(d3, i3);
            }
            if (i3 != 0) {
                P0.b bVar = new P0.b(i3, null);
                Log.w("GoogleApiManager", "The service for " + cVar2.getClass().getName() + " is not available: " + bVar.toString());
                o(bVar, null);
                return;
            }
            a aVar = this.f1210e;
            n nVar = new n();
            nVar.f = cVar;
            nVar.f1225d = null;
            nVar.f1226e = null;
            nVar.f1222a = false;
            nVar.f1223b = cVar2;
            nVar.f1224c = aVar;
            if (cVar2.j()) {
                u uVar = this.f1214j;
                S0.r.c(uVar);
                C0325a c0325a = uVar.f1247i;
                if (c0325a != null) {
                    c0325a.i();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(uVar));
                A0.h hVar = uVar.f1246h;
                hVar.f55c = valueOf;
                b1.e eVar2 = uVar.f1244e;
                uVar.f1247i = (C0325a) uVar.f.f(uVar.f1243d, eVar2.getLooper(), hVar, (C0315a) hVar.f58g, uVar, uVar);
                uVar.f1248j = nVar;
                Set set = uVar.f1245g;
                if (set == null || set.isEmpty()) {
                    eVar2.post(new A.b(6, uVar));
                } else {
                    C0325a c0325a2 = uVar.f1247i;
                    c0325a2.getClass();
                    c0325a2.k(new S0.g(c0325a2));
                }
            }
            try {
                cVar2.k(nVar);
            } catch (SecurityException e3) {
                o(new P0.b(10), e3);
            }
        } catch (IllegalStateException e4) {
            o(new P0.b(10), e4);
        }
    }

    public final void n(q qVar) {
        S0.r.a(this.f1219o.f1203m);
        boolean a3 = this.f1209d.a();
        LinkedList linkedList = this.f1208a;
        if (a3) {
            if (k(qVar)) {
                j();
                return;
            } else {
                linkedList.add(qVar);
                return;
            }
        }
        linkedList.add(qVar);
        P0.b bVar = this.f1217m;
        if (bVar == null || bVar.f1122b == 0 || bVar.f1123c == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(P0.b bVar, RuntimeException runtimeException) {
        C0325a c0325a;
        S0.r.a(this.f1219o.f1203m);
        u uVar = this.f1214j;
        if (uVar != null && (c0325a = uVar.f1247i) != null) {
            c0325a.i();
        }
        S0.r.a(this.f1219o.f1203m);
        this.f1217m = null;
        ((SparseIntArray) this.f1219o.f1197g.f1788b).clear();
        d(bVar);
        if ((this.f1209d instanceof U0.d) && bVar.f1122b != 24) {
            c cVar = this.f1219o;
            cVar.f1193b = true;
            b1.e eVar = cVar.f1203m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f1122b == 4) {
            e(c.f1189p);
            return;
        }
        if (this.f1208a.isEmpty()) {
            this.f1217m = bVar;
            return;
        }
        if (runtimeException != null) {
            S0.r.a(this.f1219o.f1203m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f1219o.f1204n) {
            e(c.c(this.f1210e, bVar));
            return;
        }
        f(c.c(this.f1210e, bVar), null, true);
        if (this.f1208a.isEmpty() || l(bVar) || this.f1219o.b(bVar, this.f1213i)) {
            return;
        }
        if (bVar.f1122b == 18) {
            this.f1215k = true;
        }
        if (!this.f1215k) {
            e(c.c(this.f1210e, bVar));
            return;
        }
        c cVar2 = this.f1219o;
        a aVar = this.f1210e;
        b1.e eVar2 = cVar2.f1203m;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, aVar), 5000L);
    }

    public final void p(P0.b bVar) {
        S0.r.a(this.f1219o.f1203m);
        Q0.c cVar = this.f1209d;
        cVar.c("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        S0.r.a(this.f1219o.f1203m);
        Status status = c.f1188o;
        e(status);
        this.f.F(false, status);
        for (f fVar : (f[]) this.f1212h.keySet().toArray(new f[0])) {
            n(new w(new C0335e()));
        }
        d(new P0.b(4));
        Q0.c cVar = this.f1209d;
        if (cVar.a()) {
            cVar.m(new J1.i(11, this));
        }
    }
}
