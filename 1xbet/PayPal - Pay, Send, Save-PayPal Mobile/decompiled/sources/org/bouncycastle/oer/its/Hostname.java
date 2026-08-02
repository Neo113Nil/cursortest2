package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Hostname extends org.bouncycastle.asn1.ASN1Object {
    private final java.lang.String getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERUTF8String(this.getHighSpeedVideoFpsRanges);
    }

    public static org.bouncycastle.oer.its.Hostname getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.Hostname) {
            return (org.bouncycastle.oer.its.Hostname) obj;
        }
        if (obj instanceof java.lang.String) {
            return new org.bouncycastle.oer.its.Hostname((java.lang.String) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1String) {
            return new org.bouncycastle.oer.its.Hostname(((org.bouncycastle.asn1.ASN1String) obj).getString());
        }
        throw new java.lang.IllegalArgumentException("hostname accepts Hostname, String and ASN1String");
    }

    public Hostname(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }
}
