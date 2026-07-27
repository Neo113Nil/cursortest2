package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcuv implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcuv(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcuv zza(zziof zziofVar, zziof zziofVar2) {
        return new zzcuv(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcuu(((zzcok) this.zza).zza(), (zzbfd) this.zzb.zzb());
    }
}
