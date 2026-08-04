package W5;

import C0.RunnableC0085d;
import U5.AbstractC0457y;
import com.google.protobuf.AbstractC0847a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends AbstractC0457y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f6819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f6820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f6821c = new ArrayList();

    public I(AbstractC0457y abstractC0457y) {
        this.f6819a = abstractC0457y;
    }

    @Override // U5.AbstractC0457y
    public final void g(U5.l0 l0Var, U5.b0 b0Var) {
        q(new H2.q(8, this, l0Var, b0Var, false));
    }

    @Override // U5.AbstractC0457y
    public final void h(U5.b0 b0Var) {
        if (this.f6820b) {
            this.f6819a.h(b0Var);
        } else {
            q(new E(3, this, b0Var));
        }
    }

    @Override // U5.AbstractC0457y
    public final void i(AbstractC0847a abstractC0847a) {
        if (this.f6820b) {
            this.f6819a.i(abstractC0847a);
        } else {
            q(new E(4, this, abstractC0847a));
        }
    }

    @Override // U5.AbstractC0457y
    public final void j() {
        if (this.f6820b) {
            this.f6819a.j();
        } else {
            q(new RunnableC0085d(this, 14));
        }
    }

    public final void q(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f6820b) {
                    runnable.run();
                } else {
                    this.f6821c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
