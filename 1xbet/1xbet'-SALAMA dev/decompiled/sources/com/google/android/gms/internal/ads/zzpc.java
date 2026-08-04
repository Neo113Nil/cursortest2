package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzpc {
    public static final zzpc zza = new zzpa().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzpc(zzpa zzpaVar, zzpb zzpbVar) {
        this.zzb = zzpaVar.zza;
        this.zzc = zzpaVar.zzb;
        this.zzd = zzpaVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpc.class == obj.getClass()) {
            zzpc zzpcVar = (zzpc) obj;
            if (this.zzb == zzpcVar.zzb && this.zzc == zzpcVar.zzc && this.zzd == zzpcVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z4 = this.zzb;
        boolean z7 = this.zzc;
        return (z7 ? 1 : 0) + (z7 ? 1 : 0) + ((z4 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
