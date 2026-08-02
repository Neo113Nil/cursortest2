package com.sun.jna;

/* loaded from: classes5.dex */
public interface CallbackProxy extends com.sun.jna.Callback {
    java.lang.Object callback(java.lang.Object[] objArr);

    java.lang.Class<?>[] getParameterTypes();

    java.lang.Class<?> getReturnType();
}
