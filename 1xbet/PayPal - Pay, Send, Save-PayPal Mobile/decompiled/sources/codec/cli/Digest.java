package codec.cli;

/* loaded from: classes7.dex */
public class Digest {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2769a;
    public final java.lang.String[] b;
    public final java.lang.String[] c;

    public Digest(java.lang.String[] strArr) {
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("args");
        }
        if (strArr.length == 0) {
            java.lang.String name2 = codec.cli.Digest.class.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Usage: java ");
            sb.append(name2);
            sb.append(" [algorithm] [FILE|DIRECTORY|string] ...");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.b = strArr;
        this.f2769a = strArr[0];
        if (strArr.length <= 1) {
            this.c = null;
            return;
        }
        int length = strArr.length - 1;
        java.lang.String[] strArr2 = new java.lang.String[length];
        this.c = strArr2;
        java.lang.System.arraycopy(strArr, 1, strArr2, 0, length);
    }

    public static void a(java.lang.String str, byte[] bArr, java.lang.String str2) {
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(codec.binary.Hex.encodeHexString(bArr));
        sb.append(str2 != null ? "  ".concat(str2) : "");
        printStream.println(sb.toString());
    }

    public static void main(java.lang.String[] strArr) throws java.io.IOException {
        codec.cli.Digest digest = new codec.cli.Digest(strArr);
        if (!digest.f2769a.equalsIgnoreCase("ALL") && !digest.f2769a.equals("*")) {
            java.security.MessageDigest digest2 = codec.digest.DigestUtils.getDigest(digest.f2769a, null);
            if (digest2 != null) {
                digest.a("", digest2);
                return;
            } else {
                digest.a("", codec.digest.DigestUtils.getDigest(digest.f2769a.toUpperCase(java.util.Locale.ROOT)));
                return;
            }
        }
        for (java.lang.String str : codec.digest.MessageDigestAlgorithms.values()) {
            if (codec.digest.DigestUtils.isAvailable(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" ");
                digest.a(sb.toString(), codec.digest.DigestUtils.getDigest(str));
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String obj = super.toString();
        java.lang.String arrays = java.util.Arrays.toString(this.b);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(obj);
        sb.append(" ");
        sb.append(arrays);
        return sb.toString();
    }

    public final void a(java.lang.String str, java.security.MessageDigest messageDigest) {
        java.lang.String[] strArr = this.c;
        if (strArr == null) {
            a(str, codec.digest.DigestUtils.digest(messageDigest, java.lang.System.in), null);
            return;
        }
        for (java.lang.String str2 : strArr) {
            java.io.File file = new java.io.File(str2);
            if (file.isFile()) {
                a(str, codec.digest.DigestUtils.digest(messageDigest, file), str2);
            } else if (file.isDirectory()) {
                java.io.File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (java.io.File file2 : listFiles) {
                        if (file2.isFile()) {
                            a(str, codec.digest.DigestUtils.digest(messageDigest, file2), file2.getName());
                        }
                    }
                }
            } else {
                a(str, codec.digest.DigestUtils.digest(messageDigest, str2.getBytes(java.nio.charset.Charset.defaultCharset())), null);
            }
        }
    }
}
