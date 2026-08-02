package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n61 extends g61 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AtomicReferenceArray f5308g;

    public n61(long j, n61 n61Var, int i) {
        super(j, n61Var, i);
        this.f5308g = new AtomicReferenceArray(m61.f4987f);
    }

    @Override // p000.g61
    /* JADX INFO: renamed from: k */
    public final int mo643k() {
        return m61.f4987f;
    }

    @Override // p000.g61
    /* JADX INFO: renamed from: l */
    public final void mo644l(int i, InterfaceC0180en interfaceC0180en) {
        this.f5308g.set(i, m61.f4986e);
        m1990m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f2635e + ", hashCode=" + hashCode() + ']';
    }
}
