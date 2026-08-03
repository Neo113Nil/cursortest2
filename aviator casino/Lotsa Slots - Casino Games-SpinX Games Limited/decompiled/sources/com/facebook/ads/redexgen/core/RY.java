package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class RY implements java.lang.reflect.InvocationHandler {
    public final /* synthetic */ java.lang.ClassLoader A00;

    public RY(java.lang.ClassLoader classLoader) {
        this.A00 = classLoader;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object A00;
        A00 = com.facebook.ads.redexgen.core.RZ.A00(this.A00, method);
        return A00;
    }
}
