package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class Sv {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11600a = 0;

    static {
        new Rv();
    }

    public static byte[] a(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i5 = 0;
            while (i5 < min2) {
                int read = inputStream.read(bArr, i5, min2 - i5);
                if (read == -1) {
                    return b(arrayDeque, i);
                }
                i5 += read;
                i += read;
            }
            min = AbstractC1400ot.T(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] b(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i);
        int i5 = i - length;
        while (i5 > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(i5, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - i5, min);
            i5 -= min;
        }
        return copyOf;
    }
}
