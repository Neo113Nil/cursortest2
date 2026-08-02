package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.zzf != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaae zzh() {
        boolean z4;
        zzcv.zzf(!this.zzb);
        Handler handler = this.zze;
        if (handler != null || this.zzf != null) {
            z4 = false;
            if (handler != null) {
            }
            zzcv.zzf(z4);
            this.zzb = true;
            return new zzaae(this);
        }
        z4 = true;
        zzcv.zzf(z4);
        this.zzb = true;
        return new zzaae(this);
    }
}
