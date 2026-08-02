package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class LegacyFullSign implements com.google.crypto.tink.PublicKeySign {
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final com.google.crypto.tink.PublicKeySign rawSigner;

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        return new com.google.crypto.tink.signature.internal.LegacyFullSign((com.google.crypto.tink.PublicKeySign) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.PublicKeySign.class).getPrimitive(serialization.getValue()), com.google.crypto.tink.signature.internal.LegacyFullVerify.getOutputPrefix(serialization), com.google.crypto.tink.signature.internal.LegacyFullVerify.getMessageSuffix(serialization));
    }

    private LegacyFullSign(com.google.crypto.tink.PublicKeySign publicKeySign, byte[] bArr, byte[] bArr2) {
        this.rawSigner = publicKeySign;
        this.outputPrefix = bArr;
        this.messageSuffix = bArr2;
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] sign;
        byte[] bArr2 = this.messageSuffix;
        if (bArr2.length == 0) {
            sign = this.rawSigner.sign(bArr);
        } else {
            sign = this.rawSigner.sign(com.google.crypto.tink.subtle.Bytes.concat(bArr, bArr2));
        }
        byte[] bArr3 = this.outputPrefix;
        return bArr3.length == 0 ? sign : com.google.crypto.tink.subtle.Bytes.concat(bArr3, sign);
    }
}
