package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzgyc {
    protected volatile zzgyr zza;
    private volatile zzgvy zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyc)) {
            return false;
        }
        zzgyc zzgycVar = (zzgyc) obj;
        zzgyr zzgyrVar = this.zza;
        zzgyr zzgyrVar2 = zzgycVar.zza;
        if (zzgyrVar == null && zzgyrVar2 == null) {
            return zzb().equals(zzgycVar.zzb());
        }
        if (zzgyrVar != null && zzgyrVar2 != null) {
            return zzgyrVar.equals(zzgyrVar2);
        }
        if (zzgyrVar != null) {
            zzgycVar.zzd(zzgyrVar.zzbt());
            return zzgyrVar.equals(zzgycVar.zza);
        }
        zzd(zzgyrVar2.zzbt());
        return this.zza.equals(zzgyrVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgvv) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgvy zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzgvy.zzb;
                } else {
                    this.zzb = this.zza.zzaN();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzgyr zzc(zzgyr zzgyrVar) {
        zzgyr zzgyrVar2 = this.zza;
        this.zzb = null;
        this.zza = zzgyrVar;
        return zzgyrVar2;
    }

    public final void zzd(zzgyr zzgyrVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzgyrVar;
                this.zzb = zzgvy.zzb;
            } catch (zzgxv unused) {
                this.zzc = true;
                this.zza = zzgyrVar;
                this.zzb = zzgvy.zzb;
            }
        }
    }
}
