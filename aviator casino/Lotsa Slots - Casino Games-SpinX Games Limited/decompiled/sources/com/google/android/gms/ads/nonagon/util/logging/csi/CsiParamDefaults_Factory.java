package com.google.android.gms.ads.nonagon.util.logging.csi;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class CsiParamDefaults_Factory implements com.google.android.gms.internal.ads.zzimu<com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults> {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;
    private final com.google.android.gms.internal.ads.zzind zze;

    private CsiParamDefaults_Factory(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
        this.zze = zzindVar5;
    }

    public static com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory create(com.google.android.gms.internal.ads.zzind<android.content.Context> zzindVar, com.google.android.gms.internal.ads.zzind<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> zzindVar2, com.google.android.gms.internal.ads.zzind<android.content.pm.PackageInfo> zzindVar3, com.google.android.gms.internal.ads.zzind<java.lang.String> zzindVar4, com.google.android.gms.internal.ads.zzind<com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager> zzindVar5) {
        return new com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5);
    }

    public static com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults newInstance(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, android.content.pm.PackageInfo packageInfo, java.lang.String str, com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager deviceTierManager) {
        return new com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults(context, versionInfoParcel, packageInfo, str, deviceTierManager);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults zzb() {
        return newInstance((android.content.Context) this.zza.zzb(), (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) this.zzb.zzb(), (android.content.pm.PackageInfo) this.zzc.zzb(), (java.lang.String) this.zzd.zzb(), (com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager) this.zze.zzb());
    }
}
