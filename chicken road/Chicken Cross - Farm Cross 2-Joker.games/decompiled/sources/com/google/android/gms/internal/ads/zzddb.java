package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzddb implements zzinw {
    private final zzdcz zza;
    private final zziof zzb;

    private zzddb(zzdcz zzdczVar, zziof zziofVar) {
        this.zza = zzdczVar;
        this.zzb = zziofVar;
    }

    public static zzddb zza(zzdcz zzdczVar, zziof zziofVar) {
        return new zzddb(zzdczVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zzf = this.zza.zzf(((zzcok) this.zzb).zza());
        zzioe.zzb(zzf);
        return zzf;
    }
}
