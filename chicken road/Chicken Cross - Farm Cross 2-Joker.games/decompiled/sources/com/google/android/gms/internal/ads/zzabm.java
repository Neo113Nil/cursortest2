package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzabm {
    public final int zza;
    public final zznh[] zzb;
    public final zzabe[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzabm(zznh[] zznhVarArr, zzabe[] zzabeVarArr, zzbn zzbnVar, Object obj) {
        int length = zznhVarArr.length;
        zzguk.zza(length == zzabeVarArr.length);
        this.zzb = zznhVarArr;
        this.zzc = (zzabe[]) zzabeVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i) {
        return this.zzb[i] != null;
    }

    public final boolean zzb(zzabm zzabmVar, int i) {
        return zzabmVar != null && Objects.equals(this.zzb[i], zzabmVar.zzb[i]) && Objects.equals(this.zzc[i], zzabmVar.zzc[i]);
    }
}
