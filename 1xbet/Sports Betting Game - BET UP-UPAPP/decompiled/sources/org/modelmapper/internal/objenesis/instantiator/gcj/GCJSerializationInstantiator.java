package org.modelmapper.internal.objenesis.instantiator.gcj;

import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.SerializationInstantiatorHelper;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.SERIALIZATION)
/* loaded from: classes4.dex */
public class GCJSerializationInstantiator<T> extends GCJInstantiatorBase<T> {
    private Class<? super T> superType;

    public GCJSerializationInstantiator(Class<T> cls) {
        super(cls);
        this.superType = SerializationInstantiatorHelper.getNonSerializableSuperClass(cls);
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.gcj.GCJInstantiatorBase, org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return this.type.cast(newObjectMethod.invoke(dummyStream, this.type, this.superType));
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }
}
