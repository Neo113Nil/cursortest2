package org.threeten.bp.format;

/* loaded from: classes18.dex */
public final class DecimalStyle {
    private final char getHighResolutionOutputSizeshNQ4ISI;
    private final char getHighSpeedVideoFpsRanges;
    final char getHighSpeedVideoFpsRangesFor;
    private final char getHighSpeedVideoSizes;
    public static final org.threeten.bp.format.DecimalStyle STANDARD = new org.threeten.bp.format.DecimalStyle(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '+', '-', com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    private static final java.util.concurrent.ConcurrentMap<java.util.Locale, org.threeten.bp.format.DecimalStyle> Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 2);

    public static java.util.Set<java.util.Locale> getAvailableLocales() {
        return new java.util.HashSet(java.util.Arrays.asList(java.text.DecimalFormatSymbols.getAvailableLocales()));
    }

    public static org.threeten.bp.format.DecimalStyle ofDefaultLocale() {
        return of(java.util.Locale.getDefault());
    }

    public static org.threeten.bp.format.DecimalStyle of(java.util.Locale locale) {
        org.threeten.bp.format.DecimalStyle decimalStyle;
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
        java.util.concurrent.ConcurrentMap<java.util.Locale, org.threeten.bp.format.DecimalStyle> concurrentMap = Camera2StreamConfigurationMap;
        org.threeten.bp.format.DecimalStyle decimalStyle2 = concurrentMap.get(locale);
        if (decimalStyle2 != null) {
            return decimalStyle2;
        }
        java.text.DecimalFormatSymbols decimalFormatSymbols = java.text.DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        if (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') {
            decimalStyle = STANDARD;
        } else {
            decimalStyle = new org.threeten.bp.format.DecimalStyle(zeroDigit, '+', minusSign, decimalSeparator);
        }
        concurrentMap.putIfAbsent(locale, decimalStyle);
        return concurrentMap.get(locale);
    }

    private DecimalStyle(char c, char c2, char c3, char c4) {
        this.getHighSpeedVideoFpsRangesFor = c;
        this.getHighSpeedVideoSizes = c2;
        this.getHighResolutionOutputSizeshNQ4ISI = c3;
        this.getHighSpeedVideoFpsRanges = c4;
    }

    public final char getZeroDigit() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final org.threeten.bp.format.DecimalStyle withZeroDigit(char c) {
        return c == this.getHighSpeedVideoFpsRangesFor ? this : new org.threeten.bp.format.DecimalStyle(c, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }

    public final char getPositiveSign() {
        return this.getHighSpeedVideoSizes;
    }

    public final org.threeten.bp.format.DecimalStyle withPositiveSign(char c) {
        return c == this.getHighSpeedVideoSizes ? this : new org.threeten.bp.format.DecimalStyle(this.getHighSpeedVideoFpsRangesFor, c, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }

    public final char getNegativeSign() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final org.threeten.bp.format.DecimalStyle withNegativeSign(char c) {
        return c == this.getHighResolutionOutputSizeshNQ4ISI ? this : new org.threeten.bp.format.DecimalStyle(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, c, this.getHighSpeedVideoFpsRanges);
    }

    public final char getDecimalSeparator() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final org.threeten.bp.format.DecimalStyle withDecimalSeparator(char c) {
        return c == this.getHighSpeedVideoFpsRanges ? this : new org.threeten.bp.format.DecimalStyle(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, c);
    }

    final java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        char c = this.getHighSpeedVideoFpsRangesFor;
        if (c == '0') {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + (c - '0'));
        }
        return new java.lang.String(charArray);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.format.DecimalStyle)) {
            return false;
        }
        org.threeten.bp.format.DecimalStyle decimalStyle = (org.threeten.bp.format.DecimalStyle) obj;
        return this.getHighSpeedVideoFpsRangesFor == decimalStyle.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == decimalStyle.getHighSpeedVideoSizes && this.getHighResolutionOutputSizeshNQ4ISI == decimalStyle.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == decimalStyle.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor + this.getHighSpeedVideoSizes + this.getHighResolutionOutputSizeshNQ4ISI + this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DecimalStyle[");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("]");
        return sb.toString();
    }
}
