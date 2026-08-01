package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzejz implements zzdfd, zzdds {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzekj zzd;

    public zzejz(zzekj zzekjVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzekjVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzho)).intValue();
            }
            if (i < intValue) {
                this.zzd.zza(z);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzb(true);
    }
}
