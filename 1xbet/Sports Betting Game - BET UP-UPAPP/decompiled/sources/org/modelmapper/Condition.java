package org.modelmapper;

import org.modelmapper.spi.MappingContext;

/* loaded from: classes4.dex */
public interface Condition<S, D> {
    boolean applies(MappingContext<S, D> mappingContext);
}
