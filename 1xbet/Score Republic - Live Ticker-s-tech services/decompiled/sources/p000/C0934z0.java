package p000;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0934z0 extends AbstractRunnableC0046b1 {
    @Override // p000.AbstractRunnableC0046b1
    /* JADX INFO: renamed from: q */
    public final Object mo12q(Object obj, Object obj2) {
        InterfaceC0387k8 interfaceC0387k8 = (InterfaceC0387k8) obj;
        ListenableFuture listenableFutureApply = interfaceC0387k8.apply(obj2);
        a90.m126j(listenableFutureApply, interfaceC0387k8, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return listenableFutureApply;
    }

    @Override // p000.AbstractRunnableC0046b1
    /* JADX INFO: renamed from: r */
    public final void mo13r(Object obj) {
        m2179n((ListenableFuture) obj);
    }
}
