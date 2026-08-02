package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface HpkeKem {
    byte[] authDecapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey, byte[] bArr2) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput authEncapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException;

    byte[] decapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] bArr) throws java.security.GeneralSecurityException;

    byte[] getKemId() throws java.security.GeneralSecurityException;
}
