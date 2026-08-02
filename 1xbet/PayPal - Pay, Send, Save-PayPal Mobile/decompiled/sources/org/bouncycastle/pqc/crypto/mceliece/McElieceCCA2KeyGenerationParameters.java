package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceCCA2KeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters Camera2StreamConfigurationMap;

    public org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters getParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    public McElieceCCA2KeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(secureRandom, 128);
        this.Camera2StreamConfigurationMap = mcElieceCCA2Parameters;
    }
}
