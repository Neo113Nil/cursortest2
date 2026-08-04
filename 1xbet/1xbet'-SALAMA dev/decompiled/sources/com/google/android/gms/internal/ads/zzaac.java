package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class zzaac {
    private final Context zza;
    private boolean zzb;
    private zzta zzc = zzta.zza;
    private final zzsm zzd;
    private Handler zze;
    private zzabl zzf;

    public zzaac(Context context) {
        this.zza = context;
        this.zzd = new zzsg(context, null, null);
    }

    public final zzaac zze(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaac zzf(zzabl zzablVar) {
        this.zzf = zzablVar;
        return this;
    }

    public final zzaac zzg(zzta zztaVar) {
        this.zzc = zztaVar;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final zzaae zzh() {
        boolean z4;
        zzcv.zzf(!this.zzb);
        Handler handler = this.zze;
        if (handler == null && this.zzf == null) {
            z4 = true;
        } else {
            z4 = false;
            if (handler != null && this.zzf != null) {
                z4 = true;
            }
        }
        zzcv.zzf(z4);
        this.zzb = true;
        return new zzaae(this);
    }
}
