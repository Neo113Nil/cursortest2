package g1;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: g1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1974h extends C1973g {
    @Override // g1.C1973g
    public final Typeface W(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f17087k, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f17093q.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // g1.C1973g
    public final Method a0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
