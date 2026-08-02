package com.sun.jna;

/* loaded from: classes5.dex */
public interface ToNativeConverter {
    java.lang.Class<?> nativeType();

    java.lang.Object toNative(java.lang.Object obj, com.sun.jna.ToNativeContext toNativeContext);
}
