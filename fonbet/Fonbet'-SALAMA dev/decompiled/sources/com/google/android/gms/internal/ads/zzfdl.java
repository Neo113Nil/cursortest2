package com.google.android.gms.internal.ads;

import E2.o;

/* loaded from: classes.dex */
final class zzfdl {
    private final long zza;
    private long zzc;
    private final zzfdk zzb = new zzfdk();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfdl() {
        o.f1952C.j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
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
        zzfdk clone = zzfdkVar.clone();
        zzfdkVar.zza = false;
        zzfdkVar.zzb = 0;
        return clone;
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
