package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class X9ECPoint extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.math.ec.ECPoint getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.math.ec.ECCurve getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isPointCompressed() {
        byte b;
        byte[] octets = this.getHighSpeedVideoSizes.getOctets();
        return octets != null && octets.length > 0 && ((b = octets[0]) == 2 || b == 3);
    }

    public byte[] getPointEncoding() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes.getOctets());
    }

    public org.bouncycastle.math.ec.ECPoint getPoint() {
        org.bouncycastle.math.ec.ECPoint eCPoint;
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.decodePoint(this.getHighSpeedVideoSizes.getOctets()).normalize();
            }
            eCPoint = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return eCPoint;
    }

    public X9ECPoint(org.bouncycastle.math.ec.ECPoint eCPoint, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = eCPoint.normalize();
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DEROctetString(eCPoint.getEncoded(z));
    }

    public X9ECPoint(org.bouncycastle.math.ec.ECCurve eCCurve, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = eCCurve;
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
    }

    public X9ECPoint(org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }
}
