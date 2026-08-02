package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class IValue extends org.bouncycastle.asn1.ASN1Object {
    private final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.oer.its.IValue getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.IValue) {
            return (org.bouncycastle.oer.its.IValue) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.oer.its.IValue(org.bouncycastle.asn1.ASN1Integer.getInstance(obj));
        }
        return null;
    }

    private IValue(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        int intValueExact = org.bouncycastle.util.BigIntegers.intValueExact(aSN1Integer.getValue());
        if (intValueExact < 0 || intValueExact > 65535) {
            throw new java.lang.IllegalArgumentException("value out of range");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer.getValue();
    }
}
