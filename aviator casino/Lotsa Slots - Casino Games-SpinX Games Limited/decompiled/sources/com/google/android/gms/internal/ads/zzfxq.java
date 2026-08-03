package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfxq {
    private final android.content.Context zza;
    private final android.os.Looper zzb;

    public zzfxq(android.content.Context context, android.os.Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfya zza = com.google.android.gms.internal.ads.zzfyc.zza();
        android.content.Context context = this.zza;
        zza.zza(context.getPackageName());
        zza.zzc(2);
        com.google.android.gms.internal.ads.zzfxy zza2 = com.google.android.gms.internal.ads.zzfxz.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new com.google.android.gms.internal.ads.zzfxr(context, this.zzb, (com.google.android.gms.internal.ads.zzfyc) zza.zzbu()).zza();
    }
}
