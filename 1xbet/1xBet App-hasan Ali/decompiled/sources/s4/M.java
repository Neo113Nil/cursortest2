package s4;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4.C2268h;

/* loaded from: classes.dex */
public final class M extends t4.b implements v, InterfaceC2368e, t4.q {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19247p = AtomicReferenceFieldUpdater.newUpdater(M.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: o, reason: collision with root package name */
    public int f19248o;

    public M(Object obj) {
        this._state$volatile = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00de, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00de, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:15:0x007d). Please report as a decompilation issue!!! */
    @Override // s4.InterfaceC2368e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(s4.InterfaceC2369f r17, a4.c r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.M.a(s4.f, a4.c):java.lang.Object");
    }

    @Override // t4.q
    public final InterfaceC2368e b(a4.h hVar, int i, r4.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != r4.a.f19107l) ? C.i(this, hVar, i, aVar) : this;
    }

    @Override // s4.InterfaceC2369f
    public final Object d(Object obj, a4.c cVar) {
        i(obj);
        return W3.o.f6046a;
    }

    @Override // t4.b
    public final t4.d e() {
        return new N();
    }

    @Override // t4.b
    public final t4.d[] f() {
        return new N[2];
    }

    @Override // s4.K
    public final Object getValue() {
        H3.g gVar = t4.c.f19596b;
        Object obj = f19247p.get(this);
        if (obj == gVar) {
            return null;
        }
        return obj;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = t4.c.f19596b;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i;
        t4.d[] dVarArr;
        H3.g gVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19247p;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.l.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.f19248o;
            if ((i5 & 1) != 0) {
                this.f19248o = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.f19248o = i6;
            t4.d[] dVarArr2 = this.f19591k;
            while (true) {
                N[] nArr = (N[]) dVarArr2;
                if (nArr != null) {
                    for (N n5 : nArr) {
                        if (n5 != null) {
                            AtomicReference atomicReference = n5.f19249a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (gVar = C.f19224c)) {
                                    H3.g gVar2 = C.f19223b;
                                    if (obj4 != gVar2) {
                                        while (!atomicReference.compareAndSet(obj4, gVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C2268h) obj4).resumeWith(W3.o.f6046a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, gVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f19248o;
                    if (i == i6) {
                        this.f19248o = i6 + 1;
                        return true;
                    }
                    dVarArr = this.f19591k;
                }
                dVarArr2 = dVarArr;
                i6 = i;
            }
        }
    }
}
