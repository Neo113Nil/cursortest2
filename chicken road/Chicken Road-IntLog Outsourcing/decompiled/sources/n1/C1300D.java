package n1;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import b2.AbstractC0279e;
import com.google.android.gms.common.api.Status;
import com.onesignal.debug.internal.crash.AnrConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import l.q0;
import m1.InterfaceC1276c;
import r.AbstractC1394d;
import r.C1392b;
import r.C1393c;

/* renamed from: n1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300D implements m1.i, m1.j {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1276c f11294e;

    /* renamed from: f, reason: collision with root package name */
    public final C1314a f11295f;

    /* renamed from: g, reason: collision with root package name */
    public final S f11296g;

    /* renamed from: j, reason: collision with root package name */
    public final int f11299j;

    /* renamed from: k, reason: collision with root package name */
    public final BinderC1312P f11300k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11301l;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1318e f11305p;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f11293a = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f11297h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f11298i = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f11302m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public l1.b f11303n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f11304o = 0;

    public C1300D(C1318e c1318e, m1.h hVar) {
        this.f11305p = c1318e;
        Looper looper = c1318e.f11383m.getLooper();
        B4.i a6 = hVar.a();
        C1393c c1393c = (C1393c) a6.f311b;
        String str = (String) a6.f312c;
        String str2 = (String) a6.f313d;
        F1.a aVar = F1.a.f674b;
        q0 q0Var = new q0(c1393c, null, str, str2, aVar);
        e5.g gVar = hVar.f11131c.f11123a;
        o1.u.g(gVar);
        InterfaceC1276c f3 = gVar.f(hVar.f11129a, looper, q0Var, hVar.f11132d, this, this);
        String str3 = hVar.f11130b;
        if (str3 != null && (f3 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) f3).f5015w = str3;
        }
        if (str3 != null && (f3 instanceof AbstractServiceConnectionC1323j)) {
            AbstractC0279e.o(f3);
            throw null;
        }
        this.f11294e = f3;
        this.f11295f = hVar.f11133e;
        this.f11296g = new S(2);
        this.f11299j = hVar.f11134f;
        if (!f3.n()) {
            this.f11300k = null;
            return;
        }
        Context context = c1318e.f11375e;
        A1.c cVar = c1318e.f11383m;
        B4.i a7 = hVar.a();
        this.f11300k = new BinderC1312P(context, cVar, new q0((C1393c) a7.f311b, null, (String) a7.f312c, (String) a7.f313d, aVar));
    }

    public final void a(l1.b bVar) {
        HashSet hashSet = this.f11297h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (o1.u.j(bVar, l1.b.f10998e)) {
                this.f11294e.j();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        o1.u.b(this.f11305p.f11383m);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z) {
        o1.u.b(this.f11305p.f11383m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f11293a.iterator();
        while (it.hasNext()) {
            AbstractC1307K abstractC1307K = (AbstractC1307K) it.next();
            if (!z || abstractC1307K.f11319a == 2) {
                if (status != null) {
                    abstractC1307K.c(status);
                } else {
                    abstractC1307K.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f11293a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1307K abstractC1307K = (AbstractC1307K) arrayList.get(i2);
            if (!this.f11294e.a()) {
                return;
            }
            if (h(abstractC1307K)) {
                linkedList.remove(abstractC1307K);
            }
        }
    }

    public final void e() {
        C1318e c1318e = this.f11305p;
        o1.u.b(c1318e.f11383m);
        this.f11303n = null;
        a(l1.b.f10998e);
        if (this.f11301l) {
            A1.c cVar = c1318e.f11383m;
            C1314a c1314a = this.f11295f;
            cVar.removeMessages(11, c1314a);
            c1318e.f11383m.removeMessages(9, c1314a);
            this.f11301l = false;
        }
        Iterator it = this.f11298i.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        d();
        g();
    }

    public final void f(int i2) {
        C1318e c1318e = this.f11305p;
        o1.u.b(c1318e.f11383m);
        this.f11303n = null;
        this.f11301l = true;
        String k3 = this.f11294e.k();
        S s2 = this.f11296g;
        s2.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k3 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k3);
        }
        s2.b(true, new Status(20, sb.toString(), null, null));
        A1.c cVar = c1318e.f11383m;
        C1314a c1314a = this.f11295f;
        cVar.sendMessageDelayed(Message.obtain(cVar, 9, c1314a), AnrConstants.DEFAULT_ANR_THRESHOLD_MS);
        A1.c cVar2 = c1318e.f11383m;
        cVar2.sendMessageDelayed(Message.obtain(cVar2, 11, c1314a), 120000L);
        ((SparseIntArray) c1318e.f11377g.f12265a).clear();
        Iterator it = this.f11298i.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void g() {
        C1318e c1318e = this.f11305p;
        A1.c cVar = c1318e.f11383m;
        C1314a c1314a = this.f11295f;
        cVar.removeMessages(12, c1314a);
        A1.c cVar2 = c1318e.f11383m;
        cVar2.sendMessageDelayed(cVar2.obtainMessage(12, c1314a), c1318e.f11371a);
    }

    public final boolean h(AbstractC1307K abstractC1307K) {
        l1.d dVar;
        if (!(abstractC1307K instanceof AbstractC1307K)) {
            InterfaceC1276c interfaceC1276c = this.f11294e;
            abstractC1307K.f(this.f11296g, interfaceC1276c.n());
            try {
                abstractC1307K.e(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                interfaceC1276c.c("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        l1.d[] b6 = abstractC1307K.b(this);
        if (b6 != null && b6.length != 0) {
            l1.d[] i2 = this.f11294e.i();
            if (i2 == null) {
                i2 = new l1.d[0];
            }
            int length = i2.length;
            C1392b c1392b = new C1392b();
            if (length == 0) {
                c1392b.f11711a = AbstractC1394d.f11683a;
                c1392b.f11712b = AbstractC1394d.f11684b;
            } else {
                c1392b.a(length);
            }
            c1392b.f11713c = 0;
            for (l1.d dVar2 : i2) {
                c1392b.put(dVar2.f11006a, Long.valueOf(dVar2.a()));
            }
            int length2 = b6.length;
            for (int i3 = 0; i3 < length2; i3++) {
                dVar = b6[i3];
                Long l2 = (Long) c1392b.getOrDefault(dVar.f11006a, null);
                if (l2 == null || l2.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            InterfaceC1276c interfaceC1276c2 = this.f11294e;
            abstractC1307K.f(this.f11296g, interfaceC1276c2.n());
            try {
                abstractC1307K.e(this);
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                interfaceC1276c2.c("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f11294e.getClass().getName() + " could not execute call because it requires feature (" + dVar.f11006a + ", " + dVar.a() + ").");
        if (!this.f11305p.f11384n || !abstractC1307K.a(this)) {
            abstractC1307K.d(new m1.m(dVar));
            return true;
        }
        C1301E c1301e = new C1301E(this.f11295f, dVar);
        int indexOf = this.f11302m.indexOf(c1301e);
        if (indexOf >= 0) {
            C1301E c1301e2 = (C1301E) this.f11302m.get(indexOf);
            this.f11305p.f11383m.removeMessages(15, c1301e2);
            A1.c cVar = this.f11305p.f11383m;
            cVar.sendMessageDelayed(Message.obtain(cVar, 15, c1301e2), AnrConstants.DEFAULT_ANR_THRESHOLD_MS);
        } else {
            this.f11302m.add(c1301e);
            A1.c cVar2 = this.f11305p.f11383m;
            cVar2.sendMessageDelayed(Message.obtain(cVar2, 15, c1301e), AnrConstants.DEFAULT_ANR_THRESHOLD_MS);
            A1.c cVar3 = this.f11305p.f11383m;
            cVar3.sendMessageDelayed(Message.obtain(cVar3, 16, c1301e), 120000L);
            l1.b bVar = new l1.b(2, null);
            if (!i(bVar)) {
                this.f11305p.b(bVar, this.f11299j);
            }
        }
        return false;
    }

    public final boolean i(l1.b bVar) {
        synchronized (C1318e.f11369q) {
            this.f11305p.getClass();
        }
        return false;
    }

    public final void j() {
        C1318e c1318e = this.f11305p;
        o1.u.b(c1318e.f11383m);
        InterfaceC1276c interfaceC1276c = this.f11294e;
        if (interfaceC1276c.a() || interfaceC1276c.g()) {
            return;
        }
        try {
            int v4 = c1318e.f11377g.v(c1318e.f11375e, interfaceC1276c);
            if (v4 != 0) {
                l1.b bVar = new l1.b(v4, null);
                Log.w("GoogleApiManager", "The service for " + interfaceC1276c.getClass().getName() + " is not available: " + bVar.toString());
                l(bVar, null);
                return;
            }
            C1303G c1303g = new C1303G(c1318e, interfaceC1276c, this.f11295f);
            if (interfaceC1276c.n()) {
                BinderC1312P binderC1312P = this.f11300k;
                o1.u.g(binderC1312P);
                G1.a aVar = binderC1312P.f11338i;
                if (aVar != null) {
                    aVar.l();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(binderC1312P));
                q0 q0Var = binderC1312P.f11337h;
                q0Var.f10947g = valueOf;
                A1.c cVar = binderC1312P.f11334e;
                binderC1312P.f11338i = (G1.a) binderC1312P.f11335f.f(binderC1312P.f11333a, cVar.getLooper(), q0Var, (F1.a) q0Var.f10946f, binderC1312P, binderC1312P);
                binderC1312P.f11339j = c1303g;
                Set set = binderC1312P.f11336g;
                if (set == null || set.isEmpty()) {
                    cVar.post(new B.a(20, binderC1312P));
                } else {
                    binderC1312P.f11338i.A();
                }
            }
            try {
                interfaceC1276c.d(c1303g);
            } catch (SecurityException e3) {
                l(new l1.b(10), e3);
            }
        } catch (IllegalStateException e6) {
            l(new l1.b(10), e6);
        }
    }

    public final void k(AbstractC1307K abstractC1307K) {
        o1.u.b(this.f11305p.f11383m);
        boolean a6 = this.f11294e.a();
        LinkedList linkedList = this.f11293a;
        if (a6) {
            if (h(abstractC1307K)) {
                g();
                return;
            } else {
                linkedList.add(abstractC1307K);
                return;
            }
        }
        linkedList.add(abstractC1307K);
        l1.b bVar = this.f11303n;
        if (bVar == null || !bVar.a()) {
            j();
        } else {
            l(this.f11303n, null);
        }
    }

    public final void l(l1.b bVar, RuntimeException runtimeException) {
        G1.a aVar;
        o1.u.b(this.f11305p.f11383m);
        BinderC1312P binderC1312P = this.f11300k;
        if (binderC1312P != null && (aVar = binderC1312P.f11338i) != null) {
            aVar.l();
        }
        o1.u.b(this.f11305p.f11383m);
        this.f11303n = null;
        ((SparseIntArray) this.f11305p.f11377g.f12265a).clear();
        a(bVar);
        if ((this.f11294e instanceof q1.c) && bVar.f11000b != 24) {
            C1318e c1318e = this.f11305p;
            c1318e.f11372b = true;
            A1.c cVar = c1318e.f11383m;
            cVar.sendMessageDelayed(cVar.obtainMessage(19), 300000L);
        }
        if (bVar.f11000b == 4) {
            b(C1318e.f11368p);
            return;
        }
        if (this.f11293a.isEmpty()) {
            this.f11303n = bVar;
            return;
        }
        if (runtimeException != null) {
            o1.u.b(this.f11305p.f11383m);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f11305p.f11384n) {
            b(C1318e.c(this.f11295f, bVar));
            return;
        }
        c(C1318e.c(this.f11295f, bVar), null, true);
        if (this.f11293a.isEmpty() || i(bVar) || this.f11305p.b(bVar, this.f11299j)) {
            return;
        }
        if (bVar.f11000b == 18) {
            this.f11301l = true;
        }
        if (!this.f11301l) {
            b(C1318e.c(this.f11295f, bVar));
            return;
        }
        C1318e c1318e2 = this.f11305p;
        C1314a c1314a = this.f11295f;
        A1.c cVar2 = c1318e2.f11383m;
        cVar2.sendMessageDelayed(Message.obtain(cVar2, 9, c1314a), AnrConstants.DEFAULT_ANR_THRESHOLD_MS);
    }

    public final void m(l1.b bVar) {
        o1.u.b(this.f11305p.f11383m);
        InterfaceC1276c interfaceC1276c = this.f11294e;
        interfaceC1276c.c("onSignInFailed for " + interfaceC1276c.getClass().getName() + " with " + String.valueOf(bVar));
        l(bVar, null);
    }

    public final void n() {
        o1.u.b(this.f11305p.f11383m);
        Status status = C1318e.f11367o;
        b(status);
        this.f11296g.b(false, status);
        for (C1321h c1321h : (C1321h[]) this.f11298i.keySet().toArray(new C1321h[0])) {
            k(new U(c1321h, new I1.h()));
        }
        a(new l1.b(4));
        InterfaceC1276c interfaceC1276c = this.f11294e;
        if (interfaceC1276c.a()) {
            interfaceC1276c.e(new V0.j(21, this));
        }
    }

    @Override // m1.i
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        C1318e c1318e = this.f11305p;
        if (myLooper == c1318e.f11383m.getLooper()) {
            e();
        } else {
            c1318e.f11383m.post(new B.a(18, this));
        }
    }

    @Override // m1.j
    public final void onConnectionFailed(l1.b bVar) {
        l(bVar, null);
    }

    @Override // m1.i
    public final void onConnectionSuspended(int i2) {
        Looper myLooper = Looper.myLooper();
        C1318e c1318e = this.f11305p;
        if (myLooper == c1318e.f11383m.getLooper()) {
            f(i2);
        } else {
            c1318e.f11383m.post(new A0.e(i2, 2, this));
        }
    }
}
