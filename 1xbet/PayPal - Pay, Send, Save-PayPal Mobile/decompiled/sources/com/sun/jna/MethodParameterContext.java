package com.sun.jna;

/* loaded from: classes5.dex */
public class MethodParameterContext extends com.sun.jna.FunctionParameterContext {
    private java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;

    MethodParameterContext(com.sun.jna.Function function, java.lang.Object[] objArr, int i, java.lang.reflect.Method method) {
        super(function, objArr, i);
        this.getHighResolutionOutputSizeshNQ4ISI = method;
    }

    public java.lang.reflect.Method getMethod() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
