package org.modelmapper;

import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
public interface Converter<S, D> {
    D convert(MappingContext<S, D> mappingContext);
}
