package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzasl {
    static android.util.Pair zza(java.io.RandomAccessFile randomAccessFile) throws java.io.IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        android.util.Pair zze = zze(randomAccessFile, 0);
        return zze != null ? zze : zze(randomAccessFile, 65535);
    }

    public static long zzb(java.nio.ByteBuffer byteBuffer) {
        zzf(byteBuffer);
        return zzg(byteBuffer, byteBuffer.position() + 16);
    }

    public static void zzc(java.nio.ByteBuffer byteBuffer, long j) {
        zzf(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j >= 0 && j <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 27);
        sb.append("uint32 value of out range: ");
        sb.append(j);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static long zzd(java.nio.ByteBuffer byteBuffer) {
        zzf(byteBuffer);
        return zzg(byteBuffer, byteBuffer.position() + 12);
    }

    private static android.util.Pair zze(java.io.RandomAccessFile randomAccessFile, int i) throws java.io.IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(((int) java.lang.Math.min(i, (-22) + length)) + 22);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        zzf(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = java.lang.Math.min(i3, 65535);
            for (int i4 = 0; i4 < min; i4++) {
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        java.nio.ByteBuffer slice = allocate.slice();
        slice.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return android.util.Pair.create(slice, java.lang.Long.valueOf(capacity + i2));
    }

    private static void zzf(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long zzg(java.nio.ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }
}
