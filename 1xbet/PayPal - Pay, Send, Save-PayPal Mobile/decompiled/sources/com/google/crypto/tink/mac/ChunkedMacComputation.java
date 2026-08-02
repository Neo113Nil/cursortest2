package com.google.crypto.tink.mac;

/* loaded from: classes9.dex */
public interface ChunkedMacComputation {
    byte[] computeMac() throws java.security.GeneralSecurityException;

    void update(java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException;
}
