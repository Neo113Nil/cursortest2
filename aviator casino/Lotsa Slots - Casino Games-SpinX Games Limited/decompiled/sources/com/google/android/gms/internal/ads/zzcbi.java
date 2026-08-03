package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcbi implements java.util.concurrent.Callable {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbk zzb;

    zzcbi(com.google.android.gms.internal.ads.zzcbk zzcbkVar, android.content.Context context) {
        this.zza = context;
        java.util.Objects.requireNonNull(zzcbkVar);
        this.zzb = zzcbkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzcbh zza;
        com.google.android.gms.internal.ads.zzcbk zzcbkVar = this.zzb;
        java.util.WeakHashMap zzb = zzcbkVar.zzb();
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzcbj zzcbjVar = (com.google.android.gms.internal.ads.zzcbj) zzb.get(context);
        if (zzcbjVar != null) {
            if (zzcbjVar.zza + ((java.lang.Long) com.google.android.gms.internal.ads.zzbkf.zzd.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zza = new com.google.android.gms.internal.ads.zzcbg(context, zzcbjVar.zzb).zza();
                zzcbkVar.zzb().put(context, new com.google.android.gms.internal.ads.zzcbj(zzcbkVar, zza));
                return zza;
            }
        }
        zza = new com.google.android.gms.internal.ads.zzcbg(context).zza();
        zzcbkVar.zzb().put(context, new com.google.android.gms.internal.ads.zzcbj(zzcbkVar, zza));
        return zza;
    }
}
