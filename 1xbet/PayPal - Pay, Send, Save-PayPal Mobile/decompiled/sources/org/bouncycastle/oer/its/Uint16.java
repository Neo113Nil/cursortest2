package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Uint16 extends org.bouncycastle.asn1.ASN1Object {
    private final int getHighSpeedVideoFpsRanges;

    protected int verify(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Uint16 must be >= 0");
        }
        if (i <= 65535) {
            return i;
        }
        throw new java.lang.IllegalArgumentException("Uint16 must be <= 0xFFFF");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges);
    }

    public static org.bouncycastle.oer.its.Uint16 getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.Uint16 ? (org.bouncycastle.oer.its.Uint16) obj : new org.bouncycastle.oer.its.Uint16(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public Uint16(java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRanges = bigInteger.intValue();
    }

    public Uint16(int i) {
        this.getHighSpeedVideoFpsRanges = verify(i);
    }
}
