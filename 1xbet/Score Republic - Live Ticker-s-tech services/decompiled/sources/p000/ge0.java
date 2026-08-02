package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ge0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f2710a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f2711b;

    static {
        Charset.forName("US-ASCII");
        f2710a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2711b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0063bi(bArr, 0, 0, false).mo680e(0);
        } catch (if0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2031a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m2032b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
