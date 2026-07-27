package z2;

import B2.v;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.C1227f;
import w2.C1240t;
import w2.P;
import w2.Z;

/* loaded from: classes.dex */
public final class p extends A2.b implements d, e, A2.j {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10747e = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f10748d;

    public p(Object obj) {
        this._state = obj;
    }

    @Override // z2.e
    public final Object a(Object obj, InterfaceC0319c interfaceC0319c) {
        if (obj == null) {
            obj = A2.l.f108a;
        }
        b(null, obj);
        return C0279i.f4852a;
    }

    public final boolean b(Object obj, Object obj2) {
        int i3;
        A2.c[] cVarArr;
        v vVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10747e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.f10748d;
            if ((i4 & 1) != 0) {
                this.f10748d = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.f10748d = i5;
            A2.c[] cVarArr2 = this.f91a;
            while (true) {
                r[] rVarArr = (r[]) cVarArr2;
                if (rVarArr != null) {
                    for (r rVar : rVarArr) {
                        if (rVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r.f10751a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(rVar);
                                if (obj4 != null && obj4 != (vVar = q.f10750b)) {
                                    v vVar2 = q.f10749a;
                                    if (obj4 != vVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(rVar, obj4, vVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(rVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C1227f) obj4).e(C0279i.f4852a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(rVar, obj4, vVar)) {
                                        if (atomicReferenceFieldUpdater2.get(rVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f10748d;
                    if (i3 == i5) {
                        this.f10748d = i5 + 1;
                        return true;
                    }
                    cVarArr = this.f91a;
                }
                cVarArr2 = cVarArr;
                i5 = i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014d, code lost:
    
        if (r4 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    @Override // z2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(e eVar, InterfaceC0319c interfaceC0319c) {
        o oVar;
        EnumC0326a enumC0326a;
        int i3;
        A2.c cVar;
        r rVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar2;
        p pVar;
        r rVar2;
        P p3;
        e eVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (interfaceC0319c instanceof o) {
                oVar = (o) interfaceC0319c;
                int i4 = oVar.f10746k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    oVar.f10746k = i4 - Integer.MIN_VALUE;
                    Object obj4 = oVar.f10744i;
                    enumC0326a = EnumC0326a.f4994a;
                    i3 = oVar.f10746k;
                    int i5 = 1;
                    if (i3 != 0) {
                        X0.a.L(obj4);
                        synchronized (this) {
                            try {
                                A2.c[] cVarArr = this.f91a;
                                if (cVarArr == null) {
                                    cVarArr = new r[2];
                                    this.f91a = cVarArr;
                                } else if (this.f92b >= cVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                                    kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
                                    this.f91a = (A2.c[]) copyOf;
                                    cVarArr = (A2.c[]) copyOf;
                                }
                                int i6 = this.f93c;
                                do {
                                    cVar = cVarArr[i6];
                                    if (cVar == null) {
                                        cVar = new r();
                                        cVarArr[i6] = cVar;
                                    }
                                    i6++;
                                    if (i6 >= cVarArr.length) {
                                        i6 = 0;
                                    }
                                    rVar = (r) cVar;
                                    atomicReferenceFieldUpdater = r.f10751a;
                                } while (atomicReferenceFieldUpdater.get(rVar) != null);
                                atomicReferenceFieldUpdater.set(rVar, q.f10749a);
                                this.f93c = i6;
                                this.f92b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        pVar = this;
                        rVar2 = (r) cVar;
                    } else if (i3 == 1) {
                        rVar2 = oVar.f;
                        eVar2 = oVar.f10741e;
                        pVar = oVar.f10740d;
                        X0.a.L(obj4);
                    } else if (i3 == 2) {
                        obj2 = oVar.f10743h;
                        p3 = oVar.f10742g;
                        rVar2 = oVar.f;
                        eVar3 = oVar.f10741e;
                        pVar = oVar.f10740d;
                        X0.a.L(obj4);
                        obj = obj2;
                        rVar2.getClass();
                        v vVar = q.f10749a;
                        andSet = r.f10751a.getAndSet(rVar2, vVar);
                        kotlin.jvm.internal.j.b(andSet);
                        if (andSet == q.f10750b) {
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = oVar.f10743h;
                        p3 = oVar.f10742g;
                        rVar2 = oVar.f;
                        eVar3 = oVar.f10741e;
                        pVar = oVar.f10740d;
                        X0.a.L(obj4);
                        obj = obj5;
                        i5 = 1;
                        obj2 = f10747e.get(pVar);
                        if (p3 != null && !p3.a()) {
                            throw ((Z) p3).y();
                        }
                        obj3 = obj2 != A2.l.f108a ? null : obj2;
                        oVar.f10740d = pVar;
                        oVar.f10741e = eVar3;
                        oVar.f = rVar2;
                        oVar.f10742g = p3;
                        oVar.f10743h = obj2;
                        oVar.f10746k = 2;
                        if (eVar3.a(obj3, oVar) == enumC0326a) {
                            return enumC0326a;
                        }
                        obj = obj2;
                        rVar2.getClass();
                        v vVar2 = q.f10749a;
                        andSet = r.f10751a.getAndSet(rVar2, vVar2);
                        kotlin.jvm.internal.j.b(andSet);
                        if (andSet == q.f10750b) {
                            obj2 = f10747e.get(pVar);
                            if (p3 != null) {
                                throw ((Z) p3).y();
                            }
                            if (obj2 != A2.l.f108a) {
                            }
                            oVar.f10740d = pVar;
                            oVar.f10741e = eVar3;
                            oVar.f = rVar2;
                            oVar.f10742g = p3;
                            oVar.f10743h = obj2;
                            oVar.f10746k = 2;
                            if (eVar3.a(obj3, oVar) == enumC0326a) {
                            }
                            obj = obj2;
                            rVar2.getClass();
                            v vVar22 = q.f10749a;
                            andSet = r.f10751a.getAndSet(rVar2, vVar22);
                            kotlin.jvm.internal.j.b(andSet);
                            if (andSet == q.f10750b) {
                                oVar.f10740d = pVar;
                                oVar.f10741e = eVar3;
                                oVar.f = rVar2;
                                oVar.f10742g = p3;
                                oVar.f10743h = obj;
                                oVar.f10746k = 3;
                                C1227f c1227f = new C1227f(i5, F2.b.y(oVar));
                                c1227f.t();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r.f10751a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(rVar2, vVar22, c1227f);
                                    C0279i c0279i = C0279i.f4852a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(rVar2) != vVar22) {
                                        c1227f.e(c0279i);
                                        break;
                                    }
                                }
                                Object s3 = c1227f.s();
                                if (s3 == EnumC0326a.f4994a) {
                                }
                            }
                        }
                    }
                    g2.h hVar = oVar.f5029b;
                    kotlin.jvm.internal.j.b(hVar);
                    p3 = (P) hVar.k(C1240t.f10525b);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f10747e.get(pVar);
                    if (p3 != null) {
                    }
                    if (obj2 != A2.l.f108a) {
                    }
                    oVar.f10740d = pVar;
                    oVar.f10741e = eVar3;
                    oVar.f = rVar2;
                    oVar.f10742g = p3;
                    oVar.f10743h = obj2;
                    oVar.f10746k = 2;
                    if (eVar3.a(obj3, oVar) == enumC0326a) {
                    }
                    obj = obj2;
                    rVar2.getClass();
                    v vVar222 = q.f10749a;
                    andSet = r.f10751a.getAndSet(rVar2, vVar222);
                    kotlin.jvm.internal.j.b(andSet);
                    if (andSet == q.f10750b) {
                    }
                }
            }
            if (i3 != 0) {
            }
            g2.h hVar2 = oVar.f5029b;
            kotlin.jvm.internal.j.b(hVar2);
            p3 = (P) hVar2.k(C1240t.f10525b);
            eVar3 = eVar2;
            obj = null;
            obj2 = f10747e.get(pVar);
            if (p3 != null) {
            }
            if (obj2 != A2.l.f108a) {
            }
            oVar.f10740d = pVar;
            oVar.f10741e = eVar3;
            oVar.f = rVar2;
            oVar.f10742g = p3;
            oVar.f10743h = obj2;
            oVar.f10746k = 2;
            if (eVar3.a(obj3, oVar) == enumC0326a) {
            }
            obj = obj2;
            rVar2.getClass();
            v vVar2222 = q.f10749a;
            andSet = r.f10751a.getAndSet(rVar2, vVar2222);
            kotlin.jvm.internal.j.b(andSet);
            if (andSet == q.f10750b) {
            }
        } catch (Throwable th2) {
            synchronized (pVar) {
                try {
                    int i7 = pVar.f92b - 1;
                    pVar.f92b = i7;
                    if (i7 == 0) {
                        pVar.f93c = 0;
                    }
                    kotlin.jvm.internal.j.c(rVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    r.f10751a.set(rVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        oVar = new o(this, interfaceC0319c);
        Object obj42 = oVar.f10744i;
        enumC0326a = EnumC0326a.f4994a;
        i3 = oVar.f10746k;
        int i52 = 1;
    }

    @Override // A2.j
    public final d p(g2.h hVar, int i3, int i4) {
        return ((((i3 < 0 || i3 >= 2) && i3 != -2) || i4 != 2) && !((i3 == 0 || i3 == -3) && i4 == 1)) ? new A2.h(this, hVar, i3, i4) : this;
    }
}
