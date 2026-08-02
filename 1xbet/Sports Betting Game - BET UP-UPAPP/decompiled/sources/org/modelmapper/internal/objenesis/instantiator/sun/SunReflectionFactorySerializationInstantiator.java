package org.modelmapper.internal.objenesis.instantiator.sun;

import java.io.NotSerializableException;
import java.lang.reflect.Constructor;
import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.SerializationInstantiatorHelper;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.SERIALIZATION)
/* loaded from: classes4.dex */
public class SunReflectionFactorySerializationInstantiator<T> implements ObjectInstantiator<T> {
    private final Constructor<T> mungedConstructor;

    public SunReflectionFactorySerializationInstantiator(Class<T> cls) {
        try {
            Constructor<T> newConstructorForSerialization = SunReflectionFactoryHelper.newConstructorForSerialization(cls, SerializationInstantiatorHelper.getNonSerializableSuperClass(cls).getDeclaredConstructor(null));
            this.mungedConstructor = newConstructorForSerialization;
            newConstructorForSerialization.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            throw new ObjenesisException(new NotSerializableException(cls + " has no suitable superclass constructor"));
        }
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return this.mungedConstructor.newInstance(null);
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }
}
