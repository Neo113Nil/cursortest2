package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdpb implements zzinw {
    private final zziof zza;

    private zzdpb(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdpb zza(zziof zziofVar) {
        return new zzdpb(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdoy) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzioe.zzb(singleton);
        return singleton;
    }
}
