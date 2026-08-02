package org.modelmapper.builder;

import org.modelmapper.Condition;
import org.modelmapper.Converter;
import org.modelmapper.Provider;

/* loaded from: classes4.dex */
public interface ConfigurableMapExpression<S, D> extends ReferenceMapExpression<S, D> {
    ReferenceMapExpression<S, D> using(Converter<?, ?> converter);

    ReferenceMapExpression<S, D> when(Condition<?, ?> condition);

    ReferenceMapExpression<S, D> with(Provider<?> provider);
}
