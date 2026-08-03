package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbad {
    public static final java.lang.String zza(android.content.Context context, java.lang.String str, long j, boolean z) {
        try {
            com.google.android.gms.internal.ads.zzayx zza = com.google.android.gms.internal.ads.zzayy.zza();
            zza.zzb(str);
            zza.zza("0.828153725");
            zza.zzd(context.getPackageName());
            zza.zzf((java.lang.System.currentTimeMillis() - j) / 1000);
            zza.zzc(java.lang.System.currentTimeMillis() / 1000);
            try {
                zza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                zza.zze(-1L);
            }
            com.google.android.gms.internal.ads.zzaze zzc = com.google.android.gms.internal.ads.zzazo.zzc(((com.google.android.gms.internal.ads.zzayy) zza.zzbu()).zzaN(), null);
            zzc.zzc(5);
            zzc.zzd(2);
            return android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzazf) zzc.zzbu()).zzaN(), 11);
        } catch (java.io.UnsupportedEncodingException | java.security.GeneralSecurityException unused2) {
            return java.lang.Integer.toString(7);
        }
    }
}
