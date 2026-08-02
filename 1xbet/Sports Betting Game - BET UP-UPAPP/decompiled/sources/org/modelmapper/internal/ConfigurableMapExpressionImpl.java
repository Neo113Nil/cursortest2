package org.modelmapper.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.modelmapper.Condition;
import org.modelmapper.Converter;
import org.modelmapper.Provider;
import org.modelmapper.builder.ConfigurableMapExpression;
import org.modelmapper.builder.ReferenceMapExpression;
import org.modelmapper.internal.ExplicitMappingBuilder;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.spi.DestinationSetter;
import org.modelmapper.spi.SourceGetter;

/* loaded from: classes4.dex */
class ConfigurableMapExpressionImpl<S, D> implements ConfigurableMapExpression<S, D> {
    TypeMapImpl<S, D> typeMap;

    public ConfigurableMapExpressionImpl(TypeMapImpl<S, D> typeMapImpl) {
        this.typeMap = typeMapImpl;
    }

    @Override // org.modelmapper.builder.ConfigurableMapExpression
    public ReferenceMapExpression<S, D> using(Converter<?, ?> converter) {
        Assert.notNull(converter, "converter");
        ExplicitMappingBuilder.MappingOptions mappingOptions = new ExplicitMappingBuilder.MappingOptions();
        mappingOptions.converter = converter;
        return new ReferenceMapExpressionImpl(this.typeMap, mappingOptions);
    }

    @Override // org.modelmapper.builder.ConfigurableMapExpression
    public ReferenceMapExpression<S, D> with(Provider<?> provider) {
        Assert.notNull(provider, IronSourceConstants.EVENTS_PROVIDER);
        ExplicitMappingBuilder.MappingOptions mappingOptions = new ExplicitMappingBuilder.MappingOptions();
        mappingOptions.provider = provider;
        return new ReferenceMapExpressionImpl(this.typeMap, mappingOptions);
    }

    @Override // org.modelmapper.builder.ConfigurableMapExpression
    public ReferenceMapExpression<S, D> when(Condition<?, ?> condition) {
        Assert.notNull(condition, "condition");
        ExplicitMappingBuilder.MappingOptions mappingOptions = new ExplicitMappingBuilder.MappingOptions();
        mappingOptions.condition = condition;
        return new ReferenceMapExpressionImpl(this.typeMap, mappingOptions);
    }

    @Override // org.modelmapper.builder.ReferenceMapExpression
    public <V> void map(SourceGetter<S> sourceGetter, DestinationSetter<D, V> destinationSetter) {
        Assert.notNull(sourceGetter, "sourceGetter");
        Assert.notNull(destinationSetter, "destinationSetter");
        new ReferenceMapExpressionImpl(this.typeMap).map(sourceGetter, destinationSetter);
    }

    @Override // org.modelmapper.builder.ReferenceMapExpression
    public <V> void skip(DestinationSetter<D, V> destinationSetter) {
        Assert.notNull(destinationSetter, "destinationSetter");
        new ReferenceMapExpressionImpl(this.typeMap).skip(destinationSetter);
    }
}
