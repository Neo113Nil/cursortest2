package androidx.camera.core.impl;

import C.C;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class L0 extends C5090e0 {

    /* renamed from: c, reason: collision with root package name */
    private final E f38134c;

    /* renamed from: d, reason: collision with root package name */
    private final Q0 f38135d;

    public L0(@NonNull E e11, Q0 q02) {
        super(e11);
        this.f38134c = e11;
        this.f38135d = q02;
    }

    @Override // androidx.camera.core.impl.C5090e0, C.InterfaceC2689i
    @NonNull
    public final com.google.common.util.concurrent.m<Void> a(float f7) {
        return !G.p.a(this.f38135d, 0) ? I.k.f(new IllegalStateException("Zoom is not supported")) : this.f38134c.a(f7);
    }

    @Override // androidx.camera.core.impl.C5090e0, C.InterfaceC2689i
    @NonNull
    public final com.google.common.util.concurrent.m<Void> d(float f7) {
        return !G.p.a(this.f38135d, 0) ? I.k.f(new IllegalStateException("Zoom is not supported")) : this.f38134c.d(f7);
    }

    @Override // androidx.camera.core.impl.C5090e0, C.InterfaceC2689i
    @NonNull
    public final com.google.common.util.concurrent.m<Void> e(boolean z11) {
        return !G.p.a(this.f38135d, 6) ? I.k.f(new IllegalStateException("Torch is not supported")) : this.f38134c.e(z11);
    }

    @Override // androidx.camera.core.impl.C5090e0, C.InterfaceC2689i
    @NonNull
    public final com.google.common.util.concurrent.m<C.D> f(@NonNull C.C c11) {
        boolean z11;
        Q0 q02 = this.f38135d;
        if (q02 != null) {
            C.a aVar = new C.a(c11);
            boolean z12 = true;
            if (c11.c().isEmpty() || G.p.a(q02, 1, 2)) {
                z11 = false;
            } else {
                aVar.c(1);
                z11 = true;
            }
            if (!c11.b().isEmpty() && !G.p.a(q02, 3)) {
                aVar.c(2);
                z11 = true;
            }
            if (c11.d().isEmpty() || G.p.a(q02, 4)) {
                z12 = z11;
            } else {
                aVar.c(4);
            }
            if (z12) {
                C.C a11 = aVar.a();
                c11 = (a11.c().isEmpty() && a11.b().isEmpty() && a11.d().isEmpty()) ? null : aVar.a();
            }
        }
        return c11 == null ? I.k.f(new IllegalStateException("FocusMetering is not supported")) : this.f38134c.f(c11);
    }
}
