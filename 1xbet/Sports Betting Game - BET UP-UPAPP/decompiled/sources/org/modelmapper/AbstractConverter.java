package org.modelmapper;

import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
public abstract class AbstractConverter<S, D> implements Converter<S, D> {
    protected abstract D convert(S s);

    @Override // org.modelmapper.Converter
    public D convert(MappingContext<S, D> mappingContext) {
        return convert((AbstractConverter<S, D>) mappingContext.getSource());
    }

    public String toString() {
        return String.format("Converter<%s, %s>", TypeResolver.resolveRawArguments(Converter.class, (Class) getClass()));
    }
}
