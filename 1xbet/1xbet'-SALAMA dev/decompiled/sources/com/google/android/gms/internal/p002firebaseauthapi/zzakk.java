package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public class zzakk {
    private volatile zzalc zza;
    private volatile zzaip zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakk)) {
            return false;
        }
        zzakk zzakkVar = (zzakk) obj;
        zzalc zzalcVar = this.zza;
        zzalc zzalcVar2 = zzakkVar.zza;
        if (zzalcVar == null && zzalcVar2 == null) {
            return zzb().equals(zzakkVar.zzb());
        }
        if (zzalcVar == null || zzalcVar2 == null) {
            return zzalcVar != null ? zzalcVar.equals(zzakkVar.zzb(zzalcVar.zzg())) : zzb(zzalcVar2.zzg()).equals(zzalcVar2);
        }
        return zzalcVar.equals(zzalcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final zzaip zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzaip.zza;
                } else {
                    this.zzb = this.zza.a_();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzalc zza(zzalc zzalcVar) {
        zzalc zzalcVar2 = this.zza;
        this.zzb = null;
        this.zza = zzalcVar;
        return zzalcVar2;
    }

    private final zzalc zzb(zzalc zzalcVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzalcVar;
                        this.zzb = zzaip.zza;
                    } catch (zzakf unused) {
                        this.zza = zzalcVar;
                        this.zzb = zzaip.zza;
                    }
                }
            }
        }
        return this.zza;
    }
}
