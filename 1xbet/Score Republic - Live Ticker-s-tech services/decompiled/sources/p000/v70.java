package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v70 implements r61 {

    /* JADX INFO: renamed from: a */
    public final C0124d3 f8124a;

    /* JADX INFO: renamed from: b */
    public final ab0 f8125b;

    public v70(C0124d3 c0124d3, ab0 ab0Var) {
        this.f8124a = c0124d3;
        this.f8125b = ab0Var;
    }

    @Override // p000.r61
    public final Iterator iterator() {
        return new u70(this);
    }
}
