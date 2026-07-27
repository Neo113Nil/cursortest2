package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeaj {
    private final zzeao zza;
    private final Executor zzb;
    private final Map zzc;

    public zzeaj(zzeao zzeaoVar, Executor executor) {
        this.zza = zzeaoVar;
        this.zzc = zzeaoVar.zza();
        this.zzb = executor;
    }

    public final zzeai zza() {
        zzeai zzeaiVar = new zzeai(this);
        zzeaiVar.zzj();
        return zzeaiVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznn)).booleanValue()) {
            zzeai zza = zza();
            zza.zzc("action", "pecr");
            zza.zzd();
        }
    }

    final /* synthetic */ zzeao zzc() {
        return this.zza;
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
