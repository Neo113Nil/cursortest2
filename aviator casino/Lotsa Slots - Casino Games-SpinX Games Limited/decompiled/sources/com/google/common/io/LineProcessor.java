package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface LineProcessor<T> {
    @com.google.common.io.ParametricNullness
    T getResult();

    boolean processLine(java.lang.String line) throws java.io.IOException;
}
