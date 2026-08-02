package com.google.android.gms.internal.ads;

import e1.k;
import java.util.HashMap;

/* loaded from: classes.dex */
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
        HashMap m7 = k.m("event", "precacheProgress");
        m7.put("src", this.zza);
        m7.put("cachedSrc", this.zzb);
        m7.put("bytesLoaded", Integer.toString(this.zzc));
        m7.put("totalBytes", Integer.toString(this.zzd));
        m7.put("cacheReady", "0");
        zzcci.zze(this.zze, "onPrecacheEvent", m7);
    }
}
