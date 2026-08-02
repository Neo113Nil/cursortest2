package org.modelmapper.internal.objenesis.instantiator.basic;

import java.lang.reflect.Constructor;
import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.NOT_COMPLIANT)
/* loaded from: classes4.dex */
public class ConstructorInstantiator<T> implements ObjectInstantiator<T> {
    protected Constructor<T> constructor;

    public ConstructorInstantiator(Class<T> cls) {
        try {
            this.constructor = cls.getDeclaredConstructor(null);
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return this.constructor.newInstance(null);
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }
}
