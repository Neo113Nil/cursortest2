package Mi0;

import P0.E;
import P0.p2;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9890C;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f18087a = new C4912a(false, 428781190, C0351a.f18089b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f18088b = new C4912a(false, -1039545944, b.f18090b);

    /* renamed from: Mi0.a$a, reason: collision with other inner class name */
    static final class C0351a extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0351a f18089b = new C0351a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9890C Button = interfaceC9890C;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                p2.b("Dispatch Events", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 6, 0, 131070);
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f18090b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                E.b(K0.c.a(), null, null, 0L, interfaceC3967k2, 48, 12);
            }
            return Unit.f71690a;
        }
    }
}
