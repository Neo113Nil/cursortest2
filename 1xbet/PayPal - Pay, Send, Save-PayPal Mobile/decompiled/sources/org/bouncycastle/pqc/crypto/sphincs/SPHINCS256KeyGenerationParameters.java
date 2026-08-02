package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
public class SPHINCS256KeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private final org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap;

    public org.bouncycastle.crypto.Digest getTreeDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    public SPHINCS256KeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.crypto.Digest digest) {
        super(secureRandom, 8448);
        this.Camera2StreamConfigurationMap = digest;
    }
}
