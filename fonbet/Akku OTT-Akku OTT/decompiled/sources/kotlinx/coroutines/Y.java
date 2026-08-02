package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.internal.C1090g;

/* loaded from: classes5.dex */
public final class Y<T> extends kotlinx.coroutines.internal.t<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public Y() {
        throw null;
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.C0
    public final void l(Object obj) {
        m(obj);
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.C0
    public final void m(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                C1090g.a(C.a(obj), IntrinsicsKt.intercepted(this.d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
