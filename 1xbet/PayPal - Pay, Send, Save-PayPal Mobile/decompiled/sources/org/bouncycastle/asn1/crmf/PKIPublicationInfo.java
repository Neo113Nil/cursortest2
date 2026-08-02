package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class PKIPublicationInfo extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.ASN1Integer dontPublish = new org.bouncycastle.asn1.ASN1Integer(0);
    public static final org.bouncycastle.asn1.ASN1Integer pleasePublish = new org.bouncycastle.asn1.ASN1Integer(1);
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.crmf.SinglePubInfo[] getPubInfos() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.crmf.SinglePubInfo[] singlePubInfoArr = new org.bouncycastle.asn1.crmf.SinglePubInfo[size];
        for (int i = 0; i != size; i++) {
            singlePubInfoArr[i] = org.bouncycastle.asn1.crmf.SinglePubInfo.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
        }
        return singlePubInfoArr;
    }

    public org.bouncycastle.asn1.ASN1Integer getAction() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.crmf.PKIPublicationInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.crmf.PKIPublicationInfo) {
            return (org.bouncycastle.asn1.crmf.PKIPublicationInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.crmf.PKIPublicationInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKIPublicationInfo(org.bouncycastle.asn1.crmf.SinglePubInfo[] singlePubInfoArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = pleasePublish;
        if (singlePubInfoArr != null) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(singlePubInfoArr);
        } else {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    public PKIPublicationInfo(org.bouncycastle.asn1.crmf.SinglePubInfo singlePubInfo) {
        this(singlePubInfo != null ? new org.bouncycastle.asn1.crmf.SinglePubInfo[]{singlePubInfo} : null);
    }

    private PKIPublicationInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public PKIPublicationInfo(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
    }

    public PKIPublicationInfo(java.math.BigInteger bigInteger) {
        this(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
    }
}
