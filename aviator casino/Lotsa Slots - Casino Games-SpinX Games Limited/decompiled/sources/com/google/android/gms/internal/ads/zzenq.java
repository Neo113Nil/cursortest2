package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzenq implements com.google.android.gms.internal.ads.zzdno {
    private final com.google.android.gms.internal.ads.zzfkf zza;
    private final com.google.android.gms.internal.ads.zzbxb zzb;
    private final com.google.android.gms.ads.AdFormat zzc;
    private com.google.android.gms.internal.ads.zzddj zzd = null;

    zzenq(com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzbxb zzbxbVar, com.google.android.gms.ads.AdFormat adFormat) {
        this.zza = zzfkfVar;
        this.zzb = zzbxbVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzdde zzddeVar) throws com.google.android.gms.internal.ads.zzdnn {
        boolean zzk;
        try {
            com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzk = this.zzb.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzk = this.zzb.zzt(com.google.android.gms.dynamic.ObjectWrapper.wrap(context));
                    }
                    throw new com.google.android.gms.internal.ads.zzdnn("Adapter failed to show.");
                }
                zzk = this.zzb.zzm(com.google.android.gms.dynamic.ObjectWrapper.wrap(context));
            }
            if (zzk) {
                com.google.android.gms.internal.ads.zzddj zzddjVar = this.zzd;
                if (zzddjVar == null) {
                    return;
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzch)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzddjVar.zza();
                return;
            }
            throw new com.google.android.gms.internal.ads.zzdnn("Adapter failed to show.");
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.ads.zzdnn(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final com.google.android.gms.internal.ads.zzfkf zzb() {
        return this.zza;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzddj zzddjVar) {
        this.zzd = zzddjVar;
    }
}
