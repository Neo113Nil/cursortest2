package org.modelmapper;

import org.modelmapper.Provider;
import org.modelmapper.internal.typetools.TypeResolver;

/* loaded from: classes4.dex */
public abstract class AbstractProvider<T> implements Provider<T> {
    protected abstract T get();

    @Override // org.modelmapper.Provider
    public T get(Provider.ProvisionRequest<T> provisionRequest) {
        return get();
    }

    public String toString() {
        return String.format("Provider<%s>", TypeResolver.resolveRawArgument(Provider.class, (Class) getClass()));
    }
}
