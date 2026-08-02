package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class ToneDeltaPair {
    private final double delta;
    private final com.google.android.material.color.utilities.TonePolarity polarity;
    private final com.google.android.material.color.utilities.DynamicColor roleA;
    private final com.google.android.material.color.utilities.DynamicColor roleB;
    private final boolean stayTogether;

    public ToneDeltaPair(com.google.android.material.color.utilities.DynamicColor dynamicColor, com.google.android.material.color.utilities.DynamicColor dynamicColor2, double d, com.google.android.material.color.utilities.TonePolarity tonePolarity, boolean z) {
        this.roleA = dynamicColor;
        this.roleB = dynamicColor2;
        this.delta = d;
        this.polarity = tonePolarity;
        this.stayTogether = z;
    }

    public final com.google.android.material.color.utilities.DynamicColor getRoleA() {
        return this.roleA;
    }

    public final com.google.android.material.color.utilities.DynamicColor getRoleB() {
        return this.roleB;
    }

    public final double getDelta() {
        return this.delta;
    }

    public final com.google.android.material.color.utilities.TonePolarity getPolarity() {
        return this.polarity;
    }

    public final boolean getStayTogether() {
        return this.stayTogether;
    }
}
