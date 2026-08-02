package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public class HpkeKemPrivateKey {
    private final com.google.crypto.tink.util.Bytes serializedPrivate;
    private final com.google.crypto.tink.util.Bytes serializedPublic;

    public HpkeKemPrivateKey(com.google.crypto.tink.util.Bytes bytes, com.google.crypto.tink.util.Bytes bytes2) {
        this.serializedPrivate = bytes;
        this.serializedPublic = bytes2;
    }

    com.google.crypto.tink.util.Bytes getSerializedPrivate() {
        return this.serializedPrivate;
    }

    com.google.crypto.tink.util.Bytes getSerializedPublic() {
        return this.serializedPublic;
    }
}
