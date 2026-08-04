package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzkm {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzkm(zzkk zzkkVar, zzkl zzklVar) {
        this.zza = zzkkVar.zza;
        this.zzb = zzkkVar.zzb;
        this.zzc = zzkkVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkm)) {
            return false;
        }
        zzkm zzkmVar = (zzkm) obj;
        return this.zza == zzkmVar.zza && this.zzb == zzkmVar.zzb && this.zzc == zzkmVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkk zza() {
        return new zzkk(this, null);
    }
}
