package O0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import Sc.InterfaceC3999a;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes8.dex */
public final class f extends h {
    private f() {
        throw null;
    }

    @Override // O0.h
    @NotNull
    public final b c(@NotNull t0.q qVar, boolean z11, float f7, @NotNull InterfaceC3978p0 interfaceC3978p0, @NotNull InterfaceC3978p0 interfaceC3978p02, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(331259447);
        ViewGroup b11 = v.b((View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h()));
        boolean n11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(qVar)) || (i11 & 6) == 4) | ((((458752 & i11) ^ 196608) > 131072 && interfaceC3967k.n(this)) || (i11 & 196608) == 131072) | interfaceC3967k.n(b11);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            Object bVar = new b(z11, f7, interfaceC3978p0, interfaceC3978p02, b11);
            interfaceC3967k.x(bVar);
            C11 = bVar;
        }
        b bVar2 = (b) C11;
        interfaceC3967k.k();
        return bVar2;
    }
}
