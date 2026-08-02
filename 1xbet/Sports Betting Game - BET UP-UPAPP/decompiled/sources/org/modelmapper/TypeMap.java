package org.modelmapper;

import java.util.List;
import org.modelmapper.spi.DestinationSetter;
import org.modelmapper.spi.Mapping;
import org.modelmapper.spi.PropertyInfo;
import org.modelmapper.spi.SourceGetter;
import org.modelmapper.spi.TypeSafeSourceGetter;

/* loaded from: classes4.dex */
public interface TypeMap<S, D> {
    <V> TypeMap<S, D> addMapping(SourceGetter<S> sourceGetter, DestinationSetter<D, V> destinationSetter);

    TypeMap<S, D> addMappings(ExpressionMap<S, D> expressionMap);

    TypeMap<S, D> addMappings(PropertyMap<S, D> propertyMap);

    Condition<?, ?> getCondition();

    Converter<S, D> getConverter();

    Class<D> getDestinationType();

    List<Mapping> getMappings();

    String getName();

    Converter<S, D> getPostConverter();

    Converter<S, D> getPreConverter();

    Condition<?, ?> getPropertyCondition();

    Converter<?, ?> getPropertyConverter();

    Provider<?> getPropertyProvider();

    Provider<D> getProvider();

    Class<S> getSourceType();

    List<PropertyInfo> getUnmappedProperties();

    TypeMap<S, D> implicitMappings();

    TypeMap<S, D> include(Class<? super D> cls);

    <DS extends S, DD extends D> TypeMap<S, D> include(Class<DS> cls, Class<DD> cls2);

    <P> TypeMap<S, D> include(TypeSafeSourceGetter<S, P> typeSafeSourceGetter, Class<P> cls);

    TypeMap<S, D> includeBase(Class<? super S> cls, Class<? super D> cls2);

    D map(S s);

    void map(S s, D d);

    TypeMap<S, D> setCondition(Condition<?, ?> condition);

    TypeMap<S, D> setConverter(Converter<S, D> converter);

    TypeMap<S, D> setPostConverter(Converter<S, D> converter);

    TypeMap<S, D> setPreConverter(Converter<S, D> converter);

    TypeMap<S, D> setPropertyCondition(Condition<?, ?> condition);

    TypeMap<S, D> setPropertyConverter(Converter<?, ?> converter);

    TypeMap<S, D> setPropertyProvider(Provider<?> provider);

    TypeMap<S, D> setProvider(Provider<D> provider);

    void validate();
}
