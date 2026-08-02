package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ve1 extends a40 implements RunnableFuture {

    /* JADX INFO: renamed from: r */
    public volatile ze0 f8186r;

    public ve1(Callable callable) {
        this.f8186r = new ue1(this, callable);
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: b */
    public final void mo549b() {
        ze0 ze0Var;
        if (m2181p() && (ze0Var = this.f8186r) != null) {
            ze0Var.m5888c();
        }
        this.f8186r = null;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: j */
    public final String mo550j() {
        ze0 ze0Var = this.f8186r;
        if (ze0Var == null) {
            return super.mo550j();
        }
        return "task=[" + ze0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        ze0 ze0Var = this.f8186r;
        if (ze0Var != null) {
            ze0Var.run();
        }
        this.f8186r = null;
    }
}
