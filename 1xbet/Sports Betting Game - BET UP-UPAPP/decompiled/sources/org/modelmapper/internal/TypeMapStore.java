package org.modelmapper.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.modelmapper.Converter;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.modelmapper.internal.util.Primitives;
import org.modelmapper.internal.util.Types;

/* loaded from: classes4.dex */
public final class TypeMapStore {
    private final InheritingConfiguration config;
    private final Map<TypePair<?, ?>, TypeMap<?, ?>> immutableTypeMaps;
    private final Object lock;
    private final Map<TypePair<?, ?>, TypeMap<?, ?>> typeMaps;

    TypeMapStore(InheritingConfiguration inheritingConfiguration) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.typeMaps = concurrentHashMap;
        this.immutableTypeMaps = Collections.unmodifiableMap(concurrentHashMap);
        this.lock = new Object();
        this.config = inheritingConfiguration;
    }

    public <S, D> TypeMap<S, D> create(S s, Class<S> cls, Class<D> cls2, String str, InheritingConfiguration inheritingConfiguration, MappingEngineImpl mappingEngineImpl) {
        TypeMapImpl typeMapImpl;
        synchronized (this.lock) {
            typeMapImpl = new TypeMapImpl(cls, cls2, str, inheritingConfiguration, mappingEngineImpl);
            if (inheritingConfiguration.isImplicitMappingEnabled() && Types.mightContainsProperties(typeMapImpl.getSourceType()) && Types.mightContainsProperties(typeMapImpl.getDestinationType())) {
                ImplicitMappingBuilder.build(s, typeMapImpl, this.config.typeMapStore, this.config.converterStore);
            }
            this.typeMaps.put(TypePair.of(cls, cls2, str), typeMapImpl);
        }
        return typeMapImpl;
    }

    public <S, D> TypeMap<S, D> createEmptyTypeMap(Class<S> cls, Class<D> cls2, String str, InheritingConfiguration inheritingConfiguration, MappingEngineImpl mappingEngineImpl) {
        TypeMapImpl typeMapImpl;
        synchronized (this.lock) {
            typeMapImpl = new TypeMapImpl(cls, cls2, str, inheritingConfiguration, mappingEngineImpl);
            this.typeMaps.put(TypePair.of(cls, cls2, str), typeMapImpl);
        }
        return typeMapImpl;
    }

    public Collection<TypeMap<?, ?>> get() {
        return this.immutableTypeMaps.values();
    }

    public <S, D> TypeMap<S, D> get(Class<S> cls, Class<D> cls2, String str) {
        TypeMap<S, D> typeMap = (TypeMap) this.typeMaps.get(TypePair.of(cls, cls2, str));
        if (typeMap != null) {
            return typeMap;
        }
        Iterator<TypePair<?, ?>> it = getPrimitiveWrapperTypePairs(cls, cls2, str).iterator();
        while (it.hasNext()) {
            TypeMap<S, D> typeMap2 = (TypeMap) this.typeMaps.get(it.next());
            if (typeMap2 != null) {
                return typeMap2;
            }
        }
        return null;
    }

    public <S, D> TypeMap<S, D> getOrCreate(S s, Class<S> cls, Class<D> cls2, String str, MappingEngineImpl mappingEngineImpl) {
        return getOrCreate(s, cls, cls2, str, null, null, mappingEngineImpl);
    }

    public <S, D> TypeMap<S, D> getOrCreate(S s, Class<S> cls, Class<D> cls2, String str, PropertyMap<S, D> propertyMap, Converter<S, D> converter, MappingEngineImpl mappingEngineImpl) {
        TypeMapImpl typeMapImpl;
        synchronized (this.lock) {
            TypePair<?, ?> of = TypePair.of(cls, cls2, str);
            typeMapImpl = (TypeMapImpl) this.typeMaps.get(of);
            if (typeMapImpl == null) {
                typeMapImpl = new TypeMapImpl(cls, cls2, str, this.config, mappingEngineImpl);
                if (propertyMap != null) {
                    typeMapImpl.addMappings(propertyMap);
                }
                if (converter == null && this.config.isImplicitMappingEnabled() && Types.mightContainsProperties(typeMapImpl.getSourceType()) && Types.mightContainsProperties(typeMapImpl.getDestinationType())) {
                    ImplicitMappingBuilder.build(s, typeMapImpl, this.config.typeMapStore, this.config.converterStore);
                }
                if (typeMapImpl.isFullMatching()) {
                    this.typeMaps.put(of, typeMapImpl);
                }
            } else if (propertyMap != null) {
                typeMapImpl.addMappings(propertyMap);
            }
            if (converter != null) {
                typeMapImpl.setConverter(converter);
            }
        }
        return typeMapImpl;
    }

    public void put(TypeMap<?, ?> typeMap) {
        TypePair<?, ?> of = TypePair.of(typeMap.getSourceType(), typeMap.getDestinationType(), typeMap.getName());
        synchronized (this.lock) {
            if (this.typeMaps.containsKey(of)) {
                throw new IllegalArgumentException("TypeMap exists in the store: " + of.toString());
            }
            this.typeMaps.put(of, typeMap);
        }
    }

    public <S, D> void put(Class<S> cls, Class<D> cls2, TypeMap<S, ? extends D> typeMap) {
        TypePair<?, ?> of = TypePair.of(cls, cls2, typeMap.getName());
        synchronized (this.lock) {
            if (this.typeMaps.containsKey(of)) {
                throw new IllegalArgumentException("TypeMap exists in the store: " + of.toString());
            }
            this.typeMaps.put(of, typeMap);
        }
    }

    private <S, D> List<TypePair<?, ?>> getPrimitiveWrapperTypePairs(Class<S> cls, Class<D> cls2, String str) {
        ArrayList arrayList = new ArrayList(1);
        if (Primitives.isPrimitive(cls)) {
            arrayList.add(TypePair.of(Primitives.wrapperFor(cls), cls2, str));
        }
        if (Primitives.isPrimitive(cls2)) {
            arrayList.add(TypePair.of(cls, Primitives.wrapperFor(cls2), str));
        }
        if (Primitives.isPrimitive(cls) && Primitives.isPrimitiveWrapper(cls2)) {
            arrayList.add(TypePair.of(Primitives.wrapperFor(cls), Primitives.wrapperFor(cls2), str));
        }
        return arrayList;
    }
}
