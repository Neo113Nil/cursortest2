package org.modelmapper.spi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public interface PropertyInfo {
    <T extends Annotation> T getAnnotation(Class<T> cls);

    Type getGenericType();

    Class<?> getInitialType();

    Member getMember();

    String getName();

    PropertyType getPropertyType();

    Class<?> getType();
}
