package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PKIMessage extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.PKIHeader getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cmp.PKIBody getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1BitString aSN1BitString = this.getHighSpeedVideoSizes;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1BitString));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1BitString getProtection() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cmp.PKIHeader getHeader() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.cmp.CMPCertificate[] getExtraCerts() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.cmp.CMPCertificate[] cMPCertificateArr = new org.bouncycastle.asn1.cmp.CMPCertificate[size];
        for (int i = 0; i < size; i++) {
            cMPCertificateArr[i] = org.bouncycastle.asn1.cmp.CMPCertificate.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return cMPCertificateArr;
    }

    public org.bouncycastle.asn1.cmp.PKIBody getBody() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmp.PKIMessage getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PKIMessage) {
            return (org.bouncycastle.asn1.cmp.PKIMessage) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PKIMessage(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKIMessage(org.bouncycastle.asn1.cmp.PKIHeader pKIHeader, org.bouncycastle.asn1.cmp.PKIBody pKIBody, org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.cmp.CMPCertificate[] cMPCertificateArr) {
        this.getHighSpeedVideoFpsRanges = pKIHeader;
        this.getHighSpeedVideoFpsRangesFor = pKIBody;
        this.getHighSpeedVideoSizes = aSN1BitString;
        if (cMPCertificateArr != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(cMPCertificateArr);
        }
    }

    public PKIMessage(org.bouncycastle.asn1.cmp.PKIHeader pKIHeader, org.bouncycastle.asn1.cmp.PKIBody pKIBody, org.bouncycastle.asn1.ASN1BitString aSN1BitString) {
        this(pKIHeader, pKIBody, aSN1BitString, null);
    }

    public PKIMessage(org.bouncycastle.asn1.cmp.PKIHeader pKIHeader, org.bouncycastle.asn1.cmp.PKIBody pKIBody) {
        this(pKIHeader, pKIBody, null, null);
    }

    private PKIMessage(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmp.PKIHeader.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cmp.PKIBody.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.DERBitString.getInstance(aSN1TaggedObject, true);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, true);
            }
        }
    }
}
