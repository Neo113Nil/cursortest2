package G6;

import D6.C0130m;
import F2.W0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends H6.b implements u, g, H6.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3138e = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3139d;

    public w(Object obj) {
        this._state = obj;
    }

    public final boolean E(Object obj, Object obj2) {
        int i7;
        H6.c[] cVarArr;
        W0 w7;
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
                                if (obj4 == null || obj4 == (w7 = x.f3141b)) {
                                    break;
                                }
                                W0 w8 = x.f3140a;
                                if (obj4 != w8) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(yVar, obj4, w8)) {
                                            ((C0130m) obj4).resumeWith(p044f6.i.f13014a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(yVar) == obj4);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(yVar, obj4, w7)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(yVar) == obj4);
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
    public final Object c(Object obj, p065i6.d dVar) {
        if (obj == null) {
            obj = H6.l.f3444a;
        }
        E(null, obj);
        return p044f6.i.f13014a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d5 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00cd, B:52:0x00d5, B:55:0x00dc, B:56:0x00e0, B:58:0x00e3, B:68:0x0104, B:71:0x0117, B:72:0x012f, B:78:0x0143, B:75:0x013a, B:77:0x0140, B:60:0x00e9, B:64:0x00f0, B:21:0x0054, B:24:0x005f, B:49:0x00be), top: B:102:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00cd, B:52:0x00d5, B:55:0x00dc, B:56:0x00e0, B:58:0x00e3, B:68:0x0104, B:71:0x0117, B:72:0x012f, B:78:0x0143, B:75:0x013a, B:77:0x0140, B:60:0x00e9, B:64:0x00f0, B:21:0x0054, B:24:0x005f, B:49:0x00be), top: B:102:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0116 -> B:50:0x00cd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // G6.g
    public final java.lang.Object r(G6.h r18, p065i6.d r19) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.w.r(G6.h, i6.d):java.lang.Object");
    }

    @Override // H6.j
    public final g t(p065i6.i iVar, int i7, int i8) {
        return ((((i7 < 0 || i7 >= 2) && i7 != -2) || i8 != 2) && !((i7 == 0 || i7 == -3) && i8 == 1)) ? new H6.h(this, iVar, i7, i8) : this;
    }
}
