package androidx.fragment.app;

import B0.A0;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5400v {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.collection.Z<ClassLoader, androidx.collection.Z<String, Class<?>>> f43173a = new androidx.collection.Z<>();

    static boolean b(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return ComponentCallbacksC5392m.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    private static Class<?> c(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        androidx.collection.Z<ClassLoader, androidx.collection.Z<String, Class<?>>> z11 = f43173a;
        androidx.collection.Z<String, Class<?>> z12 = z11.get(classLoader);
        if (z12 == null) {
            z12 = new androidx.collection.Z<>();
            z11.put(classLoader, z12);
        }
        Class<?> cls = z12.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        z12.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends ComponentCallbacksC5392m> d(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e11) {
            throw new ComponentCallbacksC5392m.l(A0.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e11);
        } catch (ClassNotFoundException e12) {
            throw new ComponentCallbacksC5392m.l(A0.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e12);
        }
    }

    @NonNull
    public ComponentCallbacksC5392m a(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e11) {
            throw new ComponentCallbacksC5392m.l(A0.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (InstantiationException e12) {
            throw new ComponentCallbacksC5392m.l(A0.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e12);
        } catch (NoSuchMethodException e13) {
            throw new ComponentCallbacksC5392m.l(A0.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e13);
        } catch (InvocationTargetException e14) {
            throw new ComponentCallbacksC5392m.l(A0.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e14);
        }
    }
}
