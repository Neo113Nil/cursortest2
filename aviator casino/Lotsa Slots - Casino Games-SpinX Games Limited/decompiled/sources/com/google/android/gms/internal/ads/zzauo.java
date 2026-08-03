package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzauo {
    public static long zza(java.nio.ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int zzb(java.nio.ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static int zzc(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static long zzd(java.nio.ByteBuffer byteBuffer) {
        long zza = zza(byteBuffer) << 32;
        if (zza >= 0) {
            return zza + zza(byteBuffer);
        }
        throw new java.lang.RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double zze(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << com.google.common.base.Ascii.CAN;
        int i2 = bArr[1] << com.google.common.base.Ascii.DLE;
        int i3 = bArr[2] << 8;
        return ((((i & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static double zzf(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << com.google.common.base.Ascii.CAN;
        int i2 = bArr[1] << com.google.common.base.Ascii.DLE;
        int i3 = bArr[2] << 8;
        return ((((i & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & 255)) / 1.073741824E9d;
    }
}
