package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Longitude extends org.bouncycastle.oer.its.OneEightyDegreeInt {
    public static org.bouncycastle.oer.its.Longitude getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.Longitude ? (org.bouncycastle.oer.its.Longitude) obj : obj instanceof org.bouncycastle.oer.its.OneEightyDegreeInt ? new org.bouncycastle.oer.its.Longitude(((org.bouncycastle.oer.its.OneEightyDegreeInt) obj).getValue()) : new org.bouncycastle.oer.its.Longitude(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public Longitude(byte[] bArr) {
        super(bArr);
    }

    public Longitude(java.math.BigInteger bigInteger) {
        super(bigInteger);
    }

    public Longitude(long j) {
        super(j);
    }
}
