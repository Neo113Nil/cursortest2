package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzfn implements com.google.android.gms.ads.internal.gmsg.zzv<zzwb> {
    private final /* synthetic */ zzff zzaga;

    zzfn(zzff zzffVar) {
        this.zzaga = zzffVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzwb zzwbVar, Map map) {
        zzet zzetVar;
        com.google.android.gms.ads.internal.gmsg.zzab zzabVar;
        zzwb zzwbVar2 = zzwbVar;
        zzetVar = this.zzaga.zzafq;
        if (zzetVar.zzc(map)) {
            zzabVar = this.zzaga.zzafw;
            zzabVar.zza(zzwbVar2, map);
        }
    }
}
