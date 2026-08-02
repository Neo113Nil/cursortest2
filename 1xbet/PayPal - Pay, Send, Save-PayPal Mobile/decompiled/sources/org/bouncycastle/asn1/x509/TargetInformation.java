package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class TargetInformation extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.Targets[] getTargetsObjects() {
        org.bouncycastle.asn1.x509.Targets[] targetsArr = new org.bouncycastle.asn1.x509.Targets[this.getHighSpeedVideoFpsRanges.size()];
        java.util.Enumeration objects = this.getHighSpeedVideoFpsRanges.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            targetsArr[i] = org.bouncycastle.asn1.x509.Targets.getInstance(objects.nextElement());
            i++;
        }
        return targetsArr;
    }

    public static org.bouncycastle.asn1.x509.TargetInformation getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.TargetInformation) {
            return (org.bouncycastle.asn1.x509.TargetInformation) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.TargetInformation(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TargetInformation(org.bouncycastle.asn1.x509.Target[] targetArr) {
        this(new org.bouncycastle.asn1.x509.Targets(targetArr));
    }

    public TargetInformation(org.bouncycastle.asn1.x509.Targets targets) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(targets);
    }

    private TargetInformation(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
    }
}
