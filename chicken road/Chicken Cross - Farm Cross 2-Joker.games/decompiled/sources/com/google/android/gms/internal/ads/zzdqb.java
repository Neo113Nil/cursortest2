package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzdqb implements zzbfg {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdqm zzb;

    zzdqb(zzdqm zzdqmVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdqmVar);
        this.zzb = zzdqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzdj(zzbff zzbffVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcz)).booleanValue()) {
            synchronized (this) {
                if (zzbffVar.zzj) {
                    zzdqm zzdqmVar = this.zzb;
                    if (zzdqmVar.zzaa() != null) {
                        zzdqmVar.zzab().put(this.zza, true);
                        if (zzdqmVar.zzaa() == null) {
                            return;
                        } else {
                            zzdqmVar.zzu(zzdqmVar.zzaa().zzdF(), zzdqmVar.zzaa().zzh(), zzdqmVar.zzaa().zzi(), true);
                        }
                    }
                }
                return;
            }
        }
        if (zzbffVar.zzj) {
            zzdqm zzdqmVar2 = this.zzb;
            if (zzdqmVar2.zzaa() != null) {
                zzdqmVar2.zzab().put(this.zza, true);
                if (zzdqmVar2.zzaa() == null) {
                    return;
                }
                zzdqmVar2.zzu(zzdqmVar2.zzaa().zzdF(), zzdqmVar2.zzaa().zzh(), zzdqmVar2.zzaa().zzi(), true);
            }
        }
    }
}
