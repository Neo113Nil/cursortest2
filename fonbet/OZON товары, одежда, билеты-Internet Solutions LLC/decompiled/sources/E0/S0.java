package E0;

import android.view.DragEvent;
import h1.C6769b;
import h1.InterfaceC6776i;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p0.AbstractC8823a;
import p0.C8824b;

/* loaded from: classes8.dex */
public final class S0 implements InterfaceC6776i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<C6769b, Unit> f7079a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<androidx.compose.ui.platform.G0, androidx.compose.ui.platform.H0, Boolean> f7080b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<C6769b, Unit> f7081c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<C7459e, Unit> f7082d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<C6769b, Unit> f7083e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<C6769b, Unit> f7084f;

    S0(Function1 function1, Function2 function2, Function1 function12, Function1 function13, Function1 function14, Function1 function15) {
        this.f7079a = function1;
        this.f7080b = function2;
        this.f7081c = function12;
        this.f7082d = function13;
        this.f7083e = function14;
        this.f7084f = function15;
    }

    @Override // h1.InterfaceC6776i
    public final boolean A1(@NotNull C6769b c6769b) {
        String str;
        ((I0) this.f7079a).invoke(c6769b);
        androidx.compose.ui.platform.G0 g02 = new androidx.compose.ui.platform.G0(c6769b.a().getClipData());
        c6769b.a().getClipDescription();
        F0 f02 = ((H0) this.f7080b).f7035b;
        F0.N1(f02);
        f02.e2().A();
        int itemCount = g02.a().getItemCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < itemCount; i11++) {
            z11 = z11 || g02.a().getItemAt(i11).getText() != null;
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder();
            int itemCount2 = g02.a().getItemCount();
            boolean z12 = false;
            for (int i12 = 0; i12 < itemCount2; i12++) {
                CharSequence text = g02.a().getItemAt(i12).getText();
                if (text != null) {
                    if (z12) {
                        sb2.append("\n");
                    }
                    sb2.append(text);
                    z12 = true;
                }
            }
            str = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        } else {
            str = null;
        }
        AbstractC8823a a11 = C8824b.a(f02);
        if (a11 != null) {
            a11.a();
            throw null;
        }
        if (str == null) {
            return true;
        }
        c1.q(f02.f2(), str, null, 6);
        return true;
    }

    @Override // h1.InterfaceC6776i
    public final void Q0(@NotNull C6769b c6769b) {
        ((L0) this.f7083e).invoke(c6769b);
        Unit unit = Unit.f71690a;
    }

    @Override // h1.InterfaceC6776i
    public final void a1(@NotNull C6769b c6769b) {
        ((J0) this.f7081c).invoke(c6769b);
        Unit unit = Unit.f71690a;
    }

    @Override // h1.InterfaceC6776i
    public final void h1(@NotNull C6769b c6769b) {
        DragEvent a11 = c6769b.a();
        ((K0) this.f7082d).invoke(C7459e.a(P9.a.a(a11.getX(), a11.getY())));
        Unit unit = Unit.f71690a;
    }

    @Override // h1.InterfaceC6776i
    public final void i1(@NotNull C6769b c6769b) {
        ((M0) this.f7084f).invoke(c6769b);
        Unit unit = Unit.f71690a;
    }

    @Override // h1.InterfaceC6776i
    public final void x0(@NotNull C6769b c6769b) {
    }
}
