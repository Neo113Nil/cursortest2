package org.modelmapper.internal;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.modelmapper.Condition;
import org.modelmapper.ConfigurationException;
import org.modelmapper.Converter;
import org.modelmapper.Provider;
import org.modelmapper.TypeMap;
import org.modelmapper.TypeToken;
import org.modelmapper.internal.converter.ConverterStore;
import org.modelmapper.internal.util.Iterables;
import org.modelmapper.internal.util.Objects;
import org.modelmapper.internal.util.Primitives;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.ConstantMapping;
import org.modelmapper.spi.Mapping;
import org.modelmapper.spi.MappingContext;
import org.modelmapper.spi.MappingEngine;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyMapping;

/* loaded from: classes4.dex */
public class MappingEngineImpl implements MappingEngine {
    private final InheritingConfiguration configuration;
    private final Map<TypePair<?, ?>, Converter<?, ?>> converterCache = new ConcurrentHashMap();
    private final ConverterStore converterStore;
    private final TypeMapStore typeMapStore;

    public MappingEngineImpl(InheritingConfiguration inheritingConfiguration) {
        this.configuration = inheritingConfiguration;
        this.typeMapStore = inheritingConfiguration.typeMapStore;
        this.converterStore = inheritingConfiguration.converterStore;
    }

    public <S, D> D map(S s, Class<S> cls, D d, TypeToken<D> typeToken, String str) {
        D d2;
        MappingContextImpl mappingContextImpl = new MappingContextImpl(s, cls, d, typeToken.getRawType(), typeToken.getType(), str, this);
        try {
            d2 = (D) map(mappingContextImpl);
        } catch (ConfigurationException e) {
            throw e;
        } catch (ErrorsException unused) {
            throw mappingContextImpl.errors.toMappingException();
        } catch (Throwable th) {
            mappingContextImpl.errors.errorMapping(cls, typeToken.getType(), th);
            d2 = null;
        }
        mappingContextImpl.errors.throwMappingExceptionIfErrorsExist();
        return d2;
    }

