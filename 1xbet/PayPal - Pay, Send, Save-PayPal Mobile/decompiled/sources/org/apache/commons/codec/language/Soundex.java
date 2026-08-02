package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class Soundex implements org.apache.commons.codec.StringEncoder {
    public static final char SILENT_MARKER = '-';
    public static final java.lang.String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
    private final char[] Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRanges;

    @java.lang.Deprecated
    private int getHighSpeedVideoFpsRangesFor;
    private static final char[] getHighResolutionOutputSizeshNQ4ISI = "01230120022455012623010202".toCharArray();
    public static final org.apache.commons.codec.language.Soundex US_ENGLISH = new org.apache.commons.codec.language.Soundex();
    public static final org.apache.commons.codec.language.Soundex US_ENGLISH_SIMPLIFIED = new org.apache.commons.codec.language.Soundex("01230120022455012623010202", false);
    public static final org.apache.commons.codec.language.Soundex US_ENGLISH_GENEALOGY = new org.apache.commons.codec.language.Soundex("-123-12--22455-12623-1-2-2");

    public Soundex() {
        this.getHighSpeedVideoFpsRangesFor = 4;
        this.Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = true;
    }

    public Soundex(char[] cArr) {
        this.getHighSpeedVideoFpsRangesFor = 4;
        char[] cArr2 = (char[]) cArr.clone();
        this.Camera2StreamConfigurationMap = cArr2;
        int length = cArr2.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (cArr2[i] == '-') {
                z = true;
                break;
            }
            i++;
        }
        this.getHighSpeedVideoFpsRanges = !z;
    }

    public Soundex(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = 4;
        char[] charArray = str.toCharArray();
        this.Camera2StreamConfigurationMap = charArray;
        int length = charArray.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (charArray[i] == '-') {
                z = true;
                break;
            }
            i++;
        }
        this.getHighSpeedVideoFpsRanges = !z;
    }

    public Soundex(java.lang.String str, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = 4;
        this.Camera2StreamConfigurationMap = str.toCharArray();
        this.getHighSpeedVideoFpsRanges = z;
    }

    public int difference(java.lang.String str, java.lang.String str2) throws org.apache.commons.codec.EncoderException {
        return org.apache.commons.codec.language.SoundexUtils.getHighSpeedVideoSizes(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.codec.EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
        }
        return soundex((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return soundex(str);
    }

    @java.lang.Deprecated
    public int getMaxLength() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private char Camera2StreamConfigurationMap(char c) {
        int i = c - 'A';
        if (i >= 0) {
            char[] cArr = this.Camera2StreamConfigurationMap;
            if (i < cArr.length) {
                return cArr[i];
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The character is not mapped: ");
        sb.append(c);
        sb.append(" (index=");
        sb.append(i);
        sb.append(")");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @java.lang.Deprecated
    public void setMaxLength(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public java.lang.String soundex(java.lang.String str) {
        char Camera2StreamConfigurationMap;
        if (str == null) {
            return null;
        }
        java.lang.String highSpeedVideoSizes = org.apache.commons.codec.language.SoundexUtils.getHighSpeedVideoSizes(str);
        if (highSpeedVideoSizes.isEmpty()) {
            return highSpeedVideoSizes;
        }
        char[] cArr = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask};
        char charAt = highSpeedVideoSizes.charAt(0);
        cArr[0] = charAt;
        char Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(charAt);
        int i = 1;
        for (int i2 = 1; i2 < highSpeedVideoSizes.length() && i < 4; i2++) {
            char charAt2 = highSpeedVideoSizes.charAt(i2);
            if ((!this.getHighSpeedVideoFpsRanges || (charAt2 != 'H' && charAt2 != 'W')) && (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(charAt2)) != '-') {
                if (Camera2StreamConfigurationMap != '0' && Camera2StreamConfigurationMap != Camera2StreamConfigurationMap2) {
                    cArr[i] = Camera2StreamConfigurationMap;
                    i++;
                }
                Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap;
            }
        }
        return new java.lang.String(cArr);
    }
}
