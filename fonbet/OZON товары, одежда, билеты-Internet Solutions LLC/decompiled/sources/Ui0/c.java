package Ui0;

import S0.InterfaceC3967k;
import S0.n1;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import oj0.InterfaceC8746a;
import org.jetbrains.annotations.NotNull;
import ui0.C10063b;

/* loaded from: classes3.dex */
public final class c extends Yi0.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f27826b = "Performance Tracker";

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f27827c = "PerformanceTracker.NavBar";

    @Override // Yi0.d
    protected final void b(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(1791808104);
        interfaceC3967k.o(932189391);
        z0.b bVar = (z0.b) interfaceC3967k.m(C10063b.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(d.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        d dVar = (d) a12;
        InterfaceC8746a interfaceC8746a = (InterfaceC8746a) n1.b(dVar.getUiState(), interfaceC3967k).getValue();
        interfaceC3967k.o(-187213353);
        boolean n11 = interfaceC3967k.n(dVar);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new a(dVar);
            interfaceC3967k.x(C11);
        }
        Function1 function1 = (Function1) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-187207467);
        boolean n12 = interfaceC3967k.n(dVar);
        Object C12 = interfaceC3967k.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new b(dVar);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Ii0.b.a(interfaceC8746a, "PerformanceTracker.ResetBadge", function1, (Function1) C12, interfaceC3967k, 48);
        interfaceC3967k.k();
    }

    @Override // Yi0.d
    @NotNull
    protected final String d() {
        return this.f27827c;
    }

    @Override // Yi0.d
    @NotNull
    protected final String e() {
        return this.f27826b;
    }
}
