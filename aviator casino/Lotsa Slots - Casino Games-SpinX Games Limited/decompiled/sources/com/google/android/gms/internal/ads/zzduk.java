package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzduk implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzbnf zza;
    private final com.google.android.gms.internal.ads.zzdux zzb;
    private final com.google.android.gms.internal.ads.zzimo zzc;

    public zzduk(com.google.android.gms.internal.ads.zzdqd zzdqdVar, com.google.android.gms.internal.ads.zzdpt zzdptVar, com.google.android.gms.internal.ads.zzdux zzduxVar, com.google.android.gms.internal.ads.zzimo zzimoVar) {
        this.zza = zzdqdVar.zzg(zzdptVar.zzS());
        this.zzb = zzduxVar;
        this.zzc = zzimoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("asset");
        try {
            this.zza.zze((com.google.android.gms.internal.ads.zzbmv) this.zzc.zzb(), str);
        } catch (android.os.RemoteException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            java.lang.String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb2, e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
