package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
abstract class zzgjd {
    int[] zza;
    private final int zzb;

    public zzgjd(byte[] bArr, int i7) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgjb.zze(bArr);
        this.zzb = i7;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i7);

    public final ByteBuffer zzc(byte[] bArr, int i7) {
        int[] iArrZzb = zzb(zzgjb.zze(bArr), i7);
        int[] iArr = (int[]) iArrZzb.clone();
        zzgjb.zzc(iArr);
        for (int i8 = 0; i8 < 16; i8++) {
            iArrZzb[i8] = iArrZzb[i8] + iArr[i8];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException(k.d(zza(), "The nonce length (in bytes) must be "));
        }
        int iRemaining = byteBuffer.remaining();
        int i7 = iRemaining / 64;
        for (int i8 = 0; i8 < i7 + 1; i8++) {
            ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i8);
            if (i8 == i7) {
                zzgud.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, iRemaining % 64);
            } else {
                zzgud.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, 64);
            }
        }
        return byteBufferAllocate.array();
    }
}
