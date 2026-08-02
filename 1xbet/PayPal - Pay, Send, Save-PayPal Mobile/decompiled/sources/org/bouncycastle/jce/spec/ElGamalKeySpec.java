package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class ElGamalKeySpec implements java.security.spec.KeySpec {
    private org.bouncycastle.jce.spec.ElGamalParameterSpec Camera2StreamConfigurationMap;

    public org.bouncycastle.jce.spec.ElGamalParameterSpec getParams() {
        return this.Camera2StreamConfigurationMap;
    }

    public ElGamalKeySpec(org.bouncycastle.jce.spec.ElGamalParameterSpec elGamalParameterSpec) {
        this.Camera2StreamConfigurationMap = elGamalParameterSpec;
    }
}
