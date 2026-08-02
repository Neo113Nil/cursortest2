package androidx.lifecycle;

import android.app.Application;
import g6.AbstractC1158g;
import g6.AbstractC1160i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9603a = AbstractC1160i.M0(Application.class, J.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f9604b = Y4.D.D(J.class);

    public static final Constructor a(Class cls, List list) {
        t6.h.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        t6.h.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            t6.h.d(parameterTypes, "constructor.parameterTypes");
            List w02 = AbstractC1158g.w0(parameterTypes);
            if (list.equals(w02)) {
                return constructor;
            }
            if (list.size() == w02.size() && w02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final S b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (S) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
