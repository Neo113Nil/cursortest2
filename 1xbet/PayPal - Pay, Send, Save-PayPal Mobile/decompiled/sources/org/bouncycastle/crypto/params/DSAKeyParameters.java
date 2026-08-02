package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DSAKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private org.bouncycastle.crypto.params.DSAParameters Camera2StreamConfigurationMap;

    public org.bouncycastle.crypto.params.DSAParameters getParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    public DSAKeyParameters(boolean z, org.bouncycastle.crypto.params.DSAParameters dSAParameters) {
        super(z);
        this.Camera2StreamConfigurationMap = dSAParameters;
    }
}
