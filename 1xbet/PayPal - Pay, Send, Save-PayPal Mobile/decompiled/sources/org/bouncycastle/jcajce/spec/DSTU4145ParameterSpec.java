package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class DSTU4145ParameterSpec extends java.security.spec.ECParameterSpec {
    private final org.bouncycastle.crypto.params.ECDomainParameters getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public byte[] getDKE() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.jcajce.spec.DSTU4145ParameterSpec) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((org.bouncycastle.jcajce.spec.DSTU4145ParameterSpec) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    private DSTU4145ParameterSpec(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters, java.security.spec.ECParameterSpec eCParameterSpec, byte[] bArr) {
        super(eCParameterSpec.getCurve(), eCParameterSpec.getGenerator(), eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
        this.getHighSpeedVideoFpsRangesFor = eCDomainParameters;
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public DSTU4145ParameterSpec(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        this(eCDomainParameters, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(eCDomainParameters), org.bouncycastle.asn1.ua.DSTU4145Params.getDefaultDKE());
    }
}
