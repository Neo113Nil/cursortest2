package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcwx implements zzinw {
    private final zziof zza;

    private zzcwx(zzcwk zzcwkVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcwx zza(zzcwk zzcwkVar, zziof zziofVar) {
        return new zzcwx(zzcwkVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdlo((zzcya) this.zza.zzb(), zzcgj.zzh));
        zzioe.zzb(singleton);
        return singleton;
    }
}
