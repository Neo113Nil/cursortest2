package org.modelmapper.internal.converter;

import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
class CharacterConverter implements ConditionalConverter<Object, Character> {
    CharacterConverter() {
    }

    @Override // org.modelmapper.Converter
    public /* bridge */ /* synthetic */ Object convert(MappingContext mappingContext) {
        return convert((MappingContext<Object, Character>) mappingContext);
    }

    @Override // org.modelmapper.Converter
    public Character convert(MappingContext<Object, Character> mappingContext) {
        Object source = mappingContext.getSource();
        if (source == null) {
            return null;
        }
        String obj = source.toString();
        if (obj.length() == 0) {
            return null;
        }
        return Character.valueOf(obj.charAt(0));
    }

    @Override // org.modelmapper.spi.ConditionalConverter
    public ConditionalConverter.MatchResult match(Class<?> cls, Class<?> cls2) {
        if (cls2 == Character.class || cls2 == Character.TYPE) {
            return (cls == Character.class || cls == Character.TYPE) ? ConditionalConverter.MatchResult.FULL : ConditionalConverter.MatchResult.PARTIAL;
        }
        return ConditionalConverter.MatchResult.NONE;
    }
}
