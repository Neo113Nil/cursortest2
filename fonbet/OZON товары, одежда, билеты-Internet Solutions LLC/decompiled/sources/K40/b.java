package K40;

import e50.f;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SheetDTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.BoxV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.ColumnV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.FinImageV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.RowV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.ui.misc.FinIcons;
import ru.ozon.uni.android.uikit.common.StyleParser;
import t40.EnumC9751a;
import t40.EnumC9752b;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f15171a;

    public b(@NotNull f snackCreator) {
        Intrinsics.checkNotNullParameter(snackCreator, "snackCreator");
        this.f15171a = snackCreator;
    }

    public static Cbottom2SnackDTO b(b bVar, String text, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        String icon = FinIcons.IC_M_EXCLAMATION_FILLED.getDrawableName();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        bVar.f15171a.getClass();
        return f.a(i11, text, icon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static RowV20DTO c(b bVar, String str, String str2, List list) {
        bVar.getClass();
        Tc.b builder = C7714v.B();
        StyleParser.OzColor ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY;
        String value = ozColor.getValue();
        EnumC9752b enumC9752b = EnumC9752b.CENTER;
        int i11 = 24;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        String str4 = "share_id_down_icon";
        builder.add(new FinImageV20DTO(null, str4, null, null, null, null, null, i11, i11, null, null, null, null, C7714v.b0(enumC9752b, enumC9752b), null, null, null, null, null, null, null, null, null, num, num2, null, null, null, str, null, value, null, null, str3, null, null, null, -1342185859, 31, null));
        List b02 = C7714v.b0(16, 0, 16, 0);
        Tc.b builder2 = C7714v.B();
        String str5 = "share_id_down_title";
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        Object[] objArr5 = null == true ? 1 : 0;
        Object[] objArr6 = null == true ? 1 : 0;
        Object[] objArr7 = null == true ? 1 : 0;
        Object[] objArr8 = null == true ? 1 : 0;
        Object[] objArr9 = null == true ? 1 : 0;
        Object[] objArr10 = null == true ? 1 : 0;
        Object[] objArr11 = null == true ? 1 : 0;
        Object[] objArr12 = null == true ? 1 : 0;
        Object[] objArr13 = null == true ? 1 : 0;
        Object[] objArr14 = null == true ? 1 : 0;
        Object[] objArr15 = null == true ? 1 : 0;
        Object[] objArr16 = null == true ? 1 : 0;
        builder2.add(new TextItemV20DTO(objArr5, str5, objArr6, objArr7, objArr8, objArr9, objArr10, num, num2, objArr11, objArr12, objArr13, null, objArr14, null, objArr15, objArr16, str3, objArr, objArr2, objArr3, null, null, objArr4, null, null, null, str2, StyleParser.TextStyle.BODY_L.getStyleName(), ozColor.getValue(), null, null, null, null, null, null, null, -939524099, 31, null));
        Intrinsics.checkNotNullParameter(builder2, "builder");
        CbottomElement2 cbottomElement2 = null;
        String str6 = "share_id_down_content";
        Integer num3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num4 = null;
        Integer num5 = null;
        Float f7 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str7 = null;
        List list5 = null;
        EnumC9751a enumC9751a = null;
        String str8 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Float f11 = null;
        Boolean bool5 = null;
        builder.add(new ColumnV20DTO(cbottomElement2, str6, num3, bool, bool2, bool3, bool4, 0, -2, num4, num5, f7, b02, list2, Float.valueOf(1.0f), list3, list4, str7, list5, enumC9751a, str8, num6, num7, num8, num9, f11, bool5, builder2.B(), null, null, null, null, null, -134238595, 1, null));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new RowV20DTO(null, "share_id_down", null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, builder.B(), null, null, "share_id_down", null, null, -1207992331, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static RowV20DTO d(b bVar, String str, String str2, String str3, List list) {
        EnumC9752b enumC9752b;
        Tc.b bVar2;
        Tc.b builder;
        String value = StyleParser.OzColor.OZ_SEMANTIC_TEXT_ACTION.getValue();
        String value2 = StyleParser.OzColor.OZ_SEMANTIC_CTRL_PRIMARY_PALE.getValue();
        bVar.getClass();
        EnumC9752b enumC9752b2 = EnumC9752b.CENTER;
        List b02 = C7714v.b0(enumC9752b2, enumC9752b2);
        Tc.b B11 = C7714v.B();
        List b03 = C7714v.b0(enumC9752b2, enumC9752b2);
        List b04 = C7714v.b0(12, 12, 12, 12);
        Tc.b B12 = C7714v.B();
        int i11 = 48;
        if (str3 != null) {
            enumC9752b = enumC9752b2;
            builder = B12;
            bVar2 = B11;
            builder.add(new FinImageV20DTO(null, "DOWNLOAD_SHEET_ID_icon", null, null, null, null, null, i11, i11, null, null, null, null, C7714v.b0(enumC9752b2, enumC9752b2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, str3, null, value, null, null, null, null, null, null, -1342185859, 31, null));
        } else {
            enumC9752b = enumC9752b2;
            bVar2 = B11;
            builder = B12;
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Integer num = null;
        Integer num2 = null;
        Float f7 = null;
        String str4 = null;
        String str5 = "DOWNLOAD_SHEET_ID_icon_box";
        Tc.b builder2 = bVar2;
        builder2.add(new BoxV20DTO(null, str5, null, null, null, null, null, i11, i11, num, num2, f7, null, b03, null, null, b04, value2, null, null, str4, null, null, null, null, null, null, builder.B(), null, null, null, null, null, -134422915, 1, null));
        EnumC9752b enumC9752b3 = enumC9752b;
        List b05 = C7714v.b0(enumC9752b3, enumC9752b3);
        List b06 = C7714v.b0(16, 0, 0, 0);
        Tc.b builder3 = C7714v.B();
        CbottomElement2 cbottomElement2 = null;
        Integer num3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Float f11 = null;
        List list2 = null;
        List list3 = null;
        Integer num8 = null;
        Integer num9 = null;
        String str6 = "DOWNLOAD_SHEET_ID_title";
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        Object[] objArr5 = null == true ? 1 : 0;
        Object[] objArr6 = null == true ? 1 : 0;
        Object[] objArr7 = null == true ? 1 : 0;
        builder3.add(new TextItemV20DTO(cbottomElement2, str6, num3, bool, bool2, bool3, bool4, num4, num5, num6, num7, f11, list2, C7714v.b0(enumC9752b3, enumC9752b3), objArr, list3, objArr2, objArr3, objArr4, objArr5, objArr6, num8, num9, num, num2, f7, objArr7, str2, StyleParser.TextStyle.BODY_L_BOLD.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), null, null, null == true ? 1 : 0, null == true ? 1 : 0, str4, null == true ? 1 : 0, null == true ? 1 : 0, -939532291, 31, null == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(builder3, "builder");
        CbottomElement2 cbottomElement22 = null;
        String str7 = "DOWNLOAD_SHEET_ID_content";
        Integer num10 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Integer num11 = null;
        Integer num12 = null;
        Float f12 = null;
        List list4 = null;
        List list5 = null;
        String str8 = null;
        List list6 = null;
        EnumC9751a enumC9751a = null;
        String str9 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Float f13 = null;
        Boolean bool9 = null;
        builder2.add(new ColumnV20DTO(cbottomElement22, str7, num10, bool5, bool6, bool7, bool8, 0, -2, num11, num12, f12, b06, b05, Float.valueOf(1.0f), list4, list5, str8, list6, enumC9751a, str9, num13, num14, num15, num16, f13, bool9, builder3.B(), null, null, null, null, null, -134246787, 1, null));
        int i12 = 24;
        int i13 = 24;
        CbottomElement2 cbottomElement23 = null;
        String str10 = "DOWNLOAD_SHEET_ID_chevron";
        Integer num17 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        Integer num18 = null;
        Integer num19 = null;
        Float f14 = null;
        List list7 = null;
        Float f15 = null;
        List list8 = null;
        List list9 = null;
        String str11 = null;
        List list10 = null;
        EnumC9751a enumC9751a2 = null;
        String str12 = null;
        Integer num20 = null;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Float f16 = null;
        Boolean bool14 = null;
        String str13 = null;
        String str14 = null;
        builder2.add(new FinImageV20DTO(cbottomElement23, str10, num17, bool10, bool11, bool12, bool13, i12, i13, num18, num19, f14, list7, C7714v.b0(enumC9752b3, enumC9752b3), f15, list8, list9, str11, list10, enumC9751a2, str12, num20, num21, num22, num23, f16, bool14, str13, FinIcons.IC_S_CHEVRON_RIGHT.getDrawableName(), str14, StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_QUATERNARY.getValue(), null, null, null, null, null, null, -1342185859, 31, null));
        Intrinsics.checkNotNullParameter(builder2, "builder");
        return new RowV20DTO(null, "DOWNLOAD_SHEET_ID_icon_row", null, Boolean.TRUE, null, null, null, -1, -2, null, null, null, null, b02, null, list, null, null, null, null, null, null, null, null, null, null, null, builder2.B(), null, null, str, null, null, -1208000907, 1, null);
    }

    @NotNull
    public static Cbottom2SheetDTO e(@NotNull String title, @NotNull String downloadTitle, @NotNull String shareTitle) {
        Intrinsics.checkNotNullParameter("SHEET_ID", "sheetId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter("SHEET_DOWNLOAD_ID", "downloadId");
        Intrinsics.checkNotNullParameter(downloadTitle, "downloadTitle");
        Intrinsics.checkNotNullParameter("SHEET_SHARE_ID", "shareId");
        Intrinsics.checkNotNullParameter(shareTitle, "shareTitle");
        return new Cbottom2SheetDTO("SHEET_ID", CbottomType.SHEET, 1, null, C7714v.b0(new TextItemV20DTO(null, "SHEET_ID_title", null, null, null, null, null, null, null, null, null, null, null, null, null, C7714v.b0(16, 16, 16, 16), null, null, null, null, null, null, null, null, null, null, null, title, StyleParser.TextStyle.HEAD_L.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), null, null, null, null, null, null, null, -939556867, 31, null), g("SHEET_DOWNLOAD_ID", downloadTitle, FinIcons.IC_M_DOWNLOAD_FILLED.getDrawableName()), g("SHEET_SHARE_ID", shareTitle, FinIcons.IC_M_SHARE_ARROW_FILLED.getDrawableName())), null, null, null, null, null, null);
    }

    public static Cbottom2SheetDTO f(b bVar, String title) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter("share_id_down", "downloadActionId");
        Intrinsics.checkNotNullParameter("share_id_down", "chooserActionId");
        Intrinsics.checkNotNullParameter("Скачать", "downloadText");
        Intrinsics.checkNotNullParameter("Через чузер", "chooserText");
        return new Cbottom2SheetDTO("sheet_id", CbottomType.SHEET, 1, null, C7714v.b0(new TextItemV20DTO(null, "share_id_title", null, null, null, null, null, null, null, null, null, null, null, null, null, C7714v.b0(16, 16, 16, 16), null, null, null, null, null, null, null, null, null, null, null, title, StyleParser.TextStyle.HEAD_L.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), null, null, null, null, null, null, null, -939556867, 31, null), c(bVar, FinIcons.IC_M_DOWNLOAD_FILLED.getDrawableName(), "Скачать", C7714v.b0(16, 8, 16, 8)), c(bVar, FinIcons.IC_M_SHARE_ARROW_FILLED.getDrawableName(), "Через чузер", C7714v.b0(16, 8, 16, 8))), null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static RowV20DTO g(String str, String str2, String str3) {
        List b02 = C7714v.b0(16, 8, 16, 8);
        int i11 = 48;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str4 = null;
        String str5 = null;
        FinImageV20DTO finImageV20DTO = new FinImageV20DTO(null, str.concat("_icon"), null, null, null, null, null, i11, i11, num, num2, null, null, null, null, null, C7714v.b0(12, 12, 12, 12), StyleParser.OzColor.OZ_SEMANTIC_CTRL_PRIMARY_PALE.getValue(), null, null, null, null, null, num3, num4, null, null, null, str3, null, StyleParser.OzColor.OZ_SEMANTIC_TEXT_ACTION.getValue(), null, str4, null, str5, null, null, -1342374275, 31, null);
        String concat = str.concat("_title");
        List b03 = C7714v.b0(16, 0, 0, 0);
        EnumC9752b enumC9752b = EnumC9752b.CENTER;
        List b04 = C7714v.b0(enumC9752b, enumC9752b);
        String styleName = StyleParser.TextStyle.BODY_L_BOLD.getStyleName();
        String value = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue();
        Map map = null;
        List list = null;
        Object[] objArr = null == true ? 1 : 0;
        TextItemV20DTO textItemV20DTO = new TextItemV20DTO(null, concat, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null, num, num2, null == true ? 1 : 0, null == true ? 1 : 0, b03, b04, Float.valueOf(1.0f), null, list, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, num3, num4, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, str2, styleName, value, null == true ? 1 : 0, str4, null == true ? 1 : 0, str5, null == true ? 1 : 0, objArr, map, -939552771, 31, null);
        int i12 = 24;
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        Object[] objArr5 = null == true ? 1 : 0;
        Object[] objArr6 = null == true ? 1 : 0;
        Object[] objArr7 = null == true ? 1 : 0;
        Object[] objArr8 = null == true ? 1 : 0;
        Object[] objArr9 = null == true ? 1 : 0;
        Object[] objArr10 = null == true ? 1 : 0;
        Object[] objArr11 = null == true ? 1 : 0;
        Object[] objArr12 = null == true ? 1 : 0;
        Object[] objArr13 = null == true ? 1 : 0;
        Object[] objArr14 = null == true ? 1 : 0;
        Object[] objArr15 = null == true ? 1 : 0;
        Object[] objArr16 = null == true ? 1 : 0;
        Object[] objArr17 = null == true ? 1 : 0;
        Object[] objArr18 = null == true ? 1 : 0;
        List b05 = C7714v.b0(finImageV20DTO, textItemV20DTO, new FinImageV20DTO(null, str.concat("_chevron"), objArr3, objArr4, objArr5, null == true ? 1 : 0, null == true ? 1 : 0, i12, i12, objArr6, objArr7, null, null, C7714v.b0(enumC9752b, enumC9752b), null == true ? 1 : 0, list, objArr8, objArr9, objArr10, objArr11, objArr12, num3, num4, objArr13, objArr14, objArr15, null, null, FinIcons.IC_S_CHEVRON_RIGHT.getDrawableName(), objArr16, StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_QUATERNARY.getValue(), objArr17, str5, objArr18, objArr2, map, null, -1342185859, 31, null));
        CbottomElement2 cbottomElement2 = null;
        Integer num5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Float f7 = null;
        List list2 = null;
        List list3 = null;
        Float f11 = null;
        List list4 = null;
        String str6 = null;
        List list5 = null;
        String str7 = null;
        Boolean bool4 = null;
        Object[] objArr19 = null == true ? 1 : 0;
        Object[] objArr20 = null == true ? 1 : 0;
        Object[] objArr21 = null == true ? 1 : 0;
        Object[] objArr22 = null == true ? 1 : 0;
        Object[] objArr23 = null == true ? 1 : 0;
        Object[] objArr24 = null == true ? 1 : 0;
        return new RowV20DTO(cbottomElement2, str, num5, Boolean.TRUE, bool, bool2, bool3, num6, num7, num8, num9, f7, list2, list3, f11, b02, list4, str6, list5, null == true ? 1 : 0, str7, objArr19, objArr20, objArr21, null == true ? 1 : 0, null == true ? 1 : 0, bool4, b05, objArr22, objArr23, str, null == true ? 1 : 0, null, -1207992331, 1, objArr24);
    }

    public static Cbottom2SnackDTO h(b bVar, String text, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        String icon = FinIcons.IC_M_CONFIRMED_FILLED.getDrawableName();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        bVar.f15171a.getClass();
        return f.b(i11, text, icon);
    }

    @NotNull
    public final Cbottom2SheetDTO a(@NotNull String title, @NotNull String titleBtn, @NotNull String titleBtn2) {
        Intrinsics.checkNotNullParameter("DOWNLOAD_SHEET_ID", "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleBtn, "titleBtn");
        Intrinsics.checkNotNullParameter(titleBtn2, "titleBtn2");
        Intrinsics.checkNotNullParameter("PHOTO_PROMO_ID", "photoActionId");
        Intrinsics.checkNotNullParameter("DOCS_PROMO_ID", "docsActionId");
        return new Cbottom2SheetDTO("DOWNLOAD_SHEET_ID", CbottomType.SHEET, 1, null, C7714v.b0(new TextItemV20DTO(null, "DOWNLOAD_SHEET_ID", null, null, null, null, null, null, null, null, null, null, null, null, null, C7714v.b0(16, 16, 16, 16), null, null, null, null, null, null, null, null, null, null, null, title, StyleParser.TextStyle.HEAD_L.getStyleName(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue(), null, null, null, null, null, null, null, -939556867, 31, null), d(this, "PHOTO_PROMO_ID", titleBtn, FinIcons.IC_M_GALLERY.getDrawableName(), C7714v.b0(16, 8, 16, 8)), d(this, "DOCS_PROMO_ID", titleBtn2, FinIcons.IC_M_DOCUMENT_FILLED.getDrawableName(), C7714v.b0(16, 8, 16, 8))), null, Boolean.FALSE, null, null, null, null);
    }
}
