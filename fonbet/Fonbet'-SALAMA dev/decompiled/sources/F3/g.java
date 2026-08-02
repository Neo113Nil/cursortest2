package F3;

import b6.C0789a;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class g {
    static {
        new f();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i7) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i7 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(C0789a c0789a) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i7 = 0;
        while (i7 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i7);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i8 = 0;
            while (i8 < min2) {
                int read = c0789a.read(bArr, i8, min2 - i8);
                if (read == -1) {
                    return a(arrayDeque, i7);
                }
                i8 += read;
                i7 += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (c0789a.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
