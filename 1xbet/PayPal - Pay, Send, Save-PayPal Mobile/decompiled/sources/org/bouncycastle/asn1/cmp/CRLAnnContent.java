package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CRLAnnContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.CertificateList[] getCertificateLists() {
        int size = this.Camera2StreamConfigurationMap.size();
        org.bouncycastle.asn1.x509.CertificateList[] certificateListArr = new org.bouncycastle.asn1.x509.CertificateList[size];
        for (int i = 0; i != size; i++) {
            certificateListArr[i] = org.bouncycastle.asn1.x509.CertificateList.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return certificateListArr;
    }

    public static org.bouncycastle.asn1.cmp.CRLAnnContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.CRLAnnContent) {
            return (org.bouncycastle.asn1.cmp.CRLAnnContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.CRLAnnContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CRLAnnContent(org.bouncycastle.asn1.x509.CertificateList certificateList) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(certificateList);
    }

    private CRLAnnContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = aSN1Sequence;
    }
}
