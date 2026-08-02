package P20;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.E;
import u0.J;
import u0.T;
import u0.X;
import u0.Y;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f21692a = new C4912a(false, 1914433283, C0427a.f21695b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f21693b = new C4912a(false, -586064646, b.f21696b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static C4912a f21694c = new C4912a(false, 1703411771, c.f21697b);

    /* renamed from: P20.a$a, reason: collision with other inner class name */
    static final class C0427a extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0427a f21695b = new C0427a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC10165e item = interfaceC10165e;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                e.a aVar = androidx.compose.ui.e.f40358c0;
                E.a(interfaceC3967k2, T.a(aVar));
                E.a(interfaceC3967k2, a0.f(aVar, 60));
                E.a(interfaceC3967k2, a0.f(aVar, 8));
                J20.t.a(6, interfaceC3967k2, null, "Модули");
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21696b = new b(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC10165e item = interfaceC10165e;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                J20.t.a(6, interfaceC3967k2, null, "Библиотеки");
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f21697b = new c(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC10165e item = interfaceC10165e;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                e.a aVar = androidx.compose.ui.e.f40358c0;
                int i11 = J.f99608a;
                E.a(interfaceC3967k2, X.a(aVar, Y.a(interfaceC3967k2)));
            }
            return Unit.f71690a;
        }
    }
}
