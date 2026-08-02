package Ti;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

/* loaded from: classes10.dex */
public final class j {
    private static final CellDTO a(String str, String str2, boolean z11, boolean z12) {
        String str3 = z12 ? "clearLightKey300" : "bgSecondary";
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return new CellDTO(new CellDTO.CenterBlock(new CellDTO.CellText(OzonSpannableStringKt.toOzonSpannableString(str2), z12 ? "textSecondaryOnDark" : "textPrimary", "tsCompact500Medium", false, null, null, 56, null), null, null, null, null, null, 62, null), new CellDTO.Settings(layoutPadding, layoutPadding, layoutPadding, layoutPadding, Boolean.valueOf(z11), null, str3, null, null, null, "graphicNeutral", 928, null), new CellDTO.LeftBlock(null, null, null, CommonCellSettings.LayoutPadding.PADDING_300, null, new IconDTO(null, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO(str, "graphicTertiary"), null, null, null, null, null, null, null, null, null, null, null, 65515, null), null, null, ModuleDescriptor.MODULE_VERSION, null), null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, null, 14, null), null, null, 6, null), 8, null);
    }

    @NotNull
    public static final IconButtonV3DTO b(boolean z11) {
        return new IconButtonV3DTO(null, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, z11 ? "graphicSecondaryOnDark" : "graphicSecondary", z11 ? "clearLightKey300" : "bgOverlap", null, null, null, null, null, null, null, 16273, null);
    }

    @NotNull
    public static final CellDTO c(@NotNull String title, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        return a("ic_m_photo_add_filled", title, false, z11);
    }

    @NotNull
    public static final CellDTO d(@NotNull String title, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        return a("ic_m_video_add_filled", title, true, z11);
    }
}
