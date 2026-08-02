package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public interface StreamSegmentEncrypter {
    void encryptSegment(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, boolean z, java.nio.ByteBuffer byteBuffer3) throws java.security.GeneralSecurityException;

    void encryptSegment(java.nio.ByteBuffer byteBuffer, boolean z, java.nio.ByteBuffer byteBuffer2) throws java.security.GeneralSecurityException;

    java.nio.ByteBuffer getHeader();
}
