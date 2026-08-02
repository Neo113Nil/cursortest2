package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;

/* loaded from: classes.dex */
final class zztz {
    com.google.android.gms.ads.internal.zzal zzbor;

    @Nullable
    zzjj zzbos;
    zzst zzbot;
    long zzbou;
    boolean zzbov;
    private final /* synthetic */ zzty zzbow;
    boolean zzwa;

    zztz(zzty zztyVar, zzss zzssVar) {
        String str;
        this.zzbow = zztyVar;
        str = zztyVar.zzye;
        this.zzbor = zzssVar.zzaw(str);
        this.zzbot = new zzst();
        zzst zzstVar = this.zzbot;
        com.google.android.gms.ads.internal.zzal zzalVar = this.zzbor;
        zzalVar.zza(new zzsu(zzstVar));
        zzalVar.zza(new zztc(zzstVar));
        zzalVar.zza(new zzte(zzstVar));
        zzalVar.zza(new zztg(zzstVar));
        zzalVar.zza(new zzti(zzstVar));
    }

    zztz(zzty zztyVar, zzss zzssVar, zzjj zzjjVar) {
        this(zztyVar, zzssVar);
        this.zzbos = zzjjVar;
    }

    final boolean load() {
        if (this.zzwa) {
            return false;
        }
        zzjj zzjjVar = this.zzbos;
        if (zzjjVar == null) {
            zzjjVar = this.zzbow.zzboo;
        }
        this.zzbov = this.zzbor.zzb(zztw.zzi(zzjjVar));
        this.zzwa = true;
        this.zzbou = com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis();
        return true;
    }
}
