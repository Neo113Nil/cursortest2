package com.google.android.gms.internal.ads;

import java.util.HashMap;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzccf implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcci zzd;

    public zzccf(zzcci zzcciVar, String str, String str2, int i7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i7;
        this.zzd = zzcciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapM = k.m("event", "precacheComplete");
        mapM.put("src", this.zza);
        mapM.put("cachedSrc", this.zzb);
        mapM.put("totalBytes", Integer.toString(this.zzc));
        zzcci.zze(this.zzd, "onPrecacheEvent", mapM);
    }
}
