package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbdc extends com.google.android.gms.internal.ads.zzbdf {
    private final android.view.View zzh;

    public zzbdc(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, android.view.View view) {
        super(zzbbsVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", zzaxmVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        android.view.View view = this.zzh;
        if (view != null) {
            java.lang.Boolean bool = (java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzen);
            java.lang.Boolean bool2 = (java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzms);
            com.google.android.gms.internal.ads.zzbbw zzbbwVar = new com.google.android.gms.internal.ads.zzbbw((java.lang.String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            com.google.android.gms.internal.ads.zzayk zza = com.google.android.gms.internal.ads.zzayl.zza();
            zza.zzb(zzbbwVar.zza.longValue());
            zza.zzc(zzbbwVar.zzb.longValue());
            zza.zzd(zzbbwVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zza(zzbbwVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zze(zzbbwVar.zzd.longValue());
            }
            this.zzd.zzM((com.google.android.gms.internal.ads.zzayl) zza.zzbu());
        }
    }
}
