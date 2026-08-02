package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class da1 extends AbstractC0860x0 implements t10, i70, ba1, u10 {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1597n = AtomicReferenceFieldUpdater.newUpdater(da1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ long f1598o = c62.f1155a.objectFieldOffset(da1.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: m */
    public int f1599m;

    public da1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p000.i70
    /* JADX INFO: renamed from: h */
    public final t10 mo1141h(InterfaceC0180en interfaceC0180en, int i, EnumC0576pc enumC0576pc) {
        return wo1.m5381f(this, interfaceC0180en, i, enumC0576pc);
    }

    @Override // p000.u10
    /* JADX INFO: renamed from: j */
    public final Object mo583j(Object obj, InterfaceC0808vm interfaceC0808vm) {
        if (obj == null) {
            obj = p80.f6019k;
        }
        m1143m0(null, obj);
        return kf1.f4365a;
    }

    /* JADX INFO: renamed from: l0 */
    public final Object m1142l0() {
        g72 g72Var = p80.f6019k;
        f1597n.getClass();
        Object objectVolatile = c62.f1155a.getObjectVolatile(this, f1598o);
        if (objectVolatile == g72Var) {
            return null;
        }
        return objectVolatile;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m1143m0(Object obj, Object obj2) {
        int i;
        ea1[] ea1VarArr;
        g72 g72Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1597n;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !af0.m187a(obj3, obj)) {
                return false;
            }
            if (af0.m187a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f1599m;
            if ((i2 & 1) != 0) {
                this.f1599m = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f1599m = i3;
            ea1[] ea1VarArr2 = (ea1[]) this.f8729l;
            while (true) {
                if (ea1VarArr2 != null) {
                    for (ea1 ea1Var : ea1VarArr2) {
                        if (ea1Var != null) {
                            AtomicReference atomicReference = ea1Var.f2043a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (g72Var = wo1.f8605c)) {
                                    break;
                                }
                                g72 g72Var2 = wo1.f8604b;
                                if (obj4 != g72Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, g72Var2)) {
                                            ((C0136df) obj4).mo476f(kf1.f4365a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, g72Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f1599m;
                    if (i == i3) {
                        this.f1599m = i3 + 1;
                        return true;
                    }
                    ea1VarArr = (ea1[]) this.f8729l;
                }
                ea1VarArr2 = ea1VarArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ce A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:14:0x0039, B:53:0x00c6, B:55:0x00ce, B:58:0x00d5, B:59:0x00db, B:61:0x00de, B:71:0x00ff, B:74:0x010f, B:75:0x012b, B:81:0x013b, B:78:0x0132, B:80:0x0138, B:63:0x00e4, B:67:0x00eb, B:21:0x0052), top: B:111:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00de A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:14:0x0039, B:53:0x00c6, B:55:0x00ce, B:58:0x00d5, B:59:0x00db, B:61:0x00de, B:71:0x00ff, B:74:0x010f, B:75:0x012b, B:81:0x013b, B:78:0x0132, B:80:0x0138, B:63:0x00e4, B:67:0x00eb, B:21:0x0052), top: B:111:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fe A[PHI: r1 r4 r5 r10 r11 r12
      0x00fe: PHI (r1v5 java.lang.Object) = (r1v11 java.lang.Object), (r1v14 java.lang.Object) binds: [B:68:0x00fb, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r4v14 ag0) = (r4v16 ag0), (r4v20 ag0) binds: [B:68:0x00fb, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r5v1 int) = (r5v6 int), (r5v0 int) binds: [B:68:0x00fb, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r10v7 ea1) = (r10v9 ea1), (r10v12 ea1) binds: [B:68:0x00fb, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r11v4 u10) = (r11v6 u10), (r11v8 u10) binds: [B:68:0x00fb, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r12v5 da1) = (r12v7 da1), (r12v10 da1) binds: [B:68:0x00fb, B:21:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x010e -> B:53:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.t10
    /* JADX INFO: renamed from: r */
    public final java.lang.Object mo622r(p000.u10 r18, p000.AbstractC0882xm r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.da1.mo622r(u10, xm):java.lang.Object");
    }
}
