package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzexb implements zzfdi {
    public final zzexv zza;
    public final zzexx zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final zzfcx zzg;

    public zzexb(zzexv zzexvVar, zzexx zzexxVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzfcx zzfcxVar) {
        this.zza = zzexvVar;
        this.zzb = zzexxVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzfcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final zzfcx zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final Executor zzb() {
        return this.zze;
    }
}
