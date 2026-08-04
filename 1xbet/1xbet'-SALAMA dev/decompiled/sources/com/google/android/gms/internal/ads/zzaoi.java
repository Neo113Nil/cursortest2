package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class zzaoi {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair zzc(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairZzf = zzf(randomAccessFile, 0);
        return pairZzf != null ? pairZzf : zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j) {
        zzg(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(AbstractC0486a1.g("uint32 value of out range: ", j));
        }
        byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j);
    }

    private static long zze(ByteBuffer byteBuffer, int i7) {
        return ((long) byteBuffer.getInt(i7)) & 4294967295L;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i7) throws IOException {
        int i8;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i7, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        zzg(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i9 = iCapacity - 22;
            int iMin = Math.min(i9, 65535);
            int i10 = 0;
            while (true) {
                if (i10 >= iMin) {
                    i8 = -1;
                    break;
                }
                i8 = i9 - i10;
                if (byteBufferAllocate.getInt(i8) == 101010256 && ((char) byteBufferAllocate.getShort(i8 + 20)) == i10) {
                    break;
                }
                i10++;
            }
        } else {
            i8 = -1;
            break;
        }
        if (i8 == -1) {
            return null;
        }
        byteBufferAllocate.position(i8);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i8)));
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
