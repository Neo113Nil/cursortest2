package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzcce implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcci zzj;

    public zzcce(zzcci zzcciVar, String str, String str2, int i7, int i8, long j, long j3, boolean z4, int i9, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = j;
        this.zzf = j3;
        this.zzg = z4;
        this.zzh = i9;
        this.zzi = i10;
        this.zzj = zzcciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapM = k.m("event", "precacheProgress");
        mapM.put("src", this.zza);
        mapM.put("cachedSrc", this.zzb);
        mapM.put("bytesLoaded", Integer.toString(this.zzc));
        mapM.put("totalBytes", Integer.toString(this.zzd));
        mapM.put("bufferedDuration", Long.toString(this.zze));
        mapM.put("totalDuration", Long.toString(this.zzf));
        mapM.put("cacheReady", true != this.zzg ? "0" : "1");
        mapM.put("playerCount", Integer.toString(this.zzh));
        mapM.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcci.zze(this.zzj, "onPrecacheEvent", mapM);
    }
}
