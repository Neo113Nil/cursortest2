package com.facebook.appevents.iap;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {
    public static final /* synthetic */ int a = 0;

    public enum a {
        NONE("none"),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");

        public final String a;

        a(String str) {
            this.a = str;
        }
    }

    public enum b {
        INAPP("inapp"),
        SUBS("subs");

        public final String a;

        b(String str) {
            this.a = str;
        }
    }

    static {
        new u();
    }

    @JvmStatic
    public static final Class<?> a(String className) {
        if (com.facebook.internal.instrument.crashshield.a.b(u.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, u.class);
            return null;
        }
    }

    @JvmStatic
    public static final Method b(Class<?> clazz, String methodName, Class<?>... args) {
        if (!com.facebook.internal.instrument.crashshield.a.b(u.class)) {
            try {
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
                } catch (NoSuchMethodException unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, u.class);
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final Method c(Class<?> clazz, String methodName, Class<?>... args) {
        if (!com.facebook.internal.instrument.crashshield.a.b(u.class)) {
            try {
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
                } catch (NoSuchMethodException unused) {
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, u.class);
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final Object d(Method method, Class clazz, Object obj, Object... args) {
        if (com.facebook.internal.instrument.crashshield.a.b(u.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, u.class);
            return null;
        }
    }
}
