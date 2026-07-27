package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfik implements zzfiu {
    private zzdcx zza;

    @Override // com.google.android.gms.internal.ads.zzfiu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdcx zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfiv zzfivVar, zzfit zzfitVar, Object obj) {
        return zzb(zzfivVar, zzfitVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfiv zzfivVar, zzfit zzfitVar, zzdcx zzdcxVar) {
        zzczp zza;
        if (zzdcxVar != null) {
            this.zza = zzdcxVar;
        } else {
            this.zza = (zzdcx) zzfitVar.zza(zzfivVar.zzb).zzh();
        }
        zza = this.zza.zza();
        return zza.zzc(zza.zzb());
    }
}
