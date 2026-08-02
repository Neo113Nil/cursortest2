package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    public static com.google.android.material.color.utilities.Hct from(double d, double d2, double d3) {
        return new com.google.android.material.color.utilities.Hct(com.google.android.material.color.utilities.HctSolver.solveToInt(d, d2, d3));
    }

    public static com.google.android.material.color.utilities.Hct fromInt(int i) {
        return new com.google.android.material.color.utilities.Hct(i);
    }

    private Hct(int i) {
        setInternalState(i);
    }

    public final double getHue() {
        return this.hue;
    }

    public final double getChroma() {
        return this.chroma;
    }

    public final double getTone() {
        return this.tone;
    }

    public final int toInt() {
        return this.argb;
    }

    public final void setHue(double d) {
        setInternalState(com.google.android.material.color.utilities.HctSolver.solveToInt(d, this.chroma, this.tone));
    }

    public final void setChroma(double d) {
        setInternalState(com.google.android.material.color.utilities.HctSolver.solveToInt(this.hue, d, this.tone));
    }

    public final void setTone(double d) {
        setInternalState(com.google.android.material.color.utilities.HctSolver.solveToInt(this.hue, this.chroma, d));
    }

    public final com.google.android.material.color.utilities.Hct inViewingConditions(com.google.android.material.color.utilities.ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = com.google.android.material.color.utilities.Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        com.google.android.material.color.utilities.Cam16 fromXyzInViewingConditions = com.google.android.material.color.utilities.Cam16.fromXyzInViewingConditions(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2], com.google.android.material.color.utilities.ViewingConditions.DEFAULT);
        return from(fromXyzInViewingConditions.getHue(), fromXyzInViewingConditions.getChroma(), com.google.android.material.color.utilities.ColorUtils.lstarFromY(xyzInViewingConditions[1]));
    }

    private void setInternalState(int i) {
        this.argb = i;
        com.google.android.material.color.utilities.Cam16 fromInt = com.google.android.material.color.utilities.Cam16.fromInt(i);
        this.hue = fromInt.getHue();
        this.chroma = fromInt.getChroma();
        this.tone = com.google.android.material.color.utilities.ColorUtils.lstarFromArgb(i);
    }
}
