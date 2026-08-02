package I6;

import F2.W0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3722a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f3716a;

    @Override // I6.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3722a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        W0 w02 = a.f3716a;
        if (obj2 == w02) {
            W0 c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == w02) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, w02, c3)) {
                        obj2 = c3;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != w02) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract W0 c(Object obj);
}
