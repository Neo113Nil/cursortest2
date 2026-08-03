package com.google.common.base;

@com.google.errorprone.annotations.DoNotMock("Use an instance of one of the Finalizable*Reference classes")
@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public interface FinalizableReference {
    void finalizeReferent();
}
