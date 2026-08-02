package com.sun.jna;

/* loaded from: classes5.dex */
public class FunctionResultContext extends com.sun.jna.FromNativeContext {
    private com.sun.jna.Function getHighSpeedVideoFpsRanges;
    private java.lang.Object[] getHighSpeedVideoSizes;

    FunctionResultContext(java.lang.Class<?> cls, com.sun.jna.Function function, java.lang.Object[] objArr) {
        super(cls);
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighSpeedVideoSizes = objArr;
    }

    public com.sun.jna.Function getFunction() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.Object[] getArguments() {
        return this.getHighSpeedVideoSizes;
    }
}
