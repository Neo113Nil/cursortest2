package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzq {
    public static final com.google.android.gms.ads.internal.client.zzq zza = new com.google.android.gms.ads.internal.client.zzq();

    protected zzq() {
    }

    public final com.google.android.gms.ads.internal.client.zzm zza(android.content.Context context, com.google.android.gms.ads.internal.client.zzeh zzehVar) {
        android.content.Context context2;
        java.util.List list;
        java.lang.String str;
        java.lang.String zza2 = zzehVar.zza();
        java.util.Set zzc = zzehVar.zzc();
        if (zzc.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = java.util.Collections.unmodifiableList(new java.util.ArrayList(zzc));
            context2 = context;
        }
        boolean zzh = zzehVar.zzh(context2);
        android.os.Bundle zzd = zzehVar.zzd(com.google.ads.mediation.admob.AdMobAdapter.class);
        java.lang.String zzf = zzehVar.zzf();
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            java.lang.String packageName = applicationContext.getPackageName();
            com.google.android.gms.ads.internal.client.zzay.zza();
            str = com.google.android.gms.ads.internal.util.client.zzf.zzx(java.lang.Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzm = zzehVar.zzm();
        com.google.android.gms.ads.RequestConfiguration zzp = com.google.android.gms.ads.internal.client.zzeu.zzb().zzp();
        return new com.google.android.gms.ads.internal.client.zzm(8, -1L, zzd, -1, list, zzh, java.lang.Math.max(zzehVar.zzj(), zzp.getTagForChildDirectedTreatment()), false, zzf, null, null, zza2, zzehVar.zzi(), zzehVar.zzk(), java.util.Collections.unmodifiableList(new java.util.ArrayList(zzehVar.zzl())), zzehVar.zzg(), str, zzm, null, zzp.getTagForUnderAgeOfConsent(), (java.lang.String) java.util.Collections.max(java.util.Arrays.asList(null, zzp.getMaxAdContentRating()), com.google.android.gms.ads.internal.client.zzp.zza), zzehVar.zzb(), zzehVar.zzo(), zzehVar.zzn(), zzp.getPublisherPrivacyPersonalizationState().getValue(), zzehVar.zzq(), zzehVar.zzr());
    }
}
