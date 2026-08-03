package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzbph implements com.google.android.gms.internal.ads.zzgta {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzbph zza = new com.google.android.gms.internal.ads.zzbph();

    private /* synthetic */ zzbph() {
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        java.lang.Throwable th = (java.lang.Throwable) obj;
        com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkp.zzi.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
