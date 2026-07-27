package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzefa implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzefa(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzefa zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzefa(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeez(((zzcok) this.zza).zza(), ((zzcpa) this.zzb).zza(), zzfoy.zzc());
    }
}
