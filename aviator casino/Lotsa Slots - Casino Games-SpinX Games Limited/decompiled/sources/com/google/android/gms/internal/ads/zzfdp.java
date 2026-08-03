package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdp implements com.google.android.gms.internal.ads.zzfck {
    private final java.util.concurrent.Executor zza;
    private final java.lang.String zzb;

    public zzfdp(com.google.android.gms.internal.ads.zzcev zzcevVar, java.util.concurrent.Executor executor, java.lang.String str, android.content.pm.PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzhbw.zza(this.zzb);
        com.google.android.gms.internal.ads.zzfdo zzfdoVar = com.google.android.gms.internal.ads.zzfdo.zza;
        java.util.concurrent.Executor executor = this.zza;
        return com.google.android.gms.internal.ads.zzhbw.zzh(com.google.android.gms.internal.ads.zzhbw.zzk(zza, zzfdoVar, executor), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfdn
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfdp.this.zzc((java.lang.Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 41;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Throwable th) {
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfdq(this.zzb));
    }
}
