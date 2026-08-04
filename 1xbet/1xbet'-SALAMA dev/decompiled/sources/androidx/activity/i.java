package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.InterfaceC0724t;

/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f8103b;

    public /* synthetic */ i(o oVar, int i7) {
        this.f8102a = i7;
        this.f8103b = oVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        switch (this.f8102a) {
            case 0:
                if (enumC0718m == EnumC0718m.ON_DESTROY) {
                    ((androidx.fragment.app.A) this.f8103b).mContextAwareHelper.f12500b = null;
                    if (!((androidx.fragment.app.A) this.f8103b).isChangingConfigurations()) {
                        ((androidx.fragment.app.A) this.f8103b).getViewModelStore().a();
                    }
                    n nVar = (n) ((androidx.fragment.app.A) this.f8103b).mReportFullyDrawnExecutor;
                    androidx.fragment.app.A a2 = nVar.f8110d;
                    a2.getWindow().getDecorView().removeCallbacks(nVar);
                    a2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(nVar);
                }
                break;
            case 1:
                if (enumC0718m == EnumC0718m.ON_STOP) {
                    Window window = ((androidx.fragment.app.A) this.f8103b).getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
                break;
            case 2:
                androidx.fragment.app.A a4 = (androidx.fragment.app.A) this.f8103b;
                a4.ensureViewModelStore();
                a4.getLifecycle().b(this);
                break;
            default:
                if (enumC0718m == EnumC0718m.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    A a7 = this.f8103b.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = k.a((o) interfaceC0724t);
                    a7.getClass();
                    t6.h.e(onBackInvokedDispatcherA, "invoker");
                    a7.f8084e = onBackInvokedDispatcherA;
                    a7.b(a7.f8086g);
                    break;
                }
                break;
        }
    }
}
