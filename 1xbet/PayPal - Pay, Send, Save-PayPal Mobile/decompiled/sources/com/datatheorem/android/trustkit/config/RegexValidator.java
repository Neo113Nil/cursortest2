package com.datatheorem.android.trustkit.config;

/* loaded from: classes8.dex */
class RegexValidator implements java.io.Serializable {
    private static final long serialVersionUID = -8832409930574867162L;
    private final java.util.regex.Pattern[] getHighSpeedVideoSizes;

    public RegexValidator(java.lang.String str) {
        this(str, (byte) 0);
    }

    private RegexValidator(java.lang.String str, byte b) {
        this(new java.lang.String[]{str}, true);
    }

    private RegexValidator(java.lang.String[] strArr, boolean z) {
        int length = strArr.length;
        this.getHighSpeedVideoSizes = new java.util.regex.Pattern[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            java.lang.String str = strArr[0];
            if (str == null || str.length() == 0) {
                throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder("Regular expression[0] is missing").toString());
            }
            this.getHighSpeedVideoSizes[0] = java.util.regex.Pattern.compile(strArr[0], 0);
        }
    }

    public final boolean Camera2StreamConfigurationMap(java.lang.String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        while (true) {
            java.util.regex.Pattern[] patternArr = this.getHighSpeedVideoSizes;
            if (i >= patternArr.length) {
                return false;
            }
            if (patternArr[i].matcher(str).matches()) {
                return true;
            }
            i++;
        }
    }

    public final java.lang.String[] getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            java.util.regex.Pattern[] patternArr = this.getHighSpeedVideoSizes;
            if (i2 >= patternArr.length) {
                return null;
            }
            java.util.regex.Matcher matcher = patternArr[i2].matcher(str);
            if (matcher.matches()) {
                int groupCount = matcher.groupCount();
                java.lang.String[] strArr = new java.lang.String[groupCount];
                while (i < groupCount) {
                    int i3 = i + 1;
                    strArr[i] = matcher.group(i3);
                    i = i3;
                }
                return strArr;
            }
            i2++;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RegexValidator{");
        for (int i = 0; i < this.getHighSpeedVideoSizes.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.getHighSpeedVideoSizes[i].pattern());
        }
        sb.append("}");
        return sb.toString();
    }
}
