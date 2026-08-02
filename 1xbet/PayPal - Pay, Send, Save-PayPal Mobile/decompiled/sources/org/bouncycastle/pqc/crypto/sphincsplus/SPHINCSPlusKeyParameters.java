package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
public class SPHINCSPlusKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    final org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters getHighSpeedVideoFpsRanges;

    public org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    protected SPHINCSPlusKeyParameters(boolean z, org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters sPHINCSPlusParameters) {
        super(z);
        this.getHighSpeedVideoFpsRanges = sPHINCSPlusParameters;
    }
}
