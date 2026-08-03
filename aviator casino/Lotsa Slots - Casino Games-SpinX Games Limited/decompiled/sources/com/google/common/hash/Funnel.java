package com.google.common.hash;

@com.google.errorprone.annotations.DoNotMock("Implement with a lambda")
@com.google.common.hash.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface Funnel<T> extends java.io.Serializable {
    void funnel(@com.google.common.hash.ParametricNullness T from, com.google.common.hash.PrimitiveSink into);
}
