package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import com.unity3d.ads.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "withDefaultFontFamily", "Landroidx/compose/ui/text/TextStyle;", BuildConfig.FLAVOR, "Landroidx/compose/ui/text/font/FontFamily;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyKt {
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0<Typography>() { // from class: androidx.compose.material.TypographyKt$LocalTypography$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        TextStyle m3497copyHL5avdY;
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        m3497copyHL5avdY = textStyle.m3497copyHL5avdY((r42 & 1) != 0 ? textStyle.spanStyle.m3459getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (r42 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? textStyle.paragraphStyle.getTextAlign() : null, (r42 & 32768) != 0 ? textStyle.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : null);
        return m3497copyHL5avdY;
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }
}
