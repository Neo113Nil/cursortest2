package org.modelmapper.internal.objenesis.instantiator.android;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* loaded from: classes4.dex */
public class Android10Instantiator<T> implements ObjectInstantiator<T> {
    private final Method newStaticMethod = getNewStaticMethod();
    private final Class<T> type;

    public Android10Instantiator(Class<T> cls) {
        this.type = cls;
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(this.newStaticMethod.invoke(null, cls, Object.class));
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }

    private static Method getNewStaticMethod() {
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, Class.class, Class.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e) {
            throw new ObjenesisException(e);
        } catch (RuntimeException e2) {
            throw new ObjenesisException(e2);
        }
    }
}
