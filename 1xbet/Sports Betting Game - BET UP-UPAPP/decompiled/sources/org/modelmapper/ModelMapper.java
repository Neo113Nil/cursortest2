package org.modelmapper;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import org.modelmapper.config.Configuration;
import org.modelmapper.internal.Errors;
import org.modelmapper.internal.InheritingConfiguration;
import org.modelmapper.internal.MappingEngineImpl;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.internal.util.Types;

/* loaded from: classes4.dex */
public class ModelMapper {
    private final InheritingConfiguration config;
    private final MappingEngineImpl engine;

    public ModelMapper() {
        InheritingConfiguration inheritingConfiguration = new InheritingConfiguration();
        this.config = inheritingConfiguration;
        this.engine = new MappingEngineImpl(inheritingConfiguration);
    }

    public <S, D> void addConverter(Converter<S, D> converter) {
        Assert.notNull(converter, "converter");
        Class<?>[] resolveRawArguments = TypeResolver.resolveRawArguments(Converter.class, (Class) converter.getClass());
        Assert.notNull(resolveRawArguments, "Must declare source type argument <S> and destination type argument <D> for converter");
        this.config.typeMapStore.getOrCreate(null, resolveRawArguments[0], resolveRawArguments[1], null, null, converter, this.engine);
    }

    public <S, D> void addConverter(Converter<S, D> converter, Class<S> cls, Class<D> cls2) {
        Assert.notNull(converter, "converter");
        this.config.typeMapStore.getOrCreate(null, cls, cls2, null, null, converter, this.engine);
    }

    public <S, D> TypeMap<S, D> addMappings(PropertyMap<S, D> propertyMap) {
        Assert.notNull(propertyMap, "propertyMap");
        return this.config.typeMapStore.getOrCreate(null, propertyMap.sourceType, propertyMap.destinationType, null, propertyMap, null, this.engine);
    }

    public <S, D> TypeMap<S, D> createTypeMap(Class<S> cls, Class<D> cls2) {
        return createTypeMap((Class) cls, (Class) cls2, (Configuration) this.config);
    }

    public <S, D> TypeMap<S, D> createTypeMap(Class<S> cls, Class<D> cls2, Configuration configuration) {
        Assert.notNull(cls, "sourceType");
        Assert.notNull(cls2, "destinationType");
        Assert.notNull(configuration, "configuration");
        return createTypeMapInternal(null, cls, cls2, null, configuration);
    }

    public <S, D> TypeMap<S, D> createTypeMap(Class<S> cls, Class<D> cls2, String str) {
        return createTypeMap((Class) cls, (Class) cls2, str, (Configuration) this.config);
    }

    public <S, D> TypeMap<S, D> createTypeMap(Class<S> cls, Class<D> cls2, String str, Configuration configuration) {
        Assert.notNull(cls, "sourceType");
        Assert.notNull(cls2, "destinationType");
        Assert.notNull(str, "typeMapName");
        Assert.notNull(configuration, "configuration");
        return createTypeMapInternal(null, cls, cls2, str, configuration);
    }

    public <S, D> TypeMap<S, D> createTypeMap(S s, Class<D> cls) {
        return createTypeMap((ModelMapper) s, (Class) cls, (Configuration) this.config);
    }

    public <S, D> TypeMap<S, D> createTypeMap(S s, Class<D> cls, Configuration configuration) {
        Assert.notNull(s, "source");
        Assert.notNull(cls, "destinationType");
        Assert.notNull(configuration, "configuration");
        return createTypeMapInternal(s, null, cls, null, configuration);
    }

    public <S, D> TypeMap<S, D> createTypeMap(S s, Class<D> cls, String str) {
        return createTypeMap((ModelMapper) s, (Class) cls, str, (Configuration) this.config);
    }

    public <S, D> TypeMap<S, D> createTypeMap(S s, Class<D> cls, String str, Configuration configuration) {
        Assert.notNull(s, "source");
        Assert.notNull(cls, "destinationType");
        Assert.notNull(str, "typeMapName");
        Assert.notNull(configuration, "configuration");
        return createTypeMapInternal(s, null, cls, str, configuration);
    }

    public Configuration getConfiguration() {
        return this.config;
    }

    public <S, D> TypeMap<S, D> getTypeMap(Class<S> cls, Class<D> cls2) {
        Assert.notNull(cls, "sourceType");
        Assert.notNull(cls2, "destinationType");
        return this.config.typeMapStore.get(cls, cls2, null);
    }

