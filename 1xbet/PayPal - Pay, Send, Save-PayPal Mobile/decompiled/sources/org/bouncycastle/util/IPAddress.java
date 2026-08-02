package org.bouncycastle.util;

/* loaded from: classes17.dex */
public class IPAddress {
    public static boolean isValidWithNetMask(java.lang.String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }

    public static boolean isValidIPv6WithNetmask(java.lang.String str) {
        int indexOf = str.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        java.lang.String substring = str.substring(indexOf + 1);
        return indexOf > 0 && isValidIPv6(str.substring(0, indexOf)) && (isValidIPv6(substring) || Camera2StreamConfigurationMap(substring, 128));
    }

    public static boolean isValidIPv6(java.lang.String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        java.lang.String obj = sb.toString();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < obj.length() && (indexOf = obj.indexOf(58, i)) >= i) {
            if (i2 == 8) {
                return false;
            }
            if (i != indexOf) {
                java.lang.String substring = obj.substring(i, indexOf);
                if (indexOf != obj.length() - 1 || substring.indexOf(46) <= 0) {
                    try {
                        int parseInt = java.lang.Integer.parseInt(obj.substring(i, indexOf), 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                        }
                    } catch (java.lang.NumberFormatException unused) {
                    }
                    return false;
                }
                if (!isValidIPv4(substring)) {
                    return false;
                }
                i2++;
            } else {
                if (indexOf != 1 && indexOf != obj.length() - 1 && z) {
                    return false;
                }
                z = true;
            }
            i = indexOf + 1;
            i2++;
        }
        return i2 == 8 || z;
    }

    public static boolean isValidIPv4WithNetmask(java.lang.String str) {
        int indexOf = str.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        java.lang.String substring = str.substring(indexOf + 1);
        return indexOf > 0 && isValidIPv4(str.substring(0, indexOf)) && (isValidIPv4(substring) || Camera2StreamConfigurationMap(substring, 32));
    }

    public static boolean isValidIPv4(java.lang.String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".");
        java.lang.String obj = sb.toString();
        int i = 0;
        int i2 = 0;
        while (i < obj.length() && (indexOf = obj.indexOf(46, i)) > i) {
            if (i2 == 4) {
                return false;
            }
            try {
                int parseInt = java.lang.Integer.parseInt(obj.substring(i, indexOf));
                if (parseInt >= 0 && parseInt <= 255) {
                    i = indexOf + 1;
                    i2++;
                }
            } catch (java.lang.NumberFormatException unused) {
            }
            return false;
        }
        return i2 == 4;
    }

    public static boolean isValid(java.lang.String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String str, int i) {
        try {
            int parseInt = java.lang.Integer.parseInt(str);
            return parseInt >= 0 && parseInt <= i;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }
}
