package com.google.crypto.tink.mac;

/* loaded from: classes9.dex */
public interface ChunkedMacVerification {
    void update(java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException;

    void verifyMac() throws java.security.GeneralSecurityException;
}
