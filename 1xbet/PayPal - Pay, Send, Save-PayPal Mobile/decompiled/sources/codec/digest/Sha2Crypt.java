package codec.digest;

/* loaded from: classes7.dex */
public class Sha2Crypt {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f2776a = java.util.regex.Pattern.compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*");

    public static java.lang.String a(byte[] bArr, java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        int i2;
        boolean z;
        byte b;
        byte[] bArr2;
        int i3;
        int length = bArr.length;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Salt must not be null");
        }
        java.util.regex.Matcher matcher = f2776a.matcher(str);
        if (!matcher.find()) {
            throw new java.lang.IllegalArgumentException("Invalid salt value: ".concat(str));
        }
        if (matcher.group(3) != null) {
            i2 = java.lang.Math.max(1000, java.lang.Math.min(org.threeten.bp.Year.MAX_VALUE, java.lang.Integer.parseInt(matcher.group(3))));
            z = true;
        } else {
            i2 = 5000;
            z = false;
        }
        java.lang.String group = matcher.group(4);
        byte[] bytes = group.getBytes(codec.Charsets.UTF_8);
        int length2 = bytes.length;
        java.security.MessageDigest digest = codec.digest.DigestUtils.getDigest(str3);
        digest.update(bArr);
        digest.update(bytes);
        java.security.MessageDigest digest2 = codec.digest.DigestUtils.getDigest(str3);
        digest2.update(bArr);
        digest2.update(bytes);
        digest2.update(bArr);
        byte[] digest3 = digest2.digest();
        int length3 = bArr.length;
        while (length3 > i) {
            digest.update(digest3, 0, i);
            length3 -= i;
        }
        digest.update(digest3, 0, length3);
        for (int length4 = bArr.length; length4 > 0; length4 >>= 1) {
            if ((length4 & 1) != 0) {
                digest.update(digest3, 0, i);
            } else {
                digest.update(bArr);
            }
        }
        byte[] digest4 = digest.digest();
        java.security.MessageDigest digest5 = codec.digest.DigestUtils.getDigest(str3);
        for (int i4 = 1; i4 <= length; i4++) {
            digest5.update(bArr);
        }
        byte[] digest6 = digest5.digest();
        byte[] bArr3 = new byte[length];
        int i5 = 0;
        while (i5 < length - i) {
            java.lang.System.arraycopy(digest6, 0, bArr3, i5, i);
            i5 += i;
        }
        java.lang.System.arraycopy(digest6, 0, bArr3, i5, length - i5);
        java.security.MessageDigest digest7 = codec.digest.DigestUtils.getDigest(str3);
        for (int i6 = 1; i6 <= (digest4[0] & 255) + 16; i6++) {
            digest7.update(bytes);
        }
        byte[] digest8 = digest7.digest();
        byte[] bArr4 = new byte[length2];
        int i7 = 0;
        while (i7 < length2 - i) {
            java.lang.System.arraycopy(digest8, 0, bArr4, i7, i);
            i7 += i;
        }
        java.lang.System.arraycopy(digest8, 0, bArr4, i7, length2 - i7);
        int i8 = 0;
        java.security.MessageDigest messageDigest = digest;
        while (i8 <= i2 - 1) {
            messageDigest = codec.digest.DigestUtils.getDigest(str3);
            int i9 = i8 & 1;
            if (i9 != 0) {
                bArr2 = bytes;
                i3 = 0;
                messageDigest.update(bArr3, 0, length);
            } else {
                bArr2 = bytes;
                i3 = 0;
                messageDigest.update(digest4, 0, i);
            }
            if (i8 % 3 != 0) {
                messageDigest.update(bArr4, i3, length2);
            }
            if (i8 % 7 != 0) {
                messageDigest.update(bArr3, i3, length);
            }
            if (i9 != 0) {
                messageDigest.update(digest4, i3, i);
            } else {
                messageDigest.update(bArr3, i3, length);
            }
            digest4 = messageDigest.digest();
            i8++;
            bytes = bArr2;
        }
        byte[] bArr5 = bytes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2);
        if (z) {
            sb.append("rounds=");
            sb.append(i2);
            sb.append(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        }
        sb.append(group);
        sb.append(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        if (i == 32) {
            com.payair.csdk.b.a(digest4[0], digest4[10], digest4[20], 4, sb);
            com.payair.csdk.b.a(digest4[21], digest4[1], digest4[11], 4, sb);
            com.payair.csdk.b.a(digest4[12], digest4[22], digest4[2], 4, sb);
            com.payair.csdk.b.a(digest4[3], digest4[13], digest4[23], 4, sb);
            com.payair.csdk.b.a(digest4[24], digest4[4], digest4[14], 4, sb);
            com.payair.csdk.b.a(digest4[15], digest4[25], digest4[5], 4, sb);
            com.payair.csdk.b.a(digest4[6], digest4[16], digest4[26], 4, sb);
            com.payair.csdk.b.a(digest4[27], digest4[7], digest4[17], 4, sb);
            com.payair.csdk.b.a(digest4[18], digest4[28], digest4[8], 4, sb);
            com.payair.csdk.b.a(digest4[9], digest4[19], digest4[29], 4, sb);
            com.payair.csdk.b.a((byte) 0, digest4[31], digest4[30], 3, sb);
            b = 0;
        } else {
            com.payair.csdk.b.a(digest4[0], digest4[21], digest4[42], 4, sb);
            com.payair.csdk.b.a(digest4[22], digest4[43], digest4[1], 4, sb);
            com.payair.csdk.b.a(digest4[44], digest4[2], digest4[23], 4, sb);
            com.payair.csdk.b.a(digest4[3], digest4[24], digest4[45], 4, sb);
            com.payair.csdk.b.a(digest4[25], digest4[46], digest4[4], 4, sb);
            com.payair.csdk.b.a(digest4[47], digest4[5], digest4[26], 4, sb);
            com.payair.csdk.b.a(digest4[6], digest4[27], digest4[48], 4, sb);
            com.payair.csdk.b.a(digest4[28], digest4[49], digest4[7], 4, sb);
            com.payair.csdk.b.a(digest4[50], digest4[8], digest4[29], 4, sb);
            com.payair.csdk.b.a(digest4[9], digest4[30], digest4[51], 4, sb);
            com.payair.csdk.b.a(digest4[31], digest4[52], digest4[10], 4, sb);
            com.payair.csdk.b.a(digest4[53], digest4[11], digest4[32], 4, sb);
            com.payair.csdk.b.a(digest4[12], digest4[33], digest4[54], 4, sb);
            com.payair.csdk.b.a(digest4[34], digest4[55], digest4[13], 4, sb);
            com.payair.csdk.b.a(digest4[56], digest4[14], digest4[35], 4, sb);
            com.payair.csdk.b.a(digest4[15], digest4[36], digest4[57], 4, sb);
            com.payair.csdk.b.a(digest4[37], digest4[58], digest4[16], 4, sb);
            com.payair.csdk.b.a(digest4[59], digest4[17], digest4[38], 4, sb);
            com.payair.csdk.b.a(digest4[18], digest4[39], digest4[60], 4, sb);
            com.payair.csdk.b.a(digest4[40], digest4[61], digest4[19], 4, sb);
            com.payair.csdk.b.a(digest4[62], digest4[20], digest4[41], 4, sb);
            b = 0;
            com.payair.csdk.b.a((byte) 0, (byte) 0, digest4[63], 2, sb);
        }
        java.util.Arrays.fill(digest8, b);
        java.util.Arrays.fill(bArr3, b);
        java.util.Arrays.fill(bArr4, b);
        messageDigest.reset();
        digest7.reset();
        java.util.Arrays.fill(bArr, b);
        java.util.Arrays.fill(bArr5, b);
        return sb.toString();
    }

    public static java.lang.String sha256Crypt(byte[] bArr) {
        return sha256Crypt(bArr, null);
    }

    public static java.lang.String sha512Crypt(byte[] bArr) {
        return sha512Crypt(bArr, null);
    }

    public static java.lang.String sha256Crypt(byte[] bArr, java.lang.String str) {
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("$5$");
            char[] cArr = com.payair.csdk.b.f4230a;
            sb.append(com.payair.csdk.b.a(new java.security.SecureRandom()));
            str = sb.toString();
        }
        return a(bArr, str, "$5$", 32, "SHA-256");
    }

    public static java.lang.String sha512Crypt(byte[] bArr, java.lang.String str) {
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("$6$");
            char[] cArr = com.payair.csdk.b.f4230a;
            sb.append(com.payair.csdk.b.a(new java.security.SecureRandom()));
            str = sb.toString();
        }
        return a(bArr, str, "$6$", 64, "SHA-512");
    }

    public static java.lang.String sha256Crypt(byte[] bArr, java.lang.String str, java.util.Random random) {
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("$5$");
            sb.append(com.payair.csdk.b.a(random));
            str = sb.toString();
        }
        return a(bArr, str, "$5$", 32, "SHA-256");
    }

    public static java.lang.String sha512Crypt(byte[] bArr, java.lang.String str, java.util.Random random) {
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("$6$");
            sb.append(com.payair.csdk.b.a(random));
            str = sb.toString();
        }
        return a(bArr, str, "$6$", 64, "SHA-512");
    }
}
