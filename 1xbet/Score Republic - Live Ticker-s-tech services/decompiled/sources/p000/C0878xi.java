package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: xi */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0878xi extends ze0 {

    /* JADX INFO: renamed from: l */
    public final Executor f8963l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0915yi f8964m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f8965n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0915yi f8966o;

    /* JADX INFO: renamed from: p */
    public final Object f8967p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0878xi(C0915yi c0915yi, Callable callable) {
        this(c0915yi, EnumC0113ct.f1449j);
        this.f8965n = 1;
        this.f8966o = c0915yi;
        this.f8967p = callable;
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: a */
    public final void mo4914a(Throwable th) {
        C0915yi c0915yi = this.f8964m;
        c0915yi.f9307w = null;
        if (th instanceof ExecutionException) {
            c0915yi.m2178m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c0915yi.cancel(false);
        } else {
            c0915yi.m2178m(th);
        }
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: b */
    public final void mo4915b(Object obj) {
        this.f8964m.f9307w = null;
        int i = this.f8965n;
        C0915yi c0915yi = this.f8966o;
        switch (i) {
            case 0:
                c0915yi.m2179n((ListenableFuture) obj);
                break;
            default:
                c0915yi.m2177l(obj);
                break;
        }
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: d */
    public final boolean mo4916d() {
        return this.f8964m.isDone();
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: e */
    public final Object mo4917e() {
        int i = this.f8965n;
        Object obj = this.f8967p;
        switch (i) {
            case 0:
                return ((a81) obj).call();
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // p000.ze0
    /* JADX INFO: renamed from: f */
    public final String mo4918f() {
        int i = this.f8965n;
        Object obj = this.f8967p;
        switch (i) {
            case 0:
                return ((a81) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0878xi(C0915yi c0915yi, a81 a81Var, Executor executor) {
        this(c0915yi, executor);
        this.f8965n = 0;
        this.f8966o = c0915yi;
        this.f8967p = a81Var;
    }

    public C0878xi(C0915yi c0915yi, Executor executor) {
        this.f8964m = c0915yi;
        executor.getClass();
        this.f8963l = executor;
    }
}
