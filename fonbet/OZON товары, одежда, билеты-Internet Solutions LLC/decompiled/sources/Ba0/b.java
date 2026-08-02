package Ba0;

import S0.InterfaceC3967k;
import Xa0.a;
import a1.C4912a;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import ff0.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziThemeKt;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f3348a = new C4912a(false, 688659825, a.f3350b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f3349b = new C4912a(false, -449953896, C0079b.f3351b);

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3350b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                h.a(a.b.f34237b, a0.d(e.f40358c0), null, null, null, null, Xa0.a.a(), interfaceC3967k2, 1572918, 60);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: Ba0.b$b, reason: collision with other inner class name */
    static final class C0079b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0079b f3351b = new C0079b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                OziThemeKt.OziTheme(false, b.f3348a, interfaceC3967k2, 48, 1);
            }
            return Unit.f71690a;
        }
    }
}
