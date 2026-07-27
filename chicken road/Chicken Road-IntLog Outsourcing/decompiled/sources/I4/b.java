package I4;

import G0.C0051a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1286a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f1280a;

    @Override // I4.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1286a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C0051a c0051a = a.f1280a;
        if (obj2 == c0051a) {
            C0051a c2 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == c0051a) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c0051a, c2)) {
                        obj2 = c2;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c0051a) {
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

    public abstract C0051a c(Object obj);
}
