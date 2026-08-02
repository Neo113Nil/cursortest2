package l3;

import A0.C;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.Jt;
import com.google.android.gms.internal.ads.RunnableC0920e5;
import e2.C1930k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import k3.InterfaceC2035c;
import m3.AbstractC2095e;
import o3.C2222c;
import r.C2327e;
import r.C2328f;

/* loaded from: classes.dex */
public final class m implements k3.g, k3.h {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2035c f17807l;

    /* renamed from: m, reason: collision with root package name */
    public final C2055b f17808m;

    /* renamed from: n, reason: collision with root package name */
    public final v3.g f17809n;

    /* renamed from: q, reason: collision with root package name */
    public final int f17812q;

    /* renamed from: r, reason: collision with root package name */
    public final u f17813r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17814s;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C2057d f17818w;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedList f17806k = new LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f17810o = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f17811p = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f17815t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public j3.b f17816u = null;

    /* renamed from: v, reason: collision with root package name */
    public int f17817v = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public m(C2057d c2057d, k3.f fVar) {
        this.f17818w = c2057d;
        Looper looper = c2057d.f17798w.getLooper();
        v3.e a5 = fVar.a();
        C0.c cVar = new C0.c((C2328f) a5.f20432l, (String) a5.f20433m, (String) a5.f20434n);
        G4.l lVar = (G4.l) fVar.f17592m.f20439l;
        m3.v.e(lVar);
        InterfaceC2035c l5 = lVar.l(fVar.f17590k, looper, cVar, fVar.f17593n, this, this);
        String str = fVar.f17591l;
        if (str != null && (l5 instanceof AbstractC2095e)) {
            ((AbstractC2095e) l5).f18039s = str;
        }
        if (str != null && (l5 instanceof h)) {
            L1.a.t(l5);
            throw null;
        }
        this.f17807l = l5;
        this.f17808m = fVar.f17594o;
        this.f17809n = new v3.g(16);
        this.f17812q = fVar.f17595p;
        if (!l5.m()) {
            this.f17813r = null;
            return;
        }
        Context context = c2057d.f17790o;
        Jt jt = c2057d.f17798w;
        v3.e a6 = fVar.a();
        this.f17813r = new u(context, jt, new C0.c((C2328f) a6.f20432l, (String) a6.f20433m, (String) a6.f20434n));
    }

    @Override // k3.g
    public final void L(int i) {
        Looper myLooper = Looper.myLooper();
        C2057d c2057d = this.f17818w;
        if (myLooper == c2057d.f17798w.getLooper()) {
            f(i);
        } else {
            c2057d.f17798w.post(new RunnableC0920e5(i, 6, this));
        }
    }

    @Override // k3.g
    public final void N() {
        Looper myLooper = Looper.myLooper();
        C2057d c2057d = this.f17818w;
        if (myLooper == c2057d.f17798w.getLooper()) {
            e();
        } else {
            c2057d.f17798w.post(new C(13, this));
        }
    }

    @Override // k3.h
    public final void Y(j3.b bVar) {
        l(bVar, null);
    }

