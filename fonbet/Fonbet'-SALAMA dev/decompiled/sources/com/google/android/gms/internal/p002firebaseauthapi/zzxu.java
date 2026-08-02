package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzxu implements zzbg {
    private final zzho zza;
    private final byte[] zzb;

    private zzxu(byte[] bArr, byte[] bArr2) {
        this.zza = new zzho(bArr);
        this.zzb = bArr2;
    }

    public static zzbg zza(zzee zzeeVar) {
        return new zzxu(zzeeVar.zzd().zza(zzbq.zza()), zzeeVar.zzc().zzb());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.zza.zza(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] zza = zzpe.zza(12);
        allocate.put(zza);
        this.zza.zza(allocate, zza, bArr, bArr2);
        byte[] array = allocate.array();
        byte[] bArr3 = this.zzb;
        return bArr3.length == 0 ? array : zzxv.zza(bArr3, array);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzpr.zza(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
