package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bt0 implements dz0 {

    /* JADX INFO: renamed from: j */
    public final ft0 f977j;

    /* JADX INFO: renamed from: k */
    public final Iterator f978k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f979l;

    /* JADX INFO: renamed from: m */
    public boolean f980m;

    /* JADX INFO: renamed from: n */
    public boolean f981n;

    public bt0(ft0 ft0Var, Iterator it) {
        this.f977j = ft0Var;
        this.f978k = it;
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        this.f979l = true;
    }

    @Override // p000.y71
    public final void clear() {
        this.f980m = true;
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return this.f980m;
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // p000.y71
    public final Object poll() {
        if (this.f980m) {
            return null;
        }
        boolean z = this.f981n;
        Iterator it = this.f978k;
        if (!z) {
            this.f981n = true;
        } else if (!it.hasNext()) {
            this.f980m = true;
            return null;
        }
        Object next = it.next();
        zg1.m5905p(next, "The iterator returned a null value");
        return next;
    }
}
