package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgzm {
    public static final /* synthetic */ int zza = 0;

    static {
        new com.google.android.gms.internal.ads.zzgzk();
    }

    public static java.io.InputStream zzb(java.io.InputStream inputStream, long j) {
        return new com.google.android.gms.internal.ads.zzgzl(inputStream, j);
    }

    private static byte[] zzc(java.util.Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = java.lang.Math.min(i2, bArr2.length);
            java.lang.System.arraycopy(bArr2, 0, copyOf, i - i2, min);
            i2 -= min;
        }
        return copyOf;
    }

    public static byte[] zza(java.io.InputStream inputStream) throws java.io.IOException {
        inputStream.getClass();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(20);
        int highestOneBit = java.lang.Integer.highestOneBit(0);
        int min = java.lang.Math.min(8192, java.lang.Math.max(128, highestOneBit + highestOneBit));
        int i = 0;
        while (i < 2147483639) {
            int min2 = java.lang.Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return zzc(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            min = com.google.android.gms.internal.ads.zzhah.zzb(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }
}
