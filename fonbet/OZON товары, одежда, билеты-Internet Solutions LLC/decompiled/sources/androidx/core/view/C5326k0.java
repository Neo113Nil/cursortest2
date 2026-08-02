package androidx.core.view;

import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5326k0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f42307a;

    C5326k0(View view) {
        this.f42307a = new WeakReference<>(view);
    }

    @NonNull
    public final void a(float f7) {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
    }

    public final void b() {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final long c() {
        View view = this.f42307a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @NonNull
    public final void d(long j11) {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().setDuration(j11);
        }
    }

    @NonNull
    public final void e(BaseInterpolator baseInterpolator) {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().setInterpolator(baseInterpolator);
        }
    }

    @NonNull
    public final void f(InterfaceC5328l0 interfaceC5328l0) {
        View view = this.f42307a.get();
        if (view != null) {
            if (interfaceC5328l0 != null) {
                view.animate().setListener(new C5324j0(interfaceC5328l0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    @NonNull
    public final void g(long j11) {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().setStartDelay(j11);
        }
    }

    @NonNull
    public final void h(InterfaceC5332n0 interfaceC5332n0) {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC5332n0 != null ? new H30.B(view, 1, interfaceC5332n0) : null);
        }
    }

    public final void i() {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public final void j() {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().translationX(0.0f);
        }
    }

    @NonNull
    public final void k(float f7) {
        View view = this.f42307a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
    }
}
