package com.google.crypto.tink.prf.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public class LegacyFullPrf implements com.google.crypto.tink.prf.Prf {
    private final com.google.crypto.tink.prf.Prf rawPrf;

    public static com.google.crypto.tink.prf.Prf create(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.ProtoKeySerialization serialization = legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        return new com.google.crypto.tink.prf.internal.LegacyFullPrf((com.google.crypto.tink.prf.Prf) com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getKeyManager(serialization.getTypeUrl(), com.google.crypto.tink.prf.Prf.class).getPrimitive(serialization.getValue()));
    }

    private LegacyFullPrf(com.google.crypto.tink.prf.Prf prf) {
        this.rawPrf = prf;
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        return this.rawPrf.compute(bArr, i);
    }
}
