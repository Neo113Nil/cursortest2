package org.modelmapper.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.modelmapper.Condition;
import org.modelmapper.Converter;
import org.modelmapper.ExpressionMap;
import org.modelmapper.PropertyMap;
import org.modelmapper.Provider;
import org.modelmapper.TypeMap;
import org.modelmapper.internal.PropertyInfoImpl;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.internal.util.Objects;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.DestinationSetter;
import org.modelmapper.spi.Mapping;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.SourceGetter;
import org.modelmapper.spi.TypeSafeSourceGetter;

/* loaded from: classes4.dex */
class TypeMapImpl<S, D> implements TypeMap<S, D> {
    private Condition<?, ?> condition;
    final InheritingConfiguration configuration;
    private Converter<S, D> converter;
    private final Class<D> destinationType;
    private final MappingEngineImpl engine;
    private final Map<String, InternalMapping> mappings;
    private final String name;
    private Converter<S, D> postConverter;
    private Converter<S, D> preConverter;
    private Condition<?, ?> propertyCondition;
    private Converter<?, ?> propertyConverter;
    private Provider<?> propertyProvider;
    private Provider<D> provider;
    private final Class<S> sourceType;

    TypeMapImpl(Class<S> cls, Class<D> cls2, String str, InheritingConfiguration inheritingConfiguration, MappingEngineImpl mappingEngineImpl) {
        this.mappings = new TreeMap();
        this.sourceType = cls;
        this.destinationType = cls2;
        this.name = str;
        this.configuration = inheritingConfiguration;
        this.engine = mappingEngineImpl;
    }

