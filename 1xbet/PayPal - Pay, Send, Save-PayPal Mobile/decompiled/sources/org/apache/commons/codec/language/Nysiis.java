package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class Nysiis implements org.apache.commons.codec.StringEncoder {
    private final boolean isOutputSupportedForhNQ4ISI;
    private static final char[] getHighSpeedVideoFpsRanges = {'A'};
    private static final char[] getHighSpeedVideoSizes = {'A', 'F'};
    private static final char[] getHighResolutionOutputSizeshNQ4ISI = {'C'};
    private static final char[] Camera2StreamConfigurationMap = {'F', 'F'};
    private static final char[] getHighSpeedVideoFpsRangesFor = {'G'};
    private static final char[] getHighSpeedVideoSizesFor = {'N'};
    private static final char[] getOutputFormats = {'N', 'N'};
    private static final char[] getInputFormats = {'S'};
    private static final char[] getOutputMinFrameDuration = {'S', 'S', 'S'};
    private static final java.util.regex.Pattern getOutputSizeshNQ4ISI = java.util.regex.Pattern.compile("^MAC");
    private static final java.util.regex.Pattern getOutputSizes = java.util.regex.Pattern.compile("^KN");
    private static final java.util.regex.Pattern getOutputMinFrameDurationlomOqCM = java.util.regex.Pattern.compile("^K");
    private static final java.util.regex.Pattern getOutputStallDurationlomOqCM = java.util.regex.Pattern.compile("^(PH|PF)");
    private static final java.util.regex.Pattern unwrapAs = java.util.regex.Pattern.compile("^SCH");
    private static final java.util.regex.Pattern getOutputStallDuration = java.util.regex.Pattern.compile("(EE|IE)$");
    private static final java.util.regex.Pattern getInputSizeshNQ4ISI = java.util.regex.Pattern.compile("(DT|RT|RD|NT|ND)$");

    private static boolean Camera2StreamConfigurationMap(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public Nysiis() {
        this(true);
    }

    public Nysiis(boolean z) {
        this.isOutputSupportedForhNQ4ISI = z;
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.codec.EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
        }
        return nysiis((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return nysiis(str);
    }

    public boolean isStrict() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public java.lang.String nysiis(java.lang.String str) {
        char[] cArr;
        if (str == null) {
            return null;
        }
        java.lang.String highSpeedVideoSizes = org.apache.commons.codec.language.SoundexUtils.getHighSpeedVideoSizes(str);
        if (highSpeedVideoSizes.isEmpty()) {
            return highSpeedVideoSizes;
        }
        java.lang.String replaceFirst = getInputSizeshNQ4ISI.matcher(getOutputStallDuration.matcher(unwrapAs.matcher(getOutputStallDurationlomOqCM.matcher(getOutputMinFrameDurationlomOqCM.matcher(getOutputSizes.matcher(getOutputSizeshNQ4ISI.matcher(highSpeedVideoSizes).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA)).replaceFirst("FF")).replaceFirst("SSS")).replaceFirst("Y")).replaceFirst("D");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(replaceFirst.length());
        sb.append(replaceFirst.charAt(0));
        char[] charArray = replaceFirst.toCharArray();
        int length = charArray.length;
        int i = 1;
        while (i < length) {
            char c = i < length + (-1) ? charArray[i + 1] : ' ';
            char c2 = i < length + (-2) ? charArray[i + 2] : ' ';
            int i2 = i - 1;
            char c3 = charArray[i2];
            char c4 = charArray[i];
            if (c4 == 'E' && c == 'V') {
                cArr = getHighSpeedVideoSizes;
            } else if (Camera2StreamConfigurationMap(c4)) {
                cArr = getHighSpeedVideoFpsRanges;
            } else if (c4 != 'K') {
                if (c4 == 'M') {
                    cArr = getHighSpeedVideoSizesFor;
                } else if (c4 == 'Q') {
                    cArr = getHighSpeedVideoFpsRangesFor;
                } else if (c4 == 'Z') {
                    cArr = getInputFormats;
                } else if (c4 == 'S' && c == 'C' && c2 == 'H') {
                    cArr = getOutputMinFrameDuration;
                } else if (c4 == 'P' && c == 'H') {
                    cArr = Camera2StreamConfigurationMap;
                } else if (c4 == 'H' && (!Camera2StreamConfigurationMap(c3) || !Camera2StreamConfigurationMap(c))) {
                    cArr = new char[]{c3};
                } else if (c4 == 'W' && Camera2StreamConfigurationMap(c3)) {
                    cArr = new char[]{c3};
                } else {
                    cArr = new char[]{c4};
                }
            } else if (c == 'N') {
                cArr = getOutputFormats;
            } else {
                cArr = getHighResolutionOutputSizeshNQ4ISI;
            }
            java.lang.System.arraycopy(cArr, 0, charArray, i, cArr.length);
            char c5 = charArray[i];
            if (c5 != charArray[i2]) {
                sb.append(c5);
            }
            i++;
        }
        if (sb.length() > 1) {
            char charAt = sb.charAt(sb.length() - 1);
            if (charAt == 'S') {
                sb.deleteCharAt(sb.length() - 1);
                charAt = sb.charAt(sb.length() - 1);
            }
            if (sb.length() > 2 && sb.charAt(sb.length() - 2) == 'A' && charAt == 'Y') {
                sb.deleteCharAt(sb.length() - 2);
            }
            if (charAt == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        java.lang.String obj = sb.toString();
        return isStrict() ? obj.substring(0, java.lang.Math.min(6, obj.length())) : obj;
    }
}
