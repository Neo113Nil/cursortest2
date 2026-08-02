package common.emv.util;

/* loaded from: classes17.dex */
public class RandomUtil {
    public static final java.security.SecureRandom sr;

    public static java.lang.String generateRandomInHexString(int i) {
        return common.emv.util.HexUtil.encodeToString(generateRandom(i));
    }

    public static byte[] generateRandom(int i) {
        byte[] bArr = new byte[i];
        sr.nextBytes(bArr);
        return bArr;
    }

    static {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        sr = secureRandom;
        secureRandom.setSeed(java.lang.System.currentTimeMillis());
    }
}
