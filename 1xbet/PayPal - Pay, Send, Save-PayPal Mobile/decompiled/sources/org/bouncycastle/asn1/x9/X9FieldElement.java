package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class X9FieldElement extends org.bouncycastle.asn1.ASN1Object {
    private static org.bouncycastle.asn1.x9.X9IntegerConverter getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x9.X9IntegerConverter();
    protected org.bouncycastle.math.ec.ECFieldElement f;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DEROctetString(getHighSpeedVideoFpsRanges.integerToBytes(this.f.toBigInteger(), getHighSpeedVideoFpsRanges.getByteLength(this.f)));
    }

    public org.bouncycastle.math.ec.ECFieldElement getValue() {
        return this.f;
    }

    public X9FieldElement(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        this.f = eCFieldElement;
    }
}
