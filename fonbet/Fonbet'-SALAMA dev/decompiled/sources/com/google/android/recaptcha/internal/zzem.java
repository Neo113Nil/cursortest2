package com.google.android.recaptcha.internal;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzem {
    private final zzel zza;
    private final HashMap zzb;
    private final zzed zzc;
    private final zzcb zzd;

    public zzem(zzed zzedVar, zzcb zzcbVar, zzbu zzbuVar) {
        this.zzc = zzedVar;
        this.zzd = zzcbVar;
        zzel zzelVar = new zzel();
        this.zza = zzelVar;
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        zzelVar.zzd(173, hashMap);
    }

    public final zzel zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(173, this.zzb);
    }

    public final zzcb zzc() {
        return this.zzd;
    }

    public final zzed zzd() {
        return this.zzc;
    }

    public final void zze(int i7, Object obj) {
        this.zzb.put(Integer.valueOf(i7 - 2), obj);
    }
}
