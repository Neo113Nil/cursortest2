package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzeu implements zzau {
    public final float zza;
    public final float zzb;

    public zzeu(float f7, float f8) {
        boolean z4 = false;
        if (f7 >= -90.0f && f7 <= 90.0f && f8 >= -180.0f && f8 <= 180.0f) {
            z4 = true;
        }
        zzcv.zze(z4, "Invalid latitude or longitude");
        this.zza = f7;
        this.zzb = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzeu.class == obj.getClass()) {
            zzeu zzeuVar = (zzeu) obj;
            if (this.zza == zzeuVar.zza && this.zzb == zzeuVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
