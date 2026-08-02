package bb0;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import eb0.f;
import gb0.C6706a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.ozi.components.button.OziButtonKt;
import ru.ozon.uni.ozi.components.button.presets.style.OziButtonStyle;
import ru.ozon.uni.ozi.components.text.presets.OziTextPreset;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

/* loaded from: classes3.dex */
final class p extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb0.f f55822b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f.a f55823c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f55824d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f55825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(eb0.f fVar, f.a aVar, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.f55822b = fVar;
        this.f55823c = aVar;
        this.f55824d = function0;
        this.f55825e = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            d.a g10 = InterfaceC6250b.a.g();
            e.a aVar = androidx.compose.ui.e.f40358c0;
            C5194q a11 = C5193p.a(C5179b.g(), g10, interfaceC3967k2, 48);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c11 = P.c(interfaceC3967k2, a11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            this.f55822b.getClass();
            C6706a.a("Reset Configs", aVar, OziTextPreset.H2.INSTANCE.getTextStyle(), interfaceC3967k2, 48, 0);
            C6706a.a("Все выставленные пользовательские значения будут сброшены\nДля применения изменений потребуется перезапуск приложения", T.j(aVar, 0.0f, 4, 0.0f, 0.0f, 13), null, interfaceC3967k2, 48, 4);
            androidx.compose.ui.e e11 = a0.e(T.j(aVar, 0.0f, 16, 0.0f, 0.0f, 13), 1.0f);
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), interfaceC3967k2, 48);
            int I12 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
            Function0 a14 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a14);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c12 = P.c(interfaceC3967k2, a13, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(c12, I12, interfaceC3967k2, I12);
            }
            F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            this.f55823c.getClass();
            OziButtonKt.OziButton("Ок", this.f55824d, a0.e(OziTestTagsKt.oziResourceIdTestTag(aVar, "HostConfig.ResetConfigs.Dialog.PositiveButton", interfaceC3967k2, 6), 1.0f), null, null, false, null, OziButtonStyle.ActionPrimary.INSTANCE, null, null, interfaceC3967k2, 12582912, 888);
            OziButtonKt.OziButton("Отменить", this.f55825e, a0.e(T.j(OziTestTagsKt.oziResourceIdTestTag(aVar, "HostConfig.ResetConfigs.Dialog.NegativeButton", interfaceC3967k2, 6), 0.0f, 8, 0.0f, 0.0f, 13), 1.0f), null, null, false, null, OziButtonStyle.NegativeSecondary.INSTANCE, null, null, interfaceC3967k2, 12582912, 888);
            interfaceC3967k2.f();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
