package O20;

import J20.t;
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
    public static C4912a f19869a = new C4912a(false, -1381132398, C0395a.f19871b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f19870b = new C4912a(false, -2064834935, b.f19872b);

    /* renamed from: O20.a$a, reason: collision with other inner class name */
    static final class C0395a extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0395a f19871b = new C0395a(3);

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
                E.a(interfaceC3967k2, a0.f(aVar, 110));
                E.a(interfaceC3967k2, a0.f(aVar, 8));
                t.a(6, interfaceC3967k2, null, "Строки");
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f19872b = new b(3);

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
