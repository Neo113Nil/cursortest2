package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ECGOST3410Parameters extends org.bouncycastle.crypto.params.ECNamedDomainParameters {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getPublicKeyParamSet() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getDigestParamSet() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public ECGOST3410Parameters(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3) {
        super(aSN1ObjectIdentifier, eCDomainParameters);
        if ((eCDomainParameters instanceof org.bouncycastle.crypto.params.ECNamedDomainParameters) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) ((org.bouncycastle.crypto.params.ECNamedDomainParameters) eCDomainParameters).getName())) {
            throw new java.lang.IllegalArgumentException("named parameters do not match publicKeyParamSet value");
        }
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier2;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier3;
    }

    public ECGOST3410Parameters(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this(eCDomainParameters, aSN1ObjectIdentifier, aSN1ObjectIdentifier2, null);
    }
}
