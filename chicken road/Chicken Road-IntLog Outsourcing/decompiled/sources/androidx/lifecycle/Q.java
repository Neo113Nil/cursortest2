package androidx.lifecycle;

import android.app.Application;
import g4.AbstractC0464i;
import g4.AbstractC0466k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4553a = AbstractC0466k.A0(Application.class, J.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f4554b = K1.b.W(J.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.i.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.i.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.i.d(parameterTypes, "constructor.parameterTypes");
            List a02 = AbstractC0464i.a0(parameterTypes);
            if (signature.equals(a02)) {
                return constructor;
            }
            if (signature.size() == a02.size() && a02.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final T b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (T) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access " + cls, e3);
        } catch (InstantiationException e6) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e7.getCause());
        }
    }
}
