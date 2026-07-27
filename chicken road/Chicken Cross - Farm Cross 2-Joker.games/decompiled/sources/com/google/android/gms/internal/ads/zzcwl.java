package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcwl implements zzinw {
    private final zzcwk zza;
    private final zziof zzb;

    private zzcwl(zzcwk zzcwkVar, zziof zziofVar) {
        this.zza = zzcwkVar;
        this.zzb = zziofVar;
    }

    public static zzcwl zza(zzcwk zzcwkVar, zziof zziofVar) {
        return new zzcwl(zzcwkVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return this.zza.zze(((zzioi) this.zzb).zzb());
    }
}
