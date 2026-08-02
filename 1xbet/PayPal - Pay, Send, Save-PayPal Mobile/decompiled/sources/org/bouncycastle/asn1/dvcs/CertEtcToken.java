package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class CertEtcToken extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int TAG_ASSERTION = 3;
    public static final int TAG_CAPABILITIES = 8;
    public static final int TAG_CERTIFICATE = 0;
    public static final int TAG_CRL = 4;
    public static final int TAG_ESSCERTID = 1;
    public static final int TAG_OCSPCERTID = 6;
    public static final int TAG_OCSPCERTSTATUS = 5;
    public static final int TAG_OCSPRESPONSE = 7;
    public static final int TAG_PKISTATUS = 2;
    private static final boolean[] getHighResolutionOutputSizeshNQ4ISI = {false, true, false, true, false, true, false, false, true};
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.Extension getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CertEtcToken {\n");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}\n");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.x509.Extension extension = this.getHighSpeedVideoFpsRangesFor;
        if (extension != null) {
            return extension.toASN1Primitive();
        }
        boolean[] zArr = getHighResolutionOutputSizeshNQ4ISI;
        int i = this.Camera2StreamConfigurationMap;
        return new org.bouncycastle.asn1.DERTaggedObject(zArr[i], i, this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getTagNo() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.Extension getExtension() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.dvcs.CertEtcToken getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.CertEtcToken) {
            return (org.bouncycastle.asn1.dvcs.CertEtcToken) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.dvcs.CertEtcToken((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.dvcs.CertEtcToken(org.bouncycastle.asn1.x509.Extension.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.dvcs.CertEtcToken[] arrayFromSequence(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.dvcs.CertEtcToken[] certEtcTokenArr = new org.bouncycastle.asn1.dvcs.CertEtcToken[size];
        for (int i = 0; i != size; i++) {
            certEtcTokenArr[i] = getInstance(aSN1Sequence.getObjectAt(i));
        }
        return certEtcTokenArr;
    }

    public CertEtcToken(org.bouncycastle.asn1.x509.Extension extension) {
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoFpsRangesFor = extension;
    }

    private CertEtcToken(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        org.bouncycastle.asn1.ASN1Encodable certificate;
        int tagNo = aSN1TaggedObject.getTagNo();
        this.Camera2StreamConfigurationMap = tagNo;
        switch (tagNo) {
            case 0:
                certificate = org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1TaggedObject, false);
                break;
            case 1:
                certificate = org.bouncycastle.asn1.ess.ESSCertID.getInstance(aSN1TaggedObject.getObject());
                break;
            case 2:
                certificate = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(aSN1TaggedObject, false);
                break;
            case 3:
                certificate = org.bouncycastle.asn1.cms.ContentInfo.getInstance(aSN1TaggedObject.getObject());
                break;
            case 4:
                certificate = org.bouncycastle.asn1.x509.CertificateList.getInstance(aSN1TaggedObject, false);
                break;
            case 5:
                certificate = org.bouncycastle.asn1.ocsp.CertStatus.getInstance(aSN1TaggedObject.getObject());
                break;
            case 6:
                certificate = org.bouncycastle.asn1.ocsp.CertID.getInstance(aSN1TaggedObject, false);
                break;
            case 7:
                certificate = org.bouncycastle.asn1.ocsp.OCSPResponse.getInstance(aSN1TaggedObject, false);
                break;
            case 8:
                certificate = org.bouncycastle.asn1.smime.SMIMECapabilities.getInstance(aSN1TaggedObject.getObject());
                break;
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag: ");
                sb.append(this.Camera2StreamConfigurationMap);
                throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges = certificate;
    }

    public CertEtcToken(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }
}
