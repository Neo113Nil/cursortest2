package com.google.android.gms.internal.ads;

import e1.k;
import java.util.HashMap;

/* loaded from: classes.dex */
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
        HashMap m7 = k.m("event", "precacheComplete");
        m7.put("src", this.zza);
        m7.put("cachedSrc", this.zzb);
        m7.put("totalBytes", Integer.toString(this.zzc));
        zzcci.zze(this.zzd, "onPrecacheEvent", m7);
    }
}
