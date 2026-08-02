package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
public class SPHINCSPlusKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    final org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters getHighSpeedVideoSizes;

    public SPHINCSPlusKeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters sPHINCSPlusParameters) {
        super(secureRandom, -1);
        this.getHighSpeedVideoSizes = sPHINCSPlusParameters;
    }
}
