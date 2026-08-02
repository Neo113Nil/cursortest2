package org.apache.commons.codec.digest;

/* loaded from: classes17.dex */
public class Crypt {
    public static java.lang.String crypt(byte[] bArr) {
        return crypt(bArr, (java.lang.String) null);
    }

    public static java.lang.String crypt(byte[] bArr, java.lang.String str) {
        if (str == null) {
            return org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(bArr);
        }
        if (str.startsWith("$6$")) {
            return org.apache.commons.codec.digest.Sha2Crypt.sha512Crypt(bArr, str);
        }
        if (str.startsWith("$5$")) {
            return org.apache.commons.codec.digest.Sha2Crypt.sha256Crypt(bArr, str);
        }
        if (str.startsWith("$1$")) {
            return org.apache.commons.codec.digest.Md5Crypt.md5Crypt(bArr, str);
        }
        return org.apache.commons.codec.digest.UnixCrypt.crypt(bArr, str);
    }

    public static java.lang.String crypt(java.lang.String str) {
        return crypt(str, (java.lang.String) null);
    }

    public static java.lang.String crypt(java.lang.String str, java.lang.String str2) {
        return crypt(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2);
    }

    @java.lang.Deprecated
    public Crypt() {
    }
}
