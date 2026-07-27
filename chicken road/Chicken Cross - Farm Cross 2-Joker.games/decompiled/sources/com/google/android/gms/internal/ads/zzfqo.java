package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfqo implements zzdlb, zzdef, zzdlf {
    private final zzfrg zza;
    private final zzfqw zzb;

    zzfqo(Context context, zzfrg zzfrgVar) {
        this.zza = zzfrgVar;
        this.zzb = zzfqw.zzn(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final void zza() {
        if (((Boolean) zzbla.zzd.zze()).booleanValue()) {
            zzfrg zzfrgVar = this.zza;
            zzfqw zzfqwVar = this.zzb;
            zzfqwVar.zzd(true);
            zzfrgVar.zza(zzfqwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzh() {
        if (((Boolean) zzbla.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbla.zzd.zze()).booleanValue()) {
            zzfrg zzfrgVar = this.zza;
            zzfqw zzfqwVar = this.zzb;
            zzfqwVar.zzk(zzeVar.zza().toString());
            zzfqwVar.zzd(false);
            zzfrgVar.zza(zzfqwVar);
        }
    }
}
