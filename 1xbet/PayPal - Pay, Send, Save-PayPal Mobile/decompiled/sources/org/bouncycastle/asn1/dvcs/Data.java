package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class Data extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.x509.DigestInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.Object obj;
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            sb = new java.lang.StringBuilder("Data {\n");
            obj = this.getHighSpeedVideoFpsRangesFor;
        } else if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            sb = new java.lang.StringBuilder("Data {\n");
            obj = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            sb = new java.lang.StringBuilder("Data {\n");
            obj = this.getHighSpeedVideoSizes;
        }
        sb.append(obj);
        sb.append("}\n");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1OctetString != null) {
            return aSN1OctetString.toASN1Primitive();
        }
        org.bouncycastle.asn1.x509.DigestInfo digestInfo = this.getHighResolutionOutputSizeshNQ4ISI;
        return digestInfo != null ? digestInfo.toASN1Primitive() : new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.asn1.x509.DigestInfo getMessageImprint() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getMessage() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.dvcs.TargetEtcChain[] getCerts() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoSizes;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.dvcs.TargetEtcChain[] targetEtcChainArr = new org.bouncycastle.asn1.dvcs.TargetEtcChain[size];
        for (int i = 0; i != size; i++) {
            targetEtcChainArr[i] = org.bouncycastle.asn1.dvcs.TargetEtcChain.getInstance(this.getHighSpeedVideoSizes.getObjectAt(i));
        }
        return targetEtcChainArr;
    }

    public static org.bouncycastle.asn1.dvcs.Data getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.dvcs.Data getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.Data) {
            return (org.bouncycastle.asn1.dvcs.Data) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1OctetString) {
            return new org.bouncycastle.asn1.dvcs.Data((org.bouncycastle.asn1.ASN1OctetString) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.dvcs.Data(org.bouncycastle.asn1.x509.DigestInfo.getInstance(obj));
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.dvcs.Data(org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) obj, false));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown object submitted to getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public Data(org.bouncycastle.asn1.dvcs.TargetEtcChain[] targetEtcChainArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(targetEtcChainArr);
    }

    public Data(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    public Data(org.bouncycastle.asn1.x509.DigestInfo digestInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = digestInfo;
    }

    public Data(org.bouncycastle.asn1.dvcs.TargetEtcChain targetEtcChain) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(targetEtcChain);
    }

    private Data(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = aSN1Sequence;
    }

    public Data(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString;
    }
}
