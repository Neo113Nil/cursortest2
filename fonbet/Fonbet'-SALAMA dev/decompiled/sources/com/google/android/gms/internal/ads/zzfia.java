package com.google.android.gms.internal.ads;

import J2.m;
import J2.n;
import J2.o;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfia {
    private final Context zza;
    private final Executor zzb;
    private final zzgbo zzc;
    private final n zzd;
    private final zzfhr zze;
    private final zzfgb zzf;

    public zzfia(Context context, Executor executor, zzgbo zzgboVar, n nVar, zzfhr zzfhrVar, zzfgb zzfgbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgboVar;
        this.zzd = nVar;
        this.zze = zzfhrVar;
        this.zzf = zzfgbVar;
    }

    public final I3.b zzc(final String str, o oVar) {
        if (oVar == null) {
            return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfhx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    m zza;
                    zza = zzfia.this.zzd.zza(str);
                    return zza;
                }
            });
        }
        return new zzfhq(oVar.f3833a, this.zzd, this.zzc, this.zze).zzd(str);
    }

    public final void zzd(final String str, final o oVar, zzffy zzffyVar) {
        if (!zzfgb.zza() || !((Boolean) zzbdr.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhy
                @Override // java.lang.Runnable
                public final void run() {
                    zzfia.this.zzc(str, oVar);
                }
            });
            return;
        }
        zzffn zza = zzffm.zza(this.zza, 14);
        zza.zzi();
        zzgbc.zzr(zzc(str, oVar), new zzfhz(this, zza, zzffyVar), this.zzb);
    }

    public final void zze(List list, o oVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzd((String) it.next(), oVar, null);
        }
    }
}
