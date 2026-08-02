package P;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5049a;

    public b0(View view) {
        this.f5049a = new WeakReference(view);
    }

    public final void a(float f7) {
        View view = (View) this.f5049a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
    }

    public final void b() {
        View view = (View) this.f5049a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f5049a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(c0 c0Var) {
        View view = (View) this.f5049a.get();
        if (view != null) {
            if (c0Var != null) {
                view.animate().setListener(new O0.j(c0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f7) {
        View view = (View) this.f5049a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
    }
}
