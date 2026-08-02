package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 extends AbstractC0292hn implements InterfaceC0665rr {

    /* JADX INFO: renamed from: l */
    public final Handler f3137l;

    /* JADX INFO: renamed from: m */
    public final boolean f3138m;

    /* JADX INFO: renamed from: n */
    public final ha0 f3139n;

    public ha0(Handler handler, boolean z) {
        this.f3137l = handler;
        this.f3138m = z;
        this.f3139n = z ? this : new ha0(handler, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return ha0Var.f3137l == this.f3137l && ha0Var.f3138m == this.f3138m;
    }

    public final int hashCode() {
        return (this.f3138m ? 1231 : 1237) ^ System.identityHashCode(this.f3137l);
    }

    @Override // p000.AbstractC0292hn
    /* JADX INFO: renamed from: o */
    public final void mo1225o(InterfaceC0180en interfaceC0180en, Runnable runnable) {
        if (this.f3137l.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        ag0 ag0Var = (ag0) interfaceC0180en.mo1466j(wa0.f8474n);
        if (ag0Var != null) {
            ag0Var.mo204e(cancellationException);
        }
        C0960zq c0960zq = AbstractC0815vt.f8261a;
        ExecutorC0701sq.f7187l.mo1225o(interfaceC0180en, runnable);
    }

    @Override // p000.AbstractC0292hn
    /* JADX INFO: renamed from: p */
    public final boolean mo2243p(InterfaceC0180en interfaceC0180en) {
        return (this.f3138m && af0.m187a(Looper.myLooper(), this.f3137l.getLooper())) ? false : true;
    }

    @Override // p000.AbstractC0292hn
    public final String toString() {
        ha0 ha0Var;
        String str;
        C0960zq c0960zq = AbstractC0815vt.f8261a;
        ha0 ha0Var2 = uk0.f7838a;
        if (this == ha0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ha0Var = ha0Var2.f3139n;
            } catch (UnsupportedOperationException unused) {
                ha0Var = null;
            }
            str = this == ha0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f3137l.toString();
        if (!this.f3138m) {
            return string;
        }
        return string + ".immediate";
    }
}
