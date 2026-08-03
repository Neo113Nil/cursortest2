package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public interface Function<F, T> {
    @com.google.common.base.ParametricNullness
    T apply(@com.google.common.base.ParametricNullness F input);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object object);
}
