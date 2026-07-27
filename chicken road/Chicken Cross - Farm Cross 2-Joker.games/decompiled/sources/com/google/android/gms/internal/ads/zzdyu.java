package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdyu implements zzinw {
    private final zziof zza;

    private zzdyu(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzdyu zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdyu(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhdi zzc = zzfoy.zzc();
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgk)).booleanValue() ? Collections.singleton(new zzdlo(((zzdzn) this.zza).zzb(), zzc)) : Collections.emptySet();
        zzioe.zzb(singleton);
        return singleton;
    }
}
