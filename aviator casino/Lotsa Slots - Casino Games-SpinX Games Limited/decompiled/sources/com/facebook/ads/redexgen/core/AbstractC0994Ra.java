package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ra, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0994Ra {
    public static <T> T A00(T impl, java.lang.Class<T> clazz) {
        java.lang.ClassLoader classLoader = impl.getClass().getClassLoader();
        return clazz.cast(java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{clazz}, new com.facebook.ads.redexgen.core.RZ(impl, classLoader)));
    }
}
