package K1;

import P1.AbstractC3809p;
import S0.InterfaceC3967k;
import androidx.compose.ui.platform.K0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class N {
    @NotNull
    public static final M a(InterfaceC3967k interfaceC3967k) {
        AbstractC3809p.a aVar = (AbstractC3809p.a) interfaceC3967k.m(K0.g());
        Z1.d dVar = (Z1.d) interfaceC3967k.m(K0.e());
        Z1.s sVar = (Z1.s) interfaceC3967k.m(K0.k());
        boolean n11 = interfaceC3967k.n(aVar) | interfaceC3967k.n(dVar) | interfaceC3967k.n(sVar) | interfaceC3967k.r(8);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new M(aVar, dVar, sVar, 8);
            interfaceC3967k.x(C11);
        }
        return (M) C11;
    }
}
