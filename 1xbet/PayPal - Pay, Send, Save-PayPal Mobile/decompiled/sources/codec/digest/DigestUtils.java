package codec.digest;

/* loaded from: classes7.dex */
public class DigestUtils {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.MessageDigest f2770a;

    @java.lang.Deprecated
    public DigestUtils() {
        this.f2770a = null;
    }

    public static byte[] digest(java.security.MessageDigest messageDigest, byte[] bArr) {
        return messageDigest.digest(bArr);
    }

    public static java.security.MessageDigest getDigest(java.lang.String str) {
        try {
            return java.security.MessageDigest.getInstance(str);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static java.security.MessageDigest getMd2Digest() {
        return getDigest("MD2");
    }

    public static java.security.MessageDigest getMd5Digest() {
        return getDigest("MD5");
    }

    public static java.security.MessageDigest getSha1Digest() {
        return getDigest("SHA-1");
    }

    public static java.security.MessageDigest getSha256Digest() {
        return getDigest("SHA-256");
    }

    public static java.security.MessageDigest getSha384Digest() {
        return getDigest("SHA-384");
    }

    public static java.security.MessageDigest getSha3_224Digest() {
        return getDigest("SHA3-224");
    }

    public static java.security.MessageDigest getSha3_256Digest() {
        return getDigest("SHA3-256");
    }

    public static java.security.MessageDigest getSha3_384Digest() {
        return getDigest("SHA3-384");
    }

    public static java.security.MessageDigest getSha3_512Digest() {
        return getDigest("SHA3-512");
    }

    public static java.security.MessageDigest getSha512Digest() {
        return getDigest("SHA-512");
    }

    @java.lang.Deprecated
    public static java.security.MessageDigest getShaDigest() {
        return getSha1Digest();
    }

    public static boolean isAvailable(java.lang.String str) {
        return getDigest(str, null) != null;
    }

    public static byte[] md2(byte[] bArr) {
        return getMd2Digest().digest(bArr);
    }

    public static java.lang.String md2Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(md2(bArr));
    }

    public static byte[] md5(byte[] bArr) {
        return getMd5Digest().digest(bArr);
    }

    public static java.lang.String md5Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(md5(bArr));
    }

    @java.lang.Deprecated
    public static byte[] sha(byte[] bArr) {
        return sha1(bArr);
    }

    public static byte[] sha1(byte[] bArr) {
        return getSha1Digest().digest(bArr);
    }

