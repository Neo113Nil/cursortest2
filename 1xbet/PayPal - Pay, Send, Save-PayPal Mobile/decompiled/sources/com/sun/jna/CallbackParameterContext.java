package com.sun.jna;

/* loaded from: classes16.dex */
public class CallbackParameterContext extends com.sun.jna.FromNativeContext {
    private int Camera2StreamConfigurationMap;
    private java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    private java.lang.Object[] getHighSpeedVideoFpsRangesFor;

    CallbackParameterContext(java.lang.Class<?> cls, java.lang.reflect.Method method, java.lang.Object[] objArr, int i) {
        super(cls);
        this.getHighSpeedVideoFpsRanges = method;
        this.getHighSpeedVideoFpsRangesFor = objArr;
        this.Camera2StreamConfigurationMap = i;
    }

    public java.lang.reflect.Method getMethod() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.Object[] getArguments() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getIndex() {
        return this.Camera2StreamConfigurationMap;
    }
}
