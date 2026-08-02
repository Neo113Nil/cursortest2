package org.modelmapper.internal.objenesis;

import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;

/* loaded from: classes4.dex */
public interface Objenesis {
    <T> ObjectInstantiator<T> getInstantiatorOf(Class<T> cls);

    <T> T newInstance(Class<T> cls);
}
