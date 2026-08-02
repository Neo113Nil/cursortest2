package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u001ao\u0010\u0019\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010 \u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010#\u001a\u00020\"*\u00020\u00002\u0006\u0010!\u001a\u00020\tH\u0000¢\u0006\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "canReuse-7_7YC6M", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Z", "canReuse", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Landroidx/compose/ui/text/TextRange;", "selectionRange", "isPositionInsideSelection-uaM50fQ", "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/text/TextRange;)Z", "isPositionInsideSelection", "offset", "", "getLineHeight", "(Landroidx/compose/ui/text/TextLayoutResult;I)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m2133canReuse7_7YC6M(androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, int i, boolean z, int i2, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.font.FontFamily.Resolver resolver, long j) {
        androidx.compose.ui.text.TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !kotlin.jvm.internal.Intrinsics.areEqual(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !kotlin.jvm.internal.Intrinsics.areEqual(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i || layoutInput.getSoftWrap() != z || !androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(layoutInput.getOverflow(), i2) || !kotlin.jvm.internal.Intrinsics.areEqual(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !kotlin.jvm.internal.Intrinsics.areEqual(layoutInput.getFontFamilyResolver(), resolver) || androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) != androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(layoutInput.getConstraints())) {
            return false;
        }
        if (z || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(i2, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8())) {
            return androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) == androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(layoutInput.getConstraints()) && androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) == androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(layoutInput.getConstraints());
        }
        return true;
    }

    /* renamed from: isPositionInsideSelection-uaM50fQ, reason: not valid java name */
    public static final boolean m2134isPositionInsideSelectionuaM50fQ(androidx.compose.ui.text.TextLayoutResult textLayoutResult, long j, androidx.compose.ui.text.TextRange textRange) {
        if (textRange == null || androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI())) {
            return false;
        }
        int m8011getOffsetForPositionk4lQ0M = textLayoutResult.m8011getOffsetForPositionk4lQ0M(j);
        return getHighSpeedVideoFpsRangesFor(textRange, textLayoutResult, j, m8011getOffsetForPositionk4lQ0M) || getHighSpeedVideoFpsRangesFor(textRange, textLayoutResult, j, m8011getOffsetForPositionk4lQ0M - 1);
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.TextRange textRange, androidx.compose.ui.text.TextLayoutResult textLayoutResult, long j, int i) {
        return androidx.compose.ui.text.TextRange.m8030containsimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI(), i) && textLayoutResult.getBoundingBox(i).m5778containsk4lQ0M(j);
    }

    public static final float getLineHeight(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        if (i < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int min = java.lang.Math.min(textLayoutResult.getMultiParagraph().getLineForOffset(i), java.lang.Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i > androidx.compose.ui.text.MultiParagraph.getLineEnd$default(textLayoutResult.getMultiParagraph(), min, false, 2, null)) {
            return 0.0f;
        }
        return textLayoutResult.getMultiParagraph().getLineHeight(min);
    }
}
