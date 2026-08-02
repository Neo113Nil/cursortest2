package com.google.crypto.tink.prf;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public abstract class PrfSet {
    public abstract java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> getPrfs() throws java.security.GeneralSecurityException;

    public abstract int getPrimaryId();

    public byte[] computePrimary(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        return getPrfs().get(java.lang.Integer.valueOf(getPrimaryId())).compute(bArr, i);
    }
}
