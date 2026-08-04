package com.google.android.gms.internal.ads;

import E2.e;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class zzehs implements e {
    final /* synthetic */ zzddo zza;

    public zzehs(zzeht zzehtVar, zzddo zzddoVar) {
        this.zza = zzddoVar;
    }

    @Override // E2.e
    public final void zza(View view) {
    }

    @Override // E2.e
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // E2.e
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
