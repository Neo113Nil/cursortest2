package org.apache.commons.codec.digest;

/* loaded from: classes17.dex */
public class Md5Crypt {
    public static java.lang.String apr1Crypt(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$apr1$");
        sb.append(org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap());
        return apr1Crypt(bArr, sb.toString());
    }

    public static java.lang.String apr1Crypt(byte[] bArr, java.util.Random random) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$apr1$");
        sb.append(org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap(8, random));
        return apr1Crypt(bArr, sb.toString());
    }

    public static java.lang.String apr1Crypt(byte[] bArr, java.lang.String str) {
        if (str != null && !str.startsWith("$apr1$")) {
            str = "$apr1$".concat(java.lang.String.valueOf(str));
        }
        return md5Crypt(bArr, str, "$apr1$");
    }

    public static java.lang.String apr1Crypt(java.lang.String str) {
        return apr1Crypt(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public static java.lang.String apr1Crypt(java.lang.String str, java.lang.String str2) {
        return apr1Crypt(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2);
    }

    public static java.lang.String md5Crypt(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$1$");
        sb.append(org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap());
        return md5Crypt(bArr, sb.toString());
    }

    public static java.lang.String md5Crypt(byte[] bArr, java.util.Random random) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$1$");
        sb.append(org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap(8, random));
        return md5Crypt(bArr, sb.toString());
    }

    public static java.lang.String md5Crypt(byte[] bArr, java.lang.String str) {
        return md5Crypt(bArr, str, "$1$");
    }

    public static java.lang.String md5Crypt(byte[] bArr, java.lang.String str, java.lang.String str2) {
        return md5Crypt(bArr, str, str2, new java.security.SecureRandom());
    }

    public static java.lang.String md5Crypt(byte[] bArr, java.lang.String str, java.lang.String str2, java.util.Random random) {
        java.lang.String group;
        int length = bArr.length;
        if (str == null) {
            group = org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap(8, random);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("^");
            sb.append(str2.replace(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, "\\$"));
            sb.append("([\\.\\/a-zA-Z0-9]{1,8}).*");
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(sb.toString()).matcher(str);
            if (!matcher.find()) {
                throw new java.lang.IllegalArgumentException("Invalid salt value: ".concat(java.lang.String.valueOf(str)));
            }
            group = matcher.group(1);
        }
        byte[] bytes = group.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        java.security.MessageDigest md5Digest = org.apache.commons.codec.digest.DigestUtils.getMd5Digest();
        md5Digest.update(bArr);
        md5Digest.update(str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        md5Digest.update(bytes);
        java.security.MessageDigest md5Digest2 = org.apache.commons.codec.digest.DigestUtils.getMd5Digest();
        md5Digest2.update(bArr);
        md5Digest2.update(bytes);
        md5Digest2.update(bArr);
        byte[] digest = md5Digest2.digest();
        for (int i = length; i > 0; i -= 16) {
            md5Digest.update(digest, 0, java.lang.Math.min(i, 16));
        }
        java.util.Arrays.fill(digest, (byte) 0);
        while (length > 0) {
            if ((length & 1) == 1) {
                md5Digest.update(digest[0]);
            } else {
                md5Digest.update(bArr[0]);
            }
            length >>= 1;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append(group);
        sb2.append(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.toString());
        byte[] digest2 = md5Digest.digest();
        for (int i2 = 0; i2 < 1000; i2++) {
            md5Digest2 = org.apache.commons.codec.digest.DigestUtils.getMd5Digest();
            int i3 = i2 & 1;
            if (i3 != 0) {
                md5Digest2.update(bArr);
            } else {
                md5Digest2.update(digest2, 0, 16);
            }
            if (i2 % 3 != 0) {
                md5Digest2.update(bytes);
            }
            if (i2 % 7 != 0) {
                md5Digest2.update(bArr);
            }
            if (i3 != 0) {
                md5Digest2.update(digest2, 0, 16);
            } else {
                md5Digest2.update(bArr);
            }
            digest2 = md5Digest2.digest();
        }
        org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap(digest2[0], digest2[6], digest2[12], 4, sb3);
        org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap(digest2[1], digest2[7], digest2[13], 4, sb3);
        org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap(digest2[2], digest2[8], digest2[14], 4, sb3);
        org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap(digest2[3], digest2[9], digest2[15], 4, sb3);
        org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap(digest2[4], digest2[10], digest2[5], 4, sb3);
        org.apache.commons.codec.digest.B64.Camera2StreamConfigurationMap((byte) 0, (byte) 0, digest2[11], 2, sb3);
        md5Digest.reset();
        md5Digest2.reset();
        java.util.Arrays.fill(bArr, (byte) 0);
        java.util.Arrays.fill(bytes, (byte) 0);
        java.util.Arrays.fill(digest2, (byte) 0);
        return sb3.toString();
    }

    @java.lang.Deprecated
    public Md5Crypt() {
    }
}
