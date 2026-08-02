package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001e8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u0014\u0010-\u001a\u00020*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/ParagraphStyle;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "", "minIntrinsicWidth$delegate", "Lkotlin/Lazy;", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "maxIntrinsicWidth$delegate", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "infoList", "getInfoList$ui_text", "", "getHasStaleResolvedFonts", "()Z", "hasStaleResolvedFonts"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements androidx.compose.ui.text.ParagraphIntrinsics {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.AnnotatedString annotatedString;
    private final java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> infoList;

    /* renamed from: maxIntrinsicWidth$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy maxIntrinsicWidth;

    /* renamed from: minIntrinsicWidth$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy minIntrinsicWidth;
    private final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> placeholders;

    public MultiParagraphIntrinsics(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        java.util.List highResolutionOutputSizeshNQ4ISI;
        this.annotatedString = annotatedString;
        this.placeholders = list;
        this.minIntrinsicWidth = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.ui.text.MultiParagraphIntrinsics.getHighSpeedVideoSizes(androidx.compose.ui.text.MultiParagraphIntrinsics.this);
                return java.lang.Float.valueOf(highSpeedVideoSizes);
            }
        });
        this.maxIntrinsicWidth = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.ui.text.MultiParagraphIntrinsics.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.MultiParagraphIntrinsics.this);
                return java.lang.Float.valueOf(highSpeedVideoFpsRangesFor);
            }
        });
        androidx.compose.ui.text.ParagraphStyle paragraphStyle = textStyle.toParagraphStyle();
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> normalizedParagraphStyles = androidx.compose.ui.text.AnnotatedStringKt.normalizedParagraphStyles(annotatedString, paragraphStyle);
        java.util.ArrayList arrayList = new java.util.ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            java.util.ArrayList arrayList2 = arrayList;
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle> range = normalizedParagraphStyles.get(i);
            androidx.compose.ui.text.AnnotatedString highSpeedVideoFpsRanges = androidx.compose.ui.text.AnnotatedStringKt.getHighSpeedVideoFpsRanges(annotatedString, range.getStart(), range.getEnd());
            androidx.compose.ui.text.ParagraphStyle access$resolveTextDirection = access$resolveTextDirection(this, range.getItem(), paragraphStyle);
            java.lang.String text = highSpeedVideoFpsRanges.getText();
            androidx.compose.ui.text.TextStyle merge = textStyle.merge(access$resolveTextDirection);
            java.util.List<androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> annotations$ui_text = highSpeedVideoFpsRanges.getAnnotations$ui_text();
            if (annotations$ui_text == null) {
                annotations$ui_text = kotlin.collections.CollectionsKt.emptyList();
            }
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.text.MultiParagraphIntrinsicsKt.getHighResolutionOutputSizeshNQ4ISI(getPlaceholders(), range.getStart(), range.getEnd());
            arrayList2.add(new androidx.compose.ui.text.ParagraphIntrinsicInfo(androidx.compose.ui.text.ParagraphIntrinsicsKt.ParagraphIntrinsics(text, merge, annotations$ui_text, density, resolver, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) highResolutionOutputSizeshNQ4ISI), range.getStart(), range.getEnd()));
        }
        this.infoList = arrayList;
    }

    public static final /* synthetic */ androidx.compose.ui.text.ParagraphStyle access$resolveTextDirection(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics, androidx.compose.ui.text.ParagraphStyle paragraphStyle, androidx.compose.ui.text.ParagraphStyle paragraphStyle2) {
        return getHighResolutionOutputSizeshNQ4ISI(paragraphStyle, paragraphStyle2);
    }

    public final androidx.compose.ui.text.AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @kotlin.Deprecated(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @kotlin.ReplaceWith(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public MultiParagraphIntrinsics(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader) {
        this(annotatedString, textStyle, list, density, androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float getMinIntrinsicWidth() {
        return ((java.lang.Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoSizes(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics) {
        androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        androidx.compose.ui.text.ParagraphIntrinsics intrinsics;
        java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> list = multiParagraphIntrinsics.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float minIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i = 1;
                while (true) {
                    androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i);
                    float minIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMinIntrinsicWidth();
                    if (java.lang.Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        minIntrinsicWidth = minIntrinsicWidth2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float getMaxIntrinsicWidth() {
        return ((java.lang.Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics) {
        androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        androidx.compose.ui.text.ParagraphIntrinsics intrinsics;
        java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> list = multiParagraphIntrinsics.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float maxIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i = 1;
                while (true) {
                    androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i);
                    float maxIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMaxIntrinsicWidth();
                    if (java.lang.Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        maxIntrinsicWidth = maxIntrinsicWidth2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        androidx.compose.ui.text.ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.getMaxIntrinsicWidth();
    }

    public final java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> getInfoList$ui_text() {
        return this.infoList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final boolean getHasStaleResolvedFonts() {
        java.util.List<androidx.compose.ui.text.ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    private static androidx.compose.ui.text.ParagraphStyle getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.ParagraphStyle p0, androidx.compose.ui.text.ParagraphStyle p1) {
        androidx.compose.ui.text.ParagraphStyle m7916copyykzQM6k;
        if (!androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(p0.getTextDirection(), androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco())) {
            return p0;
        }
        m7916copyykzQM6k = p0.m7916copyykzQM6k((r22 & 1) != 0 ? p0.textAlign : 0, (r22 & 2) != 0 ? p0.textDirection : p1.getTextDirection(), (r22 & 4) != 0 ? p0.lineHeight : 0L, (r22 & 8) != 0 ? p0.textIndent : null, (r22 & 16) != 0 ? p0.platformStyle : null, (r22 & 32) != 0 ? p0.lineHeightStyle : null, (r22 & 64) != 0 ? p0.lineBreak : 0, (r22 & 128) != 0 ? p0.hyphens : 0, (r22 & 256) != 0 ? p0.textMotion : null);
        return m7916copyykzQM6k;
    }
}
