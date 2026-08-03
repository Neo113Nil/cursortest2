package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcsz implements com.google.android.gms.internal.ads.zzddm {
    private final com.google.android.gms.internal.ads.zzflw zza;

    public zzcsz(com.google.android.gms.internal.ads.zzflw zzflwVar) {
        this.zza = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zza(android.content.Context context) {
        try {
            this.zza.zzi();
        } catch (com.google.android.gms.internal.ads.zzflf e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzb(android.content.Context context) {
        try {
            com.google.android.gms.internal.ads.zzflw zzflwVar = this.zza;
            zzflwVar.zzj();
            if (context != null) {
                zzflwVar.zzp(context);
            }
        } catch (com.google.android.gms.internal.ads.zzflf e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzc(android.content.Context context) {
        try {
            this.zza.zzf();
        } catch (com.google.android.gms.internal.ads.zzflf e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
