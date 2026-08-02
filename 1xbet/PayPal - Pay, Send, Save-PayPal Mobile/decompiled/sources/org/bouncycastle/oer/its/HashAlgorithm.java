package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class HashAlgorithm extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Enumerated getHighSpeedVideoSizes;
    public static final org.bouncycastle.oer.its.HashAlgorithm sha256 = new org.bouncycastle.oer.its.HashAlgorithm(0);
    public static final org.bouncycastle.oer.its.HashAlgorithm sha384 = new org.bouncycastle.oer.its.HashAlgorithm(1);
    public static final org.bouncycastle.oer.its.HashAlgorithm extension = new org.bouncycastle.oer.its.HashAlgorithm(2);

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.oer.its.HashAlgorithm getInstance(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof org.bouncycastle.oer.its.HashAlgorithm ? (org.bouncycastle.oer.its.HashAlgorithm) obj : new org.bouncycastle.oer.its.HashAlgorithm(org.bouncycastle.asn1.ASN1Enumerated.getInstance(obj));
    }

    private HashAlgorithm(org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated) {
        this.getHighSpeedVideoSizes = aSN1Enumerated;
    }

    protected HashAlgorithm(int i) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Enumerated(i);
    }
}
