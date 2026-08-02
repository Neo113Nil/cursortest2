package com.payair.hce;

/* loaded from: classes4.dex */
public final class getIccPrivateKeyCrtComponents {
    private static final int values;

    private static int DigitizedCardProfile(java.lang.String str) {
        try {
            java.lang.String[] split = str.split("[._]");
            int parseInt = java.lang.Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : java.lang.Integer.parseInt(split[1]);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    private static int AlternateContactlessPaymentDataJson(java.lang.String str) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!java.lang.Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return java.lang.Integer.parseInt(sb.toString());
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public static int writeReplace() {
        return values;
    }

    public static boolean DigitizedCardProfile() {
        return values >= 9;
    }

    static {
        java.lang.String property = java.lang.System.getProperty("java.version");
        int DigitizedCardProfile = DigitizedCardProfile(property);
        if (DigitizedCardProfile == -1) {
            DigitizedCardProfile = AlternateContactlessPaymentDataJson(property);
        }
        if (DigitizedCardProfile == -1) {
            DigitizedCardProfile = 6;
        }
        values = DigitizedCardProfile;
    }
}
