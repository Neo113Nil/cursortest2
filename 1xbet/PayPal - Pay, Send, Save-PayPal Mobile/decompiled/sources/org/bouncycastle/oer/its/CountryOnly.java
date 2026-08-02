package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class CountryOnly extends org.bouncycastle.oer.its.Uint16 implements org.bouncycastle.oer.its.RegionInterface {
    public static org.bouncycastle.oer.its.CountryOnly getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.CountryOnly ? (org.bouncycastle.oer.its.CountryOnly) obj : new org.bouncycastle.oer.its.CountryOnly(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public CountryOnly(java.math.BigInteger bigInteger) {
        super(bigInteger);
    }

    public CountryOnly(int i) {
        super(i);
    }
}
