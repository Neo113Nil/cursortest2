package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Region extends org.bouncycastle.oer.its.Uint16 {
    public static org.bouncycastle.oer.its.Region getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.Region ? (org.bouncycastle.oer.its.Region) obj : new org.bouncycastle.oer.its.Region(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public Region(java.math.BigInteger bigInteger) {
        super(bigInteger);
    }

    public Region(int i) {
        super(i);
    }
}
