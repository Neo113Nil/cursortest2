package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b5\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B©\u0001\b\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b!\u0010$Bµ\u0001\b\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b!\u0010%BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010&BË\u0001\b\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010+J\u0019\u0010-\u001a\u00020\u00002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b/\u0010.J¯\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b0\u00101J»\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b3\u00104JÅ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b5\u00106JÏ\u0001\u00102\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020:2\b\u0010,\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020:2\u0006\u0010,\u001a\u00020\u0000H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020:2\u0006\u0010,\u001a\u00020\u0000H\u0000¢\u0006\u0004\b?\u0010>J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020@H\u0000¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u000eH\u0016¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\bV\u0010WR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u0010ER\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bZ\u0010KR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010[\u001a\u0004\b\\\u0010]R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\b_\u0010`R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\bd\u0010KR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010e\u001a\u0004\bf\u0010gR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010h\u001a\u0004\bi\u0010jR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010k\u001a\u0004\bl\u0010mR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010n\u001a\u0004\bo\u0010pR\u0011\u0010#\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bq\u0010KR\u0013\u0010(\u001a\u0004\u0018\u00010'8G¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010*\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\bt\u0010u"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "textForegroundStyle", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "Landroidx/compose/ui/graphics/Color;", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "merge", "(Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "plus", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "copy", "copy-2BkPm_w", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-GSF8kmg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-NcG25M8", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "", "", "equals", "(Ljava/lang/Object;)Z", "hasSameLayoutAffectingAttributes$ui_text", "(Landroidx/compose/ui/text/SpanStyle;)Z", "hasSameNonLayoutAttributes$ui_text", "", "hashCode", "()I", "hashCodeLayoutAffectingAttributes$ui_text", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "getTextForegroundStyle$ui_text", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "J", "getFontSize-XSAIIZE", "()J", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "Ljava/lang/String;", "getFontFeatureSettings", "getLetterSpacing-XSAIIZE", "Landroidx/compose/ui/text/style/BaselineShift;", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/intl/LocaleList;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getBackground-0d7_KjU", "Landroidx/compose/ui/text/style/TextDecoration;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "Landroidx/compose/ui/text/PlatformSpanStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getColor-0d7_KjU", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getAlpha", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpanStyle implements androidx.compose.ui.text.AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final long background;
    private final androidx.compose.ui.text.style.BaselineShift baselineShift;
    private final androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle;
    private final androidx.compose.ui.text.font.FontFamily fontFamily;
    private final java.lang.String fontFeatureSettings;
    private final long fontSize;
    private final androidx.compose.ui.text.font.FontStyle fontStyle;
    private final androidx.compose.ui.text.font.FontSynthesis fontSynthesis;
    private final androidx.compose.ui.text.font.FontWeight fontWeight;
    private final long letterSpacing;
    private final androidx.compose.ui.text.intl.LocaleList localeList;
    private final androidx.compose.ui.text.PlatformSpanStyle platformStyle;
    private final androidx.compose.ui.graphics.Shadow shadow;
    private final androidx.compose.ui.text.style.TextDecoration textDecoration;
    private final androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle;
    private final androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform;

    private SpanStyle(androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle, long j, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j3;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    /* renamed from: getTextForegroundStyle$ui_text, reason: from getter */
    public final androidx.compose.ui.text.style.TextForegroundStyle getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    public /* synthetic */ SpanStyle(androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle, long j, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, (i & 2) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j2, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j3, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : platformSpanStyle, (i & 32768) != 0 ? null : drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    public final androidx.compose.ui.text.font.FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name and from getter */
    public final androidx.compose.ui.text.font.FontStyle getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name and from getter */
    public final androidx.compose.ui.text.font.FontSynthesis getFontSynthesis() {
        return this.fontSynthesis;
    }

    public final androidx.compose.ui.text.font.FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final java.lang.String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name and from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name and from getter */
    public final androidx.compose.ui.text.style.BaselineShift getBaselineShift() {
        return this.baselineShift;
    }

    public final androidx.compose.ui.text.style.TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final androidx.compose.ui.text.intl.LocaleList getLocaleList() {
        return this.localeList;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    public final androidx.compose.ui.text.style.TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final androidx.compose.ui.graphics.Shadow getShadow() {
        return this.shadow;
    }

    public final androidx.compose.ui.text.PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final androidx.compose.ui.graphics.drawscope.DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public /* synthetic */ SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j, (i & 2) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow) {
        this(androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m8470from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 32768, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j, (i & 2) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : platformSpanStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle) {
        this(androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m8470from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 32768, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j, (i & 2) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : platformSpanStyle, (i & 32768) != 0 ? null : drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        this(androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m8470from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(androidx.compose.ui.graphics.Brush brush, float f, long j, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : fontWeight, (i & 16) != 0 ? null : fontStyle, (i & 32) != 0 ? null : fontSynthesis, (i & 64) != 0 ? null : fontFamily, (i & 128) != 0 ? null : str, (i & 256) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE() : j2, (i & 512) != 0 ? null : baselineShift, (i & 1024) != 0 ? null : textGeometricTransform, (i & 2048) != 0 ? null : localeList, (i & 4096) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j3, (i & 8192) != 0 ? null : textDecoration, (i & 16384) != 0 ? null : shadow, (32768 & i) != 0 ? null : platformSpanStyle, (i & 65536) != 0 ? null : drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private SpanStyle(androidx.compose.ui.graphics.Brush brush, float f, long j, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        this(androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.from(brush, f), j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m7982getColor0d7_KjU() {
        return this.textForegroundStyle.mo8327getColor0d7_KjU();
    }

    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    public static /* synthetic */ androidx.compose.ui.text.SpanStyle merge$default(androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.text.SpanStyle spanStyle2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    public final androidx.compose.ui.text.SpanStyle merge(androidx.compose.ui.text.SpanStyle other) {
        return other == null ? this : androidx.compose.ui.text.SpanStyleKt.m7987fastMergedSHsh3o(this, other.textForegroundStyle.mo8327getColor0d7_KjU(), other.textForegroundStyle.getBrush(), other.textForegroundStyle.getAlpha(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.textDecoration, other.shadow, other.platformStyle, other.drawStyle);
    }

    public final androidx.compose.ui.text.SpanStyle plus(androidx.compose.ui.text.SpanStyle other) {
        return merge(other);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.SpanStyle m7978copyIuqyXdg(long color, long fontSize, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long background, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow) {
        androidx.compose.ui.text.style.TextForegroundStyle m8470from8_81llA;
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(color, m7982getColor0d7_KjU())) {
            m8470from8_81llA = this.textForegroundStyle;
        } else {
            m8470from8_81llA = androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m8470from8_81llA(color);
        }
        return new androidx.compose.ui.text.SpanStyle(m8470from8_81llA, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.platformStyle, this.drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.SpanStyle m7976copy2BkPm_w(long color, long fontSize, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long background, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformStyle) {
        androidx.compose.ui.text.style.TextForegroundStyle m8470from8_81llA;
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(color, m7982getColor0d7_KjU())) {
            m8470from8_81llA = this.textForegroundStyle;
        } else {
            m8470from8_81llA = androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m8470from8_81llA(color);
        }
        return new androidx.compose.ui.text.SpanStyle(m8470from8_81llA, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 32768, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-GSF8kmg, reason: not valid java name */
    public final androidx.compose.ui.text.SpanStyle m7977copyGSF8kmg(long color, long fontSize, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long background, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        androidx.compose.ui.text.style.TextForegroundStyle m8470from8_81llA;
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(color, m7982getColor0d7_KjU())) {
            m8470from8_81llA = this.textForegroundStyle;
        } else {
            m8470from8_81llA = androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.m8470from8_81llA(color);
        }
        return new androidx.compose.ui.text.SpanStyle(m8470from8_81llA, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.SpanStyle m7975copyNcG25M8$default(androidx.compose.ui.text.SpanStyle spanStyle, androidx.compose.ui.graphics.Brush brush, float f, long j, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, int i, java.lang.Object obj) {
        androidx.compose.ui.graphics.Shadow shadow2;
        androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle2;
        float alpha = (i & 2) != 0 ? spanStyle.getAlpha() : f;
        long j4 = (i & 4) != 0 ? spanStyle.fontSize : j;
        androidx.compose.ui.text.font.FontWeight fontWeight2 = (i & 8) != 0 ? spanStyle.fontWeight : fontWeight;
        androidx.compose.ui.text.font.FontStyle fontStyle2 = (i & 16) != 0 ? spanStyle.fontStyle : fontStyle;
        androidx.compose.ui.text.font.FontSynthesis fontSynthesis2 = (i & 32) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        androidx.compose.ui.text.font.FontFamily fontFamily2 = (i & 64) != 0 ? spanStyle.fontFamily : fontFamily;
        java.lang.String str2 = (i & 128) != 0 ? spanStyle.fontFeatureSettings : str;
        long j5 = (i & 256) != 0 ? spanStyle.letterSpacing : j2;
        androidx.compose.ui.text.style.BaselineShift baselineShift2 = (i & 512) != 0 ? spanStyle.baselineShift : baselineShift;
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform2 = (i & 1024) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        androidx.compose.ui.text.intl.LocaleList localeList2 = (i & 2048) != 0 ? spanStyle.localeList : localeList;
        long j6 = (i & 4096) != 0 ? spanStyle.background : j3;
        androidx.compose.ui.text.style.TextDecoration textDecoration2 = (i & 8192) != 0 ? spanStyle.textDecoration : textDecoration;
        androidx.compose.ui.graphics.Shadow shadow3 = (i & 16384) != 0 ? spanStyle.shadow : shadow;
        if ((i & 32768) != 0) {
            shadow2 = shadow3;
            platformSpanStyle2 = spanStyle.platformStyle;
        } else {
            shadow2 = shadow3;
            platformSpanStyle2 = platformSpanStyle;
        }
        return spanStyle.m7979copyNcG25M8(brush, alpha, j4, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j5, baselineShift2, textGeometricTransform2, localeList2, j6, textDecoration2, shadow2, platformSpanStyle2, (i & 65536) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    /* renamed from: copy-NcG25M8, reason: not valid java name */
    public final androidx.compose.ui.text.SpanStyle m7979copyNcG25M8(androidx.compose.ui.graphics.Brush brush, float alpha, long fontSize, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long background, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        return new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.text.style.TextForegroundStyle.INSTANCE.from(brush, alpha), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.SpanStyle)) {
            return false;
        }
        androidx.compose.ui.text.SpanStyle spanStyle = (androidx.compose.ui.text.SpanStyle) other;
        return hasSameLayoutAffectingAttributes$ui_text(spanStyle) && hasSameNonLayoutAttributes$ui_text(spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text(androidx.compose.ui.text.SpanStyle other) {
        if (this == other) {
            return true;
        }
        return androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.fontSize, other.fontSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.fontWeight, other.fontWeight) && kotlin.jvm.internal.Intrinsics.areEqual(this.fontStyle, other.fontStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.fontSynthesis, other.fontSynthesis) && kotlin.jvm.internal.Intrinsics.areEqual(this.fontFamily, other.fontFamily) && kotlin.jvm.internal.Intrinsics.areEqual(this.fontFeatureSettings, other.fontFeatureSettings) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.letterSpacing, other.letterSpacing) && kotlin.jvm.internal.Intrinsics.areEqual(this.baselineShift, other.baselineShift) && kotlin.jvm.internal.Intrinsics.areEqual(this.textGeometricTransform, other.textGeometricTransform) && kotlin.jvm.internal.Intrinsics.areEqual(this.localeList, other.localeList) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.background, other.background) && kotlin.jvm.internal.Intrinsics.areEqual(this.platformStyle, other.platformStyle);
    }

    public final boolean hasSameNonLayoutAttributes$ui_text(androidx.compose.ui.text.SpanStyle other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.textForegroundStyle, other.textForegroundStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.textDecoration, other.textDecoration) && kotlin.jvm.internal.Intrinsics.areEqual(this.shadow, other.shadow) && kotlin.jvm.internal.Intrinsics.areEqual(this.drawStyle, other.drawStyle);
    }

    public final int hashCode() {
        int i;
        int i2;
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(m7982getColor0d7_KjU());
        androidx.compose.ui.graphics.Brush brush = getBrush();
        int hashCode = brush != null ? brush.hashCode() : 0;
        int hashCode2 = java.lang.Float.hashCode(getAlpha());
        int m8796hashCodeimpl = androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.fontSize);
        androidx.compose.ui.text.font.FontWeight fontWeight = this.fontWeight;
        int hashCode3 = fontWeight != null ? fontWeight.hashCode() : 0;
        androidx.compose.ui.text.font.FontStyle fontStyle = this.fontStyle;
        int m8153hashCodeimpl = fontStyle != null ? androidx.compose.ui.text.font.FontStyle.m8153hashCodeimpl(fontStyle.m8155unboximpl()) : 0;
        androidx.compose.ui.text.font.FontSynthesis fontSynthesis = this.fontSynthesis;
        int m8164hashCodeimpl = fontSynthesis != null ? androidx.compose.ui.text.font.FontSynthesis.m8164hashCodeimpl(fontSynthesis.m8168unboximpl()) : 0;
        androidx.compose.ui.text.font.FontFamily fontFamily = this.fontFamily;
        int hashCode4 = fontFamily != null ? fontFamily.hashCode() : 0;
        java.lang.String str = this.fontFeatureSettings;
        int hashCode5 = str != null ? str.hashCode() : 0;
        int m8796hashCodeimpl2 = androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.letterSpacing);
        androidx.compose.ui.text.style.BaselineShift baselineShift = this.baselineShift;
        int m8313hashCodeimpl = baselineShift != null ? androidx.compose.ui.text.style.BaselineShift.m8313hashCodeimpl(baselineShift.m8315unboximpl()) : 0;
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode6 = textGeometricTransform != null ? textGeometricTransform.hashCode() : 0;
        androidx.compose.ui.text.intl.LocaleList localeList = this.localeList;
        if (localeList != null) {
            i2 = localeList.hashCode();
            i = hashCode2;
        } else {
            i = hashCode2;
            i2 = 0;
        }
        int m6003hashCodeimpl2 = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.background);
        androidx.compose.ui.text.style.TextDecoration textDecoration = this.textDecoration;
        int hashCode7 = textDecoration != null ? textDecoration.hashCode() : 0;
        androidx.compose.ui.graphics.Shadow shadow = this.shadow;
        int hashCode8 = shadow != null ? shadow.hashCode() : 0;
        androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int hashCode9 = platformSpanStyle != null ? platformSpanStyle.hashCode() : 0;
        androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle = this.drawStyle;
        return (((((((((((((((((((((((((((((((((m6003hashCodeimpl * 31) + hashCode) * 31) + i) * 31) + m8796hashCodeimpl) * 31) + hashCode3) * 31) + m8153hashCodeimpl) * 31) + m8164hashCodeimpl) * 31) + hashCode4) * 31) + hashCode5) * 31) + m8796hashCodeimpl2) * 31) + m8313hashCodeimpl) * 31) + hashCode6) * 31) + i2) * 31) + m6003hashCodeimpl2) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text() {
        int m8796hashCodeimpl = androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.fontSize);
        androidx.compose.ui.text.font.FontWeight fontWeight = this.fontWeight;
        int hashCode = fontWeight != null ? fontWeight.hashCode() : 0;
        androidx.compose.ui.text.font.FontStyle fontStyle = this.fontStyle;
        int m8153hashCodeimpl = fontStyle != null ? androidx.compose.ui.text.font.FontStyle.m8153hashCodeimpl(fontStyle.m8155unboximpl()) : 0;
        androidx.compose.ui.text.font.FontSynthesis fontSynthesis = this.fontSynthesis;
        int m8164hashCodeimpl = fontSynthesis != null ? androidx.compose.ui.text.font.FontSynthesis.m8164hashCodeimpl(fontSynthesis.m8168unboximpl()) : 0;
        androidx.compose.ui.text.font.FontFamily fontFamily = this.fontFamily;
        int hashCode2 = fontFamily != null ? fontFamily.hashCode() : 0;
        java.lang.String str = this.fontFeatureSettings;
        int hashCode3 = str != null ? str.hashCode() : 0;
        int m8796hashCodeimpl2 = androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.letterSpacing);
        androidx.compose.ui.text.style.BaselineShift baselineShift = this.baselineShift;
        int m8313hashCodeimpl = baselineShift != null ? androidx.compose.ui.text.style.BaselineShift.m8313hashCodeimpl(baselineShift.m8315unboximpl()) : 0;
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode4 = textGeometricTransform != null ? textGeometricTransform.hashCode() : 0;
        androidx.compose.ui.text.intl.LocaleList localeList = this.localeList;
        int hashCode5 = localeList != null ? localeList.hashCode() : 0;
        int m6003hashCodeimpl = androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.background);
        androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return (((((((((((((((((((((m8796hashCodeimpl * 31) + hashCode) * 31) + m8153hashCodeimpl) * 31) + m8164hashCodeimpl) * 31) + hashCode2) * 31) + hashCode3) * 31) + m8796hashCodeimpl2) * 31) + m8313hashCodeimpl) * 31) + hashCode4) * 31) + hashCode5) * 31) + m6003hashCodeimpl) * 31) + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanStyle(color=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(m7982getColor0d7_KjU()));
        sb.append(", brush=");
        sb.append(getBrush());
        sb.append(", alpha=");
        sb.append(getAlpha());
        sb.append(", fontSize=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(this.fontSize));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        sb.append(this.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(this.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(this.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(this.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(this.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(this.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(this.localeList);
        sb.append(", background=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.background));
        sb.append(", textDecoration=");
        sb.append(this.textDecoration);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", drawStyle=");
        sb.append(this.drawStyle);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ SpanStyle(androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle, long j, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(androidx.compose.ui.graphics.Brush brush, float f, long j, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j2, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle);
    }

    public /* synthetic */ SpanStyle(long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontSynthesis fontSynthesis, androidx.compose.ui.text.font.FontFamily fontFamily, java.lang.String str, long j3, androidx.compose.ui.text.style.BaselineShift baselineShift, androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform, androidx.compose.ui.text.intl.LocaleList localeList, long j4, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }
}
