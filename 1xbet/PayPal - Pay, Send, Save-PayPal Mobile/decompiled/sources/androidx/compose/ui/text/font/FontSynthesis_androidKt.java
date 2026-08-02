package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "typeface", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/FontWeight;", "requestedWeight", "Landroidx/compose/ui/text/font/FontStyle;", "requestedStyle", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "synthesizeTypeface"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontSynthesis_androidKt {
    /* renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    public static final java.lang.Object m8174synthesizeTypefaceFxwP2eA(int i, java.lang.Object obj, androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.FontWeight fontWeight, int i2) {
        int weight;
        boolean m8152equalsimpl0;
        if (obj instanceof android.graphics.Typeface) {
            boolean z = false;
            boolean z2 = androidx.compose.ui.text.font.FontSynthesis.m8166isWeightOnimpl$ui_text(i) && !kotlin.jvm.internal.Intrinsics.areEqual(font.getGetHighSpeedVideoFpsRanges(), fontWeight) && fontWeight.compareTo(androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(androidx.compose.ui.text.font.FontWeight.INSTANCE)) >= 0 && font.getGetHighSpeedVideoFpsRanges().compareTo(androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(androidx.compose.ui.text.font.FontWeight.INSTANCE)) < 0;
            boolean z3 = androidx.compose.ui.text.font.FontSynthesis.m8165isStyleOnimpl$ui_text(i) && !androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(i2, font.getGetHighResolutionOutputSizeshNQ4ISI());
            if (z3 || z2) {
                if (android.os.Build.VERSION.SDK_INT < 28) {
                    if (z3 && androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(i2, androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA())) {
                        z = true;
                    }
                    return android.graphics.Typeface.create((android.graphics.Typeface) obj, androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z2, z));
                }
                if (z2) {
                    weight = fontWeight.getWeight();
                } else {
                    weight = font.getGetHighSpeedVideoFpsRanges().getWeight();
                }
                if (z3) {
                    m8152equalsimpl0 = androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(i2, androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA());
                } else {
                    m8152equalsimpl0 = androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(font.getGetHighResolutionOutputSizeshNQ4ISI(), androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA());
                }
                return androidx.compose.ui.text.font.TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) obj, weight, m8152equalsimpl0);
            }
        }
        return obj;
    }
}
