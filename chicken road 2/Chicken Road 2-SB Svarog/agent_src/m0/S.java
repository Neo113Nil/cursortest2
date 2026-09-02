package m0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r0.AbstractC0088a;

/* loaded from: classes.dex */
public final class S extends r0.b {

    /* renamed from: b, reason: collision with root package name */
    public final O f908b;

    /* renamed from: c, reason: collision with root package name */
    public U f909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f911e;

    public S(O o2, T t2, Object obj) {
        this.f910d = t2;
        this.f911e = obj;
        this.f908b = o2;
    }

    @Override // r0.b
    public final void b(Object obj, Object obj2) {
        r0.l lVar = (r0.l) obj;
        boolean z2 = obj2 == null;
        r0.l lVar2 = this.f908b;
        r0.l lVar3 = z2 ? lVar2 : this.f909c;
        if (lVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.l.f1181b;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, lVar3)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z2) {
                r0.l lVar4 = this.f909c;
                g0.h.b(lVar4);
                lVar2.j(lVar4);
            }
        }
    }

    @Override // r0.b
    public final io.flutter.plugin.platform.i c(Object obj) {
        if (this.f910d.y() == this.f911e) {
            return null;
        }
        return AbstractC0088a.f1159e;
    }
}
