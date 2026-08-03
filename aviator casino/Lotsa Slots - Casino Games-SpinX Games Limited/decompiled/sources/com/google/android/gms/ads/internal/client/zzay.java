package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzay {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.ads.internal.client.zzay zzb = new com.google.android.gms.ads.internal.client.zzay();
    private final com.google.android.gms.ads.internal.util.client.zzf zzc;
    private final com.google.android.gms.ads.internal.client.zzaw zzd;
    private boolean zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final java.util.Random zzg;
    private final java.lang.String zzh;

    protected zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        com.google.android.gms.ads.internal.client.zzaw zzawVar = new com.google.android.gms.ads.internal.client.zzaw(new com.google.android.gms.ads.internal.client.zzk(), new com.google.android.gms.ads.internal.client.zzi(), new com.google.android.gms.ads.internal.client.zzfc(), new com.google.android.gms.internal.ads.zzbnx(), new com.google.android.gms.internal.ads.zzccu(), new com.google.android.gms.internal.ads.zzbyy(), new com.google.android.gms.internal.ads.zzbny(), new com.google.android.gms.ads.internal.client.zzl());
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(0, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, true);
        java.util.Random random = new java.util.Random();
        java.lang.String zzj = com.google.android.gms.ads.internal.util.client.zzf.zzj();
        this.zzc = zzfVar;
        this.zzd = zzawVar;
        this.zze = false;
        this.zzf = versionInfoParcel;
        this.zzg = random;
        this.zzh = zzj;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zza() {
        return zzb.zzc;
    }

    public static com.google.android.gms.ads.internal.client.zzaw zzb() {
        return zzb.zzd;
    }

    public static void zzc() {
        zzb.zze = false;
    }

    public static void zzd() {
        zzb.zze = true;
    }

    public static boolean zze() {
        return zzb.zze;
    }

    public static java.lang.String zzf() {
        return zzb.zzh;
    }

    public static com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg() {
        return zzb.zzf;
    }

    public static java.util.Random zzh() {
        return zzb.zzg;
    }
}
