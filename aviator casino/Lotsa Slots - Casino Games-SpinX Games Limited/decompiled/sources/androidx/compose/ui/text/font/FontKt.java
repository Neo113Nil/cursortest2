package androidx.compose.ui.text.font;

/* compiled from: Font.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", com.helpshift.proactive.InAppViewConstants.WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontKt {
    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m4057FontRetOiIg$default(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        return m4056FontRetOiIg(i, fontWeight, i2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @kotlin.ReplaceWith(expression = "Font(resId, weight, style)", imports = {}))
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.font.Font m4056FontRetOiIg(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2) {
        return new androidx.compose.ui.text.font.ResourceFont(i, fontWeight, i2, null, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4068getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m4059FontYpTlLL0$default(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4068getBlockingPKNRLFQ();
        }
        return m4058FontYpTlLL0(i, fontWeight, i2, i3);
    }

    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m4058FontYpTlLL0(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3) {
        return new androidx.compose.ui.text.font.ResourceFont(i, fontWeight, i2, new androidx.compose.ui.text.font.FontVariation.Settings(new androidx.compose.ui.text.font.FontVariation.Setting[0]), i3, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m4055FontF3nL8kk$default(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, androidx.compose.ui.text.font.FontVariation.Settings settings, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4068getBlockingPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            settings = androidx.compose.ui.text.font.FontVariation.INSTANCE.m4098Settings6EWAqTQ(fontWeight, i2, new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m4054FontF3nL8kk(i, fontWeight, i2, i3, settings);
    }

    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m4054FontF3nL8kk(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.ResourceFont(i, fontWeight, i2, settings, i3, null);
    }

    public static final androidx.compose.ui.text.font.FontFamily toFontFamily(androidx.compose.ui.text.font.Font font) {
        return androidx.compose.ui.text.font.FontFamilyKt.FontFamily(font);
    }
}
