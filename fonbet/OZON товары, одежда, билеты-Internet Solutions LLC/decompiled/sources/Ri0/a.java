package Ri0;

import P0.p2;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9890C;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f25118a = new C4912a(false, -781933583, C0504a.f25121b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f25119b = new C4912a(false, 1380582971, b.f25122b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static C4912a f25120c = new C4912a(false, 427501668, c.f25123b);

    /* renamed from: Ri0.a$a, reason: collision with other inner class name */
    static final class C0504a extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0504a f25121b = new C0504a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9890C Button = interfaceC9890C;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                p2.b("Reset Configs", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 6, 0, 131070);
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f25122b = new b(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9890C Button = interfaceC9890C;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                p2.b("Ok", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 6, 0, 131070);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f25123b = new c(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9890C Button = interfaceC9890C;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                p2.b("Cancel", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 6, 0, 131070);
            }
            return Unit.f71690a;
        }
    }
}
