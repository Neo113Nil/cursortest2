package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgio extends com.google.android.gms.internal.ads.zzgix {
    private final java.util.Map zza;

    zzgio(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, java.util.Map map, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("G2/bixlyGCE81T8XD1821hdaWkYSafkSwXLAJIGuuGqYRgIdSuokiuQCkAmmYtmy", "cUq8+LlkvVToJpkHwW06ohwTjEjO/Tpp50dyOy2nlqU=", zzaxmVar, zzghtVar, zzgqhVar.zza(118));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.util.Map map = this.zza;
        java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", (android.net.NetworkCapabilities) map.get("ntc"), (java.lang.Long) map.get("vs"), (java.lang.Long) map.get("vf"));
        objArr.getClass();
        java.lang.Object[] objArr2 = objArr;
        synchronized (zzaxmVar) {
            zzaxmVar.zzf(((java.lang.Long) objArr2[0]).longValue());
            long longValue = ((java.lang.Long) objArr2[1]).longValue();
            if (longValue >= 0) {
                zzaxmVar.zzW(longValue);
            }
            long longValue2 = ((java.lang.Long) objArr2[2]).longValue();
            if (longValue2 >= 0) {
                zzaxmVar.zzX(longValue2);
            }
        }
    }
}
