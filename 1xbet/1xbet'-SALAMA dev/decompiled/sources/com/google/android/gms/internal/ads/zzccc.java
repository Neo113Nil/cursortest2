package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzccc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcci zze;

    public zzccc(zzcci zzcciVar, String str, String str2, int i7, int i8, boolean z4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = zzcciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapM = k.m("event", "precacheProgress");
        mapM.put("src", this.zza);
        mapM.put("cachedSrc", this.zzb);
        mapM.put("bytesLoaded", Integer.toString(this.zzc));
        mapM.put("totalBytes", Integer.toString(this.zzd));
        mapM.put("cacheReady", "0");
        zzcci.zze(this.zze, "onPrecacheEvent", mapM);
    }
}
