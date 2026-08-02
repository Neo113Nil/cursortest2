package com.google.crypto.tink.prf;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public interface Prf {
    byte[] compute(byte[] bArr, int i) throws java.security.GeneralSecurityException;
}
