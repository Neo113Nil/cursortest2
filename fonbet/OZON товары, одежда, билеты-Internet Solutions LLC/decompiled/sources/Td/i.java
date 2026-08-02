package Td;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f27091a;

    /* loaded from: classes.dex */
    public interface a {
        int getNumber();
    }

    /* loaded from: classes.dex */
    public interface b<T extends a> {
    }

    static {
        byte[] bArr = new byte[0];
        f27091a = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return x.d(bArr, 0, bArr.length) == 0;
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }
}
