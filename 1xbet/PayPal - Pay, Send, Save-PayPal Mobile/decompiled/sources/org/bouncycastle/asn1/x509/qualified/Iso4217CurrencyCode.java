package org.bouncycastle.asn1.x509.qualified;

/* loaded from: classes17.dex */
public class Iso4217CurrencyCode extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;
    final int getHighSpeedVideoFpsRanges = 3;
    final int getHighSpeedVideoFpsRangesFor = 1;
    final int getHighResolutionOutputSizeshNQ4ISI = 999;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes.toASN1Primitive();
    }

    public boolean isAlphabetic() {
        return this.getHighSpeedVideoSizes instanceof org.bouncycastle.asn1.ASN1PrintableString;
    }

    public int getNumeric() {
        return ((org.bouncycastle.asn1.ASN1Integer) this.getHighSpeedVideoSizes).intValueExact();
    }

    public java.lang.String getAlphabetic() {
        return ((org.bouncycastle.asn1.ASN1PrintableString) this.getHighSpeedVideoSizes).getString();
    }

    public static org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode)) {
            return (org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Integer) {
            return new org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode(org.bouncycastle.asn1.ASN1Integer.getInstance(obj).intValueExact());
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1PrintableString) {
            return new org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode(org.bouncycastle.asn1.ASN1PrintableString.getInstance(obj).getString());
        }
        throw new java.lang.IllegalArgumentException("unknown object in getInstance");
    }

    public Iso4217CurrencyCode(java.lang.String str) {
        if (str.length() > 3) {
            throw new java.lang.IllegalArgumentException("wrong size in alphabetic code : max size is 3");
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERPrintableString(str);
    }

    public Iso4217CurrencyCode(int i) {
        if (i > 999 || i <= 0) {
            throw new java.lang.IllegalArgumentException("wrong size in numeric code : not in (1..999)");
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(i);
    }
}
