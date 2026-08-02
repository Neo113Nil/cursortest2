package androidx.compose.foundation.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b'\u0010,R\u0016\u0010#\u001a\u00020\u00048\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u0018\u0010(\u001a\u0004\u0018\u00010\u00118\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\"\u0010.R\u0018\u0010%\u001a\u0004\u0018\u00010\u00138\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00028\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0018\u00105\u001a\u0004\u0018\u00010\u00188\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b3\u00107"}, d2 = {"Landroidx/compose/foundation/internal/MutableSpanStyle;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "Landroidx/compose/ui/unit/TextUnit;", "p1", "Landroidx/compose/ui/text/font/FontWeight;", "p2", "Landroidx/compose/ui/text/font/FontStyle;", "p3", "Landroidx/compose/ui/text/font/FontSynthesis;", "p4", "Landroidx/compose/ui/text/font/FontFamily;", "p5", "", "p6", "p7", "Landroidx/compose/ui/text/style/BaselineShift;", "p8", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "p9", "Landroidx/compose/ui/text/intl/LocaleList;", "p10", "p11", "Landroidx/compose/ui/text/style/TextDecoration;", "p12", "Landroidx/compose/ui/graphics/Shadow;", "p13", "<init>", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoFpsRanges", "J", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/text/font/FontWeight;", "getOutputMinFrameDuration", "Landroidx/compose/ui/text/font/FontStyle;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Landroidx/compose/ui/text/font/FontSynthesis;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/font/FontFamily;", "Ljava/lang/String;", "getOutputFormats", "Landroidx/compose/ui/text/style/BaselineShift;", "getOutputStallDurationlomOqCM", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/intl/LocaleList;", "getOutputSizes", "getOutputMinFrameDurationlomOqCM", "getOutputStallDuration", "Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableSpanStyle {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    java.lang.String getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    long getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public androidx.compose.ui.text.font.FontFamily getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    androidx.compose.ui.text.style.BaselineShift getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    androidx.compose.ui.text.font.FontWeight getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    long getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    androidx.compose.ui.text.font.FontSynthesis getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    long getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    androidx.compose.ui.text.font.FontStyle Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    androidx.compose.ui.graphics.Shadow getOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public androidx.compose.ui.text.intl.LocaleList getOutputSizes;
    androidx.compose.ui.text.style.TextDecoration getOutputStallDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    androidx.compose.ui.text.style.TextGeometricTransform getOutputMinFrameDuration;

    private MutableSpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = j2;
        this.getHighSpeedVideoFpsRanges = fontWeight;
        this.Camera2StreamConfigurationMap = fontStyle;
        this.getHighSpeedVideoFpsRangesFor = fontSynthesis;
        this.getInputFormats = fontFamily;
        this.getOutputFormats = str;
        this.getHighSpeedVideoSizesFor = j3;
        this.getInputSizeshNQ4ISI = baselineShift;
        this.getOutputMinFrameDuration = textGeometricTransform;
        this.getOutputSizes = localeList;
        this.getOutputMinFrameDurationlomOqCM = j4;
        this.getOutputStallDuration = textDecoration;
        this.getOutputSizeshNQ4ISI = shadow;
    }

    public /* synthetic */ MutableSpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j, (i & 2) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, null);
    }

    public /* synthetic */ MutableSpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow);
    }
}
