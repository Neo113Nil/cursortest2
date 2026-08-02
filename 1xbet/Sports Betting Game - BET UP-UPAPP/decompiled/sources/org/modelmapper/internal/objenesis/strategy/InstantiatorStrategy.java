package org.modelmapper.internal.objenesis.strategy;

import org.modelmapper.internal.objenesis.instantiator.ObjectInstantiator;

/* loaded from: classes4.dex */
public interface InstantiatorStrategy {
    <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls);
}
