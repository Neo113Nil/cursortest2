package Yi0;

import P0.C3752l1;
import S0.InterfaceC3967k;
import androidx.activity.ActivityC5043j;
import androidx.activity.J;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ff0.C6554a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC8142d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class d extends Ze0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<J, InterfaceC8142d, Unit> f35135a = a.f35136b;

    static final class a extends AbstractC7737t implements Function2<J, InterfaceC8142d, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f35136b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(J j11, InterfaceC8142d interfaceC8142d) {
            InterfaceC8142d router = interfaceC8142d;
            Intrinsics.checkNotNullParameter(router, "router");
            router.a();
            return Unit.f71690a;
        }
    }

    @Override // Ze0.a
    public final void a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(480731410);
        InterfaceC8142d interfaceC8142d = (InterfaceC8142d) interfaceC3967k.m(C6554a.a());
        Object m11 = interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        C3752l1.a(null, a1.c.c(574890446, new b(this, m11 instanceof ActivityC5043j ? (ActivityC5043j) m11 : null, interfaceC8142d), interfaceC3967k), null, null, null, 0, 0L, 0L, null, a1.c.c(1941303331, new c(this), interfaceC3967k), interfaceC3967k, 805306416, 509);
        interfaceC3967k.k();
    }

    protected abstract void b(InterfaceC3967k interfaceC3967k);

    @NotNull
    protected Function2<J, InterfaceC8142d, Unit> c() {
        return this.f35135a;
    }

    @NotNull
    protected abstract String d();

    @NotNull
    protected abstract String e();
}
