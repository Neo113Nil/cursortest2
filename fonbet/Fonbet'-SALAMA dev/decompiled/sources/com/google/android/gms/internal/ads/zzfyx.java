package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes.dex */
public final class zzfyx {
    static {
        new zzfyv();
    }

    public static InputStream zza(InputStream inputStream, long j) {
        return new zzfyw(inputStream, j);
    }

    public static byte[] zzb(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i7 = 0;
        while (i7 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i7);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i8 = 0;
            while (i8 < min2) {
                int read = inputStream.read(bArr, i8, min2 - i8);
                if (read == -1) {
                    return zzc(arrayDeque, i7);
                }
                i8 += read;
                i7 += read;
            }
            min = zzfzk.zze(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzc(Queue queue, int i7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i7) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        int i8 = i7 - length;
        while (i8 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i8, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i7 - i8, min);
            i8 -= min;
        }
        return copyOf;
    }
}
