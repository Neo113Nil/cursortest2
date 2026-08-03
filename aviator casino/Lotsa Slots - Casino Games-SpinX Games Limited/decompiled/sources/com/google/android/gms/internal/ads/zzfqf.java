package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfqf {
    public static boolean zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return java.util.regex.Pattern.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkc), str);
    }

    public static void zzb(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbo.zzw(listenableFuture), new com.google.android.gms.internal.ads.zzfqb(zzfpwVar), com.google.android.gms.internal.ads.zzcfr.zzh);
        }
    }

    public static com.google.android.gms.internal.ads.zzfok zzc(final com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        return new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzfqe
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
                    com.google.android.gms.internal.ads.zzfpw.this.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        zzh(listenableFuture, zzfqgVar, zzfpwVar, false);
    }

    public static void zze(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        zzh(listenableFuture, zzfqgVar, zzfpwVar, true);
    }

    public static void zzf(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbo.zzw(listenableFuture), new com.google.android.gms.internal.ads.zzfqd(zzfqgVar, zzfpwVar), com.google.android.gms.internal.ads.zzcfr.zzh);
        }
    }

    public static int zzg(com.google.android.gms.internal.ads.zzfky zzfkyVar) {
        int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzfkyVar) - 1;
        return (zzg == 0 || zzg == 1) ? 7 : 23;
    }

    private static void zzh(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbo.zzw(listenableFuture), new com.google.android.gms.internal.ads.zzfqc(zzfqgVar, zzfpwVar, z), com.google.android.gms.internal.ads.zzcfr.zzh);
        }
    }
}
