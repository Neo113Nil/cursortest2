package com.zettle.sdk.common.ui.components.button;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/zettle/sdk/common/ui/components/button/OttoButtonTypes;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;IIII)V", "lineHeight", com.visa.cbp.getEncExpo.warmup, "getLineHeight", "()I", "minHeight", "getMinHeight", "textSize", "getTextSize", "DEFAULT", "SMALL", "COMPACT"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public enum OttoButtonTypes {
    DEFAULT(com.zettle.sdk.common.ui.R.dimen.button_min_height_default, com.zettle.sdk.common.ui.R.dimen.button_text_size_default, com.zettle.sdk.common.ui.R.dimen.button_line_height_default),
    SMALL(com.zettle.sdk.common.ui.R.dimen.button_min_height_small, com.zettle.sdk.common.ui.R.dimen.button_text_size_small, com.zettle.sdk.common.ui.R.dimen.button_line_height_small),
    COMPACT(com.zettle.sdk.common.ui.R.dimen.button_min_height_compact, com.zettle.sdk.common.ui.R.dimen.button_text_size_compact, com.zettle.sdk.common.ui.R.dimen.button_line_height_compact);

    private final int lineHeight;
    private final int minHeight;
    private final int textSize;

    OttoButtonTypes(int i, int i2, int i3) {
        this.minHeight = i;
        this.textSize = i2;
        this.lineHeight = i3;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }
}
