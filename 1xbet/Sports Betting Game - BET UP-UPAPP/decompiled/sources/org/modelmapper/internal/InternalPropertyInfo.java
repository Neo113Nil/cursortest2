package org.modelmapper.internal;

import org.modelmapper.spi.PropertyInfo;

/* loaded from: classes4.dex */
public interface InternalPropertyInfo extends PropertyInfo {
    TypeInfo<?> getTypeInfo(InheritingConfiguration inheritingConfiguration);
}
