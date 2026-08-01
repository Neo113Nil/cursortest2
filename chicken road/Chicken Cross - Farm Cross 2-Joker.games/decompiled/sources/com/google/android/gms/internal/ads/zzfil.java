package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfil implements zzfiu {
    private final zzfiu zza;
    private zzdcx zzb;

    public zzfil(zzfiu zzfiuVar) {
        this.zza = zzfiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdcx zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfiv zzfivVar, zzfit zzfitVar, Object obj) {
        return zzb(zzfivVar, zzfitVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfiv zzfivVar, zzfit zzfitVar, zzdcx zzdcxVar) {
        zzcbv zzcbvVar;
        this.zzb = zzdcxVar;
        if (zzdcxVar == null || (zzcbvVar = zzfivVar.zza) == null) {
            zzdcx zzdcxVar2 = zzdcxVar;
            return ((zzfik) this.zza).zzb(zzfivVar, zzfitVar, zzdcxVar);
        }
        zzczp zza = zzdcxVar.zza();
        return zza.zzc(zza.zza(zzhcy.zza(zzcbvVar)));
    }
}
