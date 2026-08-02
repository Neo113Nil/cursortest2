package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class GenTimeAccuracy {
    private org.bouncycastle.asn1.tsp.Accuracy getHighSpeedVideoFpsRanges;

    public int getMicros() {
        org.bouncycastle.asn1.ASN1Integer micros = this.getHighSpeedVideoFpsRanges.getMicros();
        if (micros != null) {
            return micros.intValueExact();
        }
        return 0;
    }

    public int getMillis() {
        org.bouncycastle.asn1.ASN1Integer millis = this.getHighSpeedVideoFpsRanges.getMillis();
        if (millis != null) {
            return millis.intValueExact();
        }
        return 0;
    }

    public int getSeconds() {
        org.bouncycastle.asn1.ASN1Integer seconds = this.getHighSpeedVideoFpsRanges.getSeconds();
        if (seconds != null) {
            return seconds.intValueExact();
        }
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getSeconds());
        sb.append(".");
        sb.append(getHighSpeedVideoFpsRangesFor(getMillis()));
        sb.append(getHighSpeedVideoFpsRangesFor(getMicros()));
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.StringBuilder sb;
        if (i < 10) {
            sb = new java.lang.StringBuilder(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX);
        } else {
            if (i >= 100) {
                return java.lang.Integer.toString(i);
            }
            sb = new java.lang.StringBuilder("0");
        }
        sb.append(i);
        return sb.toString();
    }

    public GenTimeAccuracy(org.bouncycastle.asn1.tsp.Accuracy accuracy) {
        this.getHighSpeedVideoFpsRanges = accuracy;
    }
}
