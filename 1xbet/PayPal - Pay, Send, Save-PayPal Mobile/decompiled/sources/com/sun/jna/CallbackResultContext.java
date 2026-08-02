package com.sun.jna;

/* loaded from: classes16.dex */
public class CallbackResultContext extends com.sun.jna.ToNativeContext {
    private java.lang.reflect.Method getHighSpeedVideoSizes;

    CallbackResultContext(java.lang.reflect.Method method) {
        this.getHighSpeedVideoSizes = method;
    }

    public java.lang.reflect.Method getMethod() {
        return this.getHighSpeedVideoSizes;
    }
}
