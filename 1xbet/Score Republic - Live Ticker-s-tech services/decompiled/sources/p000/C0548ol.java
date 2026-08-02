package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ol */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0548ol implements r61 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f5781a;

    public C0548ol(r61 r61Var) {
        this.f5781a = new AtomicReference(r61Var);
    }

    @Override // p000.r61
    public final Iterator iterator() {
        r61 r61Var = (r61) this.f5781a.getAndSet(null);
        if (r61Var != null) {
            return r61Var.iterator();
        }
        C0270h1.m2191g("This sequence can be consumed only once.");
        return null;
    }
}