    @Override // org.modelmapper.spi.MappingEngine
    public <S, D> D map(MappingContext<S, D> mappingContext) {
        D source;
        D destinationForSource;
        MappingContextImpl<S, D> mappingContextImpl = (MappingContextImpl) mappingContext;
        if (!Iterables.isIterable(mappingContext.getDestinationType()) && (destinationForSource = mappingContextImpl.destinationForSource()) != null && destinationForSource.getClass().isAssignableFrom(mappingContextImpl.getDestinationType())) {
            return destinationForSource;
        }
        TypeMap<S, D> typeMap = this.typeMapStore.get(mappingContext.getSourceType(), mappingContext.getDestinationType(), mappingContext.getTypeMapName());
        if (typeMap != null) {
            source = (D) typeMap(mappingContextImpl, typeMap);
        } else {
            Converter<S, D> converterFor = converterFor(mappingContext);
            if (converterFor != null && (mappingContext.getDestination() == null || mappingContext.getParent() != null)) {
                source = (D) convert(mappingContext, converterFor);
            } else if (!Primitives.isPrimitive(mappingContext.getSourceType()) && !Primitives.isPrimitive(mappingContext.getDestinationType())) {
                source = (D) typeMap(mappingContextImpl, this.typeMapStore.getOrCreate(mappingContext.getSource(), mappingContext.getSourceType(), mappingContext.getDestinationType(), mappingContext.getTypeMapName(), this));
            } else {
                source = mappingContext.getDestinationType().isAssignableFrom(mappingContext.getSourceType()) ? mappingContext.getSource() : null;
            }
        }
        mappingContextImpl.setDestination(source, true);
        return source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <S, D> D typeMap(MappingContextImpl<S, D> mappingContextImpl, TypeMap<S, D> typeMap) {
        if (mappingContextImpl.getParent() != null && mappingContextImpl.getDestination() == null) {
            mappingContextImpl.setDestination(destinationProperty(mappingContextImpl), false);
        }
        mappingContextImpl.setTypeMap(typeMap);
        Condition<?, ?> condition = typeMap.getCondition();
        boolean z = condition == null || condition.applies(mappingContextImpl);
        if (z && typeMap.getConverter() != null) {
            return (D) convert(mappingContextImpl, typeMap.getConverter());
        }
        if (mappingContextImpl.getDestination() == null && Types.isInstantiable(mappingContextImpl.getDestinationType()) && createDestination(mappingContextImpl) == null) {
            return null;
        }
        if (z) {
            Converter<S, D> preConverter = typeMap.getPreConverter();
            if (preConverter != null) {
                mappingContextImpl.setDestination(convert(mappingContextImpl, preConverter), true);
            }
            Iterator<Mapping> it = typeMap.getMappings().iterator();
            while (it.hasNext()) {
                propertyMap(it.next(), mappingContextImpl);
            }
            Converter<S, D> postConverter = typeMap.getPostConverter();
            if (postConverter != null) {
                convert(mappingContextImpl, postConverter);
            }
        }
        return (D) mappingContextImpl.getDestination();
    }

    private <S, D> void propertyMap(Mapping mapping, MappingContextImpl<S, D> mappingContextImpl) {
        MappingImpl mappingImpl = (MappingImpl) mapping;
        String str = mappingContextImpl.destinationPath + mappingImpl.getPath();
        if (mappingContextImpl.isShaded(str)) {
            return;
        }
        if (mapping.getCondition() == null && mapping.isSkipped()) {
            return;
        }
        MappingContextImpl<Object, Object> propertyContextFor = propertyContextFor(mappingContextImpl, resolveSourceValue(mappingContextImpl, mapping), mappingImpl);
        Condition condition = (Condition) Objects.firstNonNull(mapping.getCondition(), mappingContextImpl.getTypeMap().getPropertyCondition(), this.configuration.getPropertyCondition());
        if (condition != null) {
            boolean applies = condition.applies(propertyContextFor);
            if (applies && mapping.isSkipped()) {
                return;
            }
            if (!applies && !mapping.isSkipped()) {
                mappingContextImpl.shadePath(str);
                return;
            }
        }
        setDestinationValue(mappingContextImpl, propertyContextFor, mappingImpl);
    }

    private Object resolveSourceValue(MappingContextImpl<?, ?> mappingContextImpl, Mapping mapping) {
        Object obj;
        Object source = mappingContextImpl.getSource();
        if (!(mapping instanceof PropertyMappingImpl)) {
            return mapping instanceof ConstantMapping ? ((ConstantMapping) mapping).getConstant() : source;
        }
        Iterator<? extends PropertyInfo> it = ((PropertyMapping) mapping).getSourceProperties().iterator();
        while (it.hasNext()) {
            Accessor accessor = (Accessor) it.next();
            mappingContextImpl.setParentSource(source);
            source = accessor.getValue(source);
            if (source == null) {
                return null;
            }
            if (!Iterables.isIterable(source.getClass()) && (obj = mappingContextImpl.sourceToDestination.get(source)) != null) {
                mappingContextImpl.intermediateDestinations.add(obj);
            }
        }
        return source;
    }

    private <S, D> void setDestinationValue(MappingContextImpl<S, D> mappingContextImpl, MappingContextImpl<Object, Object> mappingContextImpl2, MappingImpl mappingImpl) {
        String str = mappingContextImpl.destinationPath + mappingImpl.getPath();
        Converter<S, D> converter = (Converter) Objects.firstNonNull(mappingImpl.getConverter(), mappingContextImpl.getTypeMap().getPropertyConverter());
        if (converter != null) {
            mappingContextImpl.shadePath(str);
        }
        Object parentDestination = mappingContextImpl2.getParentDestination();
        if (parentDestination == null) {
            return;
        }
        Mutator mutator = (Mutator) mappingImpl.getLastDestinationProperty();
        Accessor accessorFor = PropertyInfoRegistry.accessorFor(mutator.getInitialType(), mutator.getName(), this.configuration);
        Object createDestinationViaProvider = mappingContextImpl2.createDestinationViaProvider();
        if (createDestinationViaProvider == null && mappingContextImpl2.isProvidedDestination() && accessorFor != null) {
            createDestinationViaProvider = accessorFor.getValue(parentDestination);
            mappingContextImpl2.setDestination(createDestinationViaProvider, false);
        }
        if (converter != null) {
            createDestinationViaProvider = convert(mappingContextImpl2, converter);
        } else if (mappingContextImpl2.getSource() != null) {
            createDestinationViaProvider = map(mappingContextImpl2);
        } else {
            Converter<S, D> converterFor = converterFor(mappingContextImpl2);
            if (converterFor != null) {
                createDestinationViaProvider = convert(mappingContextImpl2, converterFor);
            }
        }
        mappingContextImpl.destinationCache.put(str, createDestinationViaProvider);
        if (createDestinationViaProvider != null || !this.configuration.isSkipNullEnabled()) {
            mutator.setValue(parentDestination, createDestinationViaProvider == null ? Primitives.defaultValue(mutator.getType()) : createDestinationViaProvider);
        }
        if (createDestinationViaProvider == null) {
            mappingContextImpl.shadePath(mappingContextImpl2.destinationPath);
        }
    }

    private MappingContextImpl<Object, Object> propertyContextFor(MappingContextImpl<?, ?> mappingContextImpl, Object obj, MappingImpl mappingImpl) {
        Class<?> sourceType = mappingImpl.getSourceType();
        if (Object.class.equals(sourceType) && obj != null) {
            sourceType = obj.getClass();
        }
        return new MappingContextImpl<>(mappingContextImpl, obj, sourceType, null, mappingImpl.getLastDestinationProperty().getType(), mappingContextImpl.genericDestinationPropertyType(mappingImpl.getLastDestinationProperty().getGenericType()), mappingImpl, !((mappingImpl instanceof PropertyMapping) && ((PropertyMappingImpl) mappingImpl).cyclic));
    }

    private <S, D> D destinationProperty(MappingContextImpl<S, D> mappingContextImpl) {
        if (!mappingContextImpl.isProvidedDestination() || mappingContextImpl.getMapping() == null) {
            return null;
        }
        D d = (D) mappingContextImpl.getParent().getDestination();
        Iterator<? extends PropertyInfo> it = mappingContextImpl.getMapping().getDestinationProperties().iterator();
        while (it.hasNext()) {
            Mutator mutator = (Mutator) it.next();
            if (d == null) {
                break;
            }
            Accessor accessor = TypeInfoRegistry.typeInfoFor(d.getClass(), this.configuration).getAccessors().get(mutator.getName());
            if (accessor != null) {
                d = (D) accessor.getValue(d);
            }
        }
        return d;
    }

    private <S, D> D convert(MappingContext<S, D> mappingContext, Converter<S, D> converter) {
        try {
            return converter.convert(mappingContext);
        } catch (ErrorsException e) {
            throw e;
        } catch (Exception e2) {
            ((MappingContextImpl) mappingContext).errors.errorConverting(converter, mappingContext.getSourceType(), mappingContext.getDestinationType(), e2);
            return null;
        }
    }

    private <S, D> Converter<S, D> converterFor(MappingContext<S, D> mappingContext) {
        TypePair<?, ?> of = TypePair.of(mappingContext.getSourceType(), mappingContext.getDestinationType(), mappingContext.getTypeMapName());
        Converter<S, D> converter = (Converter) this.converterCache.get(of);
        if (converter == null && (converter = this.converterStore.getFirstSupported(mappingContext.getSourceType(), mappingContext.getDestinationType())) != null) {
            this.converterCache.put(of, converter);
        }
        return converter;
    }

    private <T> T instantiate(Class<T> cls, Errors errors) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e) {
            errors.errorInstantiatingDestination(cls, e);
            return null;
        }
    }

    @Override // org.modelmapper.spi.MappingEngine
    public <S, D> D createDestination(MappingContext<S, D> mappingContext) {
        MappingContextImpl mappingContextImpl = (MappingContextImpl) mappingContext;
        D d = (D) mappingContextImpl.createDestinationViaProvider();
        if (d == null) {
            d = (D) instantiate(mappingContext.getDestinationType(), mappingContextImpl.errors);
        }
        mappingContextImpl.setDestination(d, true);
        return d;
    }

    InheritingConfiguration getConfiguration() {
        return this.configuration;
    }

    <S, D> D createDestinationViaGlobalProvider(S s, Class<D> cls, Errors errors) {
        D d;
        Provider<?> provider = this.configuration.getProvider();
        if (provider != null) {
            d = (D) provider.get(new ProvisionRequestImpl(s, cls));
            validateDestination(cls, d, errors);
        } else {
            d = null;
        }
        return d == null ? (D) instantiate(cls, errors) : d;
    }

    void validateDestination(Class<?> cls, Object obj, Errors errors) {
        if (obj == null || cls.isAssignableFrom(obj.getClass())) {
            return;
        }
        errors.invalidProvidedDestinationInstance(obj, cls);
    }
}
