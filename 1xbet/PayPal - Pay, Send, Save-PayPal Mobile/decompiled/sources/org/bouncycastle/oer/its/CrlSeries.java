package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class CrlSeries extends org.bouncycastle.oer.its.Uint16 {
    public static org.bouncycastle.oer.its.CrlSeries getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.CrlSeries ? (org.bouncycastle.oer.its.CrlSeries) obj : new org.bouncycastle.oer.its.CrlSeries(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public CrlSeries(java.math.BigInteger bigInteger) {
        super(bigInteger);
    }

    public CrlSeries(int i) {
        super(i);
    }
}
