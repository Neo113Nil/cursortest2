package com.google.crypto.tink.mac;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public interface ChunkedMac {
    com.google.crypto.tink.mac.ChunkedMacComputation createComputation() throws java.security.GeneralSecurityException;

    com.google.crypto.tink.mac.ChunkedMacVerification createVerification(byte[] bArr) throws java.security.GeneralSecurityException;
}
