package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class BundleUtil {
    private static final java.lang.String TAG = "BundleUtil";
    private static java.lang.reflect.Method getIBinderMethod;
    private static java.lang.reflect.Method putIBinderMethod;

    public static android.os.IBinder getBinder(android.os.Bundle bundle, java.lang.String str) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return getBinderByReflection(bundle, str);
    }

    public static void putBinder(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            putBinderByReflection(bundle, str, iBinder);
        }
    }

    private static android.os.IBinder getBinderByReflection(android.os.Bundle bundle, java.lang.String str) {
        java.lang.reflect.Method method = getIBinderMethod;
        if (method == null) {
            try {
                java.lang.reflect.Method method2 = android.os.Bundle.class.getMethod("getIBinder", java.lang.String.class);
                getIBinderMethod = method2;
                method2.setAccessible(true);
                method = getIBinderMethod;
            } catch (java.lang.NoSuchMethodException e) {
                com.google.android.exoplayer2.util.Log.i(TAG, "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (android.os.IBinder) method.invoke(bundle, str);
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
            com.google.android.exoplayer2.util.Log.i(TAG, "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    private static void putBinderByReflection(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
        java.lang.reflect.Method method = putIBinderMethod;
        if (method == null) {
            try {
                java.lang.reflect.Method method2 = android.os.Bundle.class.getMethod("putIBinder", java.lang.String.class, android.os.IBinder.class);
                putIBinderMethod = method2;
                method2.setAccessible(true);
                method = putIBinderMethod;
            } catch (java.lang.NoSuchMethodException e) {
                com.google.android.exoplayer2.util.Log.i(TAG, "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
            com.google.android.exoplayer2.util.Log.i(TAG, "Failed to invoke putIBinder via reflection", e2);
        }
    }

    private BundleUtil() {
    }
}
