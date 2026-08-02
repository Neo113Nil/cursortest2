package De;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class p<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6641a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new q(8, false);

    public final boolean a(@NotNull Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6641a;
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            int a11 = qVar.a(runnable);
            if (a11 == 0) {
                return true;
            }
            if (a11 == 1) {
                q<E> e11 = qVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, e11) && atomicReferenceFieldUpdater.get(this) == qVar) {
                }
            } else if (a11 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6641a;
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar.b()) {
                return;
            } else {
                AZ.c.d(atomicReferenceFieldUpdater, this, qVar, qVar.e());
            }
        }
    }

    public final int c() {
        return ((q) f6641a.get(this)).c();
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6641a;
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            E e11 = (E) qVar.f();
            if (e11 != q.f6644g) {
                return e11;
            }
            q<E> e12 = qVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, e12) && atomicReferenceFieldUpdater.get(this) == qVar) {
            }
        }
    }
}
