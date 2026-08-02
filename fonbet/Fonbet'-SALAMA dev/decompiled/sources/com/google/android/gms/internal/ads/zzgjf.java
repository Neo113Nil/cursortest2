package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes.dex */
abstract class zzgjf {
    private final zzgjd zza;
    private final zzgjd zzb;

    public zzgjf(byte[] bArr) {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zza(bArr, 1);
        this.zzb = zza(bArr, 0);
    }

    public abstract zzgjd zza(byte[] bArr, int i7);

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
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
            this.zzb.zzc(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i7 = length & 15;
            int i8 = i7 == 0 ? length : (length + 16) - i7;
            int remaining = byteBuffer.remaining();
            int i9 = remaining % 16;
            int i10 = (i9 == 0 ? remaining : (remaining + 16) - i9) + i8;
            ByteBuffer order = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i8);
            order.put(byteBuffer);
            order.position(i10);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(zzgjj.zza(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            return this.zza.zzd(bArr, byteBuffer);
        } catch (GeneralSecurityException e7) {
            throw new AEADBadTagException(e7.toString());
        }
    }
}
