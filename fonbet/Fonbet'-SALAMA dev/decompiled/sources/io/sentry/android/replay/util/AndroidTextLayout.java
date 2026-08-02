package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.protocol.SentryTransaction;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidTextLayout implements TextLayout {
    public static final int $stable = 8;
    private final Layout layout;

    public AndroidTextLayout(Layout layout) {
        h.e(layout, "layout");
        this.layout = layout;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public Integer getDominantTextColor() {
        int i7;
        if (!(this.layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.layout.getText();
        h.c(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.layout.getText().length(), ForegroundColorSpan.class);
        h.d(foregroundColorSpanArr, SentryTransaction.JsonKeys.SPANS);
        int i8 = Integer.MIN_VALUE;
        Integer num = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = this.layout.getText();
            h.c(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.layout.getText();
            h.c(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i7 = spanEnd - spanStart) > i8) {
                num = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i8 = i7;
            }
        }
        if (num != null) {
            return Integer.valueOf(ViewsKt.toOpaque(num.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getEllipsisCount(int i7) {
        return this.layout.getEllipsisCount(i7);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineBottom(int i7) {
        return this.layout.getLineBottom(i7);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineStart(int i7) {
        return this.layout.getLineStart(i7);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineTop(int i7) {
        return this.layout.getLineTop(i7);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineVisibleEnd(int i7) {
        return this.layout.getLineVisibleEnd(i7);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getPrimaryHorizontal(int i7, int i8) {
        return this.layout.getPrimaryHorizontal(i8);
    }
}
