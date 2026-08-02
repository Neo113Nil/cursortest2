package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
final class HpkeKemEncapOutput {
    private final byte[] encapsulatedKey;
    private final byte[] sharedSecret;

    HpkeKemEncapOutput(byte[] bArr, byte[] bArr2) {
        this.sharedSecret = bArr;
        this.encapsulatedKey = bArr2;
    }

    final byte[] getSharedSecret() {
        return this.sharedSecret;
    }

    final byte[] getEncapsulatedKey() {
        return this.encapsulatedKey;
    }
}
