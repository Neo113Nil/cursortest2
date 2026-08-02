package com.sun.jna;

/* loaded from: classes5.dex */
public interface FromNativeConverter {
    java.lang.Object fromNative(java.lang.Object obj, com.sun.jna.FromNativeContext fromNativeContext);

    java.lang.Class<?> nativeType();
}
