package J0;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3270b1 {

    /* renamed from: J0.b1$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f13140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, Function2 function2) {
            super(2);
            this.f13140b = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C3270b1.a(this.f13140b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1322912246);
        int i12 = (u11.F(function2) ? 4 : 2) | i11;
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            function2.invoke(u11, Integer.valueOf(i12 & 14));
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(i11, function2));
        }
    }
}
