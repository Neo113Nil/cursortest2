package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class DistributionPointName extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int FULL_NAME = 0;
    public static final int NAME_RELATIVE_TO_CRL_ISSUER = 1;
    int getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        java.lang.String obj;
        java.lang.String str;
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(lineSeparator);
        if (this.getHighSpeedVideoFpsRanges == 0) {
            obj = this.getHighSpeedVideoFpsRangesFor.toString();
            str = "fullName";
        } else {
            obj = this.getHighSpeedVideoFpsRangesFor.toString();
            str = "nameRelativeToCRLIssuer";
        }
        stringBuffer.append("    ");
        stringBuffer.append(str);
        stringBuffer.append(io.ktor.sse.ServerSentEventKt.COLON);
        stringBuffer.append(lineSeparator);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(obj);
        stringBuffer.append(lineSeparator);
        stringBuffer.append("]");
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(false, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }

    public int getType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Encodable getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.x509.DistributionPointName getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1TaggedObject, true));
    }

    public static org.bouncycastle.asn1.x509.DistributionPointName getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.DistributionPointName)) {
            return (org.bouncycastle.asn1.x509.DistributionPointName) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.x509.DistributionPointName((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public DistributionPointName(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this(0, generalNames);
    }

    public DistributionPointName(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.getHighSpeedVideoFpsRanges = tagNo;
        this.getHighSpeedVideoFpsRangesFor = tagNo == 0 ? org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false) : org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
    }

    public DistributionPointName(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
