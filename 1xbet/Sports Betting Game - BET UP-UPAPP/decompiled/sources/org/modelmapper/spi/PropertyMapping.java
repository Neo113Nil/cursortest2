package org.modelmapper.spi;

import java.util.List;

/* loaded from: classes4.dex */
public interface PropertyMapping extends Mapping {
    PropertyInfo getLastSourceProperty();

    List<? extends PropertyInfo> getSourceProperties();
}
