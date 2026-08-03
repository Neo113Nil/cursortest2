package com.google.common.reflect;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
@com.google.common.reflect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface TypeToInstanceMap<B> extends java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> {
    @javax.annotation.CheckForNull
    <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> type);

    @javax.annotation.CheckForNull
    <T extends B> T getInstance(java.lang.Class<T> type);

    @javax.annotation.CheckForNull
    <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> type, @com.google.common.reflect.ParametricNullness T value);

    @javax.annotation.CheckForNull
    <T extends B> T putInstance(java.lang.Class<T> type, @com.google.common.reflect.ParametricNullness T value);
}
