package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefaces;", "PlatformTypefaces", "()Landroidx/compose/ui/text/font/PlatformTypefaces;", "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroid/content/Context;", "context", "setFontVariationSettings", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "name", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "getWeightSuffixForFallbackFamilyName", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformTypefaces_androidKt {
    public static final androidx.compose.ui.text.font.PlatformTypefaces PlatformTypefaces() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return new androidx.compose.ui.text.font.PlatformTypefacesApi28();
        }
        return new androidx.compose.ui.text.font.PlatformTypefacesApi();
    }

    public static final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface typeface, androidx.compose.ui.text.font.FontVariation.Settings settings, android.content.Context context) {
        return androidx.compose.ui.text.font.TypefaceCompatApi26.INSTANCE.getHighSpeedVideoFpsRangesFor(typeface, settings, context);
    }

    public static final java.lang.String getWeightSuffixForFallbackFamilyName(java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("-thin");
            return sb.toString();
        }
        if (2 <= weight && weight < 4) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("-light");
            return sb2.toString();
        }
        if (weight == 4) {
            return str;
        }
        if (weight == 5) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("-medium");
            return sb3.toString();
        }
        if ((6 <= weight && weight < 8) || 8 > weight || weight >= 11) {
            return str;
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(str);
        sb4.append("-black");
        return sb4.toString();
    }
}
