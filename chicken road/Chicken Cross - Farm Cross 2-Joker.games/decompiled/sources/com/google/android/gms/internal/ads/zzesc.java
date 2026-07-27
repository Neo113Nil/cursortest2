package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzesc implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcgo zza;
    final /* synthetic */ zzflo zzb;
    final /* synthetic */ zzfld zzc;
    final /* synthetic */ zzesj zzd;
    final /* synthetic */ zzese zze;

    zzesc(zzese zzeseVar, zzcgo zzcgoVar, zzflo zzfloVar, zzfld zzfldVar, zzesj zzesjVar) {
        this.zza = zzcgoVar;
        this.zzb = zzfloVar;
        this.zzc = zzfldVar;
        this.zzd = zzesjVar;
        Objects.requireNonNull(zzeseVar);
        this.zze = zzeseVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzesj zzesjVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzesjVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
