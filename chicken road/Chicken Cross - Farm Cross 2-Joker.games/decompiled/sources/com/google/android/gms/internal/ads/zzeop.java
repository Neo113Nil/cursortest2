package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeop implements zzdom {
    final /* synthetic */ zzemt zza;
    final /* synthetic */ zzfld zzb;
    final /* synthetic */ zzeoq zzc;

    zzeop(zzeoq zzeoqVar, zzemt zzemtVar, zzfld zzfldVar) {
        this.zza = zzemtVar;
        this.zzb = zzfldVar;
        Objects.requireNonNull(zzeoqVar);
        this.zzc = zzeoqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final void zza(boolean z, Context context, zzdec zzdecVar) throws zzdol {
        try {
            zzfmu zzfmuVar = (zzfmu) this.zza.zzb;
            zzfmuVar.zzs(z);
            if (this.zzc.zzc().clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbx)).intValue()) {
                zzfmuVar.zzd();
            } else {
                zzfmuVar.zze(context);
            }
        } catch (zzfmd e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new zzdol(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final zzfld zzb() {
        return this.zzb;
    }
}
