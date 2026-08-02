package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class Targets extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.Target[] getTargets() {
        org.bouncycastle.asn1.x509.Target[] targetArr = new org.bouncycastle.asn1.x509.Target[this.getHighSpeedVideoFpsRanges.size()];
        java.util.Enumeration objects = this.getHighSpeedVideoFpsRanges.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            targetArr[i] = org.bouncycastle.asn1.x509.Target.getInstance(objects.nextElement());
            i++;
        }
        return targetArr;
    }

    public static org.bouncycastle.asn1.x509.Targets getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.Targets) {
            return (org.bouncycastle.asn1.x509.Targets) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.Targets(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Targets(org.bouncycastle.asn1.x509.Target[] targetArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(targetArr);
    }

    private Targets(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
    }
}
