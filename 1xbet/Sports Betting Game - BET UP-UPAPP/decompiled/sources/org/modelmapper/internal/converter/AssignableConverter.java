package org.modelmapper.internal.converter;

import org.modelmapper.internal.MappingContextImpl;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
public class AssignableConverter implements ConditionalConverter<Object, Object> {
    @Override // org.modelmapper.Converter
    public Object convert(MappingContext<Object, Object> mappingContext) {
        return (((MappingContextImpl) mappingContext).isProvidedDestination() || mappingContext.getDestination() == null) ? mappingContext.getSource() : mappingContext.getDestination();
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        return cls2.isAssignableFrom(cls) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.NONE;
    }
}
