package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class RefinedSoundex implements org.apache.commons.codec.StringEncoder {
    private static final char[] Camera2StreamConfigurationMap = "01360240043788015936020505".toCharArray();
    public static final org.apache.commons.codec.language.RefinedSoundex US_ENGLISH = new org.apache.commons.codec.language.RefinedSoundex();
    public static final java.lang.String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";
    private final char[] getHighSpeedVideoFpsRanges;

    public RefinedSoundex() {
        this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap;
    }

    public RefinedSoundex(char[] cArr) {
        this.getHighSpeedVideoFpsRanges = (char[]) cArr.clone();
    }

    public RefinedSoundex(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str.toCharArray();
    }

    public int difference(java.lang.String str, java.lang.String str2) throws org.apache.commons.codec.EncoderException {
        return org.apache.commons.codec.language.SoundexUtils.getHighSpeedVideoSizes(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.codec.EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
        }
        return soundex((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return soundex(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String soundex(java.lang.String str) {
        char c;
        int upperCase;
        if (str == null) {
            return null;
        }
        java.lang.String highSpeedVideoSizes = org.apache.commons.codec.language.SoundexUtils.getHighSpeedVideoSizes(str);
        if (highSpeedVideoSizes.isEmpty()) {
            return highSpeedVideoSizes;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(highSpeedVideoSizes.charAt(0));
        char c2 = '*';
        for (int i = 0; i < highSpeedVideoSizes.length(); i++) {
            if (java.lang.Character.isLetter(highSpeedVideoSizes.charAt(i)) && java.lang.Character.toUpperCase(r4) - 'A' >= 0) {
                char[] cArr = this.getHighSpeedVideoFpsRanges;
                if (upperCase < cArr.length) {
                    c = cArr[upperCase];
                    if (c != c2) {
                        if (c != 0) {
                            sb.append(c);
                        }
                        c2 = c;
                    }
                }
            }
            c = 0;
            if (c != c2) {
            }
        }
        return sb.toString();
    }
}
