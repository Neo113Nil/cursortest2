package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdaz implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdaz(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdaz zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdaz(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdig) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
