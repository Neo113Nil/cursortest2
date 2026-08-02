package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class CertTemplate extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1BitString getInputFormats;
    private org.bouncycastle.asn1.x500.X500Name getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getOutputFormats;
    private org.bouncycastle.asn1.crmf.OptionalValidity getOutputMinFrameDuration;
    private org.bouncycastle.asn1.ASN1Integer getOutputStallDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getVersion() {
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getOutputStallDuration;
        if (aSN1Integer != null) {
            return aSN1Integer.intValueExact();
        }
        return -1;
    }

    public org.bouncycastle.asn1.crmf.OptionalValidity getValidity() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.ASN1BitString getSubjectUID() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSigningAlg() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getPublicKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1BitString getIssuerUID() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.crmf.CertTemplate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.CertTemplate) {
            return (org.bouncycastle.asn1.crmf.CertTemplate) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.CertTemplate(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CertTemplate(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = aSN1Sequence;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            switch (aSN1TaggedObject.getTagNo()) {
                case 0:
                    this.getOutputStallDuration = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false);
                    break;
                case 1:
                    this.getOutputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false);
                    break;
                case 2:
                    this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
                    break;
                case 3:
                    this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1TaggedObject, true);
                    break;
                case 4:
                    this.getOutputMinFrameDuration = org.bouncycastle.asn1.crmf.OptionalValidity.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false));
                    break;
                case 5:
                    this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1TaggedObject, true);
                    break;
                case 6:
                    this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(aSN1TaggedObject, false);
                    break;
                case 7:
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1TaggedObject, false);
                    break;
                case 8:
                    this.getInputFormats = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1TaggedObject, false);
                    break;
                case 9:
                    this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance(aSN1TaggedObject, false);
                    break;
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }
}
