package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzads {
    public final zzadv zza;
    public final zzadv zzb;

    public zzads(zzadv zzadvVar, zzadv zzadvVar2) {
        this.zza = zzadvVar;
        this.zzb = zzadvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzads.class == obj.getClass()) {
            zzads zzadsVar = (zzads) obj;
            if (this.zza.equals(zzadsVar.zza) && this.zzb.equals(zzadsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzadv zzadvVar = this.zza;
        return p150v0.a.f("[", zzadvVar.toString(), zzadvVar.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString()), "]");
    }
}
