package org.modelmapper;

import ads_mobile_sdk.ip;
import java.util.Iterator;
import org.modelmapper.internal.util.MappingContextHelper;
import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
public class Converters {

    public interface ChainableConverter<S, D1> {
        <D2> org.modelmapper.Converter<S, D2> map(org.modelmapper.Converter<D1, D2> converter);

        <D2> org.modelmapper.Converter<S, D2> to(Class<D2> cls);
    }

    public interface Converter<S, D> {
        D convert(S s);
    }

    private Converters() {
    }

    public static class Collection {
        public static <S, D> org.modelmapper.Converter<java.util.Collection<S>, java.util.Collection<D>> map(final Converter<S, D> converter) {
            return new org.modelmapper.Converter<java.util.Collection<S>, java.util.Collection<D>>() { // from class: org.modelmapper.Converters.Collection.1
                @Override // org.modelmapper.Converter
                public java.util.Collection<D> convert(MappingContext<java.util.Collection<S>, java.util.Collection<D>> mappingContext) {
                    if (mappingContext.getSource() == null) {
                        return null;
                    }
                    ip ipVar = (java.util.Collection<D>) MappingContextHelper.createCollection(mappingContext);
                    Iterator<S> it = mappingContext.getSource().iterator();
                    while (it.hasNext()) {
                        ipVar.add(Converter.this.convert(it.next()));
                    }
                    return ipVar;
                }
            };
        }

        public static <S> ChainableConverter<java.util.Collection<S>, S> first() {
            return new ChainableConverter<java.util.Collection<S>, S>() { // from class: org.modelmapper.Converters.Collection.2
                @Override // org.modelmapper.Converters.ChainableConverter
                public <D> org.modelmapper.Converter<java.util.Collection<S>, D> to(Class<D> cls) {
                    return new org.modelmapper.Converter<java.util.Collection<S>, D>() { // from class: org.modelmapper.Converters.Collection.2.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // org.modelmapper.Converter
                        public D convert(MappingContext<java.util.Collection<S>, D> mappingContext) {
                            if (mappingContext.getSource() == null || mappingContext.getSource().isEmpty()) {
                                return null;
                            }
                            return (D) mappingContext.getMappingEngine().map(mappingContext.create((MappingContext<java.util.Collection<S>, D>) mappingContext.getSource().iterator().next(), mappingContext.getDestinationType()));
                        }
                    };
                }

                @Override // org.modelmapper.Converters.ChainableConverter
                public <D> org.modelmapper.Converter<java.util.Collection<S>, D> map(final org.modelmapper.Converter<S, D> converter) {
                    return new org.modelmapper.Converter<java.util.Collection<S>, D>() { // from class: org.modelmapper.Converters.Collection.2.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // org.modelmapper.Converter
                        public D convert(MappingContext<java.util.Collection<S>, D> mappingContext) {
                            if (mappingContext.getSource() == null || mappingContext.getSource().isEmpty()) {
                                return null;
                            }
                            return (D) converter.convert(mappingContext.create((MappingContext<java.util.Collection<S>, D>) mappingContext.getSource().iterator().next(), mappingContext.getDestinationType()));
                        }
                    };
                }
            };
        }

        private Collection() {
        }
    }
}
