package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdnw implements zzinw {
    private final zziof zza;

    private zzdnw(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdnw zza(zziof zziofVar) {
        return new zzdnw(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdlo((zzdop) this.zza.zzb(), zzcgj.zzh));
        zzioe.zzb(singleton);
        return singleton;
    }
}
