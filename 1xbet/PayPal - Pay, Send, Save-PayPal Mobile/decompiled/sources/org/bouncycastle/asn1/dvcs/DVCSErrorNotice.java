package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class DVCSErrorNotice extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cmp.PKIStatusInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoSizes;

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DVCSErrorNotice {\ntransactionStatus: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        if (this.getHighSpeedVideoSizes != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("transactionIdentifier: ");
            sb2.append(this.getHighSpeedVideoSizes);
            sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("}\n");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getHighSpeedVideoSizes;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo getTransactionStatus() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.GeneralName getTransactionIdentifier() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.dvcs.DVCSErrorNotice getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.dvcs.DVCSErrorNotice getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.DVCSErrorNotice) {
            return (org.bouncycastle.asn1.dvcs.DVCSErrorNotice) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.dvcs.DVCSErrorNotice(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DVCSErrorNotice(org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighSpeedVideoFpsRanges = pKIStatusInfo;
        this.getHighSpeedVideoSizes = generalName;
    }

    public DVCSErrorNotice(org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo) {
        this(pKIStatusInfo, null);
    }

    private DVCSErrorNotice(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
