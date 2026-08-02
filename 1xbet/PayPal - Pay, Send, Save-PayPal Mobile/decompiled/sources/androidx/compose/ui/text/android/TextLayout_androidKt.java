package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u000b\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000b\u0010\u0016\u001a\u001b\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\"\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "getTextDirectionHeuristic", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "Landroidx/compose/ui/text/android/VerticalPaddings;", "VerticalPaddings", "(II)J", "Landroidx/compose/ui/text/android/TextLayout;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/text/android/TextLayout;)J", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "getHighResolutionOutputSizeshNQ4ISI", "([Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)J", "Landroid/text/TextPaint;", "p0", "p1", "p2", "Landroid/graphics/Paint$FontMetricsInt;", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)Landroid/graphics/Paint$FontMetricsInt;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/Layout;", "lineIndex", "", "isLineEllipsized", "(Landroid/text/Layout;I)Z", "Ljava/lang/ThreadLocal;", "Landroidx/compose/ui/text/android/TextAndroidCanvas;", "SharedTextAndroidCanvas", "Ljava/lang/ThreadLocal;", "getSharedTextAndroidCanvas", "()Ljava/lang/ThreadLocal;", "getSharedTextAndroidCanvas$annotations", "()V", "J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextLayout_androidKt {
    private static final java.lang.ThreadLocal<androidx.compose.ui.text.android.TextAndroidCanvas> SharedTextAndroidCanvas = new java.lang.ThreadLocal<>();
    private static final long Camera2StreamConfigurationMap = VerticalPaddings(0, 0);

    public static /* synthetic */ void getSharedTextAndroidCanvas$annotations() {
    }

    public static final java.lang.ThreadLocal<androidx.compose.ui.text.android.TextAndroidCanvas> getSharedTextAndroidCanvas() {
        return SharedTextAndroidCanvas;
    }

    public static final android.text.TextDirectionHeuristic getTextDirectionHeuristic(int i) {
        if (i == 0) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        if (i == 1) {
            return android.text.TextDirectionHeuristics.RTL;
        }
        if (i == 2) {
            return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i == 4) {
            return android.text.TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (i == 5) {
            return android.text.TextDirectionHeuristics.LOCALE;
        }
        return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static final long VerticalPaddings(int i, int i2) {
        return androidx.compose.ui.text.android.VerticalPaddings.m8088constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Camera2StreamConfigurationMap(androidx.compose.ui.text.android.TextLayout textLayout) {
        int topPadding;
        int bottomPadding;
        if (textLayout.getIncludePadding() || textLayout.isFallbackLinespacingApplied$ui_text()) {
            return Camera2StreamConfigurationMap;
        }
        android.text.TextPaint paint = textLayout.getLayout().getPaint();
        java.lang.CharSequence text = textLayout.getLayout().getText();
        android.graphics.Rect charSequenceBounds = androidx.compose.ui.text.android.PaintExtensions_androidKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
        int lineAscent = textLayout.getLayout().getLineAscent(0);
        if (charSequenceBounds.top < lineAscent) {
            topPadding = lineAscent - charSequenceBounds.top;
        } else {
            topPadding = textLayout.getLayout().getTopPadding();
        }
        if (textLayout.getLineCount() != 1) {
            int lineCount = textLayout.getLineCount() - 1;
            charSequenceBounds = androidx.compose.ui.text.android.PaintExtensions_androidKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
        }
        int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
        if (charSequenceBounds.bottom > lineDescent) {
            bottomPadding = charSequenceBounds.bottom - lineDescent;
        } else {
            bottomPadding = textLayout.getLayout().getBottomPadding();
        }
        if (topPadding == 0 && bottomPadding == 0) {
            return Camera2StreamConfigurationMap;
        }
        return VerticalPaddings(topPadding, bottomPadding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.android.style.LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int i = 0;
        int i2 = 0;
        for (androidx.compose.ui.text.android.style.LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                i = java.lang.Math.max(i, java.lang.Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                i2 = java.lang.Math.max(i, java.lang.Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        if (i == 0 && i2 == 0) {
            return Camera2StreamConfigurationMap;
        }
        return VerticalPaddings(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Paint.FontMetricsInt Camera2StreamConfigurationMap(androidx.compose.ui.text.android.TextLayout textLayout, android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, androidx.compose.ui.text.android.style.LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        android.text.StaticLayout create;
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) != textLayout.getLayout().getLineEnd(lineCount) || lineHeightStyleSpanArr == null || lineHeightStyleSpanArr.length == 0) {
            return null;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString("\u200b");
        androidx.compose.ui.text.android.style.LineHeightStyleSpan lineHeightStyleSpan = (androidx.compose.ui.text.android.style.LineHeightStyleSpan) kotlin.collections.ArraysKt.first(lineHeightStyleSpanArr);
        spannableString.setSpan(lineHeightStyleSpan.copy$ui_text(0, spannableString.length(), (lineCount == 0 || !lineHeightStyleSpan.getTrimLastLineBottom()) ? lineHeightStyleSpan.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        create = androidx.compose.ui.text.android.StaticLayoutFactory.INSTANCE.create(r6, textPaint, Integer.MAX_VALUE, (r47 & 8) != 0 ? 0 : 0, (r47 & 16) != 0 ? spannableString.length() : spannableString.length(), (r47 & 32) != 0 ? androidx.compose.ui.text.android.LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text() : textDirectionHeuristic, (r47 & 64) != 0 ? androidx.compose.ui.text.android.LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & 256) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & 1024) != 0 ? 1.0f : 0.0f, (r47 & 2048) != 0 ? 0.0f : 0.0f, (r47 & 4096) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : textLayout.getIncludePadding(), (r47 & 16384) != 0 ? true : textLayout.getFallbackLineSpacing(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = new android.graphics.Paint.FontMetricsInt();
        fontMetricsInt.ascent = create.getLineAscent(0);
        fontMetricsInt.descent = create.getLineDescent(0);
        fontMetricsInt.top = create.getLineTop(0);
        fontMetricsInt.bottom = create.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.android.style.LineHeightStyleSpan[] getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.android.TextLayout textLayout) {
        if (!(textLayout.getText() instanceof android.text.Spanned)) {
            return null;
        }
        java.lang.CharSequence text = textLayout.getText();
        kotlin.jvm.internal.Intrinsics.checkNotNull(text, "");
        if (!androidx.compose.ui.text.android.SpannedExtensions_androidKt.hasSpan((android.text.Spanned) text, androidx.compose.ui.text.android.style.LineHeightStyleSpan.class) && textLayout.getText().length() > 0) {
            return null;
        }
        java.lang.CharSequence text2 = textLayout.getText();
        kotlin.jvm.internal.Intrinsics.checkNotNull(text2, "");
        return (androidx.compose.ui.text.android.style.LineHeightStyleSpan[]) ((android.text.Spanned) text2).getSpans(0, textLayout.getText().length(), androidx.compose.ui.text.android.style.LineHeightStyleSpan.class);
    }

    public static final boolean isLineEllipsized(android.text.Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
