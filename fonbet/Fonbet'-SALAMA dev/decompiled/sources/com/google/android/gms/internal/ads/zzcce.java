package com.google.android.gms.internal.ads;

import e1.k;
import java.util.HashMap;

/* loaded from: classes.dex */
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
        HashMap m7 = k.m("event", "precacheProgress");
        m7.put("src", this.zza);
        m7.put("cachedSrc", this.zzb);
        m7.put("bytesLoaded", Integer.toString(this.zzc));
        m7.put("totalBytes", Integer.toString(this.zzd));
        m7.put("bufferedDuration", Long.toString(this.zze));
        m7.put("totalDuration", Long.toString(this.zzf));
        m7.put("cacheReady", true != this.zzg ? "0" : "1");
        m7.put("playerCount", Integer.toString(this.zzh));
        m7.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcci.zze(this.zzj, "onPrecacheEvent", m7);
    }
}
