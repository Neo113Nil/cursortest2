package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class KeyUsage extends org.bouncycastle.asn1.ASN1Object {
    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i;
        byte[] bytes = this.getHighSpeedVideoFpsRangesFor.getBytes();
        if (bytes.length == 1) {
            sb = new java.lang.StringBuilder("KeyUsage: 0x");
            i = bytes[0] & 255;
        } else {
            sb = new java.lang.StringBuilder("KeyUsage: 0x");
            i = (bytes[0] & 255) | ((bytes[1] & 255) << 8);
        }
        sb.append(java.lang.Integer.toHexString(i));
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean hasUsages(int i) {
        return (this.getHighSpeedVideoFpsRangesFor.intValue() & i) == i;
    }

    public int getPadBits() {
        return this.getHighSpeedVideoFpsRangesFor.getPadBits();
    }

    public byte[] getBytes() {
        return this.getHighSpeedVideoFpsRangesFor.getBytes();
    }

    public static org.bouncycastle.asn1.x509.KeyUsage getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.KeyUsage) {
            return (org.bouncycastle.asn1.x509.KeyUsage) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.KeyUsage(org.bouncycastle.asn1.ASN1BitString.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.KeyUsage fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.keyUsage));
    }

    private KeyUsage(org.bouncycastle.asn1.ASN1BitString aSN1BitString) {
        this.getHighSpeedVideoFpsRangesFor = aSN1BitString;
    }

    public KeyUsage(int i) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERBitString(i);
    }
}
