package sg.bigo.ads.u0;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.h.InterfaceC5159e0;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.u0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5492a {
    public static Object a(Object obj, String str) {
        Field field;
        try {
            try {
                field = obj.getClass().getDeclaredField(str);
            } catch (Exception unused) {
                field = obj.getClass().getField(str);
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            AbstractC5496a.a("ReflectionHelper", Log.getStackTraceString(e));
            return null;
        }
    }

    public static Object a(String str) {
        try {
            Constructor declaredConstructor = Class.forName(str).asSubclass(InterfaceC5159e0.class).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(null);
        } catch (Exception unused) {
            AbstractC5496a.b("ReflectionHelper", "Cannot find class: ".concat(str));
            return null;
        }
    }

    public static boolean a(Class cls, String... strArr) {
        Class<?> cls2;
        if (A.c(strArr)) {
            return false;
        }
        for (String str : strArr) {
            try {
                cls2 = Class.forName(str);
            } catch (Exception unused) {
                cls2 = null;
            }
            if (cls2 != null && cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
