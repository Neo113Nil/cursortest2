package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"", "resId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/Font;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "Font", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontFamily;", "toFontFamily", "(Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontKt {
    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m8132FontRetOiIg$default(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        return m8131FontRetOiIg(i, fontWeight, i2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @kotlin.ReplaceWith(expression = "Font(resId, weight, style)", imports = {}))
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.font.Font m8131FontRetOiIg(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2) {
        return new androidx.compose.ui.text.font.ResourceFont(i, fontWeight, i2, null, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8144getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m8134FontYpTlLL0$default(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8144getBlockingPKNRLFQ();
        }
        return m8133FontYpTlLL0(i, fontWeight, i2, i3);
    }

    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m8133FontYpTlLL0(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3) {
        return new androidx.compose.ui.text.font.ResourceFont(i, fontWeight, i2, new androidx.compose.ui.text.font.FontVariation.Settings(new androidx.compose.ui.text.font.FontVariation.Setting[0]), i3, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m8130FontF3nL8kk$default(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, androidx.compose.ui.text.font.FontVariation.Settings settings, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8144getBlockingPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            settings = androidx.compose.ui.text.font.FontVariation.INSTANCE.m8175Settings6EWAqTQ(fontWeight, i2, new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m8129FontF3nL8kk(i, fontWeight, i2, i3, settings);
    }

    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m8129FontF3nL8kk(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.ResourceFont(i, fontWeight, i2, settings, i3, null);
    }

    public static final androidx.compose.ui.text.font.FontFamily toFontFamily(androidx.compose.ui.text.font.Font font) {
        return androidx.compose.ui.text.font.FontFamilyKt.FontFamily(font);
    }
}
