package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public interface StreamSegmentDecrypter {
    void decryptSegment(java.nio.ByteBuffer byteBuffer, int i, boolean z, java.nio.ByteBuffer byteBuffer2) throws java.security.GeneralSecurityException;

    void init(java.nio.ByteBuffer byteBuffer, byte[] bArr) throws java.security.GeneralSecurityException;
}
