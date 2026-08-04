package com.google.android.gms.internal.ads;

import E2.o;

/* JADX INFO: loaded from: classes.dex */
final class zzfdl {
    private final long zza;
    private long zzc;
    private final zzfdk zzb = new zzfdk();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfdl() {
        o.f1952C.j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfdk zzd() {
        zzfdk zzfdkVar = this.zzb;
        zzfdk zzfdkVarClone = zzfdkVar.clone();
        zzfdkVar.zza = false;
        zzfdkVar.zzb = 0;
        return zzfdkVarClone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        o.f1952C.j.getClass();
        this.zzc = System.currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
