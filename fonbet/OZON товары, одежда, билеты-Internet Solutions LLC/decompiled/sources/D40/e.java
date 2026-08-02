package D40;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes3.dex */
public final class e {
    @NotNull
    public static final TextAtom a(@NotNull TextItemDTO textItemDTO) {
        Intrinsics.checkNotNullParameter(textItemDTO, "<this>");
        OzonHtmlParser.Companion companion = OzonHtmlParser.INSTANCE;
        String text = textItemDTO.getText();
        if (text == null) {
            text = "";
        }
        OzonSpannableString ozonSpannableString = new OzonSpannableString(OzonHtmlParser.Companion.parseHtml$default(companion, text, 0, 2, null));
        String textStyle = textItemDTO.getTextStyle();
        if (textStyle == null) {
            textStyle = StyleParser.TextStyle.BODY_M.getStyleName();
        }
        String str = textStyle;
        String textColor = textItemDTO.getTextColor();
        if (textColor == null) {
            textColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue();
        }
        return new TextAtom(ozonSpannableString, str, textColor, textItemDTO.getMaxLines(), null, null, null, 112, null);
    }
}
