package com.google.common.hash;

@com.google.errorprone.annotations.DoNotMock("Implement with a lambda")
/* loaded from: classes9.dex */
public interface Funnel<T> extends java.io.Serializable {
    void funnel(T t, com.google.common.hash.PrimitiveSink primitiveSink);
}
