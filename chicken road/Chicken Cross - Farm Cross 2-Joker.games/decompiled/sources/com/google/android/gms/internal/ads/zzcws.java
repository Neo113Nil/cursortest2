package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcws implements zzinw {
    private final zziof zza;

    private zzcws(zzcwk zzcwkVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcws zza(zzcwk zzcwkVar, zziof zziofVar) {
        return new zzcws(zzcwkVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgxw zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzon)).booleanValue() ? zzgxw.zzi(new zzdlo(((zzcxw) this.zza).zzb(), zzcgj.zza)) : zzgxw.zzh();
        zzioe.zzb(zzi);
        return zzi;
    }
}
