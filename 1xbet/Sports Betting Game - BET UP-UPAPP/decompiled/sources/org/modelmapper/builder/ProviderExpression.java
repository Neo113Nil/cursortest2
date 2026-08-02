package org.modelmapper.builder;

import org.modelmapper.Provider;

/* loaded from: classes4.dex */
public interface ProviderExpression<S, D> extends ConverterExpression<S, D> {
    ConverterExpression<S, D> with(Provider<?> provider);
}
