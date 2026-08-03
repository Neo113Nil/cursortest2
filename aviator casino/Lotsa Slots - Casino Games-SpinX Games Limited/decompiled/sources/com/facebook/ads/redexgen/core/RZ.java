package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class RZ<T> implements java.lang.reflect.InvocationHandler {
    public static byte[] A02;
    public java.lang.ClassLoader A00;
    public T A01;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{49, 32, 57};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.RZ != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public RZ(T impl, java.lang.ClassLoader classLoader) {
        this.A01 = impl;
        this.A00 = classLoader;
    }

    public static java.lang.Object A00(java.lang.ClassLoader classLoader, java.lang.reflect.Method method) {
        java.lang.Class<?> returnType = method.getReturnType();
        java.lang.Object result = java.lang.Void.TYPE;
        if (returnType.equals(result)) {
            return null;
        }
        if (returnType.isPrimitive()) {
            java.lang.Object result2 = java.lang.reflect.Array.newInstance(method.getReturnType(), 1);
            return java.lang.reflect.Array.get(result2, 0);
        }
        if (returnType.equals(java.lang.String.class)) {
            return A02(0, 0, 70);
        }
        if (!returnType.isInterface()) {
            return null;
        }
        return java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{returnType}, new com.facebook.ads.redexgen.core.RY(classLoader));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.RZ != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public final T A04() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.RZ != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        try {
            return method.invoke(this.A01, objArr);
        } catch (java.lang.Throwable t) {
            if (t instanceof java.lang.reflect.InvocationTargetException) {
                java.lang.Throwable targetException = ((java.lang.reflect.InvocationTargetException) t).getTargetException();
                if (targetException instanceof com.facebook.ads.redexgen.core.OF) {
                    throw new java.lang.IllegalStateException(targetException.getMessage());
                }
            }
            java.lang.Object A00 = A00(this.A00, method);
            com.facebook.ads.redexgen.core.C1632ge A002 = com.facebook.ads.redexgen.core.T7.A00();
            if (A002 != null) {
                A002.A08().ABC(A02(0, 3, 54), com.facebook.ads.redexgen.core.AbstractC1048Td.A0O, new com.facebook.ads.redexgen.core.C1049Te(t));
                return A00;
            }
            return A00;
        }
    }
}
