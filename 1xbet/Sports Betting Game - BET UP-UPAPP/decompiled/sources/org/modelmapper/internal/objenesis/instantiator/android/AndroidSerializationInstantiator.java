package org.modelmapper.internal.objenesis.instantiator.android;

import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.SERIALIZATION)
/* loaded from: classes4.dex */
public class AndroidSerializationInstantiator<T> implements ObjectInstantiator<T> {
    private final Method newInstanceMethod = getNewInstanceMethod();
    private final ObjectStreamClass objectStreamClass;
    private final Class<T> type;

    public AndroidSerializationInstantiator(Class<T> cls) {
        this.type = cls;
        try {
            try {
                this.objectStreamClass = (ObjectStreamClass) ObjectStreamClass.class.getMethod("lookupAny", Class.class).invoke(null, cls);
            } catch (IllegalAccessException e) {
                throw new ObjenesisException(e);
            } catch (InvocationTargetException e2) {
                throw new ObjenesisException(e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new ObjenesisException(e3);
        }
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(this.newInstanceMethod.invoke(this.objectStreamClass, cls));
        } catch (IllegalAccessException e) {
            throw new ObjenesisException(e);
        } catch (IllegalArgumentException e2) {
            throw new ObjenesisException(e2);
        } catch (InvocationTargetException e3) {
            throw new ObjenesisException(e3);
        }
    }

    private static Method getNewInstanceMethod() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, Class.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e) {
            throw new ObjenesisException(e);
        } catch (RuntimeException e2) {
            throw new ObjenesisException(e2);
        }
    }
}