    public static java.lang.String sha1Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(sha1(bArr));
    }

    public static byte[] sha256(byte[] bArr) {
        return getSha256Digest().digest(bArr);
    }

    public static java.lang.String sha256Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(sha256(bArr));
    }

    public static byte[] sha384(byte[] bArr) {
        return getSha384Digest().digest(bArr);
    }

    public static java.lang.String sha384Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(sha384(bArr));
    }

    public static byte[] sha3_224(byte[] bArr) {
        return getSha3_224Digest().digest(bArr);
    }

    public static java.lang.String sha3_224Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(sha3_224(str));
    }

    public static byte[] sha3_256(byte[] bArr) {
        return getSha3_256Digest().digest(bArr);
    }

    public static java.lang.String sha3_256Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(sha3_256(str));
    }

    public static byte[] sha3_384(byte[] bArr) {
        return getSha3_384Digest().digest(bArr);
    }

    public static java.lang.String sha3_384Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(sha3_384(str));
    }

    public static byte[] sha3_512(byte[] bArr) {
        return getSha3_512Digest().digest(bArr);
    }

    public static java.lang.String sha3_512Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(sha3_512(str));
    }

    public static byte[] sha512(byte[] bArr) {
        return getSha512Digest().digest(bArr);
    }

    public static java.lang.String sha512Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(sha512(bArr));
    }

    @java.lang.Deprecated
    public static java.lang.String shaHex(byte[] bArr) {
        return sha1Hex(bArr);
    }

    public static java.security.MessageDigest updateDigest(java.security.MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        return messageDigest;
    }

    public java.lang.String digestAsHex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(digest(bArr));
    }

    public java.security.MessageDigest getMessageDigest() {
        return this.f2770a;
    }

    public static byte[] digest(java.security.MessageDigest messageDigest, java.nio.ByteBuffer byteBuffer) {
        messageDigest.update(byteBuffer);
        return messageDigest.digest();
    }

    public static byte[] md2(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getMd2Digest(), inputStream);
    }

    public static java.lang.String md2Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(md2(inputStream));
    }

    public static byte[] md5(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getMd5Digest(), inputStream);
    }

    public static java.lang.String md5Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(md5(inputStream));
    }

    @java.lang.Deprecated
    public static byte[] sha(java.io.InputStream inputStream) throws java.io.IOException {
        return sha1(inputStream);
    }

    public static byte[] sha1(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getSha1Digest(), inputStream);
    }

    public static java.lang.String sha1Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(sha1(inputStream));
    }

    public static byte[] sha256(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getSha256Digest(), inputStream);
    }

    public static java.lang.String sha256Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(sha256(inputStream));
    }

    public static byte[] sha384(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getSha384Digest(), inputStream);
    }

    public static java.lang.String sha384Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(sha384(inputStream));
    }

    public static byte[] sha3_224(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getSha3_224Digest(), inputStream);
    }

    public static java.lang.String sha3_224Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(sha3_224(bArr));
    }

    public static byte[] sha3_256(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getSha3_256Digest(), inputStream);
    }

    public static java.lang.String sha3_256Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(sha3_256(bArr));
    }

    public static byte[] sha3_384(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getSha3_384Digest(), inputStream);
    }

    public static java.lang.String sha3_384Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(sha3_384(bArr));
    }

    public static byte[] sha3_512(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getSha3_512Digest(), inputStream);
    }

    public static java.lang.String sha3_512Hex(byte[] bArr) {
        return codec.binary.Hex.encodeHexString(sha3_512(bArr));
    }

    public static byte[] sha512(java.io.InputStream inputStream) throws java.io.IOException {
        return digest(getSha512Digest(), inputStream);
    }

    public static java.lang.String sha512Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(sha512(inputStream));
    }

    @java.lang.Deprecated
    public static java.lang.String shaHex(java.io.InputStream inputStream) throws java.io.IOException {
        return sha1Hex(inputStream);
    }

    public static java.security.MessageDigest updateDigest(java.security.MessageDigest messageDigest, java.nio.ByteBuffer byteBuffer) {
        messageDigest.update(byteBuffer);
        return messageDigest;
    }

    public java.lang.String digestAsHex(java.nio.ByteBuffer byteBuffer) {
        return codec.binary.Hex.encodeHexString(digest(byteBuffer));
    }

    public DigestUtils(java.security.MessageDigest messageDigest) {
        this.f2770a = messageDigest;
    }

    public static byte[] md2(java.lang.String str) {
        return md2(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String md2Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(md2(str));
    }

    public static byte[] md5(java.lang.String str) {
        return md5(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String md5Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(md5(str));
    }

    @java.lang.Deprecated
    public static byte[] sha(java.lang.String str) {
        return sha1(str);
    }

    public static byte[] sha1(java.lang.String str) {
        return sha1(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String sha1Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(sha1(str));
    }

    public static byte[] sha256(java.lang.String str) {
        return sha256(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String sha256Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(sha256(str));
    }

    public static byte[] sha384(java.lang.String str) {
        return sha384(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String sha384Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(sha384(str));
    }

    public static byte[] sha3_224(java.lang.String str) {
        return sha3_224(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String sha3_224Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(sha3_224(inputStream));
    }

    public static byte[] sha3_256(java.lang.String str) {
        return sha3_256(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String sha3_256Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(sha3_256(inputStream));
    }

    public static byte[] sha3_384(java.lang.String str) {
        return sha3_384(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String sha3_384Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(sha3_384(inputStream));
    }

    public static byte[] sha3_512(java.lang.String str) {
        return sha3_512(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String sha3_512Hex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(sha3_512(inputStream));
    }

    public static byte[] sha512(java.lang.String str) {
        return sha512(codec.binary.StringUtils.getBytesUtf8(str));
    }

    public static java.lang.String sha512Hex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(sha512(str));
    }

    @java.lang.Deprecated
    public static java.lang.String shaHex(java.lang.String str) {
        return sha1Hex(str);
    }

    public static java.security.MessageDigest updateDigest(java.security.MessageDigest messageDigest, java.io.File file) throws java.io.IOException {
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        try {
            java.security.MessageDigest updateDigest = updateDigest(messageDigest, bufferedInputStream);
            bufferedInputStream.close();
            return updateDigest;
        } catch (java.lang.Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public java.lang.String digestAsHex(java.io.File file) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(digest(file));
    }

    public static byte[] digest(java.security.MessageDigest messageDigest, java.io.File file) throws java.io.IOException {
        return updateDigest(messageDigest, file).digest();
    }

    public static java.security.MessageDigest getDigest(java.lang.String str, java.security.MessageDigest messageDigest) {
        try {
            return java.security.MessageDigest.getInstance(str);
        } catch (java.lang.Exception unused) {
            return messageDigest;
        }
    }

    public java.lang.String digestAsHex(java.io.InputStream inputStream) throws java.io.IOException {
        return codec.binary.Hex.encodeHexString(digest(inputStream));
    }

    public DigestUtils(java.lang.String str) {
        this(getDigest(str));
    }

    public static byte[] digest(java.security.MessageDigest messageDigest, java.io.InputStream inputStream) throws java.io.IOException {
        return updateDigest(messageDigest, inputStream).digest();
    }

    public java.lang.String digestAsHex(java.lang.String str) {
        return codec.binary.Hex.encodeHexString(digest(str));
    }

    public byte[] digest(byte[] bArr) {
        return updateDigest(this.f2770a, bArr).digest();
    }

    public static java.security.MessageDigest updateDigest(java.security.MessageDigest messageDigest, java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        while (read >= 0) {
            messageDigest.update(bArr, 0, read);
            read = inputStream.read(bArr, 0, 1024);
        }
        return messageDigest;
    }

    public byte[] digest(java.nio.ByteBuffer byteBuffer) {
        return updateDigest(this.f2770a, byteBuffer).digest();
    }

    public byte[] digest(java.io.File file) throws java.io.IOException {
        return updateDigest(this.f2770a, file).digest();
    }

    public byte[] digest(java.io.InputStream inputStream) throws java.io.IOException {
        return updateDigest(this.f2770a, inputStream).digest();
    }

    public byte[] digest(java.lang.String str) {
        return updateDigest(this.f2770a, str).digest();
    }

    public static java.security.MessageDigest updateDigest(java.security.MessageDigest messageDigest, java.lang.String str) {
        messageDigest.update(codec.binary.StringUtils.getBytesUtf8(str));
        return messageDigest;
    }
}
