package org.modelmapper.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.modelmapper.Converter;
import org.modelmapper.TypeMap;
import org.modelmapper.internal.PropertyInfoImpl;
import org.modelmapper.internal.converter.ConverterStore;
import org.modelmapper.internal.util.Iterables;
import org.modelmapper.internal.util.Strings;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.ConditionalConverter;
import org.modelmapper.spi.Mapping;
import org.modelmapper.spi.MatchingStrategy;
import org.modelmapper.spi.NameableType;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyMapping;

/* loaded from: classes4.dex */
class ImplicitMappingBuilder<S, D> {
    private final InheritingConfiguration configuration;
    private final ConverterStore converterStore;
    private final MatchingStrategy matchingStrategy;
    private final PropertyNameInfoImpl propertyNameInfo;
    private final TypeInfo<S> sourceTypeInfo;
    private final TypeMapImpl<S, D> typeMap;
    private final TypeMapStore typeMapStore;
    private final Errors errors = new Errors();
    private final Set<Class<?>> sourceTypes = new HashSet();
    private final Set<Class<?>> destinationTypes = new HashSet();
    private final List<PropertyMappingImpl> mappings = new ArrayList();
    private final List<PropertyMappingImpl> partiallyMatchedMappings = new ArrayList();
    private final Map<PropertyInfo, PropertyMappingImpl> intermediateMappings = new HashMap();
    private final List<InternalMapping> mergedMappings = new ArrayList();

    static <S, D> void build(S s, TypeMapImpl<S, D> typeMapImpl, TypeMapStore typeMapStore, ConverterStore converterStore) {
        new ImplicitMappingBuilder(s, typeMapImpl, typeMapStore, converterStore).build();
    }

    ImplicitMappingBuilder(S s, TypeMapImpl<S, D> typeMapImpl, TypeMapStore typeMapStore, ConverterStore converterStore) {
        this.typeMap = typeMapImpl;
        this.converterStore = converterStore;
        this.typeMapStore = typeMapStore;
        InheritingConfiguration inheritingConfiguration = typeMapImpl.configuration;
        this.configuration = inheritingConfiguration;
        this.sourceTypeInfo = TypeInfoRegistry.typeInfoFor(s, typeMapImpl.getSourceType(), inheritingConfiguration);
        this.matchingStrategy = inheritingConfiguration.getMatchingStrategy();
        this.propertyNameInfo = new PropertyNameInfoImpl(typeMapImpl.getSourceType(), inheritingConfiguration);
    }

    void build() {
        matchDestination(TypeInfoRegistry.typeInfoFor(this.typeMap.getDestinationType(), this.configuration));
    }

    private void matchDestination(TypeInfo<?> typeInfo) {
        PropertyMappingImpl disambiguateMappings;
        this.destinationTypes.add(typeInfo.getType());
        for (Map.Entry<String, Mutator> entry : typeInfo.getMutators().entrySet()) {
            this.propertyNameInfo.pushDestination(entry.getKey(), entry.getValue());
            String join = Strings.join(this.propertyNameInfo.getDestinationProperties());
            Mutator value = entry.getValue();
            Mapping mappingFor = this.typeMap.mappingFor(join);
            if (mappingFor == null) {
                matchSource(this.sourceTypeInfo, value);
                this.propertyNameInfo.clearSource();
                this.sourceTypes.clear();
            }
            if (this.mappings.isEmpty()) {
                this.mappings.addAll(this.partiallyMatchedMappings);
            }
            if (!this.mappings.isEmpty()) {
                if (this.mappings.size() == 1) {
                    disambiguateMappings = this.mappings.get(0);
                } else {
                    disambiguateMappings = disambiguateMappings();
                    if (disambiguateMappings == null && !this.configuration.isAmbiguityIgnored()) {
                        this.errors.ambiguousDestination(this.mappings);
                    }
                }
                if (disambiguateMappings != null) {
                    this.typeMap.addMappingIfAbsent(disambiguateMappings);
                    if (Iterables.isIterable(disambiguateMappings.getLastDestinationProperty().getType())) {
                        Iterator<? extends PropertyInfo> it = disambiguateMappings.getSourceProperties().iterator();
                        while (it.hasNext()) {
                            PropertyMappingImpl propertyMappingImpl = this.intermediateMappings.get(it.next());
                            if (propertyMappingImpl != null && !propertyMappingImpl.getPath().equals(disambiguateMappings.getPath())) {
                                this.typeMap.addMappingIfAbsent(propertyMappingImpl);
                            }
                        }
                    }
                }
                this.mappings.clear();
                this.partiallyMatchedMappings.clear();
                this.intermediateMappings.clear();
            } else if (!this.mergedMappings.isEmpty()) {
                Iterator<InternalMapping> it2 = this.mergedMappings.iterator();
                while (it2.hasNext()) {
                    this.typeMap.addMappingIfAbsent(it2.next());
                }
                this.mergedMappings.clear();
            } else if (!this.destinationTypes.contains(value.getType()) && !this.typeMap.isSkipped(join) && Types.mightContainsProperties(value.getType()) && !isConvertable(mappingFor)) {
                matchDestination(value.getTypeInfo(this.configuration));
            }
            this.propertyNameInfo.popDestination();
        }
        this.destinationTypes.remove(typeInfo.getType());
        this.errors.throwConfigurationExceptionIfErrorsExist();
    }

