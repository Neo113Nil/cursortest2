package androidx.compose.ui.text.font;

/* compiled from: DeviceFontFamilyNameFont.android.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "familyName", "Landroidx/compose/ui/text/font/DeviceFontFamilyName;", com.helpshift.proactive.InAppViewConstants.WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-vxs03AY", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceFontFamilyNameFontKt {
    /* renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m4048Fontvxs03AY$default(java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = new androidx.compose.ui.text.font.FontVariation.Settings(new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m4047Fontvxs03AY(str, fontWeight, i, settings);
    }

    /* renamed from: Font-vxs03AY, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m4047Fontvxs03AY(java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.DeviceFontFamilyNameFont(str, fontWeight, i, settings, null);
    }
}
