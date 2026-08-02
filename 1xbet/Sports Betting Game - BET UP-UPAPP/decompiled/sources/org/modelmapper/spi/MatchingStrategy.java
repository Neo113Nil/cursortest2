package org.modelmapper.spi;

/* loaded from: classes4.dex */
public interface MatchingStrategy {
    boolean isExact();

    boolean matches(PropertyNameInfo propertyNameInfo);
}
