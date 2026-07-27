package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcoj implements zzinw {
    private final zziof zza;

    private zzcoj(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcoj zza(zziof zziofVar) {
        return new zzcoj(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcok) this.zza).zza().getApplicationInfo();
        zzioe.zzb(applicationInfo);
        return applicationInfo;
    }
}
