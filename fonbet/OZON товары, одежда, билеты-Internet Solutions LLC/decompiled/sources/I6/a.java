package I6;

import L6.c;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<byte[]> f11998b = new ThreadLocal<>();

    public final boolean a(String str) throws IOException {
        if (!TextUtils.isEmpty(str) && str.length() == 4) {
            int b11 = b();
            for (int i11 = 0; i11 < 4; i11++) {
                if (((b11 >> (i11 * 8)) & 255) == str.charAt(i11)) {
                }
            }
            return true;
        }
        return false;
    }

    public final int b() throws IOException {
        ThreadLocal<byte[]> threadLocal = f11998b;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[4];
            threadLocal.set(bArr);
        }
        read(bArr, 0, 4);
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
    }

    public final int d() throws IOException {
        ThreadLocal<byte[]> threadLocal = f11998b;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[4];
            threadLocal.set(bArr);
        }
        read(bArr, 0, 4);
        return ((bArr[0] & 255) << 24) | (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
    }

    public final short e() throws IOException {
        ThreadLocal<byte[]> threadLocal = f11998b;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[4];
            threadLocal.set(bArr);
        }
        read(bArr, 0, 2);
        return (short) (((bArr[0] & 255) << 8) | (bArr[1] & 255));
    }
}