    public <S, D> TypeMap<S, D> getTypeMap(Class<S> cls, Class<D> cls2, String str) {
        Assert.notNull(cls, "sourceType");
        Assert.notNull(cls2, "destinationType");
        Assert.notNull(str, "typeMapName");
        return this.config.typeMapStore.get(cls, cls2, str);
    }

    public <S, D> TypeMap<S, D> typeMap(Class<S> cls, Class<D> cls2) {
        Assert.notNull(cls, "sourceType");
        Assert.notNull(cls2, "destinationType");
        return this.config.typeMapStore.getOrCreate(null, cls, cls2, null, this.engine);
    }

    public <S, D> TypeMap<S, D> typeMap(Class<S> cls, Class<D> cls2, String str) {
        Assert.notNull(cls, "sourceType");
        Assert.notNull(cls2, "destinationType");
        Assert.notNull(str, "typeMapName");
        return this.config.typeMapStore.getOrCreate(null, cls, cls2, str, this.engine);
    }

    public <S, D> TypeMap<S, D> emptyTypeMap(Class<S> cls, Class<D> cls2) {
        Assert.notNull(cls, "sourceType");
        Assert.notNull(cls2, "destinationType");
        Assert.isNull(this.config.typeMapStore.get(cls, cls2, null), "TypeMap already defined", new Object[0]);
        return this.config.typeMapStore.createEmptyTypeMap(cls, cls2, null, this.config, this.engine);
    }

    public Collection<TypeMap<?, ?>> getTypeMaps() {
        return this.config.typeMapStore.get();
    }

    public <D> D map(Object obj, Class<D> cls) {
        Assert.notNull(obj, "source");
        Assert.notNull(cls, "destinationType");
        return (D) mapInternal(obj, null, cls, null);
    }

    public <D> D map(Object obj, Class<D> cls, String str) {
        Assert.notNull(obj, "source");
        Assert.notNull(cls, "destinationType");
        Assert.notNull(str, "typeMapName");
        return (D) mapInternal(obj, null, cls, str);
    }

    public void map(Object obj, Object obj2) {
        Assert.notNull(obj, "source");
        Assert.notNull(obj2, "destination");
        mapInternal(obj, obj2, null, null);
    }

    public void map(Object obj, Object obj2, String str) {
        Assert.notNull(obj, "source");
        Assert.notNull(obj2, "destination");
        Assert.notNull(str, "typeMapName");
        mapInternal(obj, obj2, null, str);
    }

    public <D> D map(Object obj, Type type) {
        Assert.notNull(obj, "source");
        Assert.notNull(type, "destinationType");
        return (D) mapInternal(obj, null, type, null);
    }

    public <D> D map(Object obj, Type type, String str) {
        Assert.notNull(obj, "source");
        Assert.notNull(type, "destinationType");
        Assert.notNull(str, "typeMapName");
        return (D) mapInternal(obj, null, type, str);
    }

    public void validate() {
        Errors errors = new Errors();
        Iterator<TypeMap<?, ?>> it = getTypeMaps().iterator();
        while (it.hasNext()) {
            try {
                it.next().validate();
            } catch (ValidationException e) {
                errors.merge(e.getErrorMessages());
            }
        }
        errors.throwValidationExceptionIfErrorsExist();
    }

    public ModelMapper registerModule(Module module) {
        module.setupModule(this);
        return this;
    }

    private <S, D> TypeMap<S, D> createTypeMapInternal(S s, Class<S> cls, Class<D> cls2, String str, Configuration configuration) {
        if (s != null) {
            cls = Types.deProxy(s.getClass());
        }
        Class<S> cls3 = cls;
        Assert.state(this.config.typeMapStore.get(cls3, cls2, str) == null, String.format("A TypeMap already exists for %s and %s", cls3, cls2), new Object[0]);
        return this.config.typeMapStore.create(s, cls3, cls2, str, (InheritingConfiguration) configuration, this.engine);
    }

    private <D> D mapInternal(Object obj, D d, Type type, String str) {
        if (d != null) {
            type = Types.deProxy(d.getClass());
        }
        return (D) this.engine.map(obj, Types.deProxy(obj.getClass()), d, TypeToken.of(type), str);
    }
}
