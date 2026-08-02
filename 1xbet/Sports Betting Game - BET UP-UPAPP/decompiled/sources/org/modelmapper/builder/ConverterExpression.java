package org.modelmapper.builder;

import org.modelmapper.Converter;

/* loaded from: classes4.dex */
public interface ConverterExpression<S, D> extends SkipExpression<D> {
    MapExpression<D> using(Converter<?, ?> converter);
}
