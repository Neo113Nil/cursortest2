package org.modelmapper.internal.objenesis.instantiator.basic;

import org.modelmapper.internal.objenesis.instantiator.annotations.Instantiator;
import org.modelmapper.internal.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.NOT_COMPLIANT)
/* loaded from: classes4.dex */
public class AccessibleInstantiator<T> extends ConstructorInstantiator<T> {
    public AccessibleInstantiator(Class<T> cls) {
        super(cls);
        if (this.constructor != null) {
            this.constructor.setAccessible(true);
        }
    }
}
