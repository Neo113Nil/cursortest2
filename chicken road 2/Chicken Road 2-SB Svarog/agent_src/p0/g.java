package p0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.C0048e;

/* loaded from: classes.dex */
public final class g extends q0.a implements c, d {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1126f = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public int f1127e;

    public g(Object obj) {
        this._state = obj;
    }

    @Override // p0.d
    public final Object a(Object obj, a0.b bVar) {
        c(obj);
        return W.g.f394a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003b, B:17:0x00ce, B:19:0x00d6, B:22:0x00dd, B:23:0x00e3, B:27:0x00e6, B:29:0x0107, B:31:0x011b, B:32:0x0135, B:38:0x0145, B:34:0x013c, B:37:0x0142, B:47:0x00ec, B:50:0x00f3, B:58:0x0056, B:60:0x0061, B:61:0x00be), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011b A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003b, B:17:0x00ce, B:19:0x00d6, B:22:0x00dd, B:23:0x00e3, B:27:0x00e6, B:29:0x0107, B:31:0x011b, B:32:0x0135, B:38:0x0145, B:34:0x013c, B:37:0x0142, B:47:0x00ec, B:50:0x00f3, B:58:0x0056, B:60:0x0061, B:61:0x00be), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x0119). Please report as a decompilation issue!!! */
    @Override // p0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(p0.d r17, Y.d r18) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.g.b(p0.d, Y.d):java.lang.Object");
    }

    public final void c(Object obj) {
        int i2;
        q0.b[] bVarArr;
        io.flutter.plugin.platform.i iVar;
        if (obj == null) {
            obj = q0.e.f1141a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1126f;
            if (g0.h.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i3 = this.f1127e;
            if ((i3 & 1) != 0) {
                this.f1127e = i3 + 2;
                return;
            }
            int i4 = i3 + 1;
            this.f1127e = i4;
            q0.b[] bVarArr2 = this.f1131b;
            while (true) {
                i[] iVarArr = (i[]) bVarArr2;
                if (iVarArr != null) {
                    for (i iVar2 : iVarArr) {
                        if (iVar2 != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f1130a;
                            while (true) {
                                Object obj2 = atomicReferenceFieldUpdater2.get(iVar2);
                                if (obj2 != null && obj2 != (iVar = h.f1129b)) {
                                    io.flutter.plugin.platform.i iVar3 = h.f1128a;
                                    if (obj2 != iVar3) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(iVar2, obj2, iVar3)) {
                                            if (atomicReferenceFieldUpdater2.get(iVar2) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0048e) obj2).k(W.g.f394a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(iVar2, obj2, iVar)) {
                                        if (atomicReferenceFieldUpdater2.get(iVar2) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f1127e;
                    if (i2 == i4) {
                        this.f1127e = i4 + 1;
                        return;
                    }
                    bVarArr = this.f1131b;
                }
                bVarArr2 = bVarArr;
                i4 = i2;
            }
        }
    }
}
