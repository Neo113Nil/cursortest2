package com.google.common.reflect;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
/* loaded from: classes9.dex */
public interface TypeToInstanceMap<B> extends java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> {
    <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> typeToken);

    <T extends B> T getInstance(java.lang.Class<T> cls);

    <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> typeToken, T t);

    <T extends B> T putInstance(java.lang.Class<T> cls, T t);
}
