package org.modelmapper.internal.objenesis.instantiator.android;

import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* loaded from: classes4.dex */
public class Android17Instantiator<T> implements ObjectInstantiator<T> {
    private final Method newInstanceMethod = getNewInstanceMethod();
    private final Integer objectConstructorId = findConstructorIdForJavaLangObjectConstructor();
    private final Class<T> type;

    public Android17Instantiator(Class<T> cls) {
        this.type = cls;
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(this.newInstanceMethod.invoke(null, cls, this.objectConstructorId));
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }

    private static Method getNewInstanceMethod() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, Class.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e) {
            throw new ObjenesisException(e);
        } catch (RuntimeException e2) {
            throw new ObjenesisException(e2);
        }
    }

    private static Integer findConstructorIdForJavaLangObjectConstructor() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod.setAccessible(true);
            return (Integer) declaredMethod.invoke(null, Object.class);
        } catch (IllegalAccessException e) {
            throw new ObjenesisException(e);
        } catch (NoSuchMethodException e2) {
            throw new ObjenesisException(e2);
        } catch (RuntimeException e3) {
            throw new ObjenesisException(e3);
        } catch (InvocationTargetException e4) {
            throw new ObjenesisException(e4);
        }
    }
}
