package androidx.compose.material3.tokens;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "DefaultLineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefaultLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "Landroidx/compose/ui/text/TextStyle;", "DefaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyTokensKt {
    private static final androidx.compose.ui.text.style.LineHeightStyle DefaultLineHeightStyle;
    private static final androidx.compose.ui.text.TextStyle DefaultTextStyle;

    public static final androidx.compose.ui.text.style.LineHeightStyle getDefaultLineHeightStyle() {
        return DefaultLineHeightStyle;
    }

    static {
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
        androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8410getCenterPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8435getNoneEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        DefaultLineHeightStyle = lineHeightStyle;
        m8065copyp1EtxEg = r0.m8065copyp1EtxEg((r48 & 1) != 0 ? r0.spanStyle.m7982getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r0.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r0.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r0.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r0.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r0.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r0.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r0.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r0.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r0.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r0.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r0.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r0.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r0.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r0.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r0.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r0.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r0.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r0.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r0.platformStyle : androidx.compose.material3.internal.DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (r48 & 1048576) != 0 ? r0.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (r48 & 2097152) != 0 ? r0.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r0.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault().paragraphStyle.getTextMotion() : null);
        DefaultTextStyle = m8065copyp1EtxEg;
    }

    public static final androidx.compose.ui.text.TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }
}
