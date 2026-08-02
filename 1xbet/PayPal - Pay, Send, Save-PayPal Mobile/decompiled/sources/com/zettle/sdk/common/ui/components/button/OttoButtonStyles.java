package com.zettle.sdk.common.ui.components.button;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000ej\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/zettle/sdk/common/ui/components/button/OttoButtonStyles;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;IIIIIII)V", "backgroundTint", com.visa.cbp.getEncExpo.warmup, "getBackgroundTint", "()I", "iconTint", "getIconTint", "rippleColor", "getRippleColor", "strokeColor", "getStrokeColor", "strokeWidth", "getStrokeWidth", "textColor", "getTextColor", "PRIMARY", "SECONDARY"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public enum OttoButtonStyles {
    PRIMARY(com.zettle.sdk.common.ui.R.color.button_border_primary_selector, com.zettle.sdk.common.ui.R.color.button_background_primary_selector, com.zettle.sdk.common.ui.R.color.actionPrimaryBackgroundHover, com.zettle.sdk.common.ui.R.dimen.button_stroke_width, com.zettle.sdk.common.ui.R.color.text_primary_selector, com.zettle.sdk.common.ui.R.color.text_primary_selector),
    SECONDARY(com.zettle.sdk.common.ui.R.color.button_border_secondary_selector, com.zettle.sdk.common.ui.R.color.button_background_secondary_selector, com.zettle.sdk.common.ui.R.color.actionSecondaryBackgroundHoverV2, com.zettle.sdk.common.ui.R.dimen.button_stroke_width, com.zettle.sdk.common.ui.R.color.text_secondary_selector_v2, com.zettle.sdk.common.ui.R.color.text_secondary_selector_v2);

    private final int backgroundTint;
    private final int iconTint;
    private final int rippleColor;
    private final int strokeColor;
    private final int strokeWidth;
    private final int textColor;

    OttoButtonStyles(int i, int i2, int i3, int i4, int i5, int i6) {
        this.strokeColor = i;
        this.backgroundTint = i2;
        this.rippleColor = i3;
        this.strokeWidth = i4;
        this.iconTint = i5;
        this.textColor = i6;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getBackgroundTint() {
        return this.backgroundTint;
    }

    public final int getRippleColor() {
        return this.rippleColor;
    }

    public final int getStrokeWidth() {
        return this.strokeWidth;
    }

    public final int getIconTint() {
        return this.iconTint;
    }

    public final int getTextColor() {
        return this.textColor;
    }
}
