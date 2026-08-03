package androidx.compose.ui.text.android;

/* compiled from: TextLayout.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0000\u001a1\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u0003*\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u000fH\u0002¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0003*\u00020\u000fH\u0002¢\u0006\u0002\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006!"}, d2 = {"SharedTextAndroidCanvas", "Landroidx/compose/ui/text/android/TextAndroidCanvas;", "ZeroVerticalPadding", "Landroidx/compose/ui/text/android/VerticalPaddings;", "J", "VerticalPaddings", "topPadding", "", "bottomPadding", "(II)J", "getTextDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "textDirectionHeuristic", "getLastLineMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "Landroidx/compose/ui/text/android/TextLayout;", "textPaint", "Landroid/text/TextPaint;", "frameworkTextDir", "lineHeightSpans", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)Landroid/graphics/Paint$FontMetricsInt;", "getLineHeightPaddings", "(Landroidx/compose/ui/text/android/TextLayout;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)J", "getLineHeightSpans", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "getVerticalPaddings", "(Landroidx/compose/ui/text/android/TextLayout;)J", "isLineEllipsized", "", "Landroid/text/Layout;", "lineIndex", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutKt {
    private static final androidx.compose.ui.text.android.TextAndroidCanvas SharedTextAndroidCanvas = new androidx.compose.ui.text.android.TextAndroidCanvas();
    private static final long ZeroVerticalPadding = VerticalPaddings(0, 0);

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
        return androidx.compose.ui.text.android.VerticalPaddings.m4012constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getVerticalPaddings(androidx.compose.ui.text.android.TextLayout textLayout) {
        int topPadding;
        int bottomPadding;
        if (textLayout.getIncludePadding() || textLayout.isFallbackLinespacingApplied$ui_text_release()) {
            return ZeroVerticalPadding;
        }
        android.text.TextPaint paint = textLayout.getLayout().getPaint();
        java.lang.CharSequence text = textLayout.getLayout().getText();
        android.graphics.Rect charSequenceBounds = androidx.compose.ui.text.android.PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
        int lineAscent = textLayout.getLayout().getLineAscent(0);
        if (charSequenceBounds.top < lineAscent) {
            topPadding = lineAscent - charSequenceBounds.top;
        } else {
            topPadding = textLayout.getLayout().getTopPadding();
        }
        if (textLayout.getLineCount() != 1) {
            int lineCount = textLayout.getLineCount() - 1;
            charSequenceBounds = androidx.compose.ui.text.android.PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
        }
        int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
        if (charSequenceBounds.bottom > lineDescent) {
            bottomPadding = charSequenceBounds.bottom - lineDescent;
        } else {
            bottomPadding = textLayout.getLayout().getBottomPadding();
        }
        if (topPadding == 0 && bottomPadding == 0) {
            return ZeroVerticalPadding;
        }
        return VerticalPaddings(topPadding, bottomPadding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLineHeightPaddings(androidx.compose.ui.text.android.TextLayout textLayout, androidx.compose.ui.text.android.style.LineHeightStyleSpan[] lineHeightStyleSpanArr) {
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
            return ZeroVerticalPadding;
        }
        return VerticalPaddings(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Paint.FontMetricsInt getLastLineMetrics(androidx.compose.ui.text.android.TextLayout textLayout, android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, androidx.compose.ui.text.android.style.LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        android.text.StaticLayout create;
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) != textLayout.getLayout().getLineEnd(lineCount)) {
            return null;
        }
        if (!(true ^ (lineHeightStyleSpanArr.length == 0))) {
            return null;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString("\u200b");
        androidx.compose.ui.text.android.style.LineHeightStyleSpan lineHeightStyleSpan = (androidx.compose.ui.text.android.style.LineHeightStyleSpan) kotlin.collections.ArraysKt.first(lineHeightStyleSpanArr);
        spannableString.setSpan(lineHeightStyleSpan.copy$ui_text_release(0, spannableString.length(), (lineCount == 0 || !lineHeightStyleSpan.getTrimLastLineBottom()) ? lineHeightStyleSpan.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        create = androidx.compose.ui.text.android.StaticLayoutFactory.INSTANCE.create(r6, textPaint, Integer.MAX_VALUE, (r47 & 8) != 0 ? 0 : 0, (r47 & 16) != 0 ? spannableString.length() : spannableString.length(), (r47 & 32) != 0 ? androidx.compose.ui.text.android.LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic, (r47 & 64) != 0 ? androidx.compose.ui.text.android.LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & 256) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & 1024) != 0 ? 1.0f : 0.0f, (r47 & 2048) != 0 ? 0.0f : 0.0f, (r47 & 4096) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : textLayout.getIncludePadding(), (r47 & 16384) != 0 ? true : textLayout.getFallbackLineSpacing(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = new android.graphics.Paint.FontMetricsInt();
        fontMetricsInt.ascent = create.getLineAscent(0);
        fontMetricsInt.descent = create.getLineDescent(0);
        fontMetricsInt.top = create.getLineTop(0);
        fontMetricsInt.bottom = create.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.android.style.LineHeightStyleSpan[] getLineHeightSpans(androidx.compose.ui.text.android.TextLayout textLayout) {
        if (textLayout.getText() instanceof android.text.Spanned) {
            java.lang.CharSequence text = textLayout.getText();
            kotlin.jvm.internal.Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
            androidx.compose.ui.text.android.style.LineHeightStyleSpan[] lineHeightStyleSpanArr = (androidx.compose.ui.text.android.style.LineHeightStyleSpan[]) ((android.text.Spanned) text).getSpans(0, textLayout.getText().length(), androidx.compose.ui.text.android.style.LineHeightStyleSpan.class);
            return lineHeightStyleSpanArr.length == 0 ? new androidx.compose.ui.text.android.style.LineHeightStyleSpan[0] : lineHeightStyleSpanArr;
        }
        return new androidx.compose.ui.text.android.style.LineHeightStyleSpan[0];
    }

    public static final boolean isLineEllipsized(android.text.Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
