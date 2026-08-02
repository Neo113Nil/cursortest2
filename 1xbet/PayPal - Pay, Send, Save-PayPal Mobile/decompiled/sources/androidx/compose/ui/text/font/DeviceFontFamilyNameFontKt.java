package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.VerificationConstants.FamilyName, "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/Font;", "Font-vxs03AY", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Font"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceFontFamilyNameFontKt {
    /* renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m8123Fontvxs03AY$default(java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = new androidx.compose.ui.text.font.FontVariation.Settings(new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m8122Fontvxs03AY(str, fontWeight, i, settings);
    }

    /* renamed from: Font-vxs03AY, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m8122Fontvxs03AY(java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.DeviceFontFamilyNameFont(str, fontWeight, i, settings, null);
    }
}
