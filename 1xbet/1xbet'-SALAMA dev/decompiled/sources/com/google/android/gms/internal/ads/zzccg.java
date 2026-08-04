package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzccg implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcci zzd;

    public zzccg(zzcci zzcciVar, String str, String str2, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = zzcciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapM = k.m("event", "precacheComplete");
        mapM.put("src", this.zza);
        mapM.put("cachedSrc", this.zzb);
        mapM.put("totalDuration", Long.toString(this.zzc));
        zzcci.zze(this.zzd, "onPrecacheEvent", mapM);
    }
}
