package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import q2.g;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ComposeTextLayout implements TextLayout {
    public static final int $stable = TextLayoutResult.$stable;
    private final boolean hasFillModifier;
    private final TextLayoutResult layout;

    public ComposeTextLayout(TextLayoutResult textLayoutResult, boolean z4) {
        h.e(textLayoutResult, "layout");
        this.layout = textLayoutResult;
        this.hasFillModifier = z4;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public Integer getDominantTextColor() {
        return null;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getEllipsisCount(int i7) {
        return this.layout.isLineEllipsized(i7) ? 1 : 0;
    }

    public final TextLayoutResult getLayout$sentry_android_replay_release() {
        return this.layout;
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineBottom(int i7) {
        return g.d(this.layout.getLineBottom(i7));
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
        return g.d(this.layout.getLineTop(i7));
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public int getLineVisibleEnd(int i7) {
        return this.layout.getLineEnd(i7, true);
    }

    @Override // io.sentry.android.replay.util.TextLayout
    public float getPrimaryHorizontal(int i7, int i8) {
        float horizontalPosition = this.layout.getHorizontalPosition(i8, true);
        return (this.hasFillModifier || getLineCount() != 1) ? horizontalPosition : horizontalPosition - this.layout.getLineLeft(i7);
    }
}
