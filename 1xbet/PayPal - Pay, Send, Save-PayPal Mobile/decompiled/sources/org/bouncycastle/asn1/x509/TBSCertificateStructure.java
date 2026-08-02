package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class TBSCertificateStructure extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.x509.X509ObjectIdentifiers, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
    org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.x500.X500Name getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.X509Extensions getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.Time getHighSpeedVideoSizes;
    org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoSizesFor;
    org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getInputFormats;
    org.bouncycastle.asn1.ASN1Integer getInputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.Time getOutputFormats;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputMinFrameDuration;
    org.bouncycastle.asn1.ASN1BitString getOutputMinFrameDurationlomOqCM;
    org.bouncycastle.asn1.ASN1Integer getOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Integer getVersionNumber() {
        return this.getOutputSizeshNQ4ISI;
    }

    public int getVersion() {
        return this.getOutputSizeshNQ4ISI.intValueExact() + 1;
    }

    public org.bouncycastle.asn1.ASN1BitString getSubjectUniqueId() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.x509.Time getStartDate() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignature() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1BitString getIssuerUniqueId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.X509Extensions getExtensions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.Time getEndDate() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x509.TBSCertificateStructure getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.TBSCertificateStructure getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.TBSCertificateStructure) {
            return (org.bouncycastle.asn1.x509.TBSCertificateStructure) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.TBSCertificateStructure(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TBSCertificateStructure(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i;
        this.Camera2StreamConfigurationMap = aSN1Sequence;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i = 0;
        } else {
            this.getOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(0L);
            i = -1;
        }
        this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.getOutputMinFrameDuration = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i + 2));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(i + 3));
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(i + 4);
        this.getOutputFormats = org.bouncycastle.asn1.x509.Time.getInstance(aSN1Sequence2.getObjectAt(0));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Time.getInstance(aSN1Sequence2.getObjectAt(1));
        this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(i + 5));
        int i2 = i + 6;
        this.getInputFormats = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i2));
        for (int size = (aSN1Sequence.size() - i2) - 1; size > 0; size--) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i2 + size));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                this.getOutputMinFrameDurationlomOqCM = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 3) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.X509Extensions.getInstance(aSN1TaggedObject);
            }
        }
    }
}
