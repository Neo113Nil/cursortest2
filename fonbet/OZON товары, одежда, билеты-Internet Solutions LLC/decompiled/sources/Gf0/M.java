package Gf0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import h3.C6788a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.d;
import rf0.AbstractC9267a;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class M extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Jf0.b f10142a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<D> f10143b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<D> f10144c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f10145d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final B0<B> f10146e;

    public M(@NotNull Jf0.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f10142a = repository;
        AbstractC9267a.C1424a c1424a = AbstractC9267a.C1424a.f83488c;
        d.b.a aVar = d.b.a.f82081c;
        c1424a.getClass();
        x0<D> a11 = O0.a(new D("", 2, c1424a.a(), Lf0.e.a(c1424a.b()), c1424a.b().a(), kotlin.time.b.h(aVar.a()), kotlin.time.b.h(aVar.b()), false, null));
        this.f10143b = a11;
        this.f10144c = C2399j.b(a11);
        C0 b11 = E0.b(0, 0, null, 7);
        this.f10145d = b11;
        this.f10146e = C2399j.a(b11);
    }

    public static final D e0(M m11) {
        return m11.f10143b.getValue();
    }

    public static final void g0(M m11, D d11) {
        m11.f10143b.setValue(d11);
    }

    @NotNull
    public final B0<B> h0() {
        return this.f10146e;
    }

    @NotNull
    public final M0<D> i0() {
        return this.f10144c;
    }

    public final void j0(@NotNull C intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        x0<D> x0Var = this.f10143b;
        D value = x0Var.getValue();
        if (intent instanceof Q) {
            value = D.a(value, ((Q) intent).a(), 0, null, null, 0, 0L, 0L, !kotlin.text.h.K(r1.a()), null, 126);
        } else if (intent instanceof T) {
            value = D.a(value, null, 0, null, null, ((T) intent).a(), 0L, 0L, false, null, 495);
        } else if (intent instanceof S) {
            value = D.a(value, null, 0, ((S) intent).a(), null, 0, 0L, 0L, false, null, 507);
        } else if (intent instanceof U) {
            value = D.a(value, null, 0, null, ((U) intent).a(), 0, 0L, 0L, false, null, 503);
        } else if (intent instanceof V) {
            value = D.a(value, null, ((V) intent).a(), null, null, 0, 0L, 0L, false, null, 509);
        } else if (intent instanceof W) {
            value = D.a(value, null, 0, null, null, 0, ((W) intent).a(), 0L, false, null, 479);
        } else if (intent instanceof X) {
            value = D.a(value, null, 0, null, null, 0, 0L, ((X) intent).a(), false, null, 447);
        } else if (Intrinsics.d(intent, C3098a.f10162a)) {
            if (value.b()) {
                C6788a a11 = androidx.lifecycle.x0.a(this);
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(a11, He.b.f10879b, null, new K(this, value, null), 2);
                value = D.a(value, null, 0, null, null, 0, 0L, 0L, false, null, 383);
            }
        } else {
            if (!Intrinsics.d(intent, N.f10147a)) {
                throw new Sc.o();
            }
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new L(this, null), 3);
        }
        x0Var.setValue(value);
    }
}
