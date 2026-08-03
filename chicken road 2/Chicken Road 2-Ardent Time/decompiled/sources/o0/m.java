package o0;

/* loaded from: classes.dex */
public final class m implements n0.g, n0.h {

    /* renamed from: b, reason: collision with root package name */
    public final n0.InterfaceC0939c f8154b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.C0942a f8155c;

    /* renamed from: d, reason: collision with root package name */
    public final o0.i f8156d;

    /* renamed from: g, reason: collision with root package name */
    public final int f8159g;

    /* renamed from: h, reason: collision with root package name */
    public final o0.v f8160h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8161i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o0.c f8165m;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f8153a = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f8157e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f8158f = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f8162j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public m0.b f8163k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f8164l = 0;

    public m(o0.c cVar, n0.f fVar) {
        this.f8165m = cVar;
        android.os.Looper looper = cVar.f8145m.getLooper();
        I0.b a2 = fVar.a();
        P1.h hVar = new P1.h((l.C0925c) a2.f657b, (java.lang.String) a2.f658c, (java.lang.String) a2.f659d);
        Q1.l lVar = (Q1.l) fVar.f8089c.f8409b;
        p0.AbstractC0966r.c(lVar);
        n0.InterfaceC0939c a3 = lVar.a(fVar.f8087a, looper, hVar, fVar.f8090d, this, this);
        java.lang.String str = fVar.f8088b;
        if (str != null && (a3 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) a3).f2616r = str;
        }
        if (str != null && (a3 instanceof o0.g)) {
            B1.a.m(a3);
            throw null;
        }
        this.f8154b = a3;
        this.f8155c = fVar.f8091e;
        this.f8156d = new o0.i(1);
        this.f8159g = fVar.f8092f;
        if (!a3.i()) {
            this.f8160h = null;
            return;
        }
        android.content.Context context = cVar.f8137e;
        A0.a aVar = cVar.f8145m;
        I0.b a4 = fVar.a();
        this.f8160h = new o0.v(context, aVar, new P1.h((l.C0925c) a4.f657b, (java.lang.String) a4.f658c, (java.lang.String) a4.f659d));
    }

    @Override // n0.g
    public final void a(int i2) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        o0.c cVar = this.f8165m;
        if (myLooper == cVar.f8145m.getLooper()) {
            i(i2);
        } else {
            cVar.f8145m.post(new o0.l(this, i2));
        }
    }

    @Override // n0.h
    public final void b(m0.b bVar) {
        o(bVar, null);
    }

    @Override // n0.g
    public final void c() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        o0.c cVar = this.f8165m;
        if (myLooper == cVar.f8145m.getLooper()) {
            h();
        } else {
            cVar.f8145m.post(new C.b(9, this));
        }
    }

    public final void d(m0.b bVar) {
        java.util.HashSet hashSet = this.f8157e;
        java.util.Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new java.lang.ClassCastException();
            }
            if (p0.AbstractC0966r.e(bVar, m0.b.f8041e)) {
                this.f8154b.d();
            }
            throw null;
        }
    }

    public final void e(com.google.android.gms.common.api.Status status) {
        p0.AbstractC0966r.a(this.f8165m.f8145m);
        f(status, null, false);
    }

    public final void f(com.google.android.gms.common.api.Status status, java.lang.RuntimeException runtimeException, boolean z2) {
        p0.AbstractC0966r.a(this.f8165m.f8145m);
        if ((status == null) == (runtimeException == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.f8153a.iterator();
        while (it.hasNext()) {
            o0.r rVar = (o0.r) it.next();
            if (!z2 || rVar.f8176a == 2) {
                if (status != null) {
                    rVar.c(status);
                } else {
                    rVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        java.util.LinkedList linkedList = this.f8153a;
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0.r rVar = (o0.r) arrayList.get(i2);
            if (!this.f8154b.c()) {
                return;
            }
            if (k(rVar)) {
                linkedList.remove(rVar);
            }
        }
    }

    public final void h() {
        o0.c cVar = this.f8165m;
        p0.AbstractC0966r.a(cVar.f8145m);
        this.f8163k = null;
        d(m0.b.f8041e);
        if (this.f8161i) {
            A0.a aVar = cVar.f8145m;
            o0.C0942a c0942a = this.f8155c;
            aVar.removeMessages(11, c0942a);
            cVar.f8145m.removeMessages(9, c0942a);
            this.f8161i = false;
        }
        java.util.Iterator it = this.f8158f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i2) {
        o0.c cVar = this.f8165m;
        p0.AbstractC0966r.a(cVar.f8145m);
        this.f8163k = null;
        this.f8161i = true;
        java.lang.String e2 = this.f8154b.e();
        o0.i iVar = this.f8156d;
        iVar.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (e2 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(e2);
        }
        iVar.c(true, new com.google.android.gms.common.api.Status(20, sb.toString(), null, null));
        A0.a aVar = cVar.f8145m;
        o0.C0942a c0942a = this.f8155c;
        aVar.sendMessageDelayed(android.os.Message.obtain(aVar, 9, c0942a), 5000L);
        A0.a aVar2 = cVar.f8145m;
        aVar2.sendMessageDelayed(android.os.Message.obtain(aVar2, 11, c0942a), 120000L);
        ((android.util.SparseIntArray) cVar.f8139g.f8148b).clear();
        java.util.Iterator it = this.f8158f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
    }

    public final void j() {
        o0.c cVar = this.f8165m;
        A0.a aVar = cVar.f8145m;
        o0.C0942a c0942a = this.f8155c;
        aVar.removeMessages(12, c0942a);
        A0.a aVar2 = cVar.f8145m;
        aVar2.sendMessageDelayed(aVar2.obtainMessage(12, c0942a), cVar.f8133a);
    }

    public final boolean k(o0.r rVar) {
        m0.d dVar;
        if (rVar == null) {
            n0.InterfaceC0939c interfaceC0939c = this.f8154b;
            rVar.f(this.f8156d, interfaceC0939c.i());
            try {
                rVar.e(this);
            } catch (android.os.DeadObjectException unused) {
                a(1);
                interfaceC0939c.h("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        m0.d[] b2 = rVar.b(this);
        if (b2 != null && b2.length != 0) {
            m0.d[] b3 = this.f8154b.b();
            if (b3 == null) {
                b3 = new m0.d[0];
            }
            int length = b3.length;
            l.C0924b c0924b = new l.C0924b();
            if (length == 0) {
                c0924b.f8006a = l.d.f7978a;
                c0924b.f8007b = l.d.f7979b;
            } else {
                c0924b.a(length);
            }
            c0924b.f8008c = 0;
            for (m0.d dVar2 : b3) {
                c0924b.put(dVar2.f8049a, java.lang.Long.valueOf(dVar2.a()));
            }
            int length2 = b2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                dVar = b2[i2];
                java.lang.Long l2 = (java.lang.Long) c0924b.getOrDefault(dVar.f8049a, null);
                if (l2 == null || l2.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            n0.InterfaceC0939c interfaceC0939c2 = this.f8154b;
            rVar.f(this.f8156d, interfaceC0939c2.i());
            try {
                rVar.e(this);
            } catch (android.os.DeadObjectException unused2) {
                a(1);
                interfaceC0939c2.h("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        android.util.Log.w("GoogleApiManager", this.f8154b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f8049a + ", " + dVar.a() + ").");
        if (!this.f8165m.f8146n || !rVar.a(this)) {
            rVar.d(new n0.k(dVar));
            return true;
        }
        o0.n nVar = new o0.n(this.f8155c, dVar);
        int indexOf = this.f8162j.indexOf(nVar);
        if (indexOf >= 0) {
            o0.n nVar2 = (o0.n) this.f8162j.get(indexOf);
            this.f8165m.f8145m.removeMessages(15, nVar2);
            A0.a aVar = this.f8165m.f8145m;
            aVar.sendMessageDelayed(android.os.Message.obtain(aVar, 15, nVar2), 5000L);
        } else {
            this.f8162j.add(nVar);
            A0.a aVar2 = this.f8165m.f8145m;
            aVar2.sendMessageDelayed(android.os.Message.obtain(aVar2, 15, nVar), 5000L);
            A0.a aVar3 = this.f8165m.f8145m;
            aVar3.sendMessageDelayed(android.os.Message.obtain(aVar3, 16, nVar), 120000L);
            m0.b bVar = new m0.b(2, null);
            if (!l(bVar)) {
                this.f8165m.b(bVar, this.f8159g);
            }
        }
        return false;
    }

    public final boolean l(m0.b bVar) {
        synchronized (o0.c.f8131q) {
            this.f8165m.getClass();
        }
        return false;
    }

    public final void m() {
        o0.c cVar = this.f8165m;
        p0.AbstractC0966r.a(cVar.f8145m);
        n0.InterfaceC0939c interfaceC0939c = this.f8154b;
        if (interfaceC0939c.c() || interfaceC0939c.a()) {
            return;
        }
        try {
            o0.i iVar = cVar.f8139g;
            android.content.Context context = cVar.f8137e;
            iVar.getClass();
            p0.AbstractC0966r.c(context);
            int m2 = interfaceC0939c.m();
            android.util.SparseIntArray sparseIntArray = (android.util.SparseIntArray) iVar.f8148b;
            int i2 = sparseIntArray.get(m2, -1);
            if (i2 == -1) {
                i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i3);
                    if (keyAt > m2 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 == -1) {
                    i2 = ((m0.f) iVar.f8149c).b(context, m2);
                }
                sparseIntArray.put(m2, i2);
            }
            if (i2 != 0) {
                m0.b bVar = new m0.b(i2, null);
                android.util.Log.w("GoogleApiManager", "The service for " + interfaceC0939c.getClass().getName() + " is not available: " + bVar.toString());
                o(bVar, null);
                return;
            }
            o0.o oVar = new o0.o(cVar, interfaceC0939c, this.f8155c);
            if (interfaceC0939c.i()) {
                o0.v vVar = this.f8160h;
                p0.AbstractC0966r.c(vVar);
                C0.a aVar = vVar.f8195g;
                if (aVar != null) {
                    aVar.g();
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(java.lang.System.identityHashCode(vVar));
                P1.h hVar = vVar.f8194f;
                hVar.f1488f = valueOf;
                A0.a aVar2 = vVar.f8191c;
                vVar.f8195g = (C0.a) vVar.f8192d.a(vVar.f8190b, aVar2.getLooper(), hVar, (B0.a) hVar.f1487e, vVar, vVar);
                vVar.f8196h = oVar;
                java.util.Set set = vVar.f8193e;
                if (set == null || set.isEmpty()) {
                    aVar2.post(new C.b(11, vVar));
                } else {
                    C0.a aVar3 = vVar.f8195g;
                    aVar3.getClass();
                    aVar3.k(new p0.C0955g(aVar3));
                }
            }
            try {
                interfaceC0939c.k(oVar);
            } catch (java.lang.SecurityException e2) {
                o(new m0.b(10), e2);
            }
        } catch (java.lang.IllegalStateException e3) {
            o(new m0.b(10), e3);
        }
    }

    public final void n(o0.r rVar) {
        p0.AbstractC0966r.a(this.f8165m.f8145m);
        boolean c2 = this.f8154b.c();
        java.util.LinkedList linkedList = this.f8153a;
        if (c2) {
            if (k(rVar)) {
                j();
                return;
            } else {
                linkedList.add(rVar);
                return;
            }
        }
        linkedList.add(rVar);
        m0.b bVar = this.f8163k;
        if (bVar == null || bVar.f8043b == 0 || bVar.f8044c == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(m0.b bVar, java.lang.RuntimeException runtimeException) {
        C0.a aVar;
        p0.AbstractC0966r.a(this.f8165m.f8145m);
        o0.v vVar = this.f8160h;
        if (vVar != null && (aVar = vVar.f8195g) != null) {
            aVar.g();
        }
        p0.AbstractC0966r.a(this.f8165m.f8145m);
        this.f8163k = null;
        ((android.util.SparseIntArray) this.f8165m.f8139g.f8148b).clear();
        d(bVar);
        if ((this.f8154b instanceof r0.C0987c) && bVar.f8043b != 24) {
            o0.c cVar = this.f8165m;
            cVar.f8134b = true;
            A0.a aVar2 = cVar.f8145m;
            aVar2.sendMessageDelayed(aVar2.obtainMessage(19), 300000L);
        }
        if (bVar.f8043b == 4) {
            e(o0.c.f8130p);
            return;
        }
        if (this.f8153a.isEmpty()) {
            this.f8163k = bVar;
            return;
        }
        if (runtimeException != null) {
            p0.AbstractC0966r.a(this.f8165m.f8145m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f8165m.f8146n) {
            e(o0.c.c(this.f8155c, bVar));
            return;
        }
        f(o0.c.c(this.f8155c, bVar), null, true);
        if (this.f8153a.isEmpty() || l(bVar) || this.f8165m.b(bVar, this.f8159g)) {
            return;
        }
        if (bVar.f8043b == 18) {
            this.f8161i = true;
        }
        if (!this.f8161i) {
            e(o0.c.c(this.f8155c, bVar));
            return;
        }
        o0.c cVar2 = this.f8165m;
        o0.C0942a c0942a = this.f8155c;
        A0.a aVar3 = cVar2.f8145m;
        aVar3.sendMessageDelayed(android.os.Message.obtain(aVar3, 9, c0942a), 5000L);
    }

    public final void p(m0.b bVar) {
        p0.AbstractC0966r.a(this.f8165m.f8145m);
        n0.InterfaceC0939c interfaceC0939c = this.f8154b;
        interfaceC0939c.h("onSignInFailed for " + interfaceC0939c.getClass().getName() + " with " + java.lang.String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        p0.AbstractC0966r.a(this.f8165m.f8145m);
        com.google.android.gms.common.api.Status status = o0.c.f8129o;
        e(status);
        this.f8156d.c(false, status);
        for (o0.f fVar : (o0.f[]) this.f8158f.keySet().toArray(new o0.f[0])) {
            n(new o0.x(new D0.d()));
        }
        d(new m0.b(4));
        n0.InterfaceC0939c interfaceC0939c = this.f8154b;
        if (interfaceC0939c.c()) {
            interfaceC0939c.j(new Z0.h(26, this));
        }
    }
}
