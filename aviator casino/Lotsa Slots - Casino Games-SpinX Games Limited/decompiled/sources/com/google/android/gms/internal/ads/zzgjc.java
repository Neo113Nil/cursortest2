package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgjc extends com.google.android.gms.internal.ads.zzgix {
    private final android.util.DisplayMetrics zza;
    private final android.view.View zzb;

    zzgjc(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, android.util.DisplayMetrics displayMetrics, android.view.View view, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("vv376EC8RwpMxMmfATqMVweHyPhjqO5Qlm7WPZKD2npMq6jNCymiQXlS7PGFwNKe", "PixIPnnEkiaTW1Va/iznvLY8lrCk4xSlXLHjlbwwIbo=", zzaxmVar, zzghtVar, zzgqhVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        android.view.View view = this.zzb;
        if (view == null) {
            return;
        }
        java.lang.Object invoke = method.invoke("", this.zza, view);
        invoke.getClass();
        java.lang.Long[] lArr = (java.lang.Long[]) invoke;
        com.google.android.gms.internal.ads.zzayk zza = com.google.android.gms.internal.ads.zzayl.zza();
        zza.zzb(lArr[2].longValue());
        zza.zzc(lArr[1].longValue());
        zza.zzd(lArr[0].longValue());
        zza.zza(lArr[3].longValue());
        zza.zze(lArr[4].longValue());
        zzaxmVar.zzM((com.google.android.gms.internal.ads.zzayl) zza.zzbu());
    }
}
