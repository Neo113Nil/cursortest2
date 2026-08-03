package com.google.common.reflect;

@com.google.common.reflect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class TypeCapture<T> {
    TypeCapture() {
    }

    final java.lang.reflect.Type capture() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        com.google.common.base.Preconditions.checkArgument(genericSuperclass instanceof java.lang.reflect.ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
