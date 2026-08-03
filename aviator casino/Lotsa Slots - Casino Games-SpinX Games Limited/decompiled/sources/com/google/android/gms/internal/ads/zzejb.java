package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzejb implements com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzdcu {
    private static final java.lang.Object zza = new java.lang.Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final com.google.android.gms.internal.ads.zzejl zzd;

    public zzejb(com.google.android.gms.internal.ads.zzejl zzejlVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzejlVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue() && !this.zzc.zzx()) {
            java.lang.Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhi)).intValue();
            }
            if (i < intValue) {
                this.zzd.zza(z);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        zzb(true);
    }
}
