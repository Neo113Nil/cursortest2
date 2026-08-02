package util.h.xy.fb;

/* loaded from: classes5.dex */
public final class rc {
    private static final java.lang.ThreadLocal Camera2StreamConfigurationMap = new java.lang.ThreadLocal();
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 43) + ((i & 43) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r6.charAt(2) == 'U') goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 103) << 1) - (i ^ 103);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str == null || str.length() != 4) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = ((i3 | 37) << 1) - (i3 ^ 37);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw new java.lang.ArithmeticException();
        }
        if (str.charAt(0) != 't') {
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 69;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 == 0) {
            }
        }
        if (str.charAt(1) != 'r') {
            int i6 = getHighSpeedVideoFpsRangesFor;
            int i7 = ((i6 | 103) << 1) - (i6 ^ 103);
            getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
            if (i7 % 2 != 0) {
            }
        }
        if (str.charAt(2) != 'u') {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
        }
        return str.charAt(3) == 'e' || str.charAt(3) == 'E';
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m26850(final java.lang.String str) {
        java.lang.String str2 = (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: util.h.xy.fb.rc.3
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
                java.lang.String property = java.security.Security.getProperty(str);
                int i = getHighResolutionOutputSizeshNQ4ISI + 67;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 != 0) {
                    return property;
                }
                throw new java.lang.ArithmeticException();
            }
        });
        if (str2 != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 5;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                return str2;
            }
            throw null;
        }
        java.util.Map map = (java.util.Map) Camera2StreamConfigurationMap.get();
        if (map != null) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            int i3 = (i2 ^ 101) + ((i2 & 101) << 1);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            java.lang.String str3 = (java.lang.String) map.get(str);
            if (str3 != null) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i4 ^ 23) + ((i4 & 23) << 1)) % 128;
                int i5 = i4 + 19;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                if (i5 % 2 == 0) {
                    return str3;
                }
                throw null;
            }
        }
        java.lang.String str4 = (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: util.h.xy.fb.rc.5
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoFpsRangesFor;

            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 3) % 128;
                java.lang.String property = java.lang.System.getProperty(str);
                int i6 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = (((i6 | 73) << 1) - (i6 ^ 73)) % 128;
                return property;
            }
        });
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 13) % 128;
        return str4;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m26851(java.lang.String str, int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 ^ 83) + ((i2 & 83) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        java.lang.String m26850 = m26850(str);
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (m26850 != null) {
            int parseInt = java.lang.Integer.parseInt(m26850);
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
            return parseInt;
        }
        int i4 = getHighSpeedVideoFpsRangesFor + 55;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            return i;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        if (r8 == 'F') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        if (r7.charAt(2) == 'L') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (r7.charAt(3) == 'S') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r7.charAt(4) != 'E') goto L44;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m26852(java.lang.String str, boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 111;
        getHighSpeedVideoFpsRangesFor = i % 128;
        boolean z2 = false;
        try {
            if (i % 2 != 0) {
                m26850(str);
                throw null;
            }
            java.lang.String m26850 = m26850(str);
            boolean z3 = true;
            if (z) {
                int i2 = getHighSpeedVideoFpsRangesFor;
                int i3 = ((i2 | 65) << 1) - (i2 ^ 65);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    return getHighSpeedVideoFpsRanges(m26850);
                }
                getHighSpeedVideoFpsRanges(m26850);
                throw new java.lang.ArithmeticException();
            }
            int i4 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (i4 + 23) % 128;
            if (m26850 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (i4 + 31) % 128;
                if (m26850.length() == 5) {
                    if (m26850.charAt(0) != 'f') {
                        int i5 = getHighSpeedVideoFpsRangesFor;
                        int i6 = ((i5 | 97) << 1) - (i5 ^ 97);
                        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                        char charAt = m26850.charAt(0);
                        if (i6 % 2 == 0) {
                            if (charAt == 'o') {
                            }
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
                            z3 = false;
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 103) % 128;
                            z2 = z3;
                        }
                        int i7 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRangesFor = ((i7 & 61) + (i7 | 61)) % 128;
                        return z2;
                    }
                    if (m26850.charAt(1) == 'a' || m26850.charAt(1) == 'A') {
                        if (m26850.charAt(2) != 'l') {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 59) % 128;
                        }
                        if (m26850.charAt(3) != 's') {
                            int i8 = getHighSpeedVideoFpsRangesFor;
                            getHighResolutionOutputSizeshNQ4ISI = (((i8 | 75) << 1) - (i8 ^ 75)) % 128;
                        }
                        if (m26850.charAt(4) != 'e') {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 73) % 128;
                        }
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 103) % 128;
                        z2 = z3;
                        int i72 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRangesFor = ((i72 & 61) + (i72 | 61)) % 128;
                        return z2;
                    }
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
                    z3 = false;
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 103) % 128;
                    z2 = z3;
                    int i722 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoFpsRangesFor = ((i722 & 61) + (i722 | 61)) % 128;
                    return z2;
                }
            }
            int i9 = getHighResolutionOutputSizeshNQ4ISI + 63;
            getHighSpeedVideoFpsRangesFor = i9 % 128;
            if (i9 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            int i7222 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i7222 & 61) + (i7222 | 61)) % 128;
            return z2;
        } catch (java.security.AccessControlException unused) {
            return false;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m26853(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i & 79) + (i | 79)) % 128;
        try {
            boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(m26850(str));
            int i2 = getHighSpeedVideoFpsRangesFor;
            int i3 = (i2 & 43) + (i2 | 43);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                return highSpeedVideoFpsRanges;
            }
            throw null;
        } catch (java.security.AccessControlException unused) {
            return false;
        }
    }
}
