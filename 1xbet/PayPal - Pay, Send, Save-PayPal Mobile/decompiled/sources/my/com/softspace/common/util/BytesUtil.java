package my.com.softspace.common.util;

/* loaded from: classes17.dex */
public class BytesUtil {
    public static void clearBuffer(byte[] bArr) {
        if (bArr != null) {
            java.util.Arrays.fill(bArr, (byte) 0);
        }
    }
}
