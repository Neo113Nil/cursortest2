package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdoj implements com.google.android.gms.internal.ads.zzbpq {
    private final java.lang.ref.WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzdon zzdonVar = (com.google.android.gms.internal.ads.zzdon) this.zza.get();
        if (zzdonVar != null && "_ac".equals((java.lang.String) map.get(com.ironsource.X3.i.j0))) {
            zzdonVar.zzD().onAdClicked();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmh)).booleanValue()) {
                zzdonVar.zzE().zzdu();
                if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdonVar.zzE().zzdR();
            }
        }
    }
}
