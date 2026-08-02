package E0;

import D1.AbstractC2810k0;
import D1.C2805i;
import D1.InterfaceC2803h;
import D1.InterfaceC2821v;
import E0.AbstractC2923g0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.InterfaceC5275p1;
import androidx.compose.ui.platform.P1;
import androidx.compose.ui.platform.c2;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2917d0 extends e.c implements InterfaceC5275p1, InterfaceC2803h, InterfaceC2821v, AbstractC2923g0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AbstractC2923g0 f7180a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private B0.O0 f7181b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private I0.W0 f7182c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f7183d;

    public C2917d0(@NotNull AbstractC2923g0 abstractC2923g0, @NotNull B0.O0 o02, @NotNull I0.W0 w02) {
        C3991w0 f7;
        this.f7180a = abstractC2923g0;
        this.f7181b = o02;
        this.f7182c = w02;
        f7 = n1.f(null, D1.f25195a);
        this.f7183d = f7;
    }

    @Override // E0.AbstractC2923g0.a
    @NotNull
    public final B0.O0 E0() {
        return this.f7181b;
    }

    public final P1 I1() {
        return (P1) C2805i.a(this, androidx.compose.ui.platform.K0.o());
    }

    public final void J1(@NotNull B0.O0 o02) {
        this.f7181b = o02;
    }

    public final void K1(@NotNull AbstractC2923g0 abstractC2923g0) {
        if (isAttached()) {
            ((C2910a) this.f7180a).b();
            this.f7180a.l(this);
        }
        this.f7180a = abstractC2923g0;
        if (isAttached()) {
            this.f7180a.j(this);
        }
    }

    public final void L1(@NotNull I0.W0 w02) {
        this.f7182c = w02;
    }

    @Override // E0.AbstractC2923g0.a
    @NotNull
    public final c2 b() {
        return (c2) C2805i.a(this, androidx.compose.ui.platform.K0.r());
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        this.f7180a.j(this);
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f7180a.l(this);
    }

    @Override // E0.AbstractC2923g0.a
    @NotNull
    public final I0.W0 q0() {
        return this.f7182c;
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f7183d.setValue(abstractC2810k0);
    }

    @Override // E0.AbstractC2923g0.a
    public final B1.B v() {
        return (B1.B) this.f7183d.getValue();
    }
}
