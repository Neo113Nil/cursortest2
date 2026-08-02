package S0;

import Bl0.C2652m;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3996z {

    /* renamed from: S0.z$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H0<?>[] f25595b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f25596c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25597d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(H0<?>[] h0Arr, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11) {
            super(2);
            this.f25595b = h0Arr;
            this.f25596c = function2;
            this.f25597d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            H0<?>[] h0Arr = this.f25595b;
            H0[] h0Arr2 = (H0[]) Arrays.copyOf(h0Arr, h0Arr.length);
            int e11 = C2652m.e(this.f25597d | 1);
            C3996z.b(h0Arr2, this.f25596c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: S0.z$b */
    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H0<?> f25598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f25599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25600d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(H0<?> h02, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11) {
            super(2);
            this.f25598b = h02;
            this.f25599c = function2;
            this.f25600d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f25600d | 1);
            C3996z.a(this.f25598b, this.f25599c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull H0<?> h02, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1350970552);
        u11.T0(h02);
        function2.invoke(u11, Integer.valueOf((i11 >> 3) & 14));
        u11.k0();
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(h02, function2, i11));
        }
    }

    public static final void b(@NotNull H0<?>[] h0Arr, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1390796515);
        u11.U0(h0Arr);
        function2.invoke(u11, Integer.valueOf((i11 >> 3) & 14));
        u11.l0();
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(h0Arr, function2, i11));
        }
    }

    @NotNull
    public static final B1 c(@NotNull Function0 function0) {
        return new B1(function0);
    }
}
