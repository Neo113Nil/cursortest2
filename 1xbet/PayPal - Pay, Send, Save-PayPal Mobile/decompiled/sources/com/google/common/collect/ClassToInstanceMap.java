package com.google.common.collect;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
/* loaded from: classes9.dex */
public interface ClassToInstanceMap<B> extends java.util.Map<java.lang.Class<? extends B>, B> {
    <T extends B> T getInstance(java.lang.Class<T> cls);

    <T extends B> T putInstance(java.lang.Class<T> cls, T t);
}
