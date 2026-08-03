package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgiu extends com.google.android.gms.internal.ads.zzgix {
    private static final java.lang.Long zza = -1L;
    private final com.google.android.gms.internal.ads.zzgec zzb;
    private final android.content.Context zzc;
    private final java.util.Map zzd;

    zzgiu(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, com.google.android.gms.internal.ads.zzgec zzgecVar, android.content.Context context, java.util.Map map, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("l+kgGKMz/Iv8su4g8cwY9wke7SfZsr0faZH/ngMWgPU8rl0NeXLqH/yGmwd3VO0X", "i+H002K9niN4AH5EysFvLiWEIE/4786FSVH14vFL1Is=", zzaxmVar, zzghtVar, zzgqhVar.zza(121));
        this.zzb = zzgecVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzgec zzgecVar = this.zzb;
        java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", java.lang.Integer.valueOf(zzgecVar.ordinal()), this.zzc, com.google.android.gms.internal.ads.zzgtg.zza(this.zzd.get("up"), true));
        objArr.getClass();
        java.lang.Object[] objArr2 = objArr;
        synchronized (zzaxmVar) {
            if (zzgecVar == com.google.android.gms.internal.ads.zzgec.QUERY) {
                java.lang.Object obj = objArr2[0];
                java.lang.Long l = zza;
                zzaxmVar.zzq(((java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza(obj, l)).longValue());
                zzaxmVar.zzr(((java.lang.Long) com.google.android.gms.internal.ads.zzgtg.zza(objArr2[1], l)).longValue());
            }
            zzaxmVar.zzg(((java.lang.Long) objArr2[2]).longValue());
            zzaxmVar.zzQ(((java.lang.Long) objArr2[3]).longValue());
        }
    }
}
