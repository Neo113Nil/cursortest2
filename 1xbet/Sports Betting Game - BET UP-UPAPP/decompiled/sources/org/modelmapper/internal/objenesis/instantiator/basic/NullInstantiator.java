package org.modelmapper.internal.objenesis.instantiator.basic;

import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.NOT_COMPLIANT)
/* loaded from: classes4.dex */
public class NullInstantiator<T> implements ObjectInstantiator<T> {
    @Override // org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        return null;
    }

    public NullInstantiator(Class<T> cls) {
    }
}
