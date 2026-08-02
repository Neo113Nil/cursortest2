package com.sun.jna;

/* loaded from: classes5.dex */
public interface TypeMapper {
    com.sun.jna.FromNativeConverter getFromNativeConverter(java.lang.Class<?> cls);

    com.sun.jna.ToNativeConverter getToNativeConverter(java.lang.Class<?> cls);
}
