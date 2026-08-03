package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdqu {
    private final com.google.android.gms.internal.ads.zzdzl zza;

    zzdqu(com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzdzlVar;
    }

    public final void zza(android.view.View view, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzot)).booleanValue() || view == null) {
            return;
        }
        java.lang.String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(zzfkfVar);
        zza.zzd();
    }
}
