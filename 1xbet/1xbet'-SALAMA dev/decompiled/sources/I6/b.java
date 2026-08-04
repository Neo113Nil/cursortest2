package I6;

import F2.W0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3722a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f3716a;

    @Override // I6.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3722a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        W0 w7 = a.f3716a;
        if (obj2 == w7) {
            W0 w0C = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == w7) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, w7, w0C)) {
                    if (atomicReferenceFieldUpdater.get(this) != w7) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = w0C;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract W0 c(Object obj);
}
