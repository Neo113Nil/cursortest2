package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class OneEightyDegreeInt extends org.bouncycastle.asn1.ASN1Integer {
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = new java.math.BigInteger("-1799999999");
    private static final java.math.BigInteger getHighSpeedVideoFpsRanges = new java.math.BigInteger("1800000000");
    private static final java.math.BigInteger Camera2StreamConfigurationMap = new java.math.BigInteger("1800000001");

    public void assertValue() {
        java.math.BigInteger value = getValue();
        if (value.compareTo(getHighSpeedVideoFpsRangesFor) < 0) {
            throw new java.lang.IllegalStateException("one eighty degree int cannot be less than -1799999999");
        }
        if (!value.equals(Camera2StreamConfigurationMap) && value.compareTo(getHighSpeedVideoFpsRanges) > 0) {
            throw new java.lang.IllegalStateException("one eighty degree int cannot be greater than 1800000000");
        }
    }

    public static org.bouncycastle.oer.its.OneEightyDegreeInt getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.OneEightyDegreeInt ? (org.bouncycastle.oer.its.OneEightyDegreeInt) obj : new org.bouncycastle.oer.its.OneEightyDegreeInt(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).getValue());
    }

    public OneEightyDegreeInt(byte[] bArr) {
        super(bArr);
        assertValue();
    }

    public OneEightyDegreeInt(java.math.BigInteger bigInteger) {
        super(bigInteger);
        assertValue();
    }

    public OneEightyDegreeInt(long j) {
        super(j);
        assertValue();
    }
}
