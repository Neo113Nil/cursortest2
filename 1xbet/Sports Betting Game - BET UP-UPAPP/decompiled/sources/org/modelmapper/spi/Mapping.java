package org.modelmapper.spi;

import java.util.List;
import org.modelmapper.Condition;
import org.modelmapper.Converter;
import org.modelmapper.Provider;

/* loaded from: classes4.dex */
public interface Mapping {
    Condition<?, ?> getCondition();

    Converter<?, ?> getConverter();

    List<? extends PropertyInfo> getDestinationProperties();

    PropertyInfo getLastDestinationProperty();

    String getPath();

    Provider<?> getProvider();

    Class<?> getSourceType();

    boolean isSkipped();
}
