package com.datadog.trace.api.normalize;

/* loaded from: classes3.dex */
final class AntPathMatcher {
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = new java.lang.String[0];

    AntPathMatcher() {
    }

    public static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        return (str.indexOf(42) == -1 && str.indexOf(63) == -1) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00aa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ae, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r7 <= r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
    
        if (r5 > r2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r0[r5] == '*') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003e, code lost:
    
        r9 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0040, code lost:
    
        if (r9 == '*') goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0042, code lost:
    
        if (r7 > r4) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0044, code lost:
    
        if (r9 == '?') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0048, code lost:
    
        if (r9 == r1[r4]) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        r2 = r2 - 1;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0050, code lost:
    
        if (r7 <= r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:
    
        if (r5 > r2) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0056, code lost:
    
        if (r0[r5] == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005d, code lost:
    
        if (r5 == r2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005f, code lost:
    
        if (r7 > r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0061, code lost:
    
        r9 = r5 + 1;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0065, code lost:
    
        if (r11 > r2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0069, code lost:
    
        if (r0[r11] == '*') goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x006b, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006f, code lost:
    
        if (r11 != r9) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0073, code lost:
    
        r9 = (r11 - r5) - 1;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x007b, code lost:
    
        if (r13 > (((r4 - r7) + 1) - r9)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x007d, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007e, code lost:
    
        if (r14 >= r9) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0080, code lost:
    
        r15 = r0[(r5 + r14) + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0085, code lost:
    
        if (r15 == r8) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008d, code lost:
    
        if (r15 == r1[(r7 + r13) + r14]) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008f, code lost:
    
        r13 = r13 + 1;
        r8 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0094, code lost:
    
        r14 = r14 + 1;
        r8 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0099, code lost:
    
        r7 = r7 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x009c, code lost:
    
        if (r7 != (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009f, code lost:
    
        r7 = r7 + r9;
        r5 = r11;
        r8 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x009e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x009b, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0071, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x006e, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00a4, code lost:
    
        if (r5 > r2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00a8, code lost:
    
        if (r0[r5] == '*') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ab, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length = charArray.length - 1;
        int length2 = charArray2.length - 1;
        int length3 = charArray.length;
        int i = 0;
        while (true) {
            char c = '?';
            if (i >= length3) {
                if (length != length2) {
                    return false;
                }
                for (int i2 = 0; i2 <= length; i2++) {
                    char c2 = charArray[i2];
                    if (c2 != '?' && c2 != charArray2[i2]) {
                        return false;
                    }
                }
                return true;
            }
            if (charArray[i] != '*') {
                i++;
            } else {
                if (length == 0) {
                    return true;
                }
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    char c3 = charArray[i3];
                    if (c3 == '*' || i4 > length2) {
                        break;
                    }
                    if (c3 != '?' && c3 != charArray2[i4]) {
                        return false;
                    }
                    i3++;
                    i4++;
                }
            }
        }
    }

    static java.lang.String[] getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return getHighSpeedVideoFpsRangesFor;
        }
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, str2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() > 0) {
                arrayList.add(nextToken);
            }
        }
        if (!arrayList.isEmpty()) {
            return (java.lang.String[]) arrayList.toArray(getHighSpeedVideoFpsRangesFor);
        }
        return getHighSpeedVideoFpsRangesFor;
    }
}
