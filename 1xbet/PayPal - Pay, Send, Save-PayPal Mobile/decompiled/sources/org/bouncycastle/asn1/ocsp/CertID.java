package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class CertID extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getIssuerNameHash() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1OctetString getIssuerKeyHash() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.ocsp.CertID getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.ocsp.CertID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.CertID) {
            return (org.bouncycastle.asn1.ocsp.CertID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.CertID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertID(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString2, org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
        this.getHighSpeedVideoSizes = aSN1OctetString;
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString2;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
    }

    private CertID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(1);
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1OctetString) aSN1Sequence.getObjectAt(2);
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(3);
    }
}
