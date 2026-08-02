package org.modelmapper.internal.converter;

import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class EnumConverter implements ConditionalConverter<Object, Enum<?>> {
    EnumConverter() {
    }

    @Override // org.modelmapper.Converter
    public /* bridge */ /* synthetic */ Object convert(MappingContext mappingContext) {
        return convert((MappingContext<Object, Enum<?>>) mappingContext);
    }

    @Override // org.modelmapper.Converter
    public Enum<?> convert(MappingContext<Object, Enum<?>> mappingContext) {
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        String name = source.getClass() == String.class ? (String) source : ((Enum) source).name();
        if (name != null) {
            try {
                return Enum.valueOf(mappingContext.getDestinationType(), name);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        return (cls2.isEnum() && (cls.isEnum() || cls == String.class)) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.NONE;
    }
}
