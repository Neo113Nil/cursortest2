package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DSTU4145Parameters extends org.bouncycastle.crypto.params.ECDomainParameters {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;

    public byte[] getDKE() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public DSTU4145Parameters(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters, byte[] bArr) {
        super(eCDomainParameters.getCurve(), eCDomainParameters.getG(), eCDomainParameters.getN(), eCDomainParameters.getH(), eCDomainParameters.getSeed());
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
