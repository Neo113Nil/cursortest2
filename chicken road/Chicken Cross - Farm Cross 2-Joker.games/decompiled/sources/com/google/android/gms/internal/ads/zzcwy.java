package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcwy implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcwy(zzcwk zzcwkVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcwy zzc(zzcwk zzcwkVar, zziof zziofVar, zziof zziofVar2) {
        return new zzcwy(zzcwkVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzceo zzb() {
        return new zzceo(((zzcok) this.zza).zza(), ((zzddg) this.zzb).zza().zzg);
    }
}
