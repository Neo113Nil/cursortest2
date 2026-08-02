package M20;

import B4.b0;
import D4.C2848x;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"LM20/l;", "Landroidx/fragment/app/m;", "<init>", "()V", "LP20/e;", "state", "LO20/k;", "LN20/e;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends ComponentCallbacksC5392m {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                l.t(l.this, interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    public static final void t(l lVar, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1485088172);
        if ((i11 & 1) == 0 && u11.b()) {
            u11.j();
        } else {
            y20.f.b(false, a1.c.c(-598639495, new j(C2848x.b(new b0[0], u11)), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new k(lVar, i11));
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.a(new C4912a(true, 1911955845, new a()));
        return composeView;
    }
}
