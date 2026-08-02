package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class zzazd extends zzayy {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzayy
    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i7 = 4;
        if (length == 1) {
            int zza = zzazc.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i8 = 0; i8 < split.length; i8++) {
                    int zza2 = zzazc.zza(split[i8]);
                    int i9 = (zza2 >> 16) ^ ((char) zza2);
                    byte b7 = (byte) i9;
                    byte b8 = (byte) (i9 >> 8);
                    int i10 = i8 + i8;
                    bArr[i10] = new byte[]{b7, b8}[0];
                    bArr[i10 + 1] = b8;
                }
            } else {
                bArr = new byte[length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int zza3 = zzazc.zza(split[i11]);
                    bArr[i11] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArr2);
                byte[] digest = this.zzb.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i7 = length2;
                }
                byte[] bArr3 = new byte[i7];
                System.arraycopy(digest, 0, bArr3, 0, i7);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
