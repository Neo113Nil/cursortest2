package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzql {
    private final Context zza;
    private final zzot zzb;
    private boolean zzc;
    private final zzqj zzd;
    private final zzqk zze;
    private zzqn zzf;
    private zzqd zzg;

    @Deprecated
    public zzql() {
        this.zza = null;
        this.zzb = zzot.zza;
        this.zzd = zzqj.zza;
        this.zze = zzqk.zza;
    }

    public final zzqx zzc() {
        zzcv.zzf(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzqn(new zzcg[0]);
        }
        if (this.zzg == null) {
            this.zzg = new zzqd(this.zza);
        }
        return new zzqx(this, null);
    }

    public zzql(Context context) {
        this.zza = context;
        this.zzb = zzot.zza;
        this.zzd = zzqj.zza;
        this.zze = zzqk.zza;
    }
}
