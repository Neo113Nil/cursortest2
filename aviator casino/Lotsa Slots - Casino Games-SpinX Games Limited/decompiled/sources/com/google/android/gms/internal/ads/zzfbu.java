package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfbu implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzcdz zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final android.content.Context zzc;

    public zzfbu(com.google.android.gms.internal.ads.zzcdz zzcdzVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context) {
        this.zza = zzcdzVar;
        this.zzb = zzhcgVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zzb.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfbu.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 34;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfbv zzc() {
        com.google.android.gms.internal.ads.zzcdz zzcdzVar = this.zza;
        android.content.Context context = this.zzc;
        if (!zzcdzVar.zza(context)) {
            return new com.google.android.gms.internal.ads.zzfbv(null, null, null, null, null);
        }
        java.lang.String zzh = zzcdzVar.zzh(context);
        java.lang.String str = zzh == null ? "" : zzh;
        java.lang.String zzi = zzcdzVar.zzi(context);
        java.lang.String str2 = zzi == null ? "" : zzi;
        java.lang.String zzj = zzcdzVar.zzj(context);
        java.lang.String str3 = zzj == null ? "" : zzj;
        java.lang.String str4 = true != zzcdzVar.zza(context) ? null : "fa";
        return new com.google.android.gms.internal.ads.zzfbv(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaV) : null);
    }
}
