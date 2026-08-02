package org.modelmapper.spi;

import java.lang.reflect.Type;
import org.modelmapper.TypeMap;

/* loaded from: classes4.dex */
public interface MappingContext<S, D> {
    <CS, CD> MappingContext<CS, CD> create(CS cs, Class<CD> cls);

    <CS, CD> MappingContext<CS, CD> create(CS cs, CD cd);

    <CS, CD> MappingContext<CS, CD> create(CS cs, Type type);

    D getDestination();

    Class<D> getDestinationType();

    Type getGenericDestinationType();

    Mapping getMapping();

    MappingEngine getMappingEngine();

    MappingContext<?, ?> getParent();

    S getSource();

    Class<S> getSourceType();

    TypeMap<S, D> getTypeMap();

    String getTypeMapName();
}
