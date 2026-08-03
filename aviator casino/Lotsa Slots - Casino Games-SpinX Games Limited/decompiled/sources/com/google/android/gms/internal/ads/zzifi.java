package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzifi {
    private final com.google.android.gms.internal.ads.zzifh zza;

    private zzifi(com.google.android.gms.internal.ads.zzihg zzihgVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzihg zzihgVar2, java.lang.Object obj2) {
        this.zza = new com.google.android.gms.internal.ads.zzifh(zzihgVar, "", zzihgVar2, obj2);
    }

    public static com.google.android.gms.internal.ads.zzifi zza(com.google.android.gms.internal.ads.zzihg zzihgVar, java.lang.Object obj, com.google.android.gms.internal.ads.zzihg zzihgVar2, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zzifi(zzihgVar, "", zzihgVar2, obj2);
    }

    static void zzb(com.google.android.gms.internal.ads.zzidj zzidjVar, com.google.android.gms.internal.ads.zzifh zzifhVar, java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzidt.zzf(zzidjVar, zzifhVar.zza, 1, obj);
        com.google.android.gms.internal.ads.zzidt.zzf(zzidjVar, zzifhVar.zzc, 2, obj2);
    }

    static int zzc(com.google.android.gms.internal.ads.zzifh zzifhVar, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.ads.zzidt.zzh(zzifhVar.zza, 1, obj) + com.google.android.gms.internal.ads.zzidt.zzh(zzifhVar.zzc, 2, obj2);
    }

    public final int zzd(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zzifh zzifhVar = this.zza;
        int zzF = com.google.android.gms.internal.ads.zzidj.zzF(i << 3);
        int zzc = zzc(zzifhVar, obj, obj2);
        return zzF + com.google.android.gms.internal.ads.zzidj.zzF(zzc) + zzc;
    }

    final com.google.android.gms.internal.ads.zzifh zze() {
        return this.zza;
    }
}
