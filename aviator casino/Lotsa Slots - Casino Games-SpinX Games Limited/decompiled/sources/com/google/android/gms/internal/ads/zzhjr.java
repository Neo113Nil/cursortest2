package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhjr {
    private final com.google.android.gms.internal.ads.zzhjp zza;
    private final com.google.android.gms.internal.ads.zzhjp zzb;

    public zzhjr(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zza(bArr, 1);
        this.zzb = zza(bArr, 0);
    }

    abstract com.google.android.gms.internal.ads.zzhjp zza(byte[] bArr, int i) throws java.security.InvalidKeyException;

    public final byte[] zzb(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.zzb.zzd(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int remaining = byteBuffer.remaining();
            int i3 = remaining % 16;
            int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
            java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(i4 + 16).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i2);
            order.put(byteBuffer);
            order.position(i4);
            order.putLong(length);
            order.putLong(remaining);
            if (!java.security.MessageDigest.isEqual(com.google.android.gms.internal.ads.zzhjv.zza(bArr4, order.array()), bArr3)) {
                throw new java.security.GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            return this.zza.zzc(bArr, byteBuffer);
        } catch (java.security.GeneralSecurityException e) {
            throw new javax.crypto.AEADBadTagException(e.toString());
        }
    }
}