    public final void a(j3.b bVar) {
        HashSet hashSet = this.f17810o;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (m3.v.g(bVar, j3.b.f17500o)) {
                this.f17807l.j();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        m3.v.b(this.f17818w.f17798w);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z3) {
        m3.v.b(this.f17818w.f17798w);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f17806k.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (!z3 || qVar.f17823a == 2) {
                if (status != null) {
                    qVar.c(status);
                } else {
                    qVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f17806k;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q qVar = (q) arrayList.get(i);
            if (!this.f17807l.a()) {
                return;
            }
            if (h(qVar)) {
                linkedList.remove(qVar);
            }
        }
    }

    public final void e() {
        C2057d c2057d = this.f17818w;
        m3.v.b(c2057d.f17798w);
        this.f17816u = null;
        a(j3.b.f17500o);
        if (this.f17814s) {
            Jt jt = c2057d.f17798w;
            C2055b c2055b = this.f17808m;
            jt.removeMessages(11, c2055b);
            c2057d.f17798w.removeMessages(9, c2055b);
            this.f17814s = false;
        }
        Iterator it = this.f17811p.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        d();
        g();
    }

    public final void f(int i) {
        C2057d c2057d = this.f17818w;
        m3.v.b(c2057d.f17798w);
        this.f17816u = null;
        this.f17814s = true;
        String k5 = this.f17807l.k();
        v3.g gVar = this.f17809n;
        gVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k5 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k5);
        }
        gVar.H(true, new Status(20, sb.toString(), null, null));
        Jt jt = c2057d.f17798w;
        C2055b c2055b = this.f17808m;
        jt.sendMessageDelayed(Message.obtain(jt, 9, c2055b), 5000L);
        Jt jt2 = c2057d.f17798w;
        jt2.sendMessageDelayed(Message.obtain(jt2, 11, c2055b), 120000L);
        ((SparseIntArray) c2057d.f17792q.f1749l).clear();
        Iterator it = this.f17811p.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void g() {
        C2057d c2057d = this.f17818w;
        Jt jt = c2057d.f17798w;
        C2055b c2055b = this.f17808m;
        jt.removeMessages(12, c2055b);
        Jt jt2 = c2057d.f17798w;
        jt2.sendMessageDelayed(jt2.obtainMessage(12, c2055b), c2057d.f17786k);
    }

    public final boolean h(q qVar) {
        j3.d dVar;
        if (qVar != null) {
            j3.d[] b3 = qVar.b(this);
            if (b3 != null && b3.length != 0) {
                j3.d[] i = this.f17807l.i();
                if (i == null) {
                    i = new j3.d[0];
                }
                C2327e c2327e = new C2327e(i.length);
                for (j3.d dVar2 : i) {
                    c2327e.put(dVar2.f17508k, Long.valueOf(dVar2.a()));
                }
                int length = b3.length;
                for (int i5 = 0; i5 < length; i5++) {
                    dVar = b3[i5];
                    Long l5 = (Long) c2327e.get(dVar.f17508k);
                    if (l5 == null || l5.longValue() < dVar.a()) {
                        break;
                    }
                }
            }
            dVar = null;
            if (dVar != null) {
                String name = this.f17807l.getClass().getName();
                String str = dVar.f17508k;
                long a5 = dVar.a();
                StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
                sb.append(name);
                sb.append(" could not execute call because it requires feature (");
                sb.append(str);
                sb.append(", ");
                sb.append(a5);
                sb.append(").");
                Log.w("GoogleApiManager", sb.toString());
                if (!this.f17818w.f17799x || !qVar.a(this)) {
                    qVar.d(new k3.k(dVar));
                    return true;
                }
                n nVar = new n(this.f17808m, dVar);
                int indexOf = this.f17815t.indexOf(nVar);
                if (indexOf >= 0) {
                    n nVar2 = (n) this.f17815t.get(indexOf);
                    this.f17818w.f17798w.removeMessages(15, nVar2);
                    Jt jt = this.f17818w.f17798w;
                    Message obtain = Message.obtain(jt, 15, nVar2);
                    this.f17818w.getClass();
                    jt.sendMessageDelayed(obtain, 5000L);
                } else {
                    this.f17815t.add(nVar);
                    Jt jt2 = this.f17818w.f17798w;
                    Message obtain2 = Message.obtain(jt2, 15, nVar);
                    this.f17818w.getClass();
                    jt2.sendMessageDelayed(obtain2, 5000L);
                    Jt jt3 = this.f17818w.f17798w;
                    Message obtain3 = Message.obtain(jt3, 16, nVar);
                    this.f17818w.getClass();
                    jt3.sendMessageDelayed(obtain3, 120000L);
                    j3.b bVar = new j3.b(2, null);
                    if (!i(bVar)) {
                        this.f17818w.b(bVar, this.f17812q);
                    }
                }
                return false;
            }
            InterfaceC2035c interfaceC2035c = this.f17807l;
            qVar.f(this.f17809n, interfaceC2035c.m());
            try {
                qVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                L(1);
                interfaceC2035c.f("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            InterfaceC2035c interfaceC2035c2 = this.f17807l;
            qVar.f(this.f17809n, interfaceC2035c2.m());
            try {
                qVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                L(1);
                interfaceC2035c2.f("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean i(j3.b bVar) {
        synchronized (C2057d.f17782A) {
            this.f17818w.getClass();
        }
        return false;
    }

    public final void j() {
        C2057d c2057d = this.f17818w;
        m3.v.b(c2057d.f17798w);
        InterfaceC2035c interfaceC2035c = this.f17807l;
        if (interfaceC2035c.a() || interfaceC2035c.h()) {
            return;
        }
        try {
            G.v vVar = c2057d.f17792q;
            Context context = c2057d.f17790o;
            vVar.getClass();
            m3.v.e(context);
            int g5 = interfaceC2035c.g();
            SparseIntArray sparseIntArray = (SparseIntArray) vVar.f1749l;
            int i = sparseIntArray.get(g5, -1);
            if (i == -1) {
                i = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= sparseIntArray.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i5);
                    if (keyAt > g5 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i == -1) {
                    i = ((j3.e) vVar.f1750m).c(context, g5);
                }
                sparseIntArray.put(g5, i);
            }
            if (i != 0) {
                j3.b bVar = new j3.b(i, null);
                String name = interfaceC2035c.getClass().getName();
                String bVar2 = bVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + bVar2.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(bVar2);
                Log.w("GoogleApiManager", sb.toString());
                l(bVar, null);
                return;
            }
            C2055b c2055b = this.f17808m;
            S2.r rVar = new S2.r();
            rVar.f5355p = c2057d;
            rVar.f5353n = null;
            rVar.f5354o = null;
            rVar.f5350k = false;
            rVar.f5351l = interfaceC2035c;
            rVar.f5352m = c2055b;
            if (interfaceC2035c.m()) {
                u uVar = this.f17813r;
                m3.v.e(uVar);
                C3.a aVar = uVar.f17842q;
                if (aVar != null) {
                    aVar.l();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(uVar));
                C0.c cVar = uVar.f17841p;
                cVar.f815g = valueOf;
                Jt jt = uVar.f17838m;
                uVar.f17842q = (C3.a) uVar.f17839n.l(uVar.f17837l, jt.getLooper(), cVar, (B3.a) cVar.f, uVar, uVar);
                uVar.f17843r = rVar;
                Set set = uVar.f17840o;
                if (set == null || set.isEmpty()) {
                    jt.post(new C(15, uVar));
                } else {
                    C3.a aVar2 = uVar.f17842q;
                    aVar2.getClass();
                    aVar2.c(new m3.k(aVar2));
                }
            }
            try {
                interfaceC2035c.c(rVar);
            } catch (SecurityException e3) {
                l(new j3.b(10), e3);
            }
        } catch (IllegalStateException e5) {
            l(new j3.b(10), e5);
        }
    }

    public final void k(q qVar) {
        m3.v.b(this.f17818w.f17798w);
        boolean a5 = this.f17807l.a();
        LinkedList linkedList = this.f17806k;
        if (a5) {
            if (h(qVar)) {
                g();
                return;
            } else {
                linkedList.add(qVar);
                return;
            }
        }
        linkedList.add(qVar);
        j3.b bVar = this.f17816u;
        if (bVar == null || bVar.f17502l == 0 || bVar.f17503m == null) {
            j();
        } else {
            l(bVar, null);
        }
    }

    public final void l(j3.b bVar, RuntimeException runtimeException) {
        C3.a aVar;
        m3.v.b(this.f17818w.f17798w);
        u uVar = this.f17813r;
        if (uVar != null && (aVar = uVar.f17842q) != null) {
            aVar.l();
        }
        m3.v.b(this.f17818w.f17798w);
        this.f17816u = null;
        ((SparseIntArray) this.f17818w.f17792q.f1749l).clear();
        a(bVar);
        if ((this.f17807l instanceof C2222c) && bVar.f17502l != 24) {
            C2057d c2057d = this.f17818w;
            c2057d.f17787l = true;
            Jt jt = c2057d.f17798w;
            jt.sendMessageDelayed(jt.obtainMessage(19), 300000L);
        }
        if (bVar.f17502l == 4) {
            b(C2057d.f17785z);
            return;
        }
        if (this.f17806k.isEmpty()) {
            this.f17816u = bVar;
            return;
        }
        if (runtimeException != null) {
            m3.v.b(this.f17818w.f17798w);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f17818w.f17799x) {
            b(C2057d.c(this.f17808m, bVar));
            return;
        }
        c(C2057d.c(this.f17808m, bVar), null, true);
        if (this.f17806k.isEmpty() || i(bVar) || this.f17818w.b(bVar, this.f17812q)) {
            return;
        }
        if (bVar.f17502l == 18) {
            this.f17814s = true;
        }
        if (!this.f17814s) {
            b(C2057d.c(this.f17808m, bVar));
            return;
        }
        Jt jt2 = this.f17818w.f17798w;
        Message obtain = Message.obtain(jt2, 9, this.f17808m);
        this.f17818w.getClass();
        jt2.sendMessageDelayed(obtain, 5000L);
    }

    public final void m() {
        m3.v.b(this.f17818w.f17798w);
        Status status = C2057d.f17784y;
        b(status);
        this.f17809n.H(false, status);
        for (g gVar : (g[]) this.f17811p.keySet().toArray(new g[0])) {
            k(new w(new D3.f()));
        }
        a(new j3.b(4));
        InterfaceC2035c interfaceC2035c = this.f17807l;
        if (interfaceC2035c.a()) {
            interfaceC2035c.e(new C1930k(29, this));
        }
    }
}
