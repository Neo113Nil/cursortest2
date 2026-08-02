package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0007\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0000*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "", "getAndroidTypefaceStyle-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)I", "getAndroidTypefaceStyle", "", "isBold", "isItalic", "(ZZ)I", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "getAndroidBold", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/ui/text/font/FontWeight;", "AndroidBold"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontUtils_androidKt {
    public static final int getAndroidTypefaceStyle(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final androidx.compose.ui.text.font.FontWeight getAndroidBold(androidx.compose.ui.text.font.FontWeight.Companion companion) {
        return companion.getW600();
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m8104getAndroidTypefaceStyleFO1MlWM(androidx.compose.ui.text.font.FontWeight fontWeight, int i) {
        return getAndroidTypefaceStyle(fontWeight.compareTo(getAndroidBold(androidx.compose.ui.text.font.FontWeight.INSTANCE)) >= 0, androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(i, androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA()));
    }
}
