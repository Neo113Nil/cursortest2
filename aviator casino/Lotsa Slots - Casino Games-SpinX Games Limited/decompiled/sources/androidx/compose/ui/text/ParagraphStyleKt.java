package androidx.compose.ui.text;

/* compiled from: ParagraphStyle.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001af\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0018\u0010\"\u001a\u0004\u0018\u00010\n*\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"DefaultLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "J", "lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "resolveParagraphStyleDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "fastMerge", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "fastMerge-j5T8yCg", "(Landroidx/compose/ui/text/ParagraphStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();

    public static final androidx.compose.ui.text.ParagraphStyle lerp(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.ParagraphStyle paragraphStyle2, float f) {
        int value = ((androidx.compose.ui.text.style.TextAlign) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.style.TextAlign.m4353boximpl(paragraphStyle.getTextAlign()), androidx.compose.ui.text.style.TextAlign.m4353boximpl(paragraphStyle2.getTextAlign()), f)).getValue();
        int value2 = ((androidx.compose.ui.text.style.TextDirection) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.style.TextDirection.m4367boximpl(paragraphStyle.getTextDirection()), androidx.compose.ui.text.style.TextDirection.m4367boximpl(paragraphStyle2.getTextDirection()), f)).getValue();
        long m3929lerpTextUnitInheritableC3pnCVY = androidx.compose.ui.text.SpanStyleKt.m3929lerpTextUnitInheritableC3pnCVY(paragraphStyle.getLineHeight(), paragraphStyle2.getLineHeight(), f);
        androidx.compose.ui.text.style.TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = androidx.compose.ui.text.style.TextIndent.INSTANCE.getNone();
        }
        androidx.compose.ui.text.style.TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = androidx.compose.ui.text.style.TextIndent.INSTANCE.getNone();
        }
        return new androidx.compose.ui.text.ParagraphStyle(value, value2, m3929lerpTextUnitInheritableC3pnCVY, androidx.compose.ui.text.style.TextIndentKt.lerp(textIndent, textIndent2, f), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (androidx.compose.ui.text.style.LineHeightStyle) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), ((androidx.compose.ui.text.style.LineBreak) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.style.LineBreak.m4273boximpl(paragraphStyle.getLineBreak()), androidx.compose.ui.text.style.LineBreak.m4273boximpl(paragraphStyle2.getLineBreak()), f)).getMask(), ((androidx.compose.ui.text.style.Hyphens) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.style.Hyphens.m4263boximpl(paragraphStyle.getHyphens()), androidx.compose.ui.text.style.Hyphens.m4263boximpl(paragraphStyle2.getHyphens()), f)).getValue(), (androidx.compose.ui.text.style.TextMotion) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private static final androidx.compose.ui.text.PlatformParagraphStyle lerpPlatformStyle(androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = androidx.compose.ui.text.PlatformParagraphStyle.INSTANCE.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = androidx.compose.ui.text.PlatformParagraphStyle.INSTANCE.getDefault();
        }
        return androidx.compose.ui.text.AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f);
    }

    public static final androidx.compose.ui.text.ParagraphStyle resolveParagraphStyleDefaults(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int m4365getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(paragraphStyle.getTextAlign(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk()) ? androidx.compose.ui.text.style.TextAlign.INSTANCE.m4365getStarte0LSkKk() : paragraphStyle.getTextAlign();
        int m4010resolveTextDirectionIhaHGbI = androidx.compose.ui.text.TextStyleKt.m4010resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.getTextDirection());
        long lineHeight = androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(paragraphStyle.getLineHeight()) ? DefaultLineHeight : paragraphStyle.getLineHeight();
        androidx.compose.ui.text.style.TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = androidx.compose.ui.text.style.TextIndent.INSTANCE.getNone();
        }
        androidx.compose.ui.text.style.TextIndent textIndent2 = textIndent;
        androidx.compose.ui.text.PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int m4292getSimplerAG3T2k = androidx.compose.ui.text.style.LineBreak.m4279equalsimpl0(paragraphStyle.getLineBreak(), androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k()) ? androidx.compose.ui.text.style.LineBreak.INSTANCE.m4292getSimplerAG3T2k() : paragraphStyle.getLineBreak();
        int m4271getNonevmbZdU8 = androidx.compose.ui.text.style.Hyphens.m4266equalsimpl0(paragraphStyle.getHyphens(), androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8()) ? androidx.compose.ui.text.style.Hyphens.INSTANCE.m4271getNonevmbZdU8() : paragraphStyle.getHyphens();
        androidx.compose.ui.text.style.TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = androidx.compose.ui.text.style.TextMotion.INSTANCE.getStatic();
        }
        return new androidx.compose.ui.text.ParagraphStyle(m4365getStarte0LSkKk, m4010resolveTextDirectionIhaHGbI, lineHeight, textIndent2, platformStyle, lineHeightStyle, m4292getSimplerAG3T2k, m4271getNonevmbZdU8, textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x003f, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(r11, r23.getLineHeight()) != false) goto L14;
     */
    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.text.ParagraphStyle m3882fastMergej5T8yCg(androidx.compose.ui.text.ParagraphStyle paragraphStyle, int i, int i2, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i3, int i4, androidx.compose.ui.text.style.TextMotion textMotion) {
        long j2;
        int i5 = i;
        androidx.compose.ui.text.style.TextIndent textIndent2 = textIndent;
        if (androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(i5, androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk()) || androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(i5, paragraphStyle.getTextAlign())) {
            if (!androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j)) {
                j2 = j;
            } else {
                j2 = j;
            }
            if ((textIndent2 == null || kotlin.jvm.internal.Intrinsics.areEqual(textIndent2, paragraphStyle.getTextIndent())) && ((androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i2, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco()) || androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i2, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || kotlin.jvm.internal.Intrinsics.areEqual(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || kotlin.jvm.internal.Intrinsics.areEqual(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((androidx.compose.ui.text.style.LineBreak.m4279equalsimpl0(i3, androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k()) || androidx.compose.ui.text.style.LineBreak.m4279equalsimpl0(i3, paragraphStyle.getLineBreak())) && ((androidx.compose.ui.text.style.Hyphens.m4266equalsimpl0(i4, androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8()) || androidx.compose.ui.text.style.Hyphens.m4266equalsimpl0(i4, paragraphStyle.getHyphens())) && (textMotion == null || kotlin.jvm.internal.Intrinsics.areEqual(textMotion, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j2 = j;
        }
        long lineHeight = androidx.compose.ui.unit.TextUnitKt.m4691isUnspecifiedR2X_6o(j) ? paragraphStyle.getLineHeight() : j2;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        androidx.compose.ui.text.style.TextIndent textIndent3 = textIndent2;
        if (androidx.compose.ui.text.style.TextAlign.m4356equalsimpl0(i5, androidx.compose.ui.text.style.TextAlign.INSTANCE.m4366getUnspecifiede0LSkKk())) {
            i5 = paragraphStyle.getTextAlign();
        }
        return new androidx.compose.ui.text.ParagraphStyle(i5, !androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i2, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco()) ? i2 : paragraphStyle.getTextDirection(), lineHeight, textIndent3, mergePlatformStyle(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !androidx.compose.ui.text.style.LineBreak.m4279equalsimpl0(i3, androidx.compose.ui.text.style.LineBreak.INSTANCE.m4293getUnspecifiedrAG3T2k()) ? i3 : paragraphStyle.getLineBreak(), !androidx.compose.ui.text.style.Hyphens.m4266equalsimpl0(i4, androidx.compose.ui.text.style.Hyphens.INSTANCE.m4272getUnspecifiedvmbZdU8()) ? i4 : paragraphStyle.getHyphens(), textMotion == null ? paragraphStyle.getTextMotion() : textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private static final androidx.compose.ui.text.PlatformParagraphStyle mergePlatformStyle(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }
}
