package com.facebook.appevents.iap;

/* compiled from: InAppPurchaseUtils.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J#\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\nJE\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u001e\u0010\u000f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0010\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u001e\u0010\u000f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0010\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0012JE\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0010\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseUtils;", "", "()V", "getClass", "Ljava/lang/Class;", "className", "", "getClassFromContext", "context", "Landroid/content/Context;", "getClassFromContext$facebook_core_release", "getDeclaredMethod", "Ljava/lang/reflect/Method;", "clazz", "methodName", "args", "", "getDeclaredMethod$facebook_core_release", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getMethod", "invokeMethod", "method", "obj", "(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppPurchaseUtils {
    public static final com.facebook.appevents.iap.InAppPurchaseUtils INSTANCE = new com.facebook.appevents.iap.InAppPurchaseUtils();

    private InAppPurchaseUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.Class<?> getClass(java.lang.String className) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
            try {
                return java.lang.Class.forName(className);
            } catch (java.lang.ClassNotFoundException unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseUtils.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.reflect.Method getMethod(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.Class<?>... args) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (java.lang.Class[]) java.util.Arrays.copyOf(args, args.length));
            } catch (java.lang.NoSuchMethodException unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseUtils.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.reflect.Method getDeclaredMethod$facebook_core_release(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.Class<?>... args) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (java.lang.Class[]) java.util.Arrays.copyOf(args, args.length));
            } catch (java.lang.NoSuchMethodException unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseUtils.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.Object invokeMethod(java.lang.Class<?> clazz, java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... args) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, java.util.Arrays.copyOf(args, args.length));
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseUtils.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.Class<?> getClassFromContext$facebook_core_release(android.content.Context context, java.lang.String className) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.iap.InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (java.lang.ClassNotFoundException unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.iap.InAppPurchaseUtils.class);
            return null;
        }
    }
}
