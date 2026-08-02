package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzadq {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i7;
        if ((byteBuffer.get(5) & 2) == 0) {
            i7 = 0;
        } else {
            byte b7 = byteBuffer.get(26);
            int i8 = 28;
            int i9 = 28;
            for (int i10 = 0; i10 < b7; i10++) {
                i9 += byteBuffer.get(i10 + 27);
            }
            byte b8 = byteBuffer.get(i9 + 26);
            for (int i11 = 0; i11 < b8; i11++) {
                i8 += byteBuffer.get(i9 + 27 + i11);
            }
            i7 = i9 + i8;
        }
        int i12 = byteBuffer.get(i7 + 26) + 27 + i7;
        return (int) ((zzg(byteBuffer.get(i12), byteBuffer.limit() - i12 > 1 ? byteBuffer.get(i12 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zze(byte[] bArr) {
        long zza = zza(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzi(zzh(zza)));
        arrayList.add(zzi(zzh(3840L)));
        return arrayList;
    }

    public static boolean zzf(long j, long j3) {
        return j - j3 <= zzh(3840L) / 1000;
    }

    private static long zzg(byte b7, byte b8) {
        int i7;
        int i8 = b7 & 255;
        int i9 = b7 & 3;
        if (i9 != 0) {
            i7 = 2;
            if (i9 != 1 && i9 != 2) {
                i7 = b8 & 63;
            }
        } else {
            i7 = 1;
        }
        int i10 = i8 >> 3;
        return i7 * (i10 >= 16 ? 2500 << r6 : i10 >= 12 ? 10000 << (i10 & 1) : (i10 & 3) == 3 ? 60000 : 10000 << r6);
    }

    private static long zzh(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] zzi(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
