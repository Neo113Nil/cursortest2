package codec.digest;

/* loaded from: classes7.dex */
public class Md5Crypt {
    public static java.lang.String apr1Crypt(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$apr1$");
        char[] cArr = com.payair.csdk.b.f4230a;
        sb.append(com.payair.csdk.b.a(new java.security.SecureRandom()));
        return apr1Crypt(bArr, sb.toString());
    }

    public static java.lang.String md5Crypt(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$1$");
        char[] cArr = com.payair.csdk.b.f4230a;
        sb.append(com.payair.csdk.b.a(new java.security.SecureRandom()));
        return md5Crypt(bArr, sb.toString());
    }

    public static java.lang.String apr1Crypt(byte[] bArr, java.util.Random random) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$apr1$");
        sb.append(com.payair.csdk.b.a(random));
        return apr1Crypt(bArr, sb.toString());
    }

    public static java.lang.String md5Crypt(byte[] bArr, java.util.Random random) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$1$");
        sb.append(com.payair.csdk.b.a(random));
        return md5Crypt(bArr, sb.toString());
    }

    public static java.lang.String apr1Crypt(byte[] bArr, java.lang.String str) {
        if (str != null && !str.startsWith("$apr1$")) {
            str = "$apr1$".concat(str);
        }
        return md5Crypt(bArr, str, "$apr1$");
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
            group = com.payair.csdk.b.a(random);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("^");
            sb.append(str2.replace(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD, "\\$"));
            sb.append("([\\.\\/a-zA-Z0-9]{1,8}).*");
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(sb.toString()).matcher(str);
            if (matcher.find()) {
                group = matcher.group(1);
            } else {
                throw new java.lang.IllegalArgumentException("Invalid salt value: ".concat(str));
            }
        }
        java.nio.charset.Charset charset = codec.Charsets.UTF_8;
        byte[] bytes = group.getBytes(charset);
        java.security.MessageDigest md5Digest = codec.digest.DigestUtils.getMd5Digest();
        md5Digest.update(bArr);
        md5Digest.update(str2.getBytes(charset));
        md5Digest.update(bytes);
        java.security.MessageDigest md5Digest2 = codec.digest.DigestUtils.getMd5Digest();
        md5Digest2.update(bArr);
        md5Digest2.update(bytes);
        md5Digest2.update(bArr);
        byte[] digest = md5Digest2.digest();
        int i = length;
        while (true) {
            int i2 = 16;
            if (i <= 0) {
                break;
            }
            if (i <= 16) {
                i2 = i;
            }
            md5Digest.update(digest, 0, i2);
            i -= 16;
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
        for (int i3 = 0; i3 < 1000; i3++) {
            md5Digest2 = codec.digest.DigestUtils.getMd5Digest();
            int i4 = i3 & 1;
            if (i4 != 0) {
                md5Digest2.update(bArr);
            } else {
                md5Digest2.update(digest2, 0, 16);
            }
            if (i3 % 3 != 0) {
                md5Digest2.update(bytes);
            }
            if (i3 % 7 != 0) {
                md5Digest2.update(bArr);
            }
            if (i4 != 0) {
                md5Digest2.update(digest2, 0, 16);
            } else {
                md5Digest2.update(bArr);
            }
            digest2 = md5Digest2.digest();
        }
        com.payair.csdk.b.a(digest2[0], digest2[6], digest2[12], 4, sb3);
        com.payair.csdk.b.a(digest2[1], digest2[7], digest2[13], 4, sb3);
        com.payair.csdk.b.a(digest2[2], digest2[8], digest2[14], 4, sb3);
        com.payair.csdk.b.a(digest2[3], digest2[9], digest2[15], 4, sb3);
        com.payair.csdk.b.a(digest2[4], digest2[10], digest2[5], 4, sb3);
        com.payair.csdk.b.a((byte) 0, (byte) 0, digest2[11], 2, sb3);
        md5Digest.reset();
        md5Digest2.reset();
        java.util.Arrays.fill(bArr, (byte) 0);
        java.util.Arrays.fill(bytes, (byte) 0);
        java.util.Arrays.fill(digest2, (byte) 0);
        return sb3.toString();
    }

    public static java.lang.String apr1Crypt(java.lang.String str) {
        return apr1Crypt(str.getBytes(codec.Charsets.UTF_8));
    }

    public static java.lang.String apr1Crypt(java.lang.String str, java.lang.String str2) {
        return apr1Crypt(str.getBytes(codec.Charsets.UTF_8), str2);
    }
}
