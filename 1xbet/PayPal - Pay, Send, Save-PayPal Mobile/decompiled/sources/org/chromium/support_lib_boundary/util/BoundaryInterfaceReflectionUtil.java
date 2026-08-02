package org.chromium.support_lib_boundary.util;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public class BoundaryInterfaceReflectionUtil {
    private static android.util.LruCache<android.util.Pair<java.lang.reflect.Method, java.lang.ClassLoader>, java.lang.reflect.Method> Camera2StreamConfigurationMap;
    private static java.util.function.Consumer<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    public static void setMethodCache(android.util.LruCache<android.util.Pair<java.lang.reflect.Method, java.lang.ClassLoader>, java.lang.reflect.Method> lruCache, java.util.function.Consumer<java.lang.Boolean> consumer) {
        Camera2StreamConfigurationMap = lruCache;
        getHighSpeedVideoFpsRangesFor = consumer;
    }

    public static boolean instanceOfInOwnClassLoader(java.lang.Object obj, java.lang.String str) {
        try {
            return java.lang.Class.forName(str, false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static java.lang.reflect.Method dupeMethod(java.lang.reflect.Method method, java.lang.ClassLoader classLoader) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
        android.util.LruCache<android.util.Pair<java.lang.reflect.Method, java.lang.ClassLoader>, java.lang.reflect.Method> lruCache = Camera2StreamConfigurationMap;
        if (lruCache != null) {
            java.lang.reflect.Method method2 = lruCache.get(new android.util.Pair<>(method, classLoader));
            java.util.function.Consumer<java.lang.Boolean> consumer = getHighSpeedVideoFpsRangesFor;
            if (consumer != null) {
                consumer.accept(java.lang.Boolean.valueOf(method2 != null));
            }
            if (method2 != null) {
                return method2;
            }
        }
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
        android.util.LruCache<android.util.Pair<java.lang.reflect.Method, java.lang.ClassLoader>, java.lang.reflect.Method> lruCache2 = Camera2StreamConfigurationMap;
        if (lruCache2 != null) {
            lruCache2.put(new android.util.Pair<>(method, classLoader), declaredMethod);
        }
        return declaredMethod;
    }

    public static <T> T castToSuppLibClass(java.lang.Class<T> cls, java.lang.reflect.InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(java.lang.reflect.Proxy.newProxyInstance(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.class.getClassLoader(), new java.lang.Class[]{cls}, invocationHandler));
    }

    public static java.lang.reflect.InvocationHandler createInvocationHandlerFor(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.InvocationHandlerWithDelegateGetter(obj);
    }

    public static java.lang.reflect.InvocationHandler[] createInvocationHandlersForArray(java.lang.Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        java.lang.reflect.InvocationHandler[] invocationHandlerArr = new java.lang.reflect.InvocationHandler[length];
        for (int i = 0; i < length; i++) {
            invocationHandlerArr[i] = createInvocationHandlerFor(objArr[i]);
        }
        return invocationHandlerArr;
    }

    public static java.lang.Object getDelegateFromInvocationHandler(java.lang.reflect.InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.InvocationHandlerWithDelegateGetter) invocationHandler).getHighResolutionOutputSizeshNQ4ISI;
    }

    static class InvocationHandlerWithDelegateGetter implements java.lang.reflect.InvocationHandler {
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        public InvocationHandlerWithDelegateGetter(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            try {
                return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.dupeMethod(method, this.getHighResolutionOutputSizeshNQ4ISI.getClass().getClassLoader()).invoke(this.getHighResolutionOutputSizeshNQ4ISI, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getTargetException();
            } catch (java.lang.ReflectiveOperationException e2) {
                throw new java.lang.RuntimeException("Reflection failed for method ".concat(java.lang.String.valueOf(method)), e2);
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.InvocationHandlerWithDelegateGetter) {
                return this.getHighResolutionOutputSizeshNQ4ISI.equals(((org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.InvocationHandlerWithDelegateGetter) obj).getHighResolutionOutputSizeshNQ4ISI);
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(obj);
        }

        public int hashCode() {
            return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }
    }

    public static boolean containsFeature(java.util.Collection<java.lang.String> collection, java.lang.String str) {
        if (collection.contains(str)) {
            return true;
        }
        if (!"eng".equals(android.os.Build.TYPE) && !"userdebug".equals(android.os.Build.TYPE)) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(org.chromium.support_lib_boundary.util.Features.DEV_SUFFIX);
        return collection.contains(sb.toString());
    }

    public static boolean containsFeature(java.lang.String[] strArr, java.lang.String str) {
        return containsFeature(java.util.Arrays.asList(strArr), str);
    }
}
