package org.modelmapper.internal;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.Converter;
import org.modelmapper.Provider;
import org.modelmapper.internal.ExplicitMappingBuilder;
import org.modelmapper.internal.util.Strings;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.PropertyMapping;

/* loaded from: classes4.dex */
class PropertyMappingImpl extends MappingImpl implements PropertyMapping {
    boolean cyclic;
    private final List<PropertyInfo> sourceAccessors;

    PropertyMappingImpl(List<? extends PropertyInfo> list, List<? extends PropertyInfo> list2, boolean z) {
        super(list2);
        this.sourceAccessors = new ArrayList(list);
        this.cyclic = z;
    }

    PropertyMappingImpl(List<? extends PropertyInfo> list, List<? extends PropertyInfo> list2, Provider<?> provider, Converter<?, ?> converter) {
        super(list2);
        this.provider = provider;
        this.converter = converter;
        this.sourceAccessors = new ArrayList(list);
    }

    PropertyMappingImpl(List<? extends PropertyInfo> list, List<? extends PropertyInfo> list2, ExplicitMappingBuilder.MappingOptions mappingOptions) {
        super(list2, mappingOptions);
        this.sourceAccessors = new ArrayList(list);
    }

    private PropertyMappingImpl(PropertyMappingImpl propertyMappingImpl, List<? extends PropertyInfo> list, List<? extends PropertyInfo> list2) {
        super(propertyMappingImpl, list2);
        ArrayList arrayList = new ArrayList(propertyMappingImpl.sourceAccessors.size() + list.size());
        this.sourceAccessors = arrayList;
        arrayList.addAll(list);
        arrayList.addAll(propertyMappingImpl.sourceAccessors);
        this.cyclic = propertyMappingImpl.cyclic;
    }

    @Override // org.modelmapper.spi.PropertyMapping
    public PropertyInfo getLastSourceProperty() {
        List<PropertyInfo> list = this.sourceAccessors;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.sourceAccessors.get(r0.size() - 1);
    }

    @Override // org.modelmapper.spi.PropertyMapping
    public List<? extends PropertyInfo> getSourceProperties() {
        return this.sourceAccessors;
    }

    public String toString() {
        return String.format("PropertyMapping[%s -> %s]", Strings.joinWithFirstType(this.sourceAccessors), Strings.joinWithFirstType(getDestinationProperties()));
    }

    @Override // org.modelmapper.internal.InternalMapping
    public InternalMapping createMergedCopy(List<? extends PropertyInfo> list, List<? extends PropertyInfo> list2) {
        return new PropertyMappingImpl(this, list, list2);
    }

    @Override // org.modelmapper.spi.Mapping
    public Class<?> getSourceType() {
        return getLastSourceProperty().getType();
    }
}
