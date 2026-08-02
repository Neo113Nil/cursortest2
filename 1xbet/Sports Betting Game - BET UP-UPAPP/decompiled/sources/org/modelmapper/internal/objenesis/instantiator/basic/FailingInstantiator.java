package org.modelmapper.internal.objenesis.instantiator.basic;

import org.modelmapper.internal.objenesis.ObjenesisException;
import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.NOT_COMPLIANT)
/* loaded from: classes4.dex */
public class FailingInstantiator<T> implements ObjectInstantiator<T> {
    public FailingInstantiator(Class<T> cls) {
    }

    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        throw new ObjenesisException("Always failing");
    }
}
