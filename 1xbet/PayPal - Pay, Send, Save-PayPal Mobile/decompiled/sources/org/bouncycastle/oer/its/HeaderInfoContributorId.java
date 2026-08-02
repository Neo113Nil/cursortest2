package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class HeaderInfoContributorId extends org.bouncycastle.asn1.ASN1Integer {
    public static org.bouncycastle.oer.its.HeaderInfoContributorId getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.HeaderInfoContributorId ? (org.bouncycastle.oer.its.HeaderInfoContributorId) obj : new org.bouncycastle.oer.its.HeaderInfoContributorId(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public HeaderInfoContributorId(byte[] bArr) {
        super(bArr);
    }

    public HeaderInfoContributorId(java.math.BigInteger bigInteger) {
        super(bigInteger);
    }

    public HeaderInfoContributorId(long j) {
        super(j);
    }
}
