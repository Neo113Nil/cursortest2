package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzyo {
    public final int zza;
    public final zzlq[] zzb;
    public final zzyh[] zzc;
    public final zzbv zzd;
    public final Object zze;

    public zzyo(zzlq[] zzlqVarArr, zzyh[] zzyhVarArr, zzbv zzbvVar, Object obj) {
        int length = zzlqVarArr.length;
        zzcv.zzd(length == zzyhVarArr.length);
        this.zzb = zzlqVarArr;
        this.zzc = (zzyh[]) zzyhVarArr.clone();
        this.zzd = zzbvVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(zzyo zzyoVar, int i7) {
        if (zzyoVar == null) {
            return false;
        }
        zzlq zzlqVar = this.zzb[i7];
        zzlq zzlqVar2 = zzyoVar.zzb[i7];
        int i8 = zzen.zza;
        return Objects.equals(zzlqVar, zzlqVar2) && Objects.equals(this.zzc[i7], zzyoVar.zzc[i7]);
    }

    public final boolean zzb(int i7) {
        return this.zzb[i7] != null;
    }
}
