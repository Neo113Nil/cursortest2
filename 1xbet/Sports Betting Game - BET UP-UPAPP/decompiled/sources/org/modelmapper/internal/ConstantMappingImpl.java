package org.modelmapper.internal;

import java.util.List;
import org.modelmapper.internal.ExplicitMappingBuilder;
import org.modelmapper.internal.util.Strings;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.ConstantMapping;
import org.modelmapper.spi.PropertyInfo;

/* loaded from: classes4.dex */
class ConstantMappingImpl extends MappingImpl implements ConstantMapping {
    private final Object constant;

    private ConstantMappingImpl(ConstantMappingImpl constantMappingImpl, List<? extends PropertyInfo> list) {
        super(constantMappingImpl, list);
        this.constant = constantMappingImpl.constant;
    }

    ConstantMappingImpl(Object obj, List<Mutator> list, ExplicitMappingBuilder.MappingOptions mappingOptions) {
        super(list, mappingOptions);
        this.constant = obj;
    }

    @Override // org.modelmapper.spi.ConstantMapping
    public Object getConstant() {
        return this.constant;
    }

    public String toString() {
        return String.format("ConstantMapping[%s -> %s]", this.constant, Strings.joinWithFirstType(getDestinationProperties()));
    }

    @Override // org.modelmapper.internal.InternalMapping
    public InternalMapping createMergedCopy(List<? extends PropertyInfo> list, List<? extends PropertyInfo> list2) {
        return new ConstantMappingImpl(this, list2);
    }

    @Override // org.modelmapper.spi.Mapping
    public Class<?> getSourceType() {
        Object obj = this.constant;
        return obj == null ? Object.class : Types.deProxy(obj.getClass());
    }
}
