package com.google.android.gms.internal.ads;

import e1.k;
import java.util.HashMap;

/* loaded from: classes.dex */
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
        HashMap m7 = k.m("event", "precacheComplete");
        m7.put("src", this.zza);
        m7.put("cachedSrc", this.zzb);
        m7.put("totalDuration", Long.toString(this.zzc));
        zzcci.zze(this.zzd, "onPrecacheEvent", m7);
    }
}
