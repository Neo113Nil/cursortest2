package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzctz {
    private final Context zza;
    private final zzfba zzb;
    private final Bundle zzc;
    private final zzfas zzd;
    private final zzctq zze;
    private final zzebw zzf;
    private final int zzg;

    public /* synthetic */ zzctz(zzctx zzctxVar, zzcty zzctyVar) {
        Context context;
        zzfba zzfbaVar;
        Bundle bundle;
        zzfas zzfasVar;
        zzctq zzctqVar;
        zzebw zzebwVar;
        int i7;
        context = zzctxVar.zza;
        this.zza = context;
        zzfbaVar = zzctxVar.zzb;
        this.zzb = zzfbaVar;
        bundle = zzctxVar.zzc;
        this.zzc = bundle;
        zzfasVar = zzctxVar.zzd;
        this.zzd = zzfasVar;
        zzctqVar = zzctxVar.zze;
        this.zze = zzctqVar;
        zzebwVar = zzctxVar.zzf;
        this.zzf = zzebwVar;
        i7 = zzctxVar.zzg;
        this.zzg = i7;
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
