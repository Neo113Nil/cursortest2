package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PduFunctionType extends org.bouncycastle.asn1.ASN1Integer {
    public static final org.bouncycastle.oer.its.PduFunctionType tlsHandshake = new org.bouncycastle.oer.its.PduFunctionType(1);
    public static final org.bouncycastle.oer.its.PduFunctionType iso21177ExtendedAuth = new org.bouncycastle.oer.its.PduFunctionType(2);

    public static org.bouncycastle.oer.its.PduFunctionType getInstance(java.lang.Object obj) {
        while (!(obj instanceof org.bouncycastle.oer.its.PduFunctionType)) {
            if (obj instanceof org.bouncycastle.asn1.ASN1Integer) {
                return new org.bouncycastle.oer.its.PduFunctionType(((org.bouncycastle.asn1.ASN1Integer) obj).getValue());
            }
            obj = org.bouncycastle.asn1.ASN1Integer.getInstance(obj);
        }
        return (org.bouncycastle.oer.its.PduFunctionType) obj;
    }

    public PduFunctionType(byte[] bArr) {
        super(bArr);
    }

    public PduFunctionType(java.math.BigInteger bigInteger) {
        super(bigInteger);
    }

    public PduFunctionType(long j) {
        super(j);
    }
}
