package org.threeten.bp.format;

/* loaded from: classes18.dex */
public final /* synthetic */ class DateTimeFormatterBuilder$FractionPrinterParser$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ java.math.BigDecimal m(java.math.BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new java.math.BigDecimal(java.math.BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
