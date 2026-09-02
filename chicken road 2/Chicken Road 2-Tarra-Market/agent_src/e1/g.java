package e1;

import a.AbstractC0009a;
import b1.C0017e;
import b1.C0029q;
import b1.J;
import b1.S;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class g extends f1.a implements c, d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f997e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f998d;

    public g(Object obj) {
        this._state = obj;
    }

    @Override // e1.d
    public final Object a(Object obj, O0.b bVar) {
        c(obj);
        return K0.i.f206a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003b, B:16:0x00ce, B:18:0x00d6, B:21:0x00dd, B:22:0x00e3, B:26:0x00e6, B:28:0x0107, B:31:0x011a, B:32:0x0132, B:39:0x0146, B:34:0x013d, B:38:0x0143, B:47:0x00ec, B:50:0x00f3, B:58:0x0056, B:60:0x0061, B:61:0x00be), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003b, B:16:0x00ce, B:18:0x00d6, B:21:0x00dd, B:22:0x00e3, B:26:0x00e6, B:28:0x0107, B:31:0x011a, B:32:0x0132, B:39:0x0146, B:34:0x013d, B:38:0x0143, B:47:0x00ec, B:50:0x00f3, B:58:0x0056, B:60:0x0061, B:61:0x00be), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0119 -> B:16:0x00ce). Please report as a decompilation issue!!! */
    @Override // e1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d dVar, M0.d dVar2) {
        f fVar;
        N0.a aVar;
        int i2;
        f1.b bVar;
        i iVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d dVar3;
        g gVar;
        i iVar2;
        J j2;
        d dVar4;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (dVar2 instanceof f) {
                fVar = (f) dVar2;
                int i3 = fVar.f996k;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f996k = i3 - Integer.MIN_VALUE;
                    Object obj4 = fVar.f994i;
                    aVar = N0.a.f260a;
                    i2 = fVar.f996k;
                    int i4 = 1;
                    if (i2 != 0) {
                        V.a.C(obj4);
                        synchronized (this) {
                            try {
                                f1.b[] bVarArr = this.f1039a;
                                if (bVarArr == null) {
                                    bVarArr = new i[2];
                                    this.f1039a = bVarArr;
                                } else if (this.f1040b >= bVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length * 2);
                                    j.d(copyOf, "copyOf(this, newSize)");
                                    this.f1039a = (f1.b[]) copyOf;
                                    bVarArr = (f1.b[]) copyOf;
                                }
                                int i5 = this.f1041c;
                                do {
                                    bVar = bVarArr[i5];
                                    if (bVar == null) {
                                        bVar = new i();
                                        bVarArr[i5] = bVar;
                                    }
                                    i5++;
                                    if (i5 >= bVarArr.length) {
                                        i5 = 0;
                                    }
                                    iVar = (i) bVar;
                                    atomicReferenceFieldUpdater = i.f1001a;
                                } while (atomicReferenceFieldUpdater.get(iVar) != null);
                                atomicReferenceFieldUpdater.set(iVar, h.f999a);
                                this.f1041c = i5;
                                this.f1040b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        dVar3 = dVar;
                        gVar = this;
                        iVar2 = (i) bVar;
                    } else if (i2 == 1) {
                        iVar2 = fVar.f991f;
                        dVar3 = fVar.f990e;
                        gVar = fVar.f989d;
                        V.a.C(obj4);
                    } else if (i2 == 2) {
                        obj2 = fVar.f993h;
                        j2 = fVar.f992g;
                        iVar2 = fVar.f991f;
                        dVar4 = fVar.f990e;
                        gVar = fVar.f989d;
                        V.a.C(obj4);
                        obj = obj2;
                        iVar2.getClass();
                        C0.a aVar2 = h.f999a;
                        andSet = i.f1001a.getAndSet(iVar2, aVar2);
                        j.b(andSet);
                        if (andSet != h.f1000b) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = fVar.f993h;
                        j2 = fVar.f992g;
                        iVar2 = fVar.f991f;
                        dVar4 = fVar.f990e;
                        gVar = fVar.f989d;
                        V.a.C(obj4);
                        obj = obj5;
                        i4 = 1;
                        obj2 = f997e.get(gVar);
                        if (j2 != null && !j2.b()) {
                            throw ((S) j2).u();
                        }
                        obj3 = obj2 == f1.e.f1049a ? null : obj2;
                        fVar.f989d = gVar;
                        fVar.f990e = dVar4;
                        fVar.f991f = iVar2;
                        fVar.f992g = j2;
                        fVar.f993h = obj2;
                        fVar.f996k = 2;
                        if (dVar4.a(obj3, fVar) == aVar) {
                            return aVar;
                        }
                        obj = obj2;
                        iVar2.getClass();
                        C0.a aVar22 = h.f999a;
                        andSet = i.f1001a.getAndSet(iVar2, aVar22);
                        j.b(andSet);
                        if (andSet != h.f1000b) {
                            obj2 = f997e.get(gVar);
                            if (j2 != null) {
                                throw ((S) j2).u();
                            }
                            if (obj2 == f1.e.f1049a) {
                            }
                            fVar.f989d = gVar;
                            fVar.f990e = dVar4;
                            fVar.f991f = iVar2;
                            fVar.f992g = j2;
                            fVar.f993h = obj2;
                            fVar.f996k = 2;
                            if (dVar4.a(obj3, fVar) == aVar) {
                            }
                            obj = obj2;
                            iVar2.getClass();
                            C0.a aVar222 = h.f999a;
                            andSet = i.f1001a.getAndSet(iVar2, aVar222);
                            j.b(andSet);
                            if (andSet != h.f1000b) {
                                fVar.f989d = gVar;
                                fVar.f990e = dVar4;
                                fVar.f991f = iVar2;
                                fVar.f992g = j2;
                                fVar.f993h = obj;
                                fVar.f996k = 3;
                                C0017e c0017e = new C0017e(AbstractC0009a.r(fVar), i4);
                                c0017e.p();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f1001a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(iVar2, aVar222, c0017e);
                                    K0.i iVar3 = K0.i.f206a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(iVar2) != aVar222) {
                                        c0017e.f(iVar3);
                                        break;
                                    }
                                }
                                Object o2 = c0017e.o();
                                if (o2 == N0.a.f260a) {
                                }
                                if (o2 == aVar) {
                                    return aVar;
                                }
                                i4 = 1;
                                obj2 = f997e.get(gVar);
                                if (j2 != null) {
                                }
                                if (obj2 == f1.e.f1049a) {
                                }
                                fVar.f989d = gVar;
                                fVar.f990e = dVar4;
                                fVar.f991f = iVar2;
                                fVar.f992g = j2;
                                fVar.f993h = obj2;
                                fVar.f996k = 2;
                                if (dVar4.a(obj3, fVar) == aVar) {
                                }
                                obj = obj2;
                                iVar2.getClass();
                                C0.a aVar2222 = h.f999a;
                                andSet = i.f1001a.getAndSet(iVar2, aVar2222);
                                j.b(andSet);
                                if (andSet != h.f1000b) {
                                }
                            }
                        }
                    }
                    M0.i iVar4 = fVar.f277b;
                    j.b(iVar4);
                    j2 = (J) iVar4.i(C0029q.f679b);
                    dVar4 = dVar3;
                    obj = null;
                    obj2 = f997e.get(gVar);
                    if (j2 != null) {
                    }
                    if (obj2 == f1.e.f1049a) {
                    }
                    fVar.f989d = gVar;
                    fVar.f990e = dVar4;
                    fVar.f991f = iVar2;
                    fVar.f992g = j2;
                    fVar.f993h = obj2;
                    fVar.f996k = 2;
                    if (dVar4.a(obj3, fVar) == aVar) {
                    }
                    obj = obj2;
                    iVar2.getClass();
                    C0.a aVar22222 = h.f999a;
                    andSet = i.f1001a.getAndSet(iVar2, aVar22222);
                    j.b(andSet);
                    if (andSet != h.f1000b) {
                    }
                }
            }
            if (i2 != 0) {
            }
            M0.i iVar42 = fVar.f277b;
            j.b(iVar42);
            j2 = (J) iVar42.i(C0029q.f679b);
            dVar4 = dVar3;
            obj = null;
            obj2 = f997e.get(gVar);
            if (j2 != null) {
            }
            if (obj2 == f1.e.f1049a) {
            }
            fVar.f989d = gVar;
            fVar.f990e = dVar4;
            fVar.f991f = iVar2;
            fVar.f992g = j2;
            fVar.f993h = obj2;
            fVar.f996k = 2;
            if (dVar4.a(obj3, fVar) == aVar) {
            }
            obj = obj2;
            iVar2.getClass();
            C0.a aVar222222 = h.f999a;
            andSet = i.f1001a.getAndSet(iVar2, aVar222222);
            j.b(andSet);
            if (andSet != h.f1000b) {
            }
        } catch (Throwable th2) {
            synchronized (gVar) {
                try {
                    int i6 = gVar.f1040b - 1;
                    gVar.f1040b = i6;
                    if (i6 == 0) {
                        gVar.f1041c = 0;
                    }
                    j.c(iVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    i.f1001a.set(iVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        fVar = new f(this, (O0.b) dVar2);
        Object obj42 = fVar.f994i;
        aVar = N0.a.f260a;
        i2 = fVar.f996k;
        int i42 = 1;
    }

    public final void c(Object obj) {
        int i2;
        f1.b[] bVarArr;
        C0.a aVar;
        if (obj == null) {
            obj = f1.e.f1049a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f997e;
            if (j.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i3 = this.f998d;
            if ((i3 & 1) != 0) {
                this.f998d = i3 + 2;
                return;
            }
            int i4 = i3 + 1;
            this.f998d = i4;
            f1.b[] bVarArr2 = this.f1039a;
            while (true) {
                i[] iVarArr = (i[]) bVarArr2;
                if (iVarArr != null) {
                    for (i iVar : iVarArr) {
                        if (iVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f1001a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(iVar);
                                if (obj2 != null && obj2 != (aVar = h.f1000b)) {
                                    C0.a aVar2 = h.f999a;
                                    if (obj2 != aVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(iVar, obj2, aVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(iVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0017e) obj2).f(K0.i.f206a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(iVar, obj2, aVar)) {
                                        if (atomicReferenceFieldUpdater2.get(iVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f998d;
                    if (i2 == i4) {
                        this.f998d = i4 + 1;
                        return;
                    }
                    bVarArr = this.f1039a;
                }
                bVarArr2 = bVarArr;
                i4 = i2;
            }
        }
    }
}
