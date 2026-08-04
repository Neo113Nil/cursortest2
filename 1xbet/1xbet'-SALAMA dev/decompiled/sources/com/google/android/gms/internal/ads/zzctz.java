package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzctz {
    private final Context zza;
    private final zzfba zzb;
    private final Bundle zzc;
    private final zzfas zzd;
    private final zzctq zze;
    private final zzebw zzf;
    private final int zzg;

    public /* synthetic */ zzctz(zzctx zzctxVar, zzcty zzctyVar) {
        this.zza = zzctxVar.zza;
        this.zzb = zzctxVar.zzb;
        this.zzc = zzctxVar.zzc;
        this.zzd = zzctxVar.zzd;
        this.zze = zzctxVar.zze;
        this.zzf = zzctxVar.zzf;
        this.zzg = zzctxVar.zzg;
    }

    public final int zza() {
        return this.zzg;
    }

    public final Context zzb(Context context) {
        return this.zza;
    }

    public final Bundle zzc() {
        return this.zzc;
    }

    public final zzctq zzd() {
        return this.zze;
    }

    public final zzctx zze() {
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzf(this.zza);
        zzctxVar.zzk(this.zzb);
        zzctxVar.zzg(this.zzc);
        zzctxVar.zzh(this.zze);
        zzctxVar.zze(this.zzf);
        return zzctxVar;
    }

    public final zzebw zzf(String str) {
        zzebw zzebwVar = this.zzf;
        return zzebwVar != null ? zzebwVar : new zzebw(str);
    }

    public final zzfas zzg() {
        return this.zzd;
    }

    public final zzfba zzh() {
        return this.zzb;
    }
}
