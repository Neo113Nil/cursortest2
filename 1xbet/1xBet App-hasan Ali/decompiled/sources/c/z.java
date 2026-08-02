package c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;

/* loaded from: classes.dex */
public final class z implements InterfaceC0489s {

    /* renamed from: l, reason: collision with root package name */
    public static final W3.m f7374l = G4.d.E(new B1.h(12));

    /* renamed from: k, reason: collision with root package name */
    public final AbstractActivityC0531j f7375k;

    public z(AbstractActivityC0531j abstractActivityC0531j) {
        this.f7375k = abstractActivityC0531j;
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        if (enumC0486o != EnumC0486o.ON_DESTROY) {
            return;
        }
        Object systemService = this.f7375k.getSystemService("input_method");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager", systemService);
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        w wVar = (w) f7374l.getValue();
        Object b3 = wVar.b(inputMethodManager);
        if (b3 == null) {
            return;
        }
        synchronized (b3) {
            View c5 = wVar.c(inputMethodManager);
            if (c5 == null) {
                return;
            }
            if (c5.isAttachedToWindow()) {
                return;
            }
            boolean a5 = wVar.a(inputMethodManager);
            if (a5) {
                inputMethodManager.isActive();
            }
        }
    }
}
