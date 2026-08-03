package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public interface Predicate<T> {
    boolean apply(@com.google.common.base.ParametricNullness T input);

    boolean equals(@javax.annotation.CheckForNull java.lang.Object object);
}
