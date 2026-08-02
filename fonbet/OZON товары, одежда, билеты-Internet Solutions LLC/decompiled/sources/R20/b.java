package R20;

import S0.InterfaceC3967k;
import a1.C4912a;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.DebugMenuButtonKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size.DebugMenuButtonSize;
import u0.E;
import u0.J;
import u0.X;
import u0.Y;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f24502a = new C4912a(false, -1179341458, a.f24504b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f24503b = new C4912a(false, -1555002409, C0484b.f24505b);

    static final class a extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24504b = new a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC10165e item = interfaceC10165e;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                Context context = (Context) interfaceC3967k2.m(AndroidCompositionLocals_androidKt.d());
                androidx.compose.ui.e g10 = T.g(a0.d(androidx.compose.ui.e.f40358c0), T20.a.b(), 16);
                DebugMenuButtonSize debugMenuButtonSize = DebugMenuButtonSize.Size600;
                interfaceC3967k2.o(-1145975017);
                boolean F11 = interfaceC3967k2.F(context);
                Object C11 = interfaceC3967k2.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new R20.a(context);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                DebugMenuButtonKt.DebugMenuButton("Перезагрузка", (Function0) C11, g10, false, null, debugMenuButtonSize, null, interfaceC3967k2, 196998, 88);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: R20.b$b, reason: collision with other inner class name */
    static final class C0484b extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0484b f24505b = new C0484b(3);

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
