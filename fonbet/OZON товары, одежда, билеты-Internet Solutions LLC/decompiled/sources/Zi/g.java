package Zi;

import Si.InterfaceC4010a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

/* loaded from: classes10.dex */
public final class g extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ii.f f36002a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC4010a, Integer, Unit> f36003b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4010a.f f36004c;

    /* synthetic */ class a extends C7735q implements Function1<AtomAction, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction p02 = atomAction;
            Intrinsics.checkNotNullParameter(p02, "p0");
            g.e((g) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Ii.f binding, @NotNull Function2<? super InterfaceC4010a, ? super Integer, Unit> onClick) {
        super(binding.a());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f36002a = binding;
        this.f36003b = onClick;
    }

    public static final void e(g gVar, AtomAction atomAction) {
        InterfaceC4010a.f fVar;
        gVar.getClass();
        if ((atomAction instanceof AtomAction.ViewAction) || !Intrinsics.d(atomAction.getId(), "BADGE_ACTION_ID") || (fVar = gVar.f36004c) == null) {
            return;
        }
        gVar.f36003b.invoke(fVar, Integer.valueOf(gVar.getAdapterPosition()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(@NotNull InterfaceC4010a.f item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f36004c = item;
        Ii.f fVar = this.f36002a;
        CellView permissionWarning = fVar.f12575b;
        Intrinsics.checkNotNullExpressionValue(permissionWarning, "permissionWarning");
        String message = fVar.a().getContext().getString(item.e());
        Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
        String badgeText = fVar.a().getContext().getString(R.string.gallery_change_title);
        Intrinsics.checkNotNullExpressionValue(badgeText, "getString(...)");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(badgeText, "badgeText");
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_350;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_500;
        CornerRadius cornerRadius = CornerRadius.RADIUS_500;
        Boolean bool = Boolean.TRUE;
        CellDTO.Settings settings = new CellDTO.Settings(layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, bool, null, "clearLightKey300", cornerRadius, "clearLightKey0", null, "graphicNeutral", 544, null);
        Object[] objArr = 0 == true ? 1 : 0;
        CellDTO.CellText cellText = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        BadgeDTO badgeDTO = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        CellDTO.CenterBlock centerBlock = new CellDTO.CenterBlock(new CellDTO.CellText(OzonSpannableStringKt.toOzonSpannableString(message), "textLightKey", "tsBody400Small", false, null, objArr, 56, null), cellText, layoutPadding3, badgeDTO, commonAtomIconDTO, objArr2, 62, null);
        BadgeDTO.CustomStyle customStyle = new BadgeDTO.CustomStyle(new BadgeDTO.CustomBackground("clearLightKey300", null, 2, null), null, "textLightKey", null, null, 26, null);
        BadgeDTO.Style style = BadgeDTO.Style.CUSTOM;
        BadgeDTO badgeDTO2 = new BadgeDTO(badgeText, null, null, style, customStyle, null, null, bool, style, null, null, null, 3686, null);
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
        CommonControlSettings commonControlSettings = new CommonControlSettings(new AtomActionDTO(behavior, null, "BADGE_ACTION_ID", null, 10, null), null, null, 6, null);
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        CellHolderKt.bind(permissionWarning, new CellDTO(centerBlock, settings, objArr6, new CellDTO.RightBlock(commonControlSettings, null, objArr5, CommonCellSettings.LayoutPadding.PADDING_300, null, badgeDTO2, objArr4, objArr3, null, null, null, null, 4054, null), new CommonControlSettings(new AtomActionDTO(behavior, null, null, null, 14, null), null, null, 6, null), 4, 0 == true ? 1 : 0), new a(1, this, g.class, "onClickHandle", "onClickHandle(Lru/ozon/uni/atoms/af/AtomAction;)V", 0));
    }
}
