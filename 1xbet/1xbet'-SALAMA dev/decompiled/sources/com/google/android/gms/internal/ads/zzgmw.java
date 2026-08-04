package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgmw implements zzgna {
    private final String zza;
    private final zzgvd zzb;
    private final zzgvy zzc;
    private final zzgry zzd;
    private final zzgte zze;
    private final Integer zzf;

    private zzgmw(String str, zzgvd zzgvdVar, zzgvy zzgvyVar, zzgry zzgryVar, zzgte zzgteVar, Integer num) {
        this.zza = str;
        this.zzb = zzgvdVar;
        this.zzc = zzgvyVar;
        this.zzd = zzgryVar;
        this.zze = zzgteVar;
        this.zzf = num;
    }

    public static zzgmw zza(String str, zzgvy zzgvyVar, zzgry zzgryVar, zzgte zzgteVar, Integer num) {
        if (zzgteVar == zzgte.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgmw(str, zzgni.zza(str), zzgvyVar, zzgryVar, zzgteVar, num);
    }

    public final zzgry zzb() {
        return this.zzd;
    }

    public final zzgte zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgna
    public final zzgvd zzd() {
        return this.zzb;
    }

    public final zzgvy zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
