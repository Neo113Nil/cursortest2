package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzbei {
    protected volatile com.google.android.libraries.places.internal.zzbex zza;
    private volatile com.google.android.libraries.places.internal.zzbcl zzb;
    private volatile boolean zzc;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbei)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbei zzbeiVar = (com.google.android.libraries.places.internal.zzbei) obj;
        com.google.android.libraries.places.internal.zzbex zzbexVar = this.zza;
        com.google.android.libraries.places.internal.zzbex zzbexVar2 = zzbeiVar.zza;
        if (zzbexVar == null && zzbexVar2 == null) {
            return zzc().equals(zzbeiVar.zzc());
        }
        if (zzbexVar != null && zzbexVar2 != null) {
            return zzbexVar.equals(zzbexVar2);
        }
        if (zzbexVar != null) {
            zzbeiVar.zzd(zzbexVar.zzbN());
            return zzbexVar.equals(zzbeiVar.zza);
        }
        zzd(zzbexVar2.zzbN());
        return this.zza.equals(zzbexVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zzb() {
        if (this.zzb != null) {
            return this.zzb.zzc();
        }
        if (this.zza != null) {
            return this.zza.zzbx();
        }
        return 0;
    }

    public final com.google.android.libraries.places.internal.zzbcl zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = com.google.android.libraries.places.internal.zzbcl.zza;
            } else {
                this.zzb = this.zza.zzbk();
            }
            return this.zzb;
        }
    }

    protected final void zzd(com.google.android.libraries.places.internal.zzbex zzbexVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza != null) {
                    return;
                }
                try {
                    this.zza = zzbexVar;
                    this.zzb = com.google.android.libraries.places.internal.zzbcl.zza;
                } catch (com.google.android.libraries.places.internal.zzbed unused) {
                    this.zzc = true;
                    this.zza = zzbexVar;
                    this.zzb = com.google.android.libraries.places.internal.zzbcl.zza;
                }
            }
        }
    }

    public final com.google.android.libraries.places.internal.zzbex zza(com.google.android.libraries.places.internal.zzbex zzbexVar) {
        com.google.android.libraries.places.internal.zzbex zzbexVar2 = this.zza;
        this.zzb = null;
        this.zza = zzbexVar;
        return zzbexVar2;
    }
}
