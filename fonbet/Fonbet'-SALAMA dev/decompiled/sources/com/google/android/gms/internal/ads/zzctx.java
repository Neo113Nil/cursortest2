package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzctx {
    private Context zza;
    private zzfba zzb;
    private Bundle zzc;
    private zzfas zzd;
    private zzctq zze;
    private zzebw zzf;
    private int zzg = 0;

    public final zzctx zze(zzebw zzebwVar) {
        this.zzf = zzebwVar;
        return this;
    }

    public final zzctx zzf(Context context) {
        this.zza = context;
        return this;
    }

    public final zzctx zzg(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzctx zzh(zzctq zzctqVar) {
        this.zze = zzctqVar;
        return this;
    }

    public final zzctx zzi(int i7) {
        this.zzg = i7;
        return this;
    }

    public final zzctx zzj(zzfas zzfasVar) {
        this.zzd = zzfasVar;
        return this;
    }

    public final zzctx zzk(zzfba zzfbaVar) {
        this.zzb = zzfbaVar;
        return this;
    }

    public final zzctz zzl() {
        return new zzctz(this, null);
    }
}
