package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 extends ze0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f7805l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ ve1 f7806m;

    /* JADX INFO: renamed from: n */
    public final Object f7807n;

    public ue1(ve1 ve1Var, Callable callable) {
        this.f7806m = ve1Var;
        callable.getClass();
        this.f7807n = callable;
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: a */
    public final void mo4914a(Throwable th) {
        int i = this.f7805l;
        ve1 ve1Var = this.f7806m;
        switch (i) {
            case 0:
                ve1Var.m2178m(th);
                break;
            default:
                ve1Var.m2178m(th);
                break;
        }
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: b */
    public final void mo4915b(Object obj) {
        int i = this.f7805l;
        ve1 ve1Var = this.f7806m;
        switch (i) {
            case 0:
                ve1Var.m2179n((ListenableFuture) obj);
                break;
            default:
                ve1Var.m2177l(obj);
                break;
        }
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: d */
    public final boolean mo4916d() {
        int i = this.f7805l;
        ve1 ve1Var = this.f7806m;
        switch (i) {
            case 0:
                break;
        }
        return ve1Var.isDone();
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: e */
    public final Object mo4917e() {
        int i = this.f7805l;
        Object obj = this.f7807n;
        switch (i) {
            case 0:
                InterfaceC0350j8 interfaceC0350j8 = (InterfaceC0350j8) obj;
                ListenableFuture listenableFutureCall = interfaceC0350j8.call();
                a90.m126j(listenableFutureCall, interfaceC0350j8, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
                return listenableFutureCall;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: f */
    public final String mo4918f() {
        switch (this.f7805l) {
            case 0:
                return ((InterfaceC0350j8) this.f7807n).toString();
            default:
                return ((Callable) this.f7807n).toString();
        }
    }

    public ue1(ve1 ve1Var, InterfaceC0350j8 interfaceC0350j8) {
        this.f7806m = ve1Var;
        this.f7807n = interfaceC0350j8;
    }
}
