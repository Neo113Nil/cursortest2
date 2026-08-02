package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Uint8 extends org.bouncycastle.asn1.ASN1Object {
    private final int getHighSpeedVideoSizes;

    protected int verify(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Uint16 must be >= 0");
        }
        if (i <= 255) {
            return i;
        }
        throw new java.lang.IllegalArgumentException("Uint16 must be <= 0xFF");
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes);
    }

    public static org.bouncycastle.oer.its.Uint8 getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.Uint8 ? (org.bouncycastle.oer.its.Uint8) obj : new org.bouncycastle.oer.its.Uint8(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public Uint8(java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoSizes = bigInteger.intValue();
    }

    public Uint8(int i) {
        this.getHighSpeedVideoSizes = verify(i);
    }
}
