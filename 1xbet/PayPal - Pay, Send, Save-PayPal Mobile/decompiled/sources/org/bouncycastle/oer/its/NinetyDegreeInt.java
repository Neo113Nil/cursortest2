package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class NinetyDegreeInt extends org.bouncycastle.asn1.ASN1Integer {
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = new java.math.BigInteger("-900000000");
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = new java.math.BigInteger("900000000");
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = new java.math.BigInteger("900000001");

    public void assertValue() {
        java.math.BigInteger value = getValue();
        if (value.compareTo(getHighResolutionOutputSizeshNQ4ISI) < 0) {
            throw new java.lang.IllegalStateException("ninety degree int cannot be less than -900000000");
        }
        if (!value.equals(getHighSpeedVideoFpsRangesFor) && value.compareTo(getHighSpeedVideoFpsRanges) > 0) {
            throw new java.lang.IllegalStateException("ninety degree int cannot be greater than 900000000");
        }
    }

    public static org.bouncycastle.oer.its.NinetyDegreeInt getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.NinetyDegreeInt ? (org.bouncycastle.oer.its.NinetyDegreeInt) obj : new org.bouncycastle.oer.its.NinetyDegreeInt(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public NinetyDegreeInt(byte[] bArr) {
        super(bArr);
        assertValue();
    }

    public NinetyDegreeInt(java.math.BigInteger bigInteger) {
        super(bigInteger);
        assertValue();
    }

    public NinetyDegreeInt(long j) {
        super(j);
        assertValue();
    }
}
