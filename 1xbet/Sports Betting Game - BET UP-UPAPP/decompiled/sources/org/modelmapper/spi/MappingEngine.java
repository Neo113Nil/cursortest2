package org.modelmapper.spi;

/* loaded from: classes4.dex */
public interface MappingEngine {
    <S, D> D createDestination(MappingContext<S, D> mappingContext);

    <S, D> D map(MappingContext<S, D> mappingContext);
}
