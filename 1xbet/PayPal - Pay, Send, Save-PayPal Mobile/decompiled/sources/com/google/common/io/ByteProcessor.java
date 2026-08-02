package com.google.common.io;

@com.google.errorprone.annotations.DoNotMock("Implement it normally")
/* loaded from: classes9.dex */
public interface ByteProcessor<T> {
    T getResult();

    boolean processBytes(byte[] bArr, int i, int i2) throws java.io.IOException;
}
