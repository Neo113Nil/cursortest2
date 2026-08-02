package codec.digest;

/* loaded from: classes7.dex */
public class Crypt {
    public static java.lang.String crypt(byte[] bArr) {
        return crypt(bArr, (java.lang.String) null);
    }

    public static java.lang.String crypt(byte[] bArr, java.lang.String str) {
        return str == null ? codec.digest.Sha2Crypt.sha512Crypt(bArr) : str.startsWith("$6$") ? codec.digest.Sha2Crypt.sha512Crypt(bArr, str) : str.startsWith("$5$") ? codec.digest.Sha2Crypt.sha256Crypt(bArr, str) : str.startsWith("$1$") ? codec.digest.Md5Crypt.md5Crypt(bArr, str) : codec.digest.UnixCrypt.crypt(bArr, str);
    }

    public static java.lang.String crypt(java.lang.String str) {
        return crypt(str, (java.lang.String) null);
    }

    public static java.lang.String crypt(java.lang.String str, java.lang.String str2) {
        return crypt(str.getBytes(codec.Charsets.UTF_8), str2);
    }
}
