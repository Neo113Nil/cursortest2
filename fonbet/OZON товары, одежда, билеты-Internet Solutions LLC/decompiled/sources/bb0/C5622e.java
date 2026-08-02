package bb0;

import S0.InterfaceC3967k;
import eb0.C6340a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.ozi.components.cell.addons.OziCellEndScope;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

/* renamed from: bb0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5622e extends AbstractC7737t implements InterfaceC6511n<OziCellEndScope, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6340a f55803b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6340a.C0976a f55804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5622e(C6340a c6340a, C6340a.C0976a c0976a) {
        super(3);
        this.f55803b = c6340a;
        this.f55804c = c0976a;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(OziCellEndScope oziCellEndScope, InterfaceC3967k interfaceC3967k, Integer num) {
        OziCellEndScope OziCell = oziCellEndScope;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(OziCell, "$this$OziCell");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(OziCell) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else if (this.f55803b.d()) {
            OziTheme oziTheme = OziTheme.INSTANCE;
            oziTheme.getIcons();
            interfaceC3967k2.B(-1214787805);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_check, "ic_m_check", interfaceC3967k2, 48);
            interfaceC3967k2.K();
            OziCell.m3078Iconcf5BqRc(OziTestTagsKt.oziResourceIdTestTag(androidx.compose.ui.e.f40358c0, this.f55804c.b(), interfaceC3967k2, 6), uniPainterResource, oziTheme.getColors(interfaceC3967k2, OziTheme.$stable).getActiveGraphicPositivePrimary(), null, interfaceC3967k2, (intValue << 12) & 57344, 8);
        }
        return Unit.f71690a;
    }
}
