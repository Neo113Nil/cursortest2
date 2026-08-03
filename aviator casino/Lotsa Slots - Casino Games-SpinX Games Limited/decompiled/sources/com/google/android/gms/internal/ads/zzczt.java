package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzczt implements com.google.android.gms.ads.internal.client.zza {
    private final com.google.android.gms.internal.ads.zzczx zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;

    zzczt(com.google.android.gms.internal.ads.zzczx zzczxVar, com.google.android.gms.internal.ads.zzfky zzfkyVar) {
        this.zza = zzczxVar;
        this.zzb = zzfkyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
