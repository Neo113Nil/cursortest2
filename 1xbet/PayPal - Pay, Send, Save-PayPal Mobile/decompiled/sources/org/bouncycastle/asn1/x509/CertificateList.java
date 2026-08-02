package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class CertificateList extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x509.TBSCertList Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1BitString getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes = false;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (!this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRanges = super.hashCode();
            this.getHighSpeedVideoSizes = true;
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getVersionNumber() {
        return this.Camera2StreamConfigurationMap.getVersionNumber();
    }

    public org.bouncycastle.asn1.x509.Time getThisUpdate() {
        return this.Camera2StreamConfigurationMap.getThisUpdate();
    }

    public org.bouncycastle.asn1.x509.TBSCertList getTBSCertList() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1BitString getSignature() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.TBSCertList.CRLEntry[] getRevokedCertificates() {
        return this.Camera2StreamConfigurationMap.getRevokedCertificates();
    }

    public java.util.Enumeration getRevokedCertificateEnumeration() {
        return this.Camera2StreamConfigurationMap.getRevokedCertificateEnumeration();
    }

    public org.bouncycastle.asn1.x509.Time getNextUpdate() {
        return this.Camera2StreamConfigurationMap.getNextUpdate();
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.Camera2StreamConfigurationMap.getIssuer();
    }

    public static org.bouncycastle.asn1.x509.CertificateList getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.CertificateList getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.CertificateList) {
            return (org.bouncycastle.asn1.x509.CertificateList) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.CertificateList(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CertificateList(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("sequence wrong size for CertificateList");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.TBSCertList.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(2));
    }
}
