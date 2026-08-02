package com.sun.jna;

/* loaded from: classes5.dex */
public class FunctionParameterContext extends com.sun.jna.ToNativeContext {
    private com.sun.jna.Function getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private java.lang.Object[] getHighSpeedVideoSizes;

    FunctionParameterContext(com.sun.jna.Function function, java.lang.Object[] objArr, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoSizes = objArr;
        this.getHighSpeedVideoFpsRanges = i;
    }

    public com.sun.jna.Function getFunction() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.Object[] getParameters() {
        return this.getHighSpeedVideoSizes;
    }

    public int getParameterIndex() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
