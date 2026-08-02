package org.modelmapper.internal.objenesis.instantiator.basic;

import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.SERIALIZATION)
/* loaded from: classes4.dex */
public class ObjectStreamClassInstantiator<T> implements ObjectInstantiator<T> {
    private static Method newInstanceMethod;
    private final ObjectStreamClass objStreamClass;

    private static void initialize() {
        if (newInstanceMethod == null) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, new Class[0]);
                newInstanceMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                throw new ObjenesisException(e);
            } catch (RuntimeException e2) {
                throw new ObjenesisException(e2);
            }
        }
    }

    public ObjectStreamClassInstantiator(Class<T> cls) {
        initialize();
        this.objStreamClass = ObjectStreamClass.lookup(cls);
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) newInstanceMethod.invoke(this.objStreamClass, new Object[0]);
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }
}
