package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgue implements zzgci {
    private final zzgje zza;
    private final byte[] zzb;

    private zzgue(byte[] bArr, byte[] bArr2) {
        this.zza = new zzgje(bArr);
        this.zzb = bArr2;
    }

    public static zzgci zzb(zzgfv zzgfvVar) {
        return new zzgue(zzgfvVar.zze().zzd(zzgcr.zza()), zzgfvVar.zzb().zzd());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (!zzgni.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzb;
        return zzc(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
