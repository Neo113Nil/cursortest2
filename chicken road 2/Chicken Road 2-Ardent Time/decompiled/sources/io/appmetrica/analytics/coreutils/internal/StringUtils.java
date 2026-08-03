package io.appmetrica.analytics.coreutils.internal;

/* loaded from: classes.dex */
public final class StringUtils {
    public static final java.lang.String COMMA = ",";
    public static final java.lang.String EMPTY = "";
    public static final java.lang.String PROCESS_POSTFIX_DELIMITER = ":";
    public static final java.lang.String UNDEFINED = "undefined";

    public static java.lang.String capitalize(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        char charAt = str.charAt(0);
        if (java.lang.Character.isUpperCase(charAt)) {
            return str;
        }
        return java.lang.Character.toUpperCase(charAt) + str.substring(1);
    }

    public static int compare(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public static java.lang.String contentValuesToString(android.content.ContentValues contentValues) {
        return contentValues == null ? "null" : contentValues.toString();
    }

    public static java.lang.String correctIllFormedString(java.lang.String str) {
        return new java.lang.String(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public static java.lang.String emptyIfNull(java.lang.String str) {
        return ifIsNullToDef(str, "");
    }

    public static boolean equalsNullSafety(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static java.lang.String formatSha1(byte[] bArr) {
        return toHexString(bArr).toUpperCase(java.util.Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
    }

    public static byte[] getUTF8Bytes(java.lang.String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (java.lang.Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static int getUtf8BytesLength(java.lang.String str) {
        return getUTF8Bytes(str).length;
    }

    public static byte[] hexToBytes(java.lang.String str) {
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Input string must contain an even number of characters");
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (java.lang.Character.digit(str.charAt(i2 + 1), 16) + (java.lang.Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    public static java.lang.String ifIsEmptyToDef(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str) ? str2 : str;
    }

    public static java.lang.String ifIsNullToDef(java.lang.String str, java.lang.String str2) {
        return str == null ? str2 : str;
    }

    public static byte[] stringToBytesForProtobuf(java.lang.String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    public static java.lang.String throwableToString(java.lang.Throwable th) {
        return th.getClass().getName() + ": " + th.getMessage() + "\n" + i1.AbstractC0189h.P(th.getStackTrace(), "\n", "", "", -1, "...", null);
    }

    public static java.lang.String toHexString(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static final java.lang.String wrapFeatures(java.lang.String... strArr) {
        return android.text.TextUtils.join(COMMA, strArr);
    }

    public static byte[][] getUTF8Bytes(java.util.List<java.lang.String> list) {
        byte[][] bArr = new byte[0][];
        if (list != null) {
            bArr = new byte[list.size()][];
            for (int i2 = 0; i2 < list.size(); i2++) {
                bArr[i2] = getUTF8Bytes(list.get(i2));
            }
        }
        return bArr;
    }
}
