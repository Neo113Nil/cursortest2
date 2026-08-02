package p000;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: i */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0305i extends AbstractRunnableC0378k {
    @Override // p000.AbstractRunnableC0378k
    /* JADX INFO: renamed from: q */
    public final Object mo2355q(Object obj, Throwable th) {
        InterfaceC0387k8 interfaceC0387k8 = (InterfaceC0387k8) obj;
        ListenableFuture listenableFutureApply = interfaceC0387k8.apply(th);
        a90.m126j(listenableFutureApply, interfaceC0387k8, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return listenableFutureApply;
    }

    @Override // p000.AbstractRunnableC0378k
    /* JADX INFO: renamed from: r */
    public final void mo2356r(Object obj) {
        m2179n((ListenableFuture) obj);
    }
}
