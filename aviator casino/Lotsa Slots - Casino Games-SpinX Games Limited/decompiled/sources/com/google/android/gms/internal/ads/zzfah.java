package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfah implements com.google.android.gms.internal.ads.zzfci {
    public final com.google.android.gms.internal.ads.zzfke zza;

    public zzfah(com.google.android.gms.internal.ads.zzfke zzfkeVar) {
        this.zza = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.google.android.gms.internal.ads.zzfke zzfkeVar = this.zza;
        if (zzfkeVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznt)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", zzfkeVar.zzb());
            bundle.putBoolean("disable_ml", zzfkeVar.zzc());
        }
    }
}
