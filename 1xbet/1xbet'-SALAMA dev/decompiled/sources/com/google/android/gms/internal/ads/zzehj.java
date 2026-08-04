package com.google.android.gms.internal.ads;

import E2.e;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class zzehj implements e {
    final /* synthetic */ zzbzf zza;
    final /* synthetic */ zzfar zzb;
    final /* synthetic */ zzfaf zzc;
    final /* synthetic */ zzehp zzd;
    final /* synthetic */ zzehk zze;

    public zzehj(zzehk zzehkVar, zzbzf zzbzfVar, zzfar zzfarVar, zzfaf zzfafVar, zzehp zzehpVar) {
        this.zza = zzbzfVar;
        this.zzb = zzfarVar;
        this.zzc = zzfafVar;
        this.zzd = zzehpVar;
        this.zze = zzehkVar;
    }

    @Override // E2.e
    public final void zza(View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // E2.e
    public final void zzb() {
    }

    @Override // E2.e
    public final void zzc() {
    }
}
