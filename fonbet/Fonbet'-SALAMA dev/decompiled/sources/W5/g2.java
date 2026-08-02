package W5;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f7224a = Logger.getLogger(g2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7225b = "-bin".getBytes(D3.f.f1717a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i7 = length; i7 < bArr.length; i7++) {
            if (bArr[i7] != bArr2[i7 - length]) {
                return false;
            }
        }
        return true;
    }
}
