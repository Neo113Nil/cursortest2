package org.modelmapper.internal.objenesis.instantiator.basic;

import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.NOT_COMPLIANT)
/* loaded from: classes4.dex */
public class NewInstanceInstantiator<T> implements ObjectInstantiator<T> {
    private final Class<T> type;

    public NewInstanceInstantiator(Class<T> cls) {
        this.type = cls;
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return this.type.newInstance();
        } catch (Exception e) {
            throw new ObjenesisException(e);
        }
    }
}
