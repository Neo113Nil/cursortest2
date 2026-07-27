package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzffs implements zzinw {
    private final zzffn zza;

    private zzffs(zzffn zzffnVar) {
        this.zza = zzffnVar;
    }

    public static zzffs zzc(zzffn zzffnVar) {
        return new zzffs(zzffnVar);
    }

    public static String zzd(zzffn zzffnVar) {
        String zze = zzffnVar.zze();
        zzioe.zzb(zze);
        return zze;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
