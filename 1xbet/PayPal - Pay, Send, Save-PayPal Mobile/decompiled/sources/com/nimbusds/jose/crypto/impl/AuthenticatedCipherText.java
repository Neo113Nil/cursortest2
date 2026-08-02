package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class AuthenticatedCipherText {
    private final byte[] authenticationTag;
    private final byte[] cipherText;

    public AuthenticatedCipherText(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("The cipher text must not be null");
        }
        this.cipherText = bArr;
        if (bArr2 == null) {
            throw new java.lang.IllegalArgumentException("The authentication tag must not be null");
        }
        this.authenticationTag = bArr2;
    }

    public final byte[] getCipherText() {
        return this.cipherText;
    }

    public final byte[] getAuthenticationTag() {
        return this.authenticationTag;
    }
}