    private void matchSource(TypeInfo<?> typeInfo, Mutator mutator) {
        boolean z;
        this.sourceTypes.add(typeInfo.getType());
        for (Map.Entry<String, Accessor> entry : typeInfo.getAccessors().entrySet()) {
            Accessor value = entry.getValue();
            this.propertyNameInfo.pushSource(entry.getKey(), entry.getValue());
            boolean z2 = false;
            if (this.matchingStrategy.matches(this.propertyNameInfo)) {
                if (this.destinationTypes.contains(mutator.getType())) {
                    this.mappings.add(new PropertyMappingImpl((List<? extends PropertyInfo>) this.propertyNameInfo.getSourceProperties(), (List<? extends PropertyInfo>) this.propertyNameInfo.getDestinationProperties(), true));
                } else {
                    PropertyMappingImpl propertyMappingImpl = null;
                    TypeMap<?, ?> typeMap = this.typeMapStore.get(value.getType(), mutator.getType(), null);
                    if (typeMap != null) {
                        Converter<?, ?> converter = typeMap.getConverter();
                        if (converter == null) {
                            mergeMappings(typeMap);
                        } else {
                            this.mappings.add(new PropertyMappingImpl(this.propertyNameInfo.getSourceProperties(), this.propertyNameInfo.getDestinationProperties(), typeMap.getProvider(), converter));
                        }
                        z = this.matchingStrategy.isExact();
                    } else {
                        Iterator<ConditionalConverter<?, ?>> it = this.converterStore.getConverters().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ConditionalConverter.MatchResult match = it.next().match(value.getType(), mutator.getType());
                            if (!ConditionalConverter.MatchResult.NONE.equals(match)) {
                                propertyMappingImpl = new PropertyMappingImpl((List<? extends PropertyInfo>) this.propertyNameInfo.getSourceProperties(), (List<? extends PropertyInfo>) this.propertyNameInfo.getDestinationProperties(), false);
                                if (ConditionalConverter.MatchResult.FULL.equals(match)) {
                                    this.mappings.add(propertyMappingImpl);
                                    z = this.matchingStrategy.isExact();
                                    break;
                                } else if (!this.configuration.isFullTypeMatchingRequired()) {
                                    this.partiallyMatchedMappings.add(propertyMappingImpl);
                                    break;
                                }
                            }
                        }
                        z = false;
                    }
                    if (propertyMappingImpl == null) {
                        this.intermediateMappings.put(value, new PropertyMappingImpl((List<? extends PropertyInfo>) this.propertyNameInfo.getSourceProperties(), (List<? extends PropertyInfo>) this.propertyNameInfo.getDestinationProperties(), false));
                    }
                    z2 = z;
                }
            }
            if (!z2 && Types.mightContainsProperties(value.getType()) && (!this.sourceTypes.contains(value.getType()) || (value instanceof PropertyInfoImpl.ValueReaderPropertyInfo))) {
                matchSource(value.getTypeInfo(this.configuration), mutator);
            }
            this.propertyNameInfo.popSource();
            if (z2) {
                break;
            }
        }
        this.sourceTypes.remove(typeInfo.getType());
    }

    private PropertyMappingImpl disambiguateMappings() {
        ArrayList arrayList = new ArrayList(this.mappings.size());
        for (PropertyMappingImpl propertyMappingImpl : this.mappings) {
            SourceTokensMatcher createSourceTokensMatcher = createSourceTokensMatcher(propertyMappingImpl);
            DestTokenIterator destTokenIterator = new DestTokenIterator(propertyMappingImpl);
            while (destTokenIterator.hasNext()) {
                createSourceTokensMatcher.match(destTokenIterator.next());
            }
            arrayList.add(new WeightPropertyMappingImpl(propertyMappingImpl, createSourceTokensMatcher.matches() / (createSourceTokensMatcher.total() + destTokenIterator.total())));
        }
        Collections.sort(arrayList);
        if (((WeightPropertyMappingImpl) arrayList.get(0)).ratio == ((WeightPropertyMappingImpl) arrayList.get(1)).ratio) {
            return null;
        }
        return ((WeightPropertyMappingImpl) arrayList.get(0)).mapping;
    }

    private SourceTokensMatcher createSourceTokensMatcher(PropertyMappingImpl propertyMappingImpl) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < propertyMappingImpl.getSourceProperties().size(); i++) {
            PropertyInfo propertyInfo = propertyMappingImpl.getSourceProperties().get(i);
            String[] strArr = this.configuration.getSourceNameTokenizer().tokenize(propertyInfo.getName(), NameableType.forPropertyType(propertyInfo.getPropertyType()));
            for (int i2 = 0; i2 < strArr.length; i2++) {
                hashMap.put(Pair.of(Integer.valueOf(i), Integer.valueOf(i2)), strArr[i2]);
            }
        }
        return new SourceTokensMatcher(hashMap);
    }

    static class SourceTokensMatcher {
        private Map<Pair<Integer, Integer>, String> tokens;
        private List<Pair<Integer, Integer>> unmatched;

        SourceTokensMatcher(Map<Pair<Integer, Integer>, String> map) {
            this.tokens = map;
            this.unmatched = new ArrayList(map.keySet());
        }

        void match(String str) {
            Iterator<Pair<Integer, Integer>> it = this.unmatched.iterator();
            while (it.hasNext()) {
                if (this.tokens.get(it.next()).equalsIgnoreCase(str)) {
                    it.remove();
                    return;
                }
            }
        }

        int matches() {
            return this.tokens.size() - this.unmatched.size();
        }

        int total() {
            return this.tokens.size();
        }
    }

    class DestTokenIterator implements Iterator<String> {
        private PropertyMappingImpl mapping;
        private String[] destTokens = new String[0];
        private int total = 0;
        private int destIndex = -1;
        private int pos = -1;

        DestTokenIterator(PropertyMappingImpl propertyMappingImpl) {
            this.mapping = propertyMappingImpl;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.destIndex < this.mapping.getDestinationProperties().size() - 1 || this.pos < this.destTokens.length - 1;
        }

        @Override // java.util.Iterator
        public String next() {
            if (this.pos == this.destTokens.length - 1) {
                List<? extends PropertyInfo> destinationProperties = this.mapping.getDestinationProperties();
                int i = this.destIndex + 1;
                this.destIndex = i;
                PropertyInfo propertyInfo = destinationProperties.get(i);
                this.destTokens = ImplicitMappingBuilder.this.configuration.getDestinationNameTokenizer().tokenize(propertyInfo.getName(), NameableType.forPropertyType(propertyInfo.getPropertyType()));
                this.pos = -1;
            }
            this.total++;
            String[] strArr = this.destTokens;
            int i2 = this.pos + 1;
            this.pos = i2;
            return strArr[i2];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        int total() {
            return this.total;
        }
    }

    static class WeightPropertyMappingImpl implements Comparable<WeightPropertyMappingImpl> {
        private PropertyMappingImpl mapping;
        private double ratio;

        WeightPropertyMappingImpl(PropertyMappingImpl propertyMappingImpl, double d) {
            this.mapping = propertyMappingImpl;
            this.ratio = d;
        }

        @Override // java.lang.Comparable
        public int compareTo(WeightPropertyMappingImpl weightPropertyMappingImpl) {
            double d = this.ratio;
            double d2 = weightPropertyMappingImpl.ratio;
            if (d == d2) {
                return 0;
            }
            return d > d2 ? -1 : 1;
        }
    }

    private void mergeMappings(TypeMap<?, ?> typeMap) {
        Iterator<Mapping> it = typeMap.getMappings().iterator();
        while (it.hasNext()) {
            this.mergedMappings.add(((InternalMapping) it.next()).createMergedCopy(this.propertyNameInfo.getSourceProperties(), this.propertyNameInfo.getDestinationProperties()));
        }
    }

    private boolean isConvertable(Mapping mapping) {
        if (mapping == null || mapping.getProvider() != null || !(mapping instanceof PropertyMapping)) {
            return false;
        }
        PropertyMapping propertyMapping = (PropertyMapping) mapping;
        return (this.converterStore.getFirstSupported(propertyMapping.getLastSourceProperty().getType(), mapping.getLastDestinationProperty().getType()) != null) || (this.typeMapStore.get(propertyMapping.getLastSourceProperty().getType(), mapping.getLastDestinationProperty().getType(), null) != null);
    }
}
