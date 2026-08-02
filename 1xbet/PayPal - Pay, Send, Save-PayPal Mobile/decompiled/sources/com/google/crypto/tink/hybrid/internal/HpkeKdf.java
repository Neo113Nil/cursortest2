package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public interface HpkeKdf {
    byte[] extractAndExpand(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3, java.lang.String str2, byte[] bArr4, int i) throws java.security.GeneralSecurityException;

    byte[] getKdfId() throws java.security.GeneralSecurityException;

    byte[] labeledExpand(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3, int i) throws java.security.GeneralSecurityException;

    byte[] labeledExtract(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3) throws java.security.GeneralSecurityException;
}
