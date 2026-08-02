package org.modelmapper.internal.converter;

import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class StringConverter implements ConditionalConverter<Object, String> {
    StringConverter() {
    }

    @Override // org.modelmapper.Converter
    public /* bridge */ /* synthetic */ Object convert(MappingContext mappingContext) {
        return convert((MappingContext<Object, String>) mappingContext);
    }

    @Override // org.modelmapper.Converter
    public String convert(MappingContext<Object, String> mappingContext) {
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        Class<Object> sourceType = mappingContext.getSourceType();
        return ((sourceType.isArray() && sourceType.getComponentType() == Character.TYPE) || sourceType.getComponentType() == Character.class) ? String.valueOf((char[]) source) : source.toString();
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        return cls2 == String.class ? cls == String.class ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.PARTIAL : ConditionalConverter.MatchResult.NONE;
    }
}
