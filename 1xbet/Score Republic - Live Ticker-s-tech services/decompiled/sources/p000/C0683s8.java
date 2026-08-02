package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0683s8 implements lu0 {

    /* JADX INFO: renamed from: j */
    public long f7047j;

    /* JADX INFO: renamed from: k */
    public final Object f7048k;

    public C0683s8(wa0 wa0Var) {
        p80.m3863h(wa0Var);
        this.f7048k = wa0Var;
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo309e(Exception exc) {
        oq0 oq0Var = (oq0) this.f7048k;
        ((AtomicLong) oq0Var.f5842m).set(this.f7047j);
    }

    public /* synthetic */ C0683s8(Object obj, long j) {
        this.f7048k = obj;
        this.f7047j = j;
    }
}
