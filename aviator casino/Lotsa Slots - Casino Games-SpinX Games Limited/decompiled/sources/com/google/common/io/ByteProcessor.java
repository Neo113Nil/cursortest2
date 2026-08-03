package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
@com.google.errorprone.annotations.DoNotMock("Implement it normally")
/* loaded from: classes3.dex */
public interface ByteProcessor<T> {
    @com.google.common.io.ParametricNullness
    T getResult();

    boolean processBytes(byte[] buf, int off, int len) throws java.io.IOException;
}
