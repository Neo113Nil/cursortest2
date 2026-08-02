package com.google.common.reflect;

/* loaded from: classes9.dex */
public abstract class AbstractInvocationHandler implements java.lang.reflect.InvocationHandler {
    private static final java.lang.Object[] NO_ARGS = new java.lang.Object[0];

    protected abstract java.lang.Object handleInvocation(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable;

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (objArr == null) {
            objArr = NO_ARGS;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return java.lang.Integer.valueOf(hashCode());
        }
        if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == java.lang.Object.class) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 == null) {
                return java.lang.Boolean.FALSE;
            }
            if (obj == obj2) {
                return java.lang.Boolean.TRUE;
            }
            return java.lang.Boolean.valueOf(isProxyOfSameInterfaces(obj2, obj.getClass()) && equals(java.lang.reflect.Proxy.getInvocationHandler(obj2)));
        }
        if (objArr.length == 0 && method.getName().equals("toString")) {
            return toString();
        }
        return handleInvocation(obj, method, objArr);
    }

    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public java.lang.String toString() {
        return super.toString();
    }

    private static boolean isProxyOfSameInterfaces(java.lang.Object obj, java.lang.Class<?> cls) {
        if (cls.isInstance(obj)) {
            return true;
        }
        return java.lang.reflect.Proxy.isProxyClass(obj.getClass()) && java.util.Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces());
    }
}
