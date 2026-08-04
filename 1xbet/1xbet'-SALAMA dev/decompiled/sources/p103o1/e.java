package p103o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p097n3.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15562i;
    public final AtomicReferenceFieldUpdater j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15563k;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f15560g = atomicReferenceFieldUpdater;
        this.f15561h = atomicReferenceFieldUpdater2;
        this.f15562i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.f15563k = atomicReferenceFieldUpdater5;
    }

    @Override // p097n3.a
    public final void N(h hVar, h hVar2) {
        this.f15561h.lazySet(hVar, hVar2);
    }

    @Override // p097n3.a
    public final void O(h hVar, Thread thread) {
        this.f15560g.lazySet(hVar, thread);
    }

    @Override // p097n3.a
    public final boolean f(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // p097n3.a
    public final boolean g(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15563k;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // p097n3.a
    public final boolean h(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15562i;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
