package org.modelmapper.builder;

import org.modelmapper.spi.DestinationSetter;
import org.modelmapper.spi.SourceGetter;

/* loaded from: classes4.dex */
public interface ReferenceMapExpression<S, D> {
    <V> void map(SourceGetter<S> sourceGetter, DestinationSetter<D, V> destinationSetter);

    <V> void skip(DestinationSetter<D, V> destinationSetter);
}
