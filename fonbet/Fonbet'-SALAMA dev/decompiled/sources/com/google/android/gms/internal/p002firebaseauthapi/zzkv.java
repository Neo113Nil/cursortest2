package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzkv implements zzkw {
    private final zzdg zza;
    private final int zzb;

    public zzkv(zzdg zzdgVar) {
        this.zza = zzdgVar;
        this.zzb = zzdgVar.zzc() + zzdgVar.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        byte[] bArr3;
        if (bArr2.length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i7, bArr2.length);
        zzbg zza = zzyc.zza(zzcz.zzb().zza(this.zza).zza(zzze.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbq.zza())).zzb(zzze.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzc() + this.zza.zzb()), zzbq.zza())).zza());
        bArr3 = zzks.zza;
        return zza.zza(copyOfRange, bArr3);
    }
}
