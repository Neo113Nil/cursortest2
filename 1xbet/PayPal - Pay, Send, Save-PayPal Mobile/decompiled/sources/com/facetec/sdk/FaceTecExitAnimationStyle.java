package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum FaceTecExitAnimationStyle {
    CIRCLE_FADE(0),
    RIPPLE_OUT(1),
    RIPPLE_IN(2),
    NONE(3);

    private final int b;

    FaceTecExitAnimationStyle(int i) {
        this.b = i;
    }

    public final int getValue() {
        return this.b;
    }
}
