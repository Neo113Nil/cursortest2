package u4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20101a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new l(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20101a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            int a5 = lVar.a(runnable);
            if (a5 == 0) {
                return true;
            }
            if (a5 == 1) {
                l c5 = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c5) && atomicReferenceFieldUpdater.get(this) == lVar) {
                }
            } else if (a5 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20101a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar.b()) {
                return;
            }
            l c5 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c5) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }

    public final int c() {
        l lVar = (l) f20101a.get(this);
        lVar.getClass();
        long j5 = l.f.get(lVar);
        return (((int) ((j5 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j5))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20101a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            Object d5 = lVar.d();
            if (d5 != l.f20104g) {
                return d5;
            }
            l c5 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c5) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }
}
