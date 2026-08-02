package com.sun.jna.internal;

/* loaded from: classes5.dex */
public class ReflectionUtils {
    private static final java.lang.reflect.Method Camera2StreamConfigurationMap;
    private static final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.reflect.Constructor getHighSpeedVideoFpsRanges;
    private static final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
    private static final java.util.logging.Logger getHighSpeedVideoSizes = java.util.logging.Logger.getLogger(com.sun.jna.internal.ReflectionUtils.class.getName());
    private static final java.lang.reflect.Method getHighSpeedVideoSizesFor;
    private static final java.lang.reflect.Method getInputFormats;
    private static final java.lang.reflect.Method getInputSizeshNQ4ISI;
    private static final java.lang.reflect.Method getOutputFormats;
    private static final java.lang.reflect.Method getOutputMinFrameDuration;
    private static final java.lang.reflect.Method getOutputSizeshNQ4ISI;

    static {
        java.lang.Class highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor("java.lang.invoke.MethodHandles");
        java.lang.Class highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor("java.lang.invoke.MethodHandle");
        java.lang.Class highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor("java.lang.invoke.MethodHandles$Lookup");
        java.lang.Class highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor("java.lang.invoke.MethodType");
        getInputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(java.lang.reflect.Method.class, "isDefault", new java.lang.Class[0]);
        Camera2StreamConfigurationMap = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, "lookup", new java.lang.Class[0]);
        getOutputFormats = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3, "in", java.lang.Class.class);
        getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3, "unreflectSpecial", java.lang.reflect.Method.class, java.lang.Class.class);
        getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3, "findSpecial", java.lang.Class.class, java.lang.String.class, highSpeedVideoFpsRangesFor4, java.lang.Class.class);
        getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2, "bindTo", java.lang.Object.class);
        getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2, "invokeWithArguments", java.lang.Object[].class);
        getInputFormats = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, "privateLookupIn", java.lang.Class.class, highSpeedVideoFpsRangesFor3);
        getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor4, "methodType", java.lang.Class.class, java.lang.Class[].class);
    }

    private static java.lang.reflect.Constructor getHighSpeedVideoFpsRangesFor(java.lang.Class cls, java.lang.Class... clsArr) {
        if (cls == null) {
            getHighSpeedVideoSizes.log(java.util.logging.Level.FINE, "Failed to lookup method: <init>#{1}({2})", new java.lang.Object[]{cls, java.util.Arrays.toString(clsArr)});
            return null;
        }
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (java.lang.Exception unused) {
            getHighSpeedVideoSizes.log(java.util.logging.Level.FINE, "Failed to lookup method: <init>#{1}({2})", new java.lang.Object[]{cls, java.util.Arrays.toString(clsArr)});
            return null;
        }
    }

    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        if (cls == null) {
            getHighSpeedVideoSizes.log(java.util.logging.Level.FINE, "Failed to lookup method: {0}#{1}({2})", new java.lang.Object[]{cls, str, java.util.Arrays.toString(clsArr)});
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.Exception unused) {
            getHighSpeedVideoSizes.log(java.util.logging.Level.FINE, "Failed to lookup method: {0}#{1}({2})", new java.lang.Object[]{cls, str, java.util.Arrays.toString(clsArr)});
            return null;
        }
    }

    private static java.lang.Class getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            getHighSpeedVideoSizes.log(java.util.logging.Level.FINE, "Failed to lookup class: ".concat(java.lang.String.valueOf(str)), (java.lang.Throwable) e);
            return null;
        }
    }

    public static boolean isDefault(java.lang.reflect.Method method) {
        java.lang.reflect.Method method2 = getInputSizeshNQ4ISI;
        if (method2 == null) {
            return false;
        }
        try {
            return ((java.lang.Boolean) method2.invoke(method, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.IllegalAccessException e) {
            e = e;
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.IllegalArgumentException e2) {
            e = e2;
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            java.lang.Throwable cause = e3.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    public static java.lang.Object invokeDefaultMethod(java.lang.Object obj, java.lang.Object obj2, java.lang.Object... objArr) throws java.lang.Throwable {
        return getHighSpeedVideoFpsRangesFor.invoke(getHighResolutionOutputSizeshNQ4ISI.invoke(obj2, obj), objArr);
    }

    public static java.lang.Object getMethodHandle(java.lang.reflect.Method method) throws java.lang.Exception {
        java.lang.Object invoke = Camera2StreamConfigurationMap.invoke(null, new java.lang.Object[0]);
        try {
            return getHighSpeedVideoSizesFor.invoke(getInputFormats.invoke(null, method.getDeclaringClass(), invoke), method.getDeclaringClass(), method.getName(), getOutputSizeshNQ4ISI.invoke(null, method.getReturnType(), method.getParameterTypes()), method.getDeclaringClass());
        } catch (java.lang.Exception unused) {
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor("java.lang.invoke.MethodHandles$Lookup"), java.lang.Class.class);
            }
            return getOutputMinFrameDuration.invoke(getOutputFormats.invoke(getHighSpeedVideoFpsRanges.newInstance(method.getDeclaringClass()), method.getDeclaringClass()), method, method.getDeclaringClass());
        }
    }
}
