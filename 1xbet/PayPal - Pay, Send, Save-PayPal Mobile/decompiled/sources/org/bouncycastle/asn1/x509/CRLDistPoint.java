package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class CRLDistPoint extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CRLDistPoint:");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        org.bouncycastle.asn1.x509.DistributionPoint[] distributionPoints = getDistributionPoints();
        for (int i = 0; i != distributionPoints.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(distributionPoints[i]);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.DistributionPoint[] getDistributionPoints() {
        org.bouncycastle.asn1.x509.DistributionPoint[] distributionPointArr = new org.bouncycastle.asn1.x509.DistributionPoint[this.getHighSpeedVideoFpsRanges.size()];
        for (int i = 0; i != this.getHighSpeedVideoFpsRanges.size(); i++) {
            distributionPointArr[i] = org.bouncycastle.asn1.x509.DistributionPoint.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return distributionPointArr;
    }

    public static org.bouncycastle.asn1.x509.CRLDistPoint getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.CRLDistPoint getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.CRLDistPoint) {
            return (org.bouncycastle.asn1.x509.CRLDistPoint) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.CRLDistPoint(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.CRLDistPoint fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints));
    }

    public CRLDistPoint(org.bouncycastle.asn1.x509.DistributionPoint[] distributionPointArr) {
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(distributionPointArr);
    }

    private CRLDistPoint(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
    }
}
