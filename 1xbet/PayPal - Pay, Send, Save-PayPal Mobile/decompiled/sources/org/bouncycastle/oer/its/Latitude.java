package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Latitude extends org.bouncycastle.oer.its.NinetyDegreeInt {
    public static org.bouncycastle.oer.its.Latitude getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.Latitude ? (org.bouncycastle.oer.its.Latitude) obj : obj instanceof org.bouncycastle.oer.its.NinetyDegreeInt ? new org.bouncycastle.oer.its.Latitude(((org.bouncycastle.oer.its.NinetyDegreeInt) obj).getValue()) : new org.bouncycastle.oer.its.Latitude(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public Latitude(byte[] bArr) {
        super(bArr);
    }

    public Latitude(java.math.BigInteger bigInteger) {
        super(bigInteger);
    }

    public Latitude(long j) {
        super(j);
    }
}
