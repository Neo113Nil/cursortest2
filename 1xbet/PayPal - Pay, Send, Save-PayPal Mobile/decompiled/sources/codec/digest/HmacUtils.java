package codec.digest;

/* loaded from: classes7.dex */
public final class HmacUtils {

    /* renamed from: a, reason: collision with root package name */
    public final javax.crypto.Mac f2772a;

    @java.lang.Deprecated
    public HmacUtils() {
        this.f2772a = null;
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacMd5(byte[] bArr) {
        return getInitializedMac(codec.digest.HmacAlgorithms.HMAC_MD5, bArr);
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacSha1(byte[] bArr) {
        return getInitializedMac(codec.digest.HmacAlgorithms.HMAC_SHA_1, bArr);
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacSha256(byte[] bArr) {
        return getInitializedMac(codec.digest.HmacAlgorithms.HMAC_SHA_256, bArr);
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacSha384(byte[] bArr) {
        return getInitializedMac(codec.digest.HmacAlgorithms.HMAC_SHA_384, bArr);
    }

    @java.lang.Deprecated
    public static javax.crypto.Mac getHmacSha512(byte[] bArr) {
        return getInitializedMac(codec.digest.HmacAlgorithms.HMAC_SHA_512, bArr);
    }

    public static javax.crypto.Mac getInitializedMac(codec.digest.HmacAlgorithms hmacAlgorithms, byte[] bArr) {
        return getInitializedMac(hmacAlgorithms.getName(), bArr);
    }

    @java.lang.Deprecated
    public static byte[] hmacMd5(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_MD5, bArr).hmac(bArr2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacMd5Hex(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_MD5, bArr).hmacHex(bArr2);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha1(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_1, bArr).hmac(bArr2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha1Hex(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_1, bArr).hmacHex(bArr2);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha256(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_256, bArr).hmac(bArr2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha256Hex(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_256, bArr).hmacHex(bArr2);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha384(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_384, bArr).hmac(bArr2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha384Hex(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_384, bArr).hmacHex(bArr2);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha512(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_512, bArr).hmac(bArr2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha512Hex(byte[] bArr, byte[] bArr2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_512, bArr).hmacHex(bArr2);
    }

    public static boolean isAvailable(java.lang.String str) {
        try {
            javax.crypto.Mac.getInstance(str);
            return true;
        } catch (java.security.NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public static javax.crypto.Mac updateHmac(javax.crypto.Mac mac, byte[] bArr) {
        mac.reset();
        mac.update(bArr);
        return mac;
    }

    public final byte[] hmac(byte[] bArr) {
        return this.f2772a.doFinal(bArr);
    }

    public final java.lang.String hmacHex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(hmac(bArr));
    }

    public static javax.crypto.Mac getInitializedMac(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("Null key");
        }
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, str);
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(str);
            mac.init(secretKeySpec);
            return mac;
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    @java.lang.Deprecated
    public static byte[] hmacMd5(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_MD5, bArr).hmac(inputStream);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacMd5Hex(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_MD5, bArr).hmacHex(inputStream);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha1(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_1, bArr).hmac(inputStream);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha1Hex(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_1, bArr).hmacHex(inputStream);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha256(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_256, bArr).hmac(inputStream);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha256Hex(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_256, bArr).hmacHex(inputStream);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha384(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_384, bArr).hmac(inputStream);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha384Hex(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_384, bArr).hmacHex(inputStream);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha512(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_512, bArr).hmac(inputStream);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha512Hex(byte[] bArr, java.io.InputStream inputStream) throws java.io.IOException {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_512, bArr).hmacHex(inputStream);
    }

    public static boolean isAvailable(codec.digest.HmacAlgorithms hmacAlgorithms) {
        try {
            javax.crypto.Mac.getInstance(hmacAlgorithms.getName());
            return true;
        } catch (java.security.NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public final byte[] hmac(java.lang.String str) {
        return this.f2772a.doFinal(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public final java.lang.String hmacHex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(hmac(str));
    }

    public HmacUtils(java.lang.String str, byte[] bArr) {
        this.f2772a = getInitializedMac(str, bArr);
    }

    @java.lang.Deprecated
    public static byte[] hmacMd5(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_MD5, str).hmac(str2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacMd5Hex(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_MD5, str).hmacHex(str2);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha1(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_1, str).hmac(str2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha1Hex(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_1, str).hmacHex(str2);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha256(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_256, str).hmac(str2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha256Hex(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_256, str).hmacHex(str2);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha384(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_384, str).hmac(str2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha384Hex(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_384, str).hmacHex(str2);
    }

    @java.lang.Deprecated
    public static byte[] hmacSha512(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_512, str).hmac(str2);
    }

    @java.lang.Deprecated
    public static java.lang.String hmacSha512Hex(java.lang.String str, java.lang.String str2) {
        return new codec.digest.HmacUtils(codec.digest.HmacAlgorithms.HMAC_SHA_512, str).hmacHex(str2);
    }

    public static javax.crypto.Mac updateHmac(javax.crypto.Mac mac, java.io.InputStream inputStream) throws java.io.IOException {
        mac.reset();
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        while (read >= 0) {
            mac.update(bArr, 0, read);
            read = inputStream.read(bArr, 0, 1024);
        }
        return mac;
    }

    public final byte[] hmac(java.nio.ByteBuffer byteBuffer) {
        this.f2772a.update(byteBuffer);
        return this.f2772a.doFinal();
    }

    public final java.lang.String hmacHex(java.nio.ByteBuffer byteBuffer) {
        return codec.binary.Hex.encodeHexString(hmac(byteBuffer));
    }

    public final java.lang.String hmacHex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(hmac(inputStream));
    }

    public final byte[] hmac(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read >= 0) {
                this.f2772a.update(bArr, 0, read);
            } else {
                return this.f2772a.doFinal();
            }
        }
    }

    public final java.lang.String hmacHex(java.io.File file) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(hmac(file));
    }

    public HmacUtils(java.lang.String str, java.lang.String str2) {
        this(str, codec.binary.StringUtils.getBytesUtf8(str2));
    }

    public HmacUtils(codec.digest.HmacAlgorithms hmacAlgorithms, java.lang.String str) {
        this(hmacAlgorithms.getName(), codec.binary.StringUtils.getBytesUtf8(str));
    }

    public HmacUtils(codec.digest.HmacAlgorithms hmacAlgorithms, byte[] bArr) {
        this(hmacAlgorithms.getName(), bArr);
    }

    public static javax.crypto.Mac updateHmac(javax.crypto.Mac mac, java.lang.String str) {
        mac.reset();
        mac.update(codec.binary.StringUtils.getBytesUtf8(str));
        return mac;
    }

    public final byte[] hmac(java.io.File file) throws java.io.IOException {
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        try {
            byte[] hmac = hmac(bufferedInputStream);
            bufferedInputStream.close();
            return hmac;
        } catch (java.lang.Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
