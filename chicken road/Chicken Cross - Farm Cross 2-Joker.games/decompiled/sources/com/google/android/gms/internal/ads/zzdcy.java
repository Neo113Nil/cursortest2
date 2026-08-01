package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdcy {
    private Context zza;
    private zzflw zzb;
    private Bundle zzc;
    private zzflp zzd;
    private zzdcs zze;
    private zzemv zzf;

    public final zzdcy zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdcy zzb(zzflw zzflwVar) {
        this.zzb = zzflwVar;
        return this;
    }

    public final zzdcy zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdcy zzd(zzdcs zzdcsVar) {
        this.zze = zzdcsVar;
        return this;
    }

    public final zzdcz zze() {
        return new zzdcz(this, null);
    }

    public final zzdcy zzf(zzflp zzflpVar) {
        this.zzd = zzflpVar;
        return this;
    }

    public final zzdcy zzg(zzemv zzemvVar) {
        this.zzf = zzemvVar;
        return this;
    }

    final /* synthetic */ Context zzh() {
        return this.zza;
    }

    final /* synthetic */ zzflw zzi() {
        return this.zzb;
    }

    final /* synthetic */ Bundle zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzflp zzk() {
        return this.zzd;
    }

    final /* synthetic */ zzdcs zzl() {
        return this.zze;
    }

    final /* synthetic */ zzemv zzm() {
        return this.zzf;
    }
}
