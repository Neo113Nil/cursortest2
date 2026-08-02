package com.google.android.gms.internal.ads;

import e1.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class zzgjd {
    int[] zza;
    private final int zzb;

    public zzgjd(byte[] bArr, int i7) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgjb.zze(bArr);
        this.zzb = i7;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i7);

    public final ByteBuffer zzc(byte[] bArr, int i7) {
        int[] zzb = zzb(zzgjb.zze(bArr), i7);
        int[] iArr = (int[]) zzb.clone();
        zzgjb.zzc(iArr);
        for (int i8 = 0; i8 < 16; i8++) {
            zzb[i8] = zzb[i8] + iArr[i8];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException(k.d(zza(), "The nonce length (in bytes) must be "));
        }
        int remaining = byteBuffer.remaining();
        int i7 = remaining / 64;
        for (int i8 = 0; i8 < i7 + 1; i8++) {
            ByteBuffer zzc = zzc(bArr, this.zzb + i8);
            if (i8 == i7) {
                zzgud.zza(allocate, byteBuffer, zzc, remaining % 64);
            } else {
                zzgud.zza(allocate, byteBuffer, zzc, 64);
            }
        }
        return allocate.array();
    }
}
