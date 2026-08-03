package C1;

/* loaded from: classes.dex */
public final class r extends D1.b implements C1.d, C1.e, D1.j {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f175e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(C1.r.class, java.lang.Object.class, "_state");
    private volatile java.lang.Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f176d;

    public r(java.lang.Object obj) {
        this._state = obj;
    }

    @Override // C1.e
    public final java.lang.Object a(java.lang.Object obj, k1.d dVar) {
        if (obj == null) {
            obj = D1.l.f240a;
        }
        b(null, obj);
        return h1.C0177i.f3302a;
    }

    public final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        int i2;
        D1.c[] cVarArr;
        C.j jVar;
        synchronized (this) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f175e;
            java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.i.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f176d;
            if ((i3 & 1) != 0) {
                this.f176d = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f176d = i4;
            D1.c[] cVarArr2 = this.f220a;
            while (true) {
                C1.t[] tVarArr = (C1.t[]) cVarArr2;
                if (tVarArr != null) {
                    for (C1.t tVar : tVarArr) {
                        if (tVar != null) {
                            while (true) {
                                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1.t.f179a;
                                java.lang.Object obj4 = atomicReferenceFieldUpdater2.get(tVar);
                                if (obj4 != null && obj4 != (jVar = C1.s.f178b)) {
                                    C.j jVar2 = C1.s.f177a;
                                    if (obj4 != jVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, obj4, jVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(tVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((z1.C1053f) obj4).l(h1.C0177i.f3302a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, obj4, jVar)) {
                                        if (atomicReferenceFieldUpdater2.get(tVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f176d;
                    if (i2 == i4) {
                        this.f176d = i4 + 1;
                        return true;
                    }
                    cVarArr = this.f220a;
                }
                cVarArr2 = cVarArr;
                i4 = i2;
            }
        }
    }

    @Override // D1.j
    public final C1.d n(k1.i iVar, int i2, int i3) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) && !((i2 == 0 || i2 == -3) && i3 == 1)) ? new D1.h(this, iVar, i2, i3) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    @Override // C1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object o(C1.e eVar, k1.d dVar) {
        C1.q qVar;
        l1.EnumC0927a enumC0927a;
        int i2;
        D1.c cVar;
        C1.t tVar;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1.e eVar2;
        C1.r rVar;
        C1.t tVar2;
        z1.P p2;
        C1.e eVar3;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object andSet;
        java.lang.Object obj3;
        try {
            if (dVar instanceof C1.q) {
                qVar = (C1.q) dVar;
                int i3 = qVar.f174k;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    qVar.f174k = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj4 = qVar.f172i;
                    enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = qVar.f174k;
                    int i4 = 1;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj4);
                        synchronized (this) {
                            try {
                                D1.c[] cVarArr = this.f220a;
                                if (cVarArr == null) {
                                    cVarArr = new C1.t[2];
                                    this.f220a = cVarArr;
                                } else if (this.f221b >= cVarArr.length) {
                                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(cVarArr, cVarArr.length * 2);
                                    kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
                                    this.f220a = (D1.c[]) copyOf;
                                    cVarArr = (D1.c[]) copyOf;
                                }
                                int i5 = this.f222c;
                                do {
                                    cVar = cVarArr[i5];
                                    if (cVar == null) {
                                        cVar = new C1.t();
                                        cVarArr[i5] = cVar;
                                    }
                                    i5++;
                                    if (i5 >= cVarArr.length) {
                                        i5 = 0;
                                    }
                                    tVar = (C1.t) cVar;
                                    atomicReferenceFieldUpdater = C1.t.f179a;
                                } while (atomicReferenceFieldUpdater.get(tVar) != null);
                                atomicReferenceFieldUpdater.set(tVar, C1.s.f177a);
                                this.f222c = i5;
                                this.f221b++;
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        rVar = this;
                        tVar2 = (C1.t) cVar;
                    } else if (i2 == 1) {
                        tVar2 = qVar.f169f;
                        eVar2 = qVar.f168e;
                        rVar = qVar.f167d;
                        a.AbstractC0059a.A(obj4);
                    } else if (i2 == 2) {
                        obj2 = qVar.f171h;
                        p2 = qVar.f170g;
                        tVar2 = qVar.f169f;
                        eVar3 = qVar.f168e;
                        rVar = qVar.f167d;
                        a.AbstractC0059a.A(obj4);
                        obj = obj2;
                        tVar2.getClass();
                        C.j jVar = C1.s.f177a;
                        andSet = C1.t.f179a.getAndSet(tVar2, jVar);
                        kotlin.jvm.internal.i.b(andSet);
                        if (andSet != C1.s.f178b) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj5 = qVar.f171h;
                        p2 = qVar.f170g;
                        tVar2 = qVar.f169f;
                        eVar3 = qVar.f168e;
                        rVar = qVar.f167d;
                        a.AbstractC0059a.A(obj4);
                        obj = obj5;
                        i4 = 1;
                        obj2 = f175e.get(rVar);
                        if (p2 != null && !p2.b()) {
                            throw ((z1.Z) p2).z();
                        }
                        obj3 = obj2 == D1.l.f240a ? null : obj2;
                        qVar.f167d = rVar;
                        qVar.f168e = eVar3;
                        qVar.f169f = tVar2;
                        qVar.f170g = p2;
                        qVar.f171h = obj2;
                        qVar.f174k = 2;
                        if (eVar3.a(obj3, qVar) == enumC0927a) {
                            return enumC0927a;
                        }
                        obj = obj2;
                        tVar2.getClass();
                        C.j jVar2 = C1.s.f177a;
                        andSet = C1.t.f179a.getAndSet(tVar2, jVar2);
                        kotlin.jvm.internal.i.b(andSet);
                        if (andSet != C1.s.f178b) {
                            obj2 = f175e.get(rVar);
                            if (p2 != null) {
                                throw ((z1.Z) p2).z();
                            }
                            if (obj2 == D1.l.f240a) {
                            }
                            qVar.f167d = rVar;
                            qVar.f168e = eVar3;
                            qVar.f169f = tVar2;
                            qVar.f170g = p2;
                            qVar.f171h = obj2;
                            qVar.f174k = 2;
                            if (eVar3.a(obj3, qVar) == enumC0927a) {
                            }
                            obj = obj2;
                            tVar2.getClass();
                            C.j jVar22 = C1.s.f177a;
                            andSet = C1.t.f179a.getAndSet(tVar2, jVar22);
                            kotlin.jvm.internal.i.b(andSet);
                            if (andSet != C1.s.f178b) {
                                qVar.f167d = rVar;
                                qVar.f168e = eVar3;
                                qVar.f169f = tVar2;
                                qVar.f170g = p2;
                                qVar.f171h = obj;
                                qVar.f174k = 3;
                                z1.C1053f c1053f = new z1.C1053f(i4, u0.AbstractC0995a.o(qVar));
                                c1053f.u();
                                while (true) {
                                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1.t.f179a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(tVar2, jVar22, c1053f);
                                    h1.C0177i c0177i = h1.C0177i.f3302a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(tVar2) != jVar22) {
                                        c1053f.l(c0177i);
                                        break;
                                    }
                                }
                                java.lang.Object t = c1053f.t();
                                if (t == l1.EnumC0927a.f8017a) {
                                }
                                if (t == enumC0927a) {
                                    return enumC0927a;
                                }
                                i4 = 1;
                                obj2 = f175e.get(rVar);
                                if (p2 != null) {
                                }
                                if (obj2 == D1.l.f240a) {
                                }
                                qVar.f167d = rVar;
                                qVar.f168e = eVar3;
                                qVar.f169f = tVar2;
                                qVar.f170g = p2;
                                qVar.f171h = obj2;
                                qVar.f174k = 2;
                                if (eVar3.a(obj3, qVar) == enumC0927a) {
                                }
                                obj = obj2;
                                tVar2.getClass();
                                C.j jVar222 = C1.s.f177a;
                                andSet = C1.t.f179a.getAndSet(tVar2, jVar222);
                                kotlin.jvm.internal.i.b(andSet);
                                if (andSet != C1.s.f178b) {
                                }
                            }
                        }
                    }
                    k1.i iVar = qVar.f8076b;
                    kotlin.jvm.internal.i.b(iVar);
                    p2 = (z1.P) iVar.m(z1.C1066t.f8592b);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f175e.get(rVar);
                    if (p2 != null) {
                    }
                    if (obj2 == D1.l.f240a) {
                    }
                    qVar.f167d = rVar;
                    qVar.f168e = eVar3;
                    qVar.f169f = tVar2;
                    qVar.f170g = p2;
                    qVar.f171h = obj2;
                    qVar.f174k = 2;
                    if (eVar3.a(obj3, qVar) == enumC0927a) {
                    }
                    obj = obj2;
                    tVar2.getClass();
                    C.j jVar2222 = C1.s.f177a;
                    andSet = C1.t.f179a.getAndSet(tVar2, jVar2222);
                    kotlin.jvm.internal.i.b(andSet);
                    if (andSet != C1.s.f178b) {
                    }
                }
            }
            if (i2 != 0) {
            }
            k1.i iVar2 = qVar.f8076b;
            kotlin.jvm.internal.i.b(iVar2);
            p2 = (z1.P) iVar2.m(z1.C1066t.f8592b);
            eVar3 = eVar2;
            obj = null;
            obj2 = f175e.get(rVar);
            if (p2 != null) {
            }
            if (obj2 == D1.l.f240a) {
            }
            qVar.f167d = rVar;
            qVar.f168e = eVar3;
            qVar.f169f = tVar2;
            qVar.f170g = p2;
            qVar.f171h = obj2;
            qVar.f174k = 2;
            if (eVar3.a(obj3, qVar) == enumC0927a) {
            }
            obj = obj2;
            tVar2.getClass();
            C.j jVar22222 = C1.s.f177a;
            andSet = C1.t.f179a.getAndSet(tVar2, jVar22222);
            kotlin.jvm.internal.i.b(andSet);
            if (andSet != C1.s.f178b) {
            }
        } catch (java.lang.Throwable th2) {
            synchronized (rVar) {
                try {
                    int i6 = rVar.f221b - 1;
                    rVar.f221b = i6;
                    if (i6 == 0) {
                        rVar.f222c = 0;
                    }
                    kotlin.jvm.internal.i.c(tVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    C1.t.f179a.set(tVar2, null);
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    throw th3;
                }
            }
        }
        qVar = new C1.q(this, dVar);
        java.lang.Object obj42 = qVar.f172i;
        enumC0927a = l1.EnumC0927a.f8017a;
        i2 = qVar.f174k;
        int i42 = 1;
    }
}
