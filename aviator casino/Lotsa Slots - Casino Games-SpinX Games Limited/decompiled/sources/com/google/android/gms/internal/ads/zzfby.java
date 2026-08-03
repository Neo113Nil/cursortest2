package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfby implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final java.lang.String zzd;

    zzfby(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str) {
        this.zza = zzhcgVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfbx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzfby.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 35;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfbz zzc() {
        android.content.Context context = this.zzb;
        boolean isCallerInstantApp = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzH = com.google.android.gms.ads.internal.util.zzs.zzH(context);
        java.lang.String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzI = com.google.android.gms.ads.internal.util.zzs.zzI();
        com.google.android.gms.ads.internal.zzt.zzc();
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new com.google.android.gms.internal.ads.zzfbz(isCallerInstantApp, zzH, str, zzI, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID), com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
