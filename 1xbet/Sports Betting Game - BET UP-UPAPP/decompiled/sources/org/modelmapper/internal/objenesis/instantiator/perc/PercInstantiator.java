package org.modelmapper.internal.objenesis.instantiator.perc;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* loaded from: classes4.dex */
public class PercInstantiator<T> implements ObjectInstantiator<T> {
    private final Method newInstanceMethod;
    private final Object[] typeArgs;

    public PercInstantiator(Class<T> cls) {
        Object[] objArr = {null, Boolean.FALSE};
        this.typeArgs = objArr;
        objArr[0] = cls;
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, Class.class, Boolean.TYPE);
            this.newInstanceMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            throw new ObjenesisException(e);
        } catch (RuntimeException e2) {
            throw new ObjenesisException(e2);
        }
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) this.newInstanceMethod.invoke(null, this.typeArgs);
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }
}
