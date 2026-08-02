package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.core.content.res.e;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
class h extends l {

    /* renamed from: a, reason: collision with root package name */
    private static Class<?> f42160a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Constructor<?> f42161b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Method f42162c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f42163d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f42164e = false;

    private static boolean e(String str, boolean z11, int i11, Object obj) {
        f();
        try {
            return ((Boolean) f42162c.invoke(obj, str, Integer.valueOf(i11), Boolean.valueOf(z11))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static void f() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f42164e) {
            return;
        }
        f42164e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e("TypefaceCompatApi21Impl", e11.getClass().getName(), e11);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f42161b = constructor;
        f42160a = cls;
        f42162c = method2;
        f42163d = method;
    }

    @Override // androidx.core.graphics.l
    public Typeface a(Context context, e.c cVar, Resources resources, int i11) {
        f();
        try {
            Object newInstance = f42161b.newInstance(new Object[0]);
            for (e.d dVar : cVar.a()) {
                File d11 = m.d(context);
                if (d11 == null) {
                    return null;
                }
                try {
                    if (!m.b(d11, resources, dVar.b())) {
                        return null;
                    }
                    if (!e(d11.getPath(), dVar.f(), dVar.e(), newInstance)) {
                        return null;
                    }
                    d11.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d11.delete();
                }
            }
            f();
            try {
                Object newInstance2 = Array.newInstance(f42160a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f42163d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
