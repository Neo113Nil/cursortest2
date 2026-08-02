package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import e1.k;
import java.util.HashMap;

/* loaded from: classes.dex */
final class zzccd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcci zzk;

    public zzccd(zzcci zzcciVar, String str, String str2, long j, long j3, long j7, long j8, long j9, boolean z4, int i7, int i8) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = j7;
        this.zzf = j8;
        this.zzg = j9;
        this.zzh = z4;
        this.zzi = i7;
        this.zzj = i8;
        this.zzk = zzcciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap m7 = k.m("event", "precacheProgress");
        m7.put("src", this.zza);
        m7.put("cachedSrc", this.zzb);
        m7.put("bufferedDuration", Long.toString(this.zzc));
        m7.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue()) {
            m7.put("qoeLoadedBytes", Long.toString(this.zze));
            m7.put("qoeCachedBytes", Long.toString(this.zzf));
            m7.put("totalBytes", Long.toString(this.zzg));
            o.f1952C.j.getClass();
            m7.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        m7.put("cacheReady", true != this.zzh ? "0" : "1");
        m7.put("playerCount", Integer.toString(this.zzi));
        m7.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcci.zze(this.zzk, "onPrecacheEvent", m7);
    }
}
