package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzvu {
    public final int zza;
    public final boolean zzb;

    public zzvu(int i7, boolean z4) {
        this.zza = i7;
        this.zzb = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvu.class == obj.getClass()) {
            zzvu zzvuVar = (zzvu) obj;
            if (this.zza == zzvuVar.zza && this.zzb == zzvuVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
