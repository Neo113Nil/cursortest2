package com.sun.jna;

/* loaded from: classes5.dex */
public class MethodResultContext extends com.sun.jna.FunctionResultContext {
    private final java.lang.reflect.Method getHighSpeedVideoFpsRanges;

    MethodResultContext(java.lang.Class<?> cls, com.sun.jna.Function function, java.lang.Object[] objArr, java.lang.reflect.Method method) {
        super(cls, function, objArr);
        this.getHighSpeedVideoFpsRanges = method;
    }

    public java.lang.reflect.Method getMethod() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
