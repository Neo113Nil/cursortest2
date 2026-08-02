package com.datadog.trace.util;

/* loaded from: classes3.dex */
public final class Strings {
    public static java.lang.String toEnvVar(java.lang.String str) {
        return str.replace(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, '_').replace('-', '_').toUpperCase(java.util.Locale.US);
    }

    public static java.lang.String join(java.lang.CharSequence charSequence, java.lang.CharSequence... charSequenceArr) {
        int length = charSequenceArr.length;
        if (length <= 0) {
            return "";
        }
        if (length == 1) {
            return charSequenceArr[0].toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequenceArr[0]);
        for (int i = 1; i < length; i++) {
            sb.append(charSequence);
            sb.append(charSequenceArr[i]);
        }
        return sb.toString();
    }

    public static java.lang.String replace(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        int i = 0;
        while (true) {
            int indexOf = sb.indexOf(str2, i);
            if (indexOf != -1) {
                sb.replace(indexOf, str2.length() + indexOf, str3);
                i = indexOf + str3.length();
            } else {
                return sb.toString();
            }
        }
    }

    public static java.lang.String replaceFirst(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        int indexOf = sb.indexOf(str2);
        if (indexOf != -1) {
            sb.replace(indexOf, str2.length() + indexOf, str3);
        }
        return sb.toString();
    }

    public static java.lang.String propertyNameToEnvironmentVariableName(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DD_");
        sb.append(toEnvVar(str));
        return sb.toString();
    }

    public static java.lang.String systemPropertyNameToEnvironmentVariableName(java.lang.String str) {
        return str.replace(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, '_').replace('-', '_').toUpperCase(java.util.Locale.US);
    }

    public static java.lang.String propertyNameToSystemPropertyName(java.lang.String str) {
        return com.datadog.trace.api.Config.PREFIX.concat(java.lang.String.valueOf(str));
    }

    public static java.lang.String normalizedHeaderTag(java.lang.String str) {
        if (str.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (java.lang.Character.isWhitespace(charAt)) {
                sb.append('_');
            } else {
                if (i == -1) {
                    i = i3;
                }
                if (java.lang.Character.isLetterOrDigit(charAt) || charAt == '_' || charAt == '-' || charAt == '/') {
                    sb.append(java.lang.Character.toLowerCase(charAt));
                } else {
                    sb.append('_');
                }
                i2 = i3;
            }
        }
        return i == -1 ? "" : sb.substring(i, i2 + 1);
    }

    public static java.lang.String trim(java.lang.String str) {
        return str == null ? "" : str.trim();
    }

    public static java.lang.String sha256(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(digest.length * 2);
        for (byte b : digest) {
            java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static java.lang.String random(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = (char) (java.util.concurrent.ThreadLocalRandom.current().nextInt(26) + 97);
        }
        return new java.lang.String(cArr);
    }
}
