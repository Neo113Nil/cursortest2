package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhjp {
    int[] zza;
    private final int zzb;

    public zzhjp(byte[] bArr, int i) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = com.google.android.gms.internal.ads.zzhjn.zzd(bArr);
        this.zzb = i;
    }

    abstract int[] zza(int[] iArr, int i);

    abstract int zzb();

    public final byte[] zzc(byte[] bArr, java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int zzb = zzb();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 36);
            sb.append("The nonce length (in bytes) must be ");
            sb.append(zzb);
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        int remaining = byteBuffer.remaining();
        int i = remaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            java.nio.ByteBuffer zzd = zzd(bArr, this.zzb + i2);
            if (i2 == i) {
                com.google.android.gms.internal.ads.zzhzl.zzc(allocate, byteBuffer, zzd, remaining % 64);
            } else {
                com.google.android.gms.internal.ads.zzhzl.zzc(allocate, byteBuffer, zzd, 64);
            }
        }
        return allocate.array();
    }

    final java.nio.ByteBuffer zzd(byte[] bArr, int i) {
        int[] zza = zza(com.google.android.gms.internal.ads.zzhjn.zzd(bArr), i);
        int[] iArr = (int[]) zza.clone();
        com.google.android.gms.internal.ads.zzhjn.zzb(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            zza[i2] = zza[i2] + iArr[i2];
        }
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(64).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza, 0, 16);
        return order;
    }
}