    private TypeMapImpl(TypeMapImpl<? super S, ? super D> typeMapImpl, Class<S> cls, Class<D> cls2) {
        TreeMap treeMap = new TreeMap();
        this.mappings = treeMap;
        this.sourceType = cls;
        this.destinationType = cls2;
        this.name = typeMapImpl.name;
        this.configuration = typeMapImpl.configuration;
        this.engine = typeMapImpl.engine;
        synchronized (typeMapImpl.mappings) {
            treeMap.putAll(typeMapImpl.mappings);
        }
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> addMappings(PropertyMap<S, D> propertyMap) {
        if (this.sourceType.isEnum() || this.destinationType.isEnum()) {
            throw new Errors().mappingForEnum().toConfigurationException();
        }
        synchronized (this.mappings) {
            for (MappingImpl mappingImpl : ExplicitMappingBuilder.build(this.sourceType, this.destinationType, this.configuration, propertyMap)) {
                InternalMapping addMapping = addMapping(mappingImpl);
                if (addMapping != null && addMapping.isExplicit()) {
                    throw new Errors().duplicateMapping(mappingImpl.getLastDestinationProperty()).toConfigurationException();
                }
            }
        }
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public Condition<?, ?> getCondition() {
        return this.condition;
    }

    @Override // org.modelmapper.TypeMap
    public Converter<S, D> getConverter() {
        return this.converter;
    }

    @Override // org.modelmapper.TypeMap
    public Class<D> getDestinationType() {
        return this.destinationType;
    }

    @Override // org.modelmapper.TypeMap
    public List<Mapping> getMappings() {
        ArrayList arrayList;
        synchronized (this.mappings) {
            arrayList = new ArrayList(this.mappings.values());
        }
        return arrayList;
    }

    @Override // org.modelmapper.TypeMap
    public String getName() {
        return this.name;
    }

    @Override // org.modelmapper.TypeMap
    public Converter<S, D> getPostConverter() {
        return this.postConverter;
    }

    @Override // org.modelmapper.TypeMap
    public Converter<S, D> getPreConverter() {
        return this.preConverter;
    }

    @Override // org.modelmapper.TypeMap
    public Condition<?, ?> getPropertyCondition() {
        return this.propertyCondition;
    }

    @Override // org.modelmapper.TypeMap
    public Converter<?, ?> getPropertyConverter() {
        return this.propertyConverter;
    }

    @Override // org.modelmapper.TypeMap
    public Provider<?> getPropertyProvider() {
        return this.propertyProvider;
    }

    @Override // org.modelmapper.TypeMap
    public Provider<D> getProvider() {
        return this.provider;
    }

    @Override // org.modelmapper.TypeMap
    public Class<S> getSourceType() {
        return this.sourceType;
    }

    @Override // org.modelmapper.TypeMap
    public List<PropertyInfo> getUnmappedProperties() {
        PathProperties destinationProperties = getDestinationProperties();
        synchronized (this.mappings) {
            Iterator<Map.Entry<String, InternalMapping>> it = this.mappings.entrySet().iterator();
            while (it.hasNext()) {
                destinationProperties.matchAndRemove(it.next().getKey());
            }
        }
        return destinationProperties.get();
    }

    @Override // org.modelmapper.TypeMap
    public D map(S s) {
        D d;
        Class deProxy = Types.deProxy(s.getClass());
        MappingContextImpl<S, D> mappingContextImpl = new MappingContextImpl<>(s, deProxy, null, this.destinationType, null, this.name, this.engine);
        try {
            d = (D) this.engine.typeMap(mappingContextImpl, this);
        } catch (Throwable th) {
            mappingContextImpl.errors.errorMapping(deProxy, this.destinationType, th);
            d = null;
        }
        mappingContextImpl.errors.throwMappingExceptionIfErrorsExist();
        return d;
    }

    @Override // org.modelmapper.TypeMap
    public void map(S s, D d) {
        Class deProxy = Types.deProxy(s.getClass());
        MappingContextImpl<S, D> mappingContextImpl = new MappingContextImpl<>(s, deProxy, d, this.destinationType, null, this.name, this.engine);
        try {
            this.engine.typeMap(mappingContextImpl, this);
        } catch (Throwable th) {
            mappingContextImpl.errors.errorMapping(deProxy, this.destinationType, th);
        }
        mappingContextImpl.errors.throwMappingExceptionIfErrorsExist();
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> setCondition(Condition<?, ?> condition) {
        this.condition = (Condition) Assert.notNull(condition, "condition");
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> setConverter(Converter<S, D> converter) {
        this.converter = (Converter) Assert.notNull(converter, "converter");
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> setPostConverter(Converter<S, D> converter) {
        this.postConverter = (Converter) Assert.notNull(converter, "converter");
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> setPreConverter(Converter<S, D> converter) {
        this.preConverter = (Converter) Assert.notNull(converter, "converter");
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> setPropertyCondition(Condition<?, ?> condition) {
        this.propertyCondition = (Condition) Assert.notNull(condition, "condition");
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> setPropertyConverter(Converter<?, ?> converter) {
        this.propertyConverter = (Converter) Assert.notNull(converter, "converter");
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> setPropertyProvider(Provider<?> provider) {
        this.propertyProvider = (Provider) Assert.notNull(provider, IronSourceConstants.EVENTS_PROVIDER);
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> setProvider(Provider<D> provider) {
        this.provider = (Provider) Assert.notNull(provider, IronSourceConstants.EVENTS_PROVIDER);
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public <V> TypeMap<S, D> addMapping(SourceGetter<S> sourceGetter, DestinationSetter<D, V> destinationSetter) {
        new ReferenceMapExpressionImpl(this).map(sourceGetter, destinationSetter);
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> addMappings(ExpressionMap<S, D> expressionMap) {
        expressionMap.configure(new ConfigurableMapExpressionImpl(this));
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TypeMap[");
        sb.append(this.sourceType.getSimpleName()).append(" -> ").append(this.destinationType.getSimpleName());
        if (this.name != null) {
            sb.append(' ').append(this.name);
        }
        return sb.append(AbstractJsonLexerKt.END_LIST).toString();
    }

    @Override // org.modelmapper.TypeMap
    public void validate() {
        if (this.converter == null && this.preConverter == null && this.postConverter == null) {
            Errors errors = new Errors();
            List<PropertyInfo> unmappedProperties = getUnmappedProperties();
            if (!unmappedProperties.isEmpty()) {
                errors.errorUnmappedProperties(this, unmappedProperties);
            }
            errors.throwValidationExceptionIfErrorsExist();
        }
    }

    @Override // org.modelmapper.TypeMap
    public <DS extends S, DD extends D> TypeMap<S, D> include(Class<DS> cls, Class<DD> cls2) {
        this.configuration.typeMapStore.put(new TypeMapImpl(this, cls, cls2));
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> include(Class<? super D> cls) {
        if (this.provider == null) {
            this.provider = new Provider<D>() { // from class: org.modelmapper.internal.TypeMapImpl.1
                @Override // org.modelmapper.Provider
                public D get(Provider.ProvisionRequest<D> provisionRequest) {
                    return (D) Objects.instantiate(TypeMapImpl.this.destinationType);
                }
            };
        }
        this.configuration.typeMapStore.put(this.sourceType, cls, this);
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> includeBase(Class<? super S> cls, Class<? super D> cls2) {
        TypeMapImpl typeMapImpl = (TypeMapImpl) this.configuration.typeMapStore.get(cls, cls2, this.name);
        Assert.notNull(typeMapImpl, "Cannot find base TypeMap");
        synchronized (typeMapImpl.mappings) {
            Iterator<Map.Entry<String, InternalMapping>> it = typeMapImpl.mappings.entrySet().iterator();
            while (it.hasNext()) {
                addMapping(it.next().getValue());
            }
        }
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public <P> TypeMap<S, D> include(TypeSafeSourceGetter<S, P> typeSafeSourceGetter, Class<P> cls) {
        TypeMapImpl typeMapImpl = (TypeMapImpl) this.configuration.typeMapStore.get(cls, this.destinationType, this.name);
        Assert.notNull(typeMapImpl, "Cannot find child TypeMap");
        List<Accessor> collect = PropertyReferenceCollector.collect(this, typeSafeSourceGetter);
        Iterator<Mapping> it = typeMapImpl.getMappings().iterator();
        while (it.hasNext()) {
            addMapping(((InternalMapping) it.next()).createMergedCopy(collect, Collections.emptyList()));
        }
        return this;
    }

    @Override // org.modelmapper.TypeMap
    public TypeMap<S, D> implicitMappings() {
        ImplicitMappingBuilder.build(null, this, this.configuration.typeMapStore, this.configuration.converterStore);
        return this;
    }

    void addMappingIfAbsent(InternalMapping internalMapping) {
        synchronized (this.mappings) {
            if (!this.mappings.containsKey(internalMapping.getPath())) {
                this.mappings.put(internalMapping.getPath(), internalMapping);
            }
        }
    }

    InternalMapping addMapping(InternalMapping internalMapping) {
        InternalMapping put;
        synchronized (this.mappings) {
            put = this.mappings.put(internalMapping.getPath(), internalMapping);
        }
        return put;
    }

    boolean isSkipped(String str) {
        InternalMapping internalMapping = this.mappings.get(str);
        return internalMapping != null && internalMapping.isSkipped();
    }

    Mapping mappingFor(String str) {
        return this.mappings.get(str);
    }

    boolean isFullMatching() {
        return getUnmappedProperties().isEmpty() || this.configuration.valueAccessStore.getFirstSupportedReader(this.sourceType) == null;
    }

    private PathProperties getDestinationProperties() {
        PathProperties pathProperties = new PathProperties();
        HashSet hashSet = new HashSet();
        Stack stack = new Stack();
        stack.push(new Property("", TypeInfoRegistry.typeInfoFor(this.destinationType, this.configuration)));
        while (!stack.isEmpty()) {
            Property property = (Property) stack.pop();
            hashSet.add(property.typeInfo.getType());
            for (Map.Entry<String, Mutator> entry : property.typeInfo.getMutators().entrySet()) {
                if (!(entry.getValue() instanceof PropertyInfoImpl.FieldPropertyInfo) || this.configuration.isFieldMatchingEnabled()) {
                    String str = property.prefix + entry.getKey() + ".";
                    Mutator value = entry.getValue();
                    pathProperties.pathProperties.add(new PathProperty(str, value));
                    if (!hashSet.contains(value.getType()) && Types.mightContainsProperties(value.getType())) {
                        stack.push(new Property(str, TypeInfoRegistry.typeInfoFor(value.getType(), this.configuration)));
                    }
                }
            }
        }
        return pathProperties;
    }

    private static final class Property {
        String prefix;
        TypeInfo<?> typeInfo;

        public Property(String str, TypeInfo<?> typeInfo) {
            this.prefix = str;
            this.typeInfo = typeInfo;
        }
    }

    private static final class PathProperties {
        List<PathProperty> pathProperties;

        private PathProperties() {
            this.pathProperties = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void matchAndRemove(String str) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(".", i);
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
                String substring = str.substring(0, i);
                Iterator<PathProperty> it = this.pathProperties.iterator();
                while (it.hasNext()) {
                    if (it.next().path.equals(substring)) {
                        it.remove();
                    }
                }
            }
            Iterator<PathProperty> it2 = this.pathProperties.iterator();
            while (it2.hasNext()) {
                if (it2.next().path.startsWith(str)) {
                    it2.remove();
                }
            }
        }

        public List<PropertyInfo> get() {
            ArrayList arrayList = new ArrayList(this.pathProperties.size());
            Iterator<PathProperty> it = this.pathProperties.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mutator);
            }
            return arrayList;
        }
    }

    private static final class PathProperty {
        Mutator mutator;
        String path;

        private PathProperty(String str, Mutator mutator) {
            this.path = str;
            this.mutator = mutator;
        }
    }
}
