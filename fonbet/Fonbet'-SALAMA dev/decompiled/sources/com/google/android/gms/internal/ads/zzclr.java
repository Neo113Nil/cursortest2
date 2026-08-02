package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzclr implements zzcut {
    private final zzfai zza;
    private final zzfar zzb;
    private final zzfhv zzc;
    private final zzfia zzd;

    public zzclr(zzfar zzfarVar, zzfia zzfiaVar, zzfhv zzfhvVar) {
        this.zzb = zzfarVar;
        this.zzd = zzfiaVar;
        this.zzc = zzfhvVar;
        this.zza = zzfarVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zze(this.zzc.zzd(this.zzb, null, list), null);
    }
}
