package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0739m;
import androidx.lifecycle.InterfaceC0745t;

/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f8103b;

    public /* synthetic */ i(o oVar, int i7) {
        this.f8102a = i7;
        this.f8103b = oVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m) {
        A a2;
        switch (this.f8102a) {
            case 0:
                if (enumC0739m == EnumC0739m.ON_DESTROY) {
                    ((androidx.fragment.app.A) this.f8103b).mContextAwareHelper.f12494b = null;
                    if (!((androidx.fragment.app.A) this.f8103b).isChangingConfigurations()) {
                        ((androidx.fragment.app.A) this.f8103b).getViewModelStore().a();
                    }
                    n nVar = (n) ((androidx.fragment.app.A) this.f8103b).mReportFullyDrawnExecutor;
                    androidx.fragment.app.A a4 = nVar.f8110d;
                    a4.getWindow().getDecorView().removeCallbacks(nVar);
                    a4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(nVar);
                    break;
                }
                break;
            case 1:
                if (enumC0739m == EnumC0739m.ON_STOP) {
                    Window window = ((androidx.fragment.app.A) this.f8103b).getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 2:
                androidx.fragment.app.A a7 = (androidx.fragment.app.A) this.f8103b;
                a7.ensureViewModelStore();
                a7.getLifecycle().b(this);
                break;
            default:
                if (enumC0739m == EnumC0739m.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    a2 = this.f8103b.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher a8 = k.a((o) interfaceC0745t);
                    a2.getClass();
                    t6.h.e(a8, "invoker");
                    a2.f8084e = a8;
                    a2.b(a2.f8086g);
                    break;
                }
                break;
        }
    }
}
