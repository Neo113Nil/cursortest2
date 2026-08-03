package androidx.lifecycle;

/* loaded from: classes.dex */
public final class l extends androidx.lifecycle.f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2388a;

    /* renamed from: b, reason: collision with root package name */
    public j.C0910a f2389b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.e f2390c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f2391d;

    /* renamed from: e, reason: collision with root package name */
    public int f2392e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2393f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2394g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f2395h;

    /* renamed from: i, reason: collision with root package name */
    public final C1.r f2396i;

    public l(androidx.lifecycle.j jVar) {
        new java.util.concurrent.atomic.AtomicReference();
        this.f2388a = true;
        this.f2389b = new j.C0910a();
        androidx.lifecycle.e eVar = androidx.lifecycle.e.f2380b;
        this.f2390c = eVar;
        this.f2395h = new java.util.ArrayList();
        this.f2391d = new java.lang.ref.WeakReference(jVar);
        this.f2396i = new C1.r(eVar);
    }

    public final void a(androidx.lifecycle.i iVar) {
        java.lang.Object obj;
        androidx.lifecycle.j jVar;
        java.util.ArrayList arrayList = this.f2395h;
        c("addObserver");
        androidx.lifecycle.e eVar = this.f2390c;
        androidx.lifecycle.e eVar2 = androidx.lifecycle.e.f2379a;
        if (eVar != eVar2) {
            eVar2 = androidx.lifecycle.e.f2380b;
        }
        androidx.lifecycle.k kVar = new androidx.lifecycle.k();
        int i2 = androidx.lifecycle.m.f2397a;
        kVar.f2387b = iVar;
        kVar.f2386a = eVar2;
        j.C0910a c0910a = this.f2389b;
        j.C0912c a2 = c0910a.a(iVar);
        if (a2 != null) {
            obj = a2.f7927b;
        } else {
            java.util.HashMap hashMap = c0910a.f7922e;
            j.C0912c c0912c = new j.C0912c(iVar, kVar);
            c0910a.f7936d++;
            j.C0912c c0912c2 = c0910a.f7934b;
            if (c0912c2 == null) {
                c0910a.f7933a = c0912c;
                c0910a.f7934b = c0912c;
            } else {
                c0912c2.f7928c = c0912c;
                c0912c.f7929d = c0912c2;
                c0910a.f7934b = c0912c;
            }
            hashMap.put(iVar, c0912c);
            obj = null;
        }
        if (((androidx.lifecycle.k) obj) == null && (jVar = (androidx.lifecycle.j) this.f2391d.get()) != null) {
            boolean z2 = this.f2392e != 0 || this.f2393f;
            androidx.lifecycle.e b2 = b(iVar);
            this.f2392e++;
            while (kVar.f2386a.compareTo(b2) < 0 && this.f2389b.f7922e.containsKey(iVar)) {
                arrayList.add(kVar.f2386a);
                androidx.lifecycle.b bVar = androidx.lifecycle.d.Companion;
                androidx.lifecycle.e eVar3 = kVar.f2386a;
                bVar.getClass();
                androidx.lifecycle.d a3 = androidx.lifecycle.b.a(eVar3);
                if (a3 == null) {
                    throw new java.lang.IllegalStateException("no event up from " + kVar.f2386a);
                }
                kVar.a(jVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b2 = b(iVar);
            }
            if (!z2) {
                e();
            }
            this.f2392e--;
        }
    }

    public final androidx.lifecycle.e b(androidx.lifecycle.i iVar) {
        java.util.HashMap hashMap = this.f2389b.f7922e;
        j.C0912c c0912c = hashMap.containsKey(iVar) ? ((j.C0912c) hashMap.get(iVar)).f7929d : null;
        androidx.lifecycle.e eVar = c0912c != null ? ((androidx.lifecycle.k) c0912c.f7927b).f2386a : null;
        java.util.ArrayList arrayList = this.f2395h;
        androidx.lifecycle.e eVar2 = arrayList.isEmpty() ? null : (androidx.lifecycle.e) arrayList.get(arrayList.size() - 1);
        androidx.lifecycle.e state1 = this.f2390c;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (eVar == null || eVar.compareTo(state1) >= 0) {
            eVar = state1;
        }
        return (eVar2 == null || eVar2.compareTo(eVar) >= 0) ? eVar : eVar2;
    }

    public final void c(java.lang.String str) {
        i.C0178a c0178a;
        if (this.f2388a) {
            if (i.C0178a.f3303b != null) {
                c0178a = i.C0178a.f3303b;
            } else {
                synchronized (i.C0178a.class) {
                    try {
                        if (i.C0178a.f3303b == null) {
                            i.C0178a.f3303b = new i.C0178a(0);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                c0178a = i.C0178a.f3303b;
            }
            ((i.C0178a) c0178a.f3304a).getClass();
            if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                return;
            }
            throw new java.lang.IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(androidx.lifecycle.d event) {
        kotlin.jvm.internal.i.e(event, "event");
        c("handleLifecycleEvent");
        androidx.lifecycle.e a2 = event.a();
        androidx.lifecycle.e eVar = this.f2390c;
        if (eVar == a2) {
            return;
        }
        androidx.lifecycle.e eVar2 = androidx.lifecycle.e.f2380b;
        androidx.lifecycle.e eVar3 = androidx.lifecycle.e.f2379a;
        if (eVar == eVar2 && a2 == eVar3) {
            throw new java.lang.IllegalStateException(("no event down from " + this.f2390c + " in component " + this.f2391d.get()).toString());
        }
        this.f2390c = a2;
        if (this.f2393f || this.f2392e != 0) {
            this.f2394g = true;
            return;
        }
        this.f2393f = true;
        e();
        this.f2393f = false;
        if (this.f2390c == eVar3) {
            this.f2389b = new j.C0910a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r8.f2394g = false;
        r0 = r8.f2390c;
        r1 = r8.f2396i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = D1.l.f240a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.b(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        androidx.lifecycle.j jVar = (androidx.lifecycle.j) this.f2391d.get();
        if (jVar == null) {
            throw new java.lang.IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            j.C0910a c0910a = this.f2389b;
            if (c0910a.f7936d != 0) {
                j.C0912c c0912c = c0910a.f7933a;
                kotlin.jvm.internal.i.b(c0912c);
                androidx.lifecycle.e eVar = ((androidx.lifecycle.k) c0912c.f7927b).f2386a;
                j.C0912c c0912c2 = this.f2389b.f7934b;
                kotlin.jvm.internal.i.b(c0912c2);
                androidx.lifecycle.e eVar2 = ((androidx.lifecycle.k) c0912c2.f7927b).f2386a;
                if (eVar == eVar2 && this.f2390c == eVar2) {
                    break;
                }
                this.f2394g = false;
                androidx.lifecycle.e eVar3 = this.f2390c;
                j.C0912c c0912c3 = this.f2389b.f7933a;
                kotlin.jvm.internal.i.b(c0912c3);
                if (eVar3.compareTo(((androidx.lifecycle.k) c0912c3.f7927b).f2386a) < 0) {
                    j.C0910a c0910a2 = this.f2389b;
                    j.C0911b c0911b = new j.C0911b(c0910a2.f7934b, c0910a2.f7933a, 1);
                    c0910a2.f7935c.put(c0911b, java.lang.Boolean.FALSE);
                    while (c0911b.hasNext() && !this.f2394g) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) c0911b.next();
                        kotlin.jvm.internal.i.d(entry, "next()");
                        androidx.lifecycle.i iVar = (androidx.lifecycle.i) entry.getKey();
                        androidx.lifecycle.k kVar = (androidx.lifecycle.k) entry.getValue();
                        while (kVar.f2386a.compareTo(this.f2390c) > 0 && !this.f2394g && this.f2389b.f7922e.containsKey(iVar)) {
                            androidx.lifecycle.b bVar = androidx.lifecycle.d.Companion;
                            androidx.lifecycle.e state = kVar.f2386a;
                            bVar.getClass();
                            kotlin.jvm.internal.i.e(state, "state");
                            int ordinal = state.ordinal();
                            androidx.lifecycle.d dVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : androidx.lifecycle.d.ON_PAUSE : androidx.lifecycle.d.ON_STOP : androidx.lifecycle.d.ON_DESTROY;
                            if (dVar == null) {
                                throw new java.lang.IllegalStateException("no event down from " + kVar.f2386a);
                            }
                            this.f2395h.add(dVar.a());
                            kVar.a(jVar, dVar);
                            this.f2395h.remove(r5.size() - 1);
                        }
                    }
                }
                j.C0912c c0912c4 = this.f2389b.f7934b;
                if (!this.f2394g && c0912c4 != null && this.f2390c.compareTo(((androidx.lifecycle.k) c0912c4.f7927b).f2386a) > 0) {
                    j.C0910a c0910a3 = this.f2389b;
                    c0910a3.getClass();
                    j.C0913d c0913d = new j.C0913d(c0910a3);
                    c0910a3.f7935c.put(c0913d, java.lang.Boolean.FALSE);
                    while (c0913d.hasNext() && !this.f2394g) {
                        java.util.Map.Entry entry2 = (java.util.Map.Entry) c0913d.next();
                        androidx.lifecycle.i iVar2 = (androidx.lifecycle.i) entry2.getKey();
                        androidx.lifecycle.k kVar2 = (androidx.lifecycle.k) entry2.getValue();
                        while (kVar2.f2386a.compareTo(this.f2390c) < 0 && !this.f2394g && this.f2389b.f7922e.containsKey(iVar2)) {
                            this.f2395h.add(kVar2.f2386a);
                            androidx.lifecycle.b bVar2 = androidx.lifecycle.d.Companion;
                            androidx.lifecycle.e eVar4 = kVar2.f2386a;
                            bVar2.getClass();
                            androidx.lifecycle.d a2 = androidx.lifecycle.b.a(eVar4);
                            if (a2 == null) {
                                throw new java.lang.IllegalStateException("no event up from " + kVar2.f2386a);
                            }
                            kVar2.a(jVar, a2);
                            this.f2395h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
