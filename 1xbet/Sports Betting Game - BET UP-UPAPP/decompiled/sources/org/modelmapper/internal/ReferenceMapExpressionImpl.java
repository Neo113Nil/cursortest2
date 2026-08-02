package org.modelmapper.internal;

import org.modelmapper.builder.ReferenceMapExpression;
import org.modelmapper.internal.ExplicitMappingBuilder;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.internal.util.Primitives;
import org.modelmapper.spi.DestinationSetter;
import org.modelmapper.spi.SourceGetter;

/* loaded from: classes4.dex */
class ReferenceMapExpressionImpl<S, D> implements ReferenceMapExpression<S, D> {
    private ExplicitMappingBuilder.MappingOptions options;
    private TypeMapImpl<S, D> typeMap;

    ReferenceMapExpressionImpl(TypeMapImpl<S, D> typeMapImpl) {
        this(typeMapImpl, new ExplicitMappingBuilder.MappingOptions());
    }

    ReferenceMapExpressionImpl(TypeMapImpl<S, D> typeMapImpl, ExplicitMappingBuilder.MappingOptions mappingOptions) {
        this.typeMap = typeMapImpl;
        this.options = mappingOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.modelmapper.builder.ReferenceMapExpression
    public <V> void map(SourceGetter<S> sourceGetter, DestinationSetter<D, V> destinationSetter) {
        PropertyReferenceCollector propertyReferenceCollector = new PropertyReferenceCollector(this.typeMap.configuration, this.options);
        try {
            Object proxyFor = ProxyFactory.proxyFor(this.typeMap.getSourceType(), propertyReferenceCollector.newSourceInterceptor(), propertyReferenceCollector.getProxyErrors());
            Object obj = sourceGetter.get(proxyFor);
            if (proxyFor == obj) {
                propertyReferenceCollector.mapFromSource(this.typeMap.getSourceType());
            }
            if (propertyReferenceCollector.isNoSourceGetter()) {
                propertyReferenceCollector.mapFromConstant(obj);
            }
            try {
                destinationSetter.accept(ProxyFactory.proxyFor(this.typeMap.getDestinationType(), propertyReferenceCollector.newDestinationInterceptor(), propertyReferenceCollector.getProxyErrors()), destinationValue(destinationSetter));
                this.typeMap.addMapping(propertyReferenceCollector.collect());
            } catch (NullPointerException e) {
                if (propertyReferenceCollector.getProxyErrors().hasErrors()) {
                    throw propertyReferenceCollector.getProxyErrors().toException();
                }
                throw e;
            } catch (ErrorsException e2) {
                throw e2.getErrors().toConfigurationException();
            }
        } catch (NullPointerException e3) {
            if (propertyReferenceCollector.getProxyErrors().hasErrors()) {
                throw propertyReferenceCollector.getProxyErrors().toException();
            }
            throw e3;
        } catch (ErrorsException e4) {
            throw e4.getErrors().toConfigurationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.modelmapper.builder.ReferenceMapExpression
    public <V> void skip(DestinationSetter<D, V> destinationSetter) {
        this.options.skipType = 1;
        PropertyReferenceCollector propertyReferenceCollector = new PropertyReferenceCollector(this.typeMap.configuration, this.options);
        destinationSetter.accept(ProxyFactory.proxyFor(this.typeMap.getDestinationType(), propertyReferenceCollector.newDestinationInterceptor(), propertyReferenceCollector.getErrors()), destinationValue(destinationSetter));
        this.typeMap.addMapping(propertyReferenceCollector.collect());
    }

    private <V> V destinationValue(DestinationSetter<D, V> destinationSetter) {
        Class<?>[] resolveRawArguments = TypeResolver.resolveRawArguments(DestinationSetter.class, (Class) destinationSetter.getClass());
        if (resolveRawArguments == null) {
            return null;
        }
        Class<?> cls = resolveRawArguments[1];
        if (Primitives.isPrimitive(cls)) {
            return (V) Primitives.defaultValue(Primitives.primitiveFor(cls));
        }
        return null;
    }
}
