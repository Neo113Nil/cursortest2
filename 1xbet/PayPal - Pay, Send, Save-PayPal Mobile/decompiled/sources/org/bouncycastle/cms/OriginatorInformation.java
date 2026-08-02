package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class OriginatorInformation {
    private org.bouncycastle.asn1.cms.OriginatorInfo getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.cms.OriginatorInfo toASN1Structure() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.util.Store getCertificates() {
        org.bouncycastle.asn1.ASN1Set certificates = this.getHighSpeedVideoFpsRangesFor.getCertificates();
        if (certificates == null) {
            return new org.bouncycastle.util.CollectionStore(new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(certificates.size());
        java.util.Enumeration objects = certificates.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                arrayList.add(new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1Primitive)));
            }
        }
        return new org.bouncycastle.util.CollectionStore(arrayList);
    }

    public org.bouncycastle.util.Store getCRLs() {
        org.bouncycastle.asn1.ASN1Set cRLs = this.getHighSpeedVideoFpsRangesFor.getCRLs();
        if (cRLs == null) {
            return new org.bouncycastle.util.CollectionStore(new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(cRLs.size());
        java.util.Enumeration objects = cRLs.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) objects.nextElement()).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                arrayList.add(new org.bouncycastle.cert.X509CRLHolder(org.bouncycastle.asn1.x509.CertificateList.getInstance(aSN1Primitive)));
            }
        }
        return new org.bouncycastle.util.CollectionStore(arrayList);
    }

    OriginatorInformation(org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo) {
        this.getHighSpeedVideoFpsRangesFor = originatorInfo;
    }
}
