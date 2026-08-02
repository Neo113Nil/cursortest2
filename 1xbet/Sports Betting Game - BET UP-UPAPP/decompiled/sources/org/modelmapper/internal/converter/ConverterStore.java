package org.modelmapper.internal.converter;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.modelmapper.spi.ConditionalConverter;

/* loaded from: classes4.dex */
public final class ConverterStore {
    private static final ConditionalConverter<?, ?>[] DEFAULT_CONVERTERS = {new ArrayConverter(), new CollectionConverter(), new MapConverter(), new AssignableConverter(), new StringConverter(), new EnumConverter(), new NumberConverter(), new BooleanConverter(), new CharacterConverter(), new DateConverter(), new CalendarConverter()};
    private final List<ConditionalConverter<?, ?>> converters;

    public ConverterStore() {
        this(new CopyOnWriteArrayList(DEFAULT_CONVERTERS));
    }

    ConverterStore(List<ConditionalConverter<?, ?>> list) {
        this.converters = list;
    }

    public <S, D> ConditionalConverter<S, D> getFirstSupported(Class<?> cls, Class<?> cls2) {
        Iterator<ConditionalConverter<?, ?>> it = this.converters.iterator();
        ConditionalConverter<S, D> conditionalConverter = null;
        while (it.hasNext()) {
            ConditionalConverter<S, D> conditionalConverter2 = (ConditionalConverter) it.next();
            ConditionalConverter.MatchResult match = conditionalConverter2.match(cls, cls2);
            if (match == ConditionalConverter.MatchResult.FULL) {
                return conditionalConverter2;
            }
            if (conditionalConverter == null && match == ConditionalConverter.MatchResult.PARTIAL) {
                conditionalConverter = conditionalConverter2;
            }
        }
        return conditionalConverter;
    }

    public List<ConditionalConverter<?, ?>> getConverters() {
        return this.converters;
    }

    public ConverterStore removeConverter(Class<? extends ConditionalConverter<?, ?>> cls) {
        ConditionalConverter<?, ?> converterByType = getConverterByType(cls);
        if (converterByType != null) {
            this.converters.remove(converterByType);
        }
        return this;
    }

    public boolean hasConverter(Class<? extends ConditionalConverter<?, ?>> cls) {
        return getConverterByType(cls) != null;
    }

    public ConverterStore addConverter(ConditionalConverter<?, ?> conditionalConverter) {
        this.converters.add(conditionalConverter);
        return this;
    }

    private ConditionalConverter<?, ?> getConverterByType(Class<? extends ConditionalConverter<?, ?>> cls) {
        for (ConditionalConverter<?, ?> conditionalConverter : this.converters) {
            if (conditionalConverter.getClass().equals(cls)) {
                return conditionalConverter;
            }
        }
        return null;
    }
}
