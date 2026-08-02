package org.modelmapper.internal;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.internal.ExplicitMappingBuilder;
import org.modelmapper.internal.util.Strings;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.SourceMapping;

/* loaded from: classes4.dex */
class SourceMappingImpl extends MappingImpl implements SourceMapping {
    private final Class<?> sourceType;

    SourceMappingImpl(Class<?> cls, List<Mutator> list, ExplicitMappingBuilder.MappingOptions mappingOptions) {
        super(list, mappingOptions);
        this.sourceType = cls;
    }

    @Override // org.modelmapper.spi.Mapping
    public Class<?> getSourceType() {
        return this.sourceType;
    }

    public String toString() {
        return String.format("SourceMapping[%s -> %s]", this.sourceType, Strings.joinWithFirstType(getDestinationProperties()));
    }

    @Override // org.modelmapper.internal.InternalMapping
    public InternalMapping createMergedCopy(List<? extends PropertyInfo> list, List<? extends PropertyInfo> list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list2);
        arrayList.addAll(getDestinationProperties());
        return new PropertyMappingImpl(list, arrayList, getOptions());
    }
}
