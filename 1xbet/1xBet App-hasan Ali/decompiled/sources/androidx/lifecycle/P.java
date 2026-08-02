package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final List f7033a = X3.n.O(Application.class, J.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f7034b = AbstractC2346c.A(J.class);

    public static final Constructor a(Class cls, List list) {
        kotlin.jvm.internal.l.f("modelClass", cls);
        kotlin.jvm.internal.l.f("signature", list);
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.l.e("getConstructors(...)", constructors);
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.l.e("getParameterTypes(...)", parameterTypes);
            List J02 = X3.l.J0(parameterTypes);
            if (list.equals(J02)) {
                return constructor;
            }
            if (list.size() == J02.size() && J02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final S b(Class cls, Constructor constructor, Object... objArr) {
        kotlin.jvm.internal.l.f("modelClass", cls);
        try {
            return (S) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access " + cls, e3);
        } catch (InstantiationException e5) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e6.getCause());
        }
    }
}
