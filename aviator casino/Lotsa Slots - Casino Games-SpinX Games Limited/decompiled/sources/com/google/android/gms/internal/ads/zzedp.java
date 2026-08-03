package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzedp {
    private com.google.android.gms.ads.AdRequest zza;
    private com.google.android.gms.ads.nativead.NativeAdOptions zzb;
    private com.google.android.gms.ads.VideoOptions zzc;
    private com.google.android.gms.ads.AdSize zzd = com.google.android.gms.ads.AdSize.BANNER;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private boolean zzg = false;

    public zzedp() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        this.zza = new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build();
    }

    public final java.lang.String zza() {
        return this.zze;
    }

    public final java.lang.String zzb() {
        return this.zzf;
    }

    public final com.google.android.gms.ads.AdRequest zzc() {
        return this.zza;
    }

    public final com.google.android.gms.ads.AdSize zzd() {
        return this.zzd;
    }

    public final com.google.android.gms.ads.nativead.NativeAdOptions zze() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.VideoOptions zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final void zzh(java.lang.String str) {
        this.zze = str;
    }

    public final void zzi(java.lang.String str) {
        this.zzf = str;
    }

    public final void zzj(com.google.android.gms.ads.AdRequest adRequest) {
        this.zza = adRequest;
    }

    public final void zzk(com.google.android.gms.ads.AdSize adSize) {
        this.zzd = adSize;
    }

    public final void zzl(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
        this.zzb = nativeAdOptions;
    }

    public final void zzm(com.google.android.gms.ads.VideoOptions videoOptions) {
        this.zzc = videoOptions;
    }

    public final void zzn(boolean z) {
        this.zzg = z;
    }
}
