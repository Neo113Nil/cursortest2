package org.modelmapper.internal;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.Condition;
import org.modelmapper.Converter;
import org.modelmapper.Provider;
import org.modelmapper.internal.ExplicitMappingBuilder;
import org.modelmapper.internal.util.Strings;
import org.modelmapper.spi.PropertyInfo;

/* loaded from: classes4.dex */
abstract class MappingImpl implements InternalMapping, Comparable<MappingImpl> {
    private Condition<?, ?> condition;
    protected Converter<?, ?> converter;
    private final List<PropertyInfo> destinationMutators;
    private final boolean explicit;
    private final String path;
    protected Provider<?> provider;
    private int skipType;

    MappingImpl(List<? extends PropertyInfo> list) {
        this.destinationMutators = new ArrayList(list);
        this.path = Strings.join(list);
        this.explicit = false;
    }

    MappingImpl(List<? extends PropertyInfo> list, ExplicitMappingBuilder.MappingOptions mappingOptions) {
        this.destinationMutators = new ArrayList(list);
        this.path = Strings.join(list);
        this.skipType = mappingOptions.skipType;
        this.condition = mappingOptions.condition;
        this.provider = mappingOptions.provider;
        this.converter = mappingOptions.converter;
        this.explicit = true;
    }

    MappingImpl(MappingImpl mappingImpl, List<? extends PropertyInfo> list) {
        ArrayList arrayList = new ArrayList(mappingImpl.destinationMutators.size() + list.size());
        this.destinationMutators = arrayList;
        arrayList.addAll(list);
        arrayList.addAll(mappingImpl.destinationMutators);
        this.path = Strings.join(arrayList);
        this.skipType = mappingImpl.skipType;
        this.condition = mappingImpl.condition;
        this.provider = mappingImpl.provider;
        this.converter = mappingImpl.converter;
        this.explicit = mappingImpl.explicit;
    }

    @Override // java.lang.Comparable
    public int compareTo(MappingImpl mappingImpl) {
        return this.path.compareToIgnoreCase(mappingImpl.path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MappingImpl)) {
            return false;
        }
        return this.path.equals(((MappingImpl) obj).path);
    }

    @Override // org.modelmapper.spi.Mapping
    public Condition<?, ?> getCondition() {
        return this.condition;
    }

    @Override // org.modelmapper.spi.Mapping
    public Converter<?, ?> getConverter() {
        return this.converter;
    }

    @Override // org.modelmapper.spi.Mapping
    public List<? extends PropertyInfo> getDestinationProperties() {
        return this.destinationMutators;
    }

    @Override // org.modelmapper.spi.Mapping
    public PropertyInfo getLastDestinationProperty() {
        return this.destinationMutators.get(r0.size() - 1);
    }

    @Override // org.modelmapper.spi.Mapping
    public Provider<?> getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    @Override // org.modelmapper.spi.Mapping
    public boolean isSkipped() {
        return this.skipType != 0;
    }

    @Override // org.modelmapper.spi.Mapping
    public String getPath() {
        return this.path;
    }

    @Override // org.modelmapper.internal.InternalMapping
    public boolean isExplicit() {
        return this.explicit;
    }

    ExplicitMappingBuilder.MappingOptions getOptions() {
        ExplicitMappingBuilder.MappingOptions mappingOptions = new ExplicitMappingBuilder.MappingOptions();
        mappingOptions.skipType = this.skipType;
        mappingOptions.condition = this.condition;
        mappingOptions.converter = this.converter;
        mappingOptions.provider = this.provider;
        return mappingOptions;
    }
}
