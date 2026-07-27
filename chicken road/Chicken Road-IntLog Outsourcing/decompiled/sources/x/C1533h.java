package x;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533h extends C1532g {
    @Override // x.C1532g
    public final Typeface I(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f12247h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f12253n.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // x.C1532g
    public final Method N(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
