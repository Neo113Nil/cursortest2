package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0243m;
import androidx.lifecycle.InterfaceC0249t;
import androidx.lifecycle.InterfaceC0250u;
import androidx.lifecycle.T;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class f implements InterfaceC0249t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f4051b;

    public /* synthetic */ f(l lVar, int i2) {
        this.f4050a = i2;
        this.f4051b = lVar;
    }

    @Override // androidx.lifecycle.InterfaceC0249t
    public final void a(InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m) {
        t tVar;
        switch (this.f4050a) {
            case 0:
                if (enumC0243m == EnumC0243m.ON_DESTROY) {
                    this.f4051b.mContextAwareHelper.f5474b = null;
                    if (!this.f4051b.isChangingConfigurations()) {
                        LinkedHashMap linkedHashMap = this.f4051b.getViewModelStore().f4563a;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((T) it.next()).clear();
                        }
                        linkedHashMap.clear();
                    }
                    k kVar = (k) this.f4051b.mReportFullyDrawnExecutor;
                    l lVar = kVar.f4058d;
                    lVar.getWindow().getDecorView().removeCallbacks(kVar);
                    lVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    break;
                }
                break;
            case 1:
                if (enumC0243m == EnumC0243m.ON_STOP) {
                    Window window = this.f4051b.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 2:
                l lVar2 = this.f4051b;
                lVar2.ensureViewModelStore();
                lVar2.getLifecycle().b(this);
                break;
            default:
                if (enumC0243m == EnumC0243m.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    tVar = this.f4051b.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher invoker = h.a((l) interfaceC0250u);
                    tVar.getClass();
                    kotlin.jvm.internal.i.e(invoker, "invoker");
                    tVar.f4078e = invoker;
                    OnBackInvokedDispatcher onBackInvokedDispatcher = tVar.f4078e;
                    OnBackInvokedCallback onBackInvokedCallback = tVar.f4077d;
                    if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
                        q qVar = q.f4068a;
                        if (tVar.f4079f) {
                            qVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                            tVar.f4079f = false;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
