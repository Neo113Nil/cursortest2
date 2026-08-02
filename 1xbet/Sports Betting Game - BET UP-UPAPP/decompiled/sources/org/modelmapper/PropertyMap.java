package org.modelmapper;

import org.modelmapper.builder.ConverterExpression;
import org.modelmapper.builder.MapExpression;
import org.modelmapper.builder.ProviderExpression;
import org.modelmapper.internal.ExplicitMappingBuilder;
import org.modelmapper.internal.typetools.TypeResolver;
import org.modelmapper.internal.util.Assert;

/* loaded from: classes4.dex */
public abstract class PropertyMap<S, D> {
    private ExplicitMappingBuilder<S, D> builder;
    public D destination;
    Class<D> destinationType;
    public S source;
    Class<S> sourceType;

    protected abstract void configure();

    protected PropertyMap() {
        Object[] resolveRawArguments = TypeResolver.resolveRawArguments(PropertyMap.class, (Class) getClass());
        Assert.notNull(resolveRawArguments, "Must declare source type argument <S> and destination type argument <D> for PropertyMap");
        this.sourceType = (Class<S>) resolveRawArguments[0];
        this.destinationType = (Class<D>) resolveRawArguments[1];
    }

    protected PropertyMap(Class<S> cls, Class<D> cls2) {
        this.sourceType = cls;
        this.destinationType = cls2;
    }

    protected final D map() {
        assertBuilder();
        return this.builder.map();
    }

    protected final D map(Object obj) {
        assertBuilder();
        return this.builder.map(obj);
    }

    protected final void map(Object obj, Object obj2) {
        assertBuilder();
        this.builder.map(obj, obj2);
    }

    protected final D skip() {
        assertBuilder();
        return this.builder.skip();
    }

    protected final void skip(Object obj) {
        assertBuilder();
        this.builder.skip(obj);
    }

    protected final void skip(Object obj, Object obj2) {
        assertBuilder();
        this.builder.skip(obj, obj2);
    }

    protected <T> T source(String str) {
        assertBuilder();
        return (T) this.builder.source(str);
    }

    protected Object destination(String str) {
        assertBuilder();
        return this.builder.destination(str);
    }

    protected final MapExpression<D> using(Converter<?, ?> converter) {
        assertBuilder();
        return this.builder.using(converter);
    }

    protected final ProviderExpression<S, D> when(Condition<?, ?> condition) {
        assertBuilder();
        return this.builder.when(condition);
    }

    protected final ConverterExpression<S, D> with(Provider<?> provider) {
        assertBuilder();
        return this.builder.with(provider);
    }

    private void assertBuilder() {
        Assert.state(this.builder != null, "PropertyMap should not be used outside the context of PropertyMap.configure().", new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S, org.modelmapper.internal.ExplicitMappingBuilder<S, D>] */
    private synchronized void configure(ExplicitMappingBuilder<S, D> explicitMappingBuilder) {
        this.builder = explicitMappingBuilder;
        ?? r0 = (ExplicitMappingBuilder<S, D>) null;
        try {
            explicitMappingBuilder.visitPropertyMap(this);
            this.source = explicitMappingBuilder.source;
            this.destination = explicitMappingBuilder.destination;
            configure();
        } finally {
            this.builder = null;
            this.source = null;
        }
    }
}
