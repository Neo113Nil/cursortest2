package z;

import android.os.Build;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1674uy;
import java.util.List;
import n1.InterfaceC2168i;
import n1.h0;
import n1.k0;

/* renamed from: z.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2722x extends AbstractC1674uy implements Runnable, InterfaceC2168i, View.OnAttachStateChangeListener {

    /* renamed from: m, reason: collision with root package name */
    public final C2693Q f21574m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21575n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21576o;

    /* renamed from: p, reason: collision with root package name */
    public k0 f21577p;

    public RunnableC2722x(C2693Q c2693q) {
        super(!c2693q.f21512r ? 1 : 0);
        this.f21574m = c2693q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void a(n1.O o5) {
        this.f21575n = false;
        this.f21576o = false;
        k0 k0Var = this.f21577p;
        if (o5.f18387a.b() != 0 && k0Var != null) {
            C2693Q c2693q = this.f21574m;
            c2693q.getClass();
            h0 h0Var = k0Var.f18442a;
            c2693q.f21511q.f(AbstractC2701c.f(h0Var.i(8)));
            c2693q.f21510p.f(AbstractC2701c.f(h0Var.i(8)));
            C2693Q.a(c2693q, k0Var);
        }
        this.f21577p = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void b(n1.O o5) {
        this.f21575n = true;
        this.f21576o = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final k0 c(k0 k0Var, List list) {
        C2693Q c2693q = this.f21574m;
        C2693Q.a(c2693q, k0Var);
        return c2693q.f21512r ? k0.f18441b : k0Var;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final G.v d(n1.O o5, G.v vVar) {
        this.f21575n = false;
        return vVar;
    }

    @Override // n1.InterfaceC2168i
    public final k0 e(View view, k0 k0Var) {
        this.f21577p = k0Var;
        C2693Q c2693q = this.f21574m;
        c2693q.getClass();
        h0 h0Var = k0Var.f18442a;
        c2693q.f21510p.f(AbstractC2701c.f(h0Var.i(8)));
        if (this.f21575n) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f21576o) {
            c2693q.f21511q.f(AbstractC2701c.f(h0Var.i(8)));
            C2693Q.a(c2693q, k0Var);
        }
        return c2693q.f21512r ? k0.f18441b : k0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21575n) {
            this.f21575n = false;
            this.f21576o = false;
            k0 k0Var = this.f21577p;
            if (k0Var != null) {
                C2693Q c2693q = this.f21574m;
                c2693q.getClass();
                c2693q.f21511q.f(AbstractC2701c.f(k0Var.f18442a.i(8)));
                C2693Q.a(c2693q, k0Var);
                this.f21577p = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
