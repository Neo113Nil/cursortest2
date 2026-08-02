package G6;

import D6.B;
import D6.C0130m;
import D6.InterfaceC0118e0;
import F2.W0;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class w extends H6.b implements u, g, H6.j {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3138e = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f3139d;

    public w(Object obj) {
        this._state = obj;
    }

    public final boolean E(Object obj, Object obj2) {
        int i7;
        H6.c[] cVarArr;
        W0 w02;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3138e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !t6.h.a(obj3, obj)) {
                return false;
            }
            if (t6.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f3139d;
            if ((i8 & 1) != 0) {
                this.f3139d = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f3139d = i9;
            H6.c[] cVarArr2 = (H6.c[]) this.f3426c;
            while (true) {
                y[] yVarArr = (y[]) cVarArr2;
                if (yVarArr != null) {
                    for (y yVar : yVarArr) {
                        if (yVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y.f3142a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(yVar);
                                if (obj4 != null && obj4 != (w02 = x.f3141b)) {
                                    W0 w03 = x.f3140a;
                                    if (obj4 != w03) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(yVar, obj4, w03)) {
                                            if (atomicReferenceFieldUpdater2.get(yVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0130m) obj4).resumeWith(C1116i.f13008a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(yVar, obj4, w02)) {
                                        if (atomicReferenceFieldUpdater2.get(yVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f3139d;
                    if (i7 == i9) {
                        this.f3139d = i9 + 1;
                        return true;
                    }
                    cVarArr = (H6.c[]) this.f3426c;
                }
                cVarArr2 = cVarArr;
                i9 = i7;
            }
        }
    }

    @Override // G6.h
    public final Object c(Object obj, InterfaceC1287d interfaceC1287d) {
        if (obj == null) {
            obj = H6.l.f3444a;
        }
        E(null, obj);
        return C1116i.f13008a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014f, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cd, B:18:0x00d5, B:21:0x00dc, B:22:0x00e0, B:26:0x00e3, B:28:0x0104, B:31:0x0117, B:32:0x012f, B:39:0x0143, B:34:0x013a, B:38:0x0140, B:47:0x00e9, B:50:0x00f0, B:58:0x0054, B:60:0x005f, B:61:0x00be), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cd, B:18:0x00d5, B:21:0x00dc, B:22:0x00e0, B:26:0x00e3, B:28:0x0104, B:31:0x0117, B:32:0x012f, B:39:0x0143, B:34:0x013a, B:38:0x0140, B:47:0x00e9, B:50:0x00f0, B:58:0x0054, B:60:0x005f, B:61:0x00be), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0116 -> B:16:0x00cd). Please report as a decompilation issue!!! */
    @Override // G6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(h hVar, InterfaceC1287d interfaceC1287d) {
        v vVar;
        j6.a aVar;
        int i7;
        H6.c cVar;
        y yVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar2;
        w wVar;
        y yVar2;
        InterfaceC0118e0 interfaceC0118e0;
        h hVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (interfaceC1287d instanceof v) {
                vVar = (v) interfaceC1287d;
                int i8 = vVar.f3137y;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    vVar.f3137y = i8 - Integer.MIN_VALUE;
                    Object obj4 = vVar.f3135f;
                    aVar = j6.a.f14642a;
                    i7 = vVar.f3137y;
                    int i9 = 1;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj4);
                        synchronized (this) {
                            try {
                                H6.c[] cVarArr = (H6.c[]) this.f3426c;
                                if (cVarArr == null) {
                                    cVarArr = new y[2];
                                    this.f3426c = cVarArr;
                                } else if (this.f3424a >= cVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                                    t6.h.d(copyOf, "copyOf(this, newSize)");
                                    this.f3426c = (H6.c[]) copyOf;
                                    cVarArr = (H6.c[]) copyOf;
                                }
                                int i10 = this.f3425b;
                                do {
                                    cVar = cVarArr[i10];
                                    if (cVar == null) {
                                        cVar = new y();
                                        cVarArr[i10] = cVar;
                                    }
                                    i10++;
                                    if (i10 >= cVarArr.length) {
                                        i10 = 0;
                                    }
                                    yVar = (y) cVar;
                                    atomicReferenceFieldUpdater = y.f3142a;
                                } while (atomicReferenceFieldUpdater.get(yVar) != null);
                                atomicReferenceFieldUpdater.set(yVar, x.f3140a);
                                this.f3425b = i10;
                                this.f3424a++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        hVar2 = hVar;
                        wVar = this;
                        yVar2 = (y) cVar;
                    } else if (i7 == 1) {
                        yVar2 = vVar.f3132c;
                        hVar2 = vVar.f3131b;
                        wVar = vVar.f3130a;
                        AbstractC0603a.p0(obj4);
                    } else if (i7 == 2) {
                        obj2 = vVar.f3134e;
                        interfaceC0118e0 = vVar.f3133d;
                        yVar2 = vVar.f3132c;
                        hVar3 = vVar.f3131b;
                        wVar = vVar.f3130a;
                        AbstractC0603a.p0(obj4);
                        obj = obj2;
                        yVar2.getClass();
                        W0 w02 = x.f3140a;
                        andSet = y.f3142a.getAndSet(yVar2, w02);
                        t6.h.b(andSet);
                        if (andSet != x.f3141b) {
                        }
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = vVar.f3134e;
                        interfaceC0118e0 = vVar.f3133d;
                        yVar2 = vVar.f3132c;
                        hVar3 = vVar.f3131b;
                        wVar = vVar.f3130a;
                        AbstractC0603a.p0(obj4);
                        obj = obj5;
                        i9 = 1;
                        obj2 = f3138e.get(wVar);
                        if (interfaceC0118e0 != null && !interfaceC0118e0.isActive()) {
                            throw interfaceC0118e0.getCancellationException();
                        }
                        obj3 = obj2 == H6.l.f3444a ? null : obj2;
                        vVar.f3130a = wVar;
                        vVar.f3131b = hVar3;
                        vVar.f3132c = yVar2;
                        vVar.f3133d = interfaceC0118e0;
                        vVar.f3134e = obj2;
                        vVar.f3137y = 2;
                        if (hVar3.c(obj3, vVar) == aVar) {
                            return aVar;
                        }
                        obj = obj2;
                        yVar2.getClass();
                        W0 w022 = x.f3140a;
                        andSet = y.f3142a.getAndSet(yVar2, w022);
                        t6.h.b(andSet);
                        if (andSet != x.f3141b) {
                            obj2 = f3138e.get(wVar);
                            if (interfaceC0118e0 != null) {
                                throw interfaceC0118e0.getCancellationException();
                            }
                            if (obj2 == H6.l.f3444a) {
                            }
                            vVar.f3130a = wVar;
                            vVar.f3131b = hVar3;
                            vVar.f3132c = yVar2;
                            vVar.f3133d = interfaceC0118e0;
                            vVar.f3134e = obj2;
                            vVar.f3137y = 2;
                            if (hVar3.c(obj3, vVar) == aVar) {
                            }
                            obj = obj2;
                            yVar2.getClass();
                            W0 w0222 = x.f3140a;
                            andSet = y.f3142a.getAndSet(yVar2, w0222);
                            t6.h.b(andSet);
                            if (andSet != x.f3141b) {
                                vVar.f3130a = wVar;
                                vVar.f3131b = hVar3;
                                vVar.f3132c = yVar2;
                                vVar.f3133d = interfaceC0118e0;
                                vVar.f3134e = obj;
                                vVar.f3137y = 3;
                                C0130m c0130m = new C0130m(i9, P6.b.v(vVar));
                                c0130m.s();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y.f3142a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(yVar2, w0222, c0130m);
                                    C1116i c1116i = C1116i.f13008a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(yVar2) != w0222) {
                                        c0130m.resumeWith(c1116i);
                                        break;
                                    }
                                }
                                Object r7 = c0130m.r();
                                if (r7 == j6.a.f14642a) {
                                }
                                if (r7 == aVar) {
                                    return aVar;
                                }
                                i9 = 1;
                                obj2 = f3138e.get(wVar);
                                if (interfaceC0118e0 != null) {
                                }
                                if (obj2 == H6.l.f3444a) {
                                }
                                vVar.f3130a = wVar;
                                vVar.f3131b = hVar3;
                                vVar.f3132c = yVar2;
                                vVar.f3133d = interfaceC0118e0;
                                vVar.f3134e = obj2;
                                vVar.f3137y = 2;
                                if (hVar3.c(obj3, vVar) == aVar) {
                                }
                                obj = obj2;
                                yVar2.getClass();
                                W0 w02222 = x.f3140a;
                                andSet = y.f3142a.getAndSet(yVar2, w02222);
                                t6.h.b(andSet);
                                if (andSet != x.f3141b) {
                                }
                            }
                        }
                    }
                    interfaceC0118e0 = (InterfaceC0118e0) vVar.getContext().get(B.f1775b);
                    hVar3 = hVar2;
                    obj = null;
                    obj2 = f3138e.get(wVar);
                    if (interfaceC0118e0 != null) {
                    }
                    if (obj2 == H6.l.f3444a) {
                    }
                    vVar.f3130a = wVar;
                    vVar.f3131b = hVar3;
                    vVar.f3132c = yVar2;
                    vVar.f3133d = interfaceC0118e0;
                    vVar.f3134e = obj2;
                    vVar.f3137y = 2;
                    if (hVar3.c(obj3, vVar) == aVar) {
                    }
                    obj = obj2;
                    yVar2.getClass();
                    W0 w022222 = x.f3140a;
                    andSet = y.f3142a.getAndSet(yVar2, w022222);
                    t6.h.b(andSet);
                    if (andSet != x.f3141b) {
                    }
                }
            }
            if (i7 != 0) {
            }
            interfaceC0118e0 = (InterfaceC0118e0) vVar.getContext().get(B.f1775b);
            hVar3 = hVar2;
            obj = null;
            obj2 = f3138e.get(wVar);
            if (interfaceC0118e0 != null) {
            }
            if (obj2 == H6.l.f3444a) {
            }
            vVar.f3130a = wVar;
            vVar.f3131b = hVar3;
            vVar.f3132c = yVar2;
            vVar.f3133d = interfaceC0118e0;
            vVar.f3134e = obj2;
            vVar.f3137y = 2;
            if (hVar3.c(obj3, vVar) == aVar) {
            }
            obj = obj2;
            yVar2.getClass();
            W0 w0222222 = x.f3140a;
            andSet = y.f3142a.getAndSet(yVar2, w0222222);
            t6.h.b(andSet);
            if (andSet != x.f3141b) {
            }
        } catch (Throwable th2) {
            synchronized (wVar) {
                try {
                    int i11 = wVar.f3424a - 1;
                    wVar.f3424a = i11;
                    if (i11 == 0) {
                        wVar.f3425b = 0;
                    }
                    t6.h.c(yVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    y.f3142a.set(yVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        vVar = new v(this, interfaceC1287d);
        Object obj42 = vVar.f3135f;
        aVar = j6.a.f14642a;
        i7 = vVar.f3137y;
        int i92 = 1;
    }

    @Override // H6.j
    public final g t(InterfaceC1292i interfaceC1292i, int i7, int i8) {
        return ((((i7 < 0 || i7 >= 2) && i7 != -2) || i8 != 2) && !((i7 == 0 || i7 == -3) && i8 == 1)) ? new H6.h(this, interfaceC1292i, i7, i8) : this;
    }
}
