package E2;

import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.InterfaceC0477f;
import androidx.lifecycle.InterfaceC0490t;
import androidx.lifecycle.L;

/* loaded from: classes.dex */
public final class g extends L {

    /* renamed from: e, reason: collision with root package name */
    public static final g f1421e = new g();
    public static final f f = new f();

    @Override // androidx.lifecycle.L
    public final void a(InterfaceC0490t interfaceC0490t) {
        if (!(interfaceC0490t instanceof InterfaceC0477f)) {
            throw new IllegalArgumentException((interfaceC0490t + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC0477f interfaceC0477f = (InterfaceC0477f) interfaceC0490t;
        f fVar = f;
        interfaceC0477f.f(fVar);
        interfaceC0477f.k(fVar);
        interfaceC0477f.b(fVar);
    }

    @Override // androidx.lifecycle.L
    public final EnumC0487p h() {
        return EnumC0487p.f7062o;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.L
    public final void k(InterfaceC0490t interfaceC0490t) {
    }
}
