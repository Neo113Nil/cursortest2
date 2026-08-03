package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbfx extends com.google.android.gms.internal.ads.zzbfs {
    private java.security.MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final byte[] zza(java.lang.String str) {
        byte[] bArr;
        byte[] bArr2;
        java.lang.String[] split = str.split(io.ktor.sse.ServerSentEventKt.SPACE);
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int zza = com.google.android.gms.internal.ads.zzbfw.zza(split[0]);
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int zza2 = com.google.android.gms.internal.ads.zzbfw.zza(split[i2]);
                    int i3 = (zza2 >> 16) ^ ((char) zza2);
                    byte b = (byte) i3;
                    byte b2 = (byte) (i3 >> 8);
                    int i4 = i2 + i2;
                    bArr[i4] = new byte[]{b, b2}[0];
                    bArr[i4 + 1] = b2;
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int zza3 = com.google.android.gms.internal.ads.zzbfw.zza(split[i5]);
                    bArr[i5] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            java.security.MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArr2);
            byte[] digest = this.zzb.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr3 = new byte[i];
            java.lang.System.arraycopy(digest, 0, bArr3, 0, i);
            return bArr3;
        }
    }
}
