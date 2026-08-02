package org.modelmapper.spi;

import java.util.List;

/* loaded from: classes4.dex */
public interface PropertyNameInfo {
    List<PropertyInfo> getDestinationProperties();

    List<Tokens> getDestinationPropertyTokens();

    Tokens getSourceClassTokens();

    List<PropertyInfo> getSourceProperties();

    List<Tokens> getSourcePropertyTokens();

    List<Tokens> getSourcePropertyTypeTokens();
}
