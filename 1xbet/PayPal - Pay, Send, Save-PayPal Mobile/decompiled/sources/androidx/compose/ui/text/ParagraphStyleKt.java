package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001ac\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b&\u0010'\"\u0014\u0010&\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/ParagraphStyle;F)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;F)Landroidx/compose/ui/text/PlatformParagraphStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "resolveParagraphStyleDefaults", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "fastMerge-j5T8yCg", "(Landroidx/compose/ui/text/ParagraphStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "fastMerge", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformParagraphStyle;", "getHighResolutionOutputSizeshNQ4ISI", "J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE();

    public static final androidx.compose.ui.text.ParagraphStyle lerp(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.ParagraphStyle paragraphStyle2, float f) {
        int m8442unboximpl = ((androidx.compose.ui.text.style.TextAlign) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.style.TextAlign.m8436boximpl(paragraphStyle.getTextAlign()), androidx.compose.ui.text.style.TextAlign.m8436boximpl(paragraphStyle2.getTextAlign()), f)).m8442unboximpl();
        int m8459unboximpl = ((androidx.compose.ui.text.style.TextDirection) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.style.TextDirection.m8453boximpl(paragraphStyle.getTextDirection()), androidx.compose.ui.text.style.TextDirection.m8453boximpl(paragraphStyle2.getTextDirection()), f)).m8459unboximpl();
        long m7988lerpTextUnitInheritableC3pnCVY = androidx.compose.ui.text.SpanStyleKt.m7988lerpTextUnitInheritableC3pnCVY(paragraphStyle.getLineHeight(), paragraphStyle2.getLineHeight(), f);
        androidx.compose.ui.text.style.TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = androidx.compose.ui.text.style.TextIndent.INSTANCE.getNone();
        }
        androidx.compose.ui.text.style.TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = androidx.compose.ui.text.style.TextIndent.INSTANCE.getNone();
        }
        return new androidx.compose.ui.text.ParagraphStyle(m8442unboximpl, m8459unboximpl, m7988lerpTextUnitInheritableC3pnCVY, androidx.compose.ui.text.style.TextIndentKt.lerp(textIndent, textIndent2, f), getHighSpeedVideoSizes(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (androidx.compose.ui.text.style.LineHeightStyle) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), ((androidx.compose.ui.text.style.LineBreak) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.style.LineBreak.m8341boximpl(paragraphStyle.getLineBreak()), androidx.compose.ui.text.style.LineBreak.m8341boximpl(paragraphStyle2.getLineBreak()), f)).getGetHighResolutionOutputSizeshNQ4ISI(), ((androidx.compose.ui.text.style.Hyphens) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(androidx.compose.ui.text.style.Hyphens.m8328boximpl(paragraphStyle.getHyphens()), androidx.compose.ui.text.style.Hyphens.m8328boximpl(paragraphStyle2.getHyphens()), f)).m8334unboximpl(), (androidx.compose.ui.text.style.TextMotion) androidx.compose.ui.text.SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private static final androidx.compose.ui.text.PlatformParagraphStyle getHighSpeedVideoSizes(androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle2, float f) {
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
        int m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(paragraphStyle.getTextAlign(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk()) ? androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk() : paragraphStyle.getTextAlign();
        int m8085resolveTextDirectionIhaHGbI = androidx.compose.ui.text.TextStyleKt.m8085resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.getTextDirection());
        long lineHeight = androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(paragraphStyle.getLineHeight()) == 0 ? getHighResolutionOutputSizeshNQ4ISI : paragraphStyle.getLineHeight();
        androidx.compose.ui.text.style.TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = androidx.compose.ui.text.style.TextIndent.INSTANCE.getNone();
        }
        androidx.compose.ui.text.style.TextIndent textIndent2 = textIndent;
        androidx.compose.ui.text.PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int m8360getSimplerAG3T2k = androidx.compose.ui.text.style.LineBreak.m8347equalsimpl0(paragraphStyle.getLineBreak(), androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k()) ? androidx.compose.ui.text.style.LineBreak.INSTANCE.m8360getSimplerAG3T2k() : paragraphStyle.getLineBreak();
        int m8336getNonevmbZdU8 = androidx.compose.ui.text.style.Hyphens.m8331equalsimpl0(paragraphStyle.getHyphens(), androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8()) ? androidx.compose.ui.text.style.Hyphens.INSTANCE.m8336getNonevmbZdU8() : paragraphStyle.getHyphens();
        androidx.compose.ui.text.style.TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = androidx.compose.ui.text.style.TextMotion.INSTANCE.getStatic();
        }
        return new androidx.compose.ui.text.ParagraphStyle(m8448getStarte0LSkKk, m8085resolveTextDirectionIhaHGbI, lineHeight, textIndent2, platformStyle, lineHeightStyle, m8360getSimplerAG3T2k, m8336getNonevmbZdU8, textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0044, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(r14, r23.getLineHeight()) != false) goto L13;
     */
    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.text.ParagraphStyle m7926fastMergej5T8yCg(androidx.compose.ui.text.ParagraphStyle paragraphStyle, int i, int i2, long j, androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, int i3, int i4, androidx.compose.ui.text.style.TextMotion textMotion) {
        long j2;
        int i5 = i;
        androidx.compose.ui.text.style.TextIndent textIndent2 = textIndent;
        if (androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(i5, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk()) || androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(i5, paragraphStyle.getTextAlign())) {
            if (androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j) == 0) {
                j2 = j;
            } else {
                j2 = j;
            }
            if ((textIndent2 == null || kotlin.jvm.internal.Intrinsics.areEqual(textIndent2, paragraphStyle.getTextIndent())) && ((androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i2, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco()) || androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i2, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || kotlin.jvm.internal.Intrinsics.areEqual(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || kotlin.jvm.internal.Intrinsics.areEqual(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((androidx.compose.ui.text.style.LineBreak.m8347equalsimpl0(i3, androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k()) || androidx.compose.ui.text.style.LineBreak.m8347equalsimpl0(i3, paragraphStyle.getLineBreak())) && ((androidx.compose.ui.text.style.Hyphens.m8331equalsimpl0(i4, androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8()) || androidx.compose.ui.text.style.Hyphens.m8331equalsimpl0(i4, paragraphStyle.getHyphens())) && (textMotion == null || kotlin.jvm.internal.Intrinsics.areEqual(textMotion, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j2 = j;
        }
        if (androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j) == 0) {
            j2 = paragraphStyle.getLineHeight();
        }
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        androidx.compose.ui.text.style.TextIndent textIndent3 = textIndent2;
        if (androidx.compose.ui.text.style.TextAlign.m8439equalsimpl0(i5, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8449getUnspecifiede0LSkKk())) {
            i5 = paragraphStyle.getTextAlign();
        }
        return new androidx.compose.ui.text.ParagraphStyle(i5, androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i2, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco()) ? paragraphStyle.getTextDirection() : i2, j2, textIndent3, getHighSpeedVideoFpsRanges(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, androidx.compose.ui.text.style.LineBreak.m8347equalsimpl0(i3, androidx.compose.ui.text.style.LineBreak.INSTANCE.m8361getUnspecifiedrAG3T2k()) ? paragraphStyle.getLineBreak() : i3, androidx.compose.ui.text.style.Hyphens.m8331equalsimpl0(i4, androidx.compose.ui.text.style.Hyphens.INSTANCE.m8337getUnspecifiedvmbZdU8()) ? paragraphStyle.getHyphens() : i4, textMotion == null ? paragraphStyle.getTextMotion() : textMotion, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private static final androidx.compose.ui.text.PlatformParagraphStyle getHighSpeedVideoFpsRanges(androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }
}
