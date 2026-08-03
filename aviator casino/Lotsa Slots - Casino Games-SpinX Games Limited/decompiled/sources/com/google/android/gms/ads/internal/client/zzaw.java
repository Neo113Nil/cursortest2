package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzaw {
    private final com.google.android.gms.ads.internal.client.zzk zza;
    private final com.google.android.gms.ads.internal.client.zzi zzb;
    private final com.google.android.gms.ads.internal.client.zzfc zzc;
    private final com.google.android.gms.internal.ads.zzbnx zzd;
    private final com.google.android.gms.internal.ads.zzbyy zze;
    private com.google.android.gms.internal.ads.zzcaa zzf;
    private final com.google.android.gms.ads.internal.client.zzl zzg;

    public zzaw(com.google.android.gms.ads.internal.client.zzk zzkVar, com.google.android.gms.ads.internal.client.zzi zziVar, com.google.android.gms.ads.internal.client.zzfc zzfcVar, com.google.android.gms.internal.ads.zzbnx zzbnxVar, com.google.android.gms.internal.ads.zzccu zzccuVar, com.google.android.gms.internal.ads.zzbyy zzbyyVar, com.google.android.gms.internal.ads.zzbny zzbnyVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfcVar;
        this.zzd = zzbnxVar;
        this.zze = zzbyyVar;
        this.zzg = zzlVar;
    }

    static /* synthetic */ void zzl(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        com.google.android.gms.ads.internal.client.zzay.zza().zzi(context, com.google.android.gms.ads.internal.client.zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zza(android.content.Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        return (com.google.android.gms.ads.internal.client.zzbu) new com.google.android.gms.ads.internal.client.zzam(this, context, zzrVar, str, zzbvcVar).zzd(context, false);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zzb(android.content.Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        return (com.google.android.gms.ads.internal.client.zzbu) new com.google.android.gms.ads.internal.client.zzan(this, context, zzrVar, str, zzbvcVar).zzd(context, false);
    }

    public final com.google.android.gms.ads.internal.client.zzbq zzc(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        return (com.google.android.gms.ads.internal.client.zzbq) new com.google.android.gms.ads.internal.client.zzap(this, context, str, zzbvcVar).zzd(context, false);
    }

    public final com.google.android.gms.ads.internal.client.zzch zzd(android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        return (com.google.android.gms.ads.internal.client.zzch) new com.google.android.gms.ads.internal.client.zzar(this, context, zzbvcVar).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbmi zze(android.content.Context context, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        return (com.google.android.gms.internal.ads.zzbmi) new com.google.android.gms.ads.internal.client.zzav(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzcci zzf(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        return (com.google.android.gms.internal.ads.zzcci) new com.google.android.gms.ads.internal.client.zzaa(this, context, str, zzbvcVar).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbzb zzg(android.app.Activity activity) {
        com.google.android.gms.ads.internal.client.zzac zzacVar = new com.google.android.gms.ads.internal.client.zzac(this, activity);
        android.content.Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (com.google.android.gms.internal.ads.zzbzb) zzacVar.zzd(activity, z);
    }

    public final com.google.android.gms.ads.internal.client.zzdt zzh(android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        return (com.google.android.gms.ads.internal.client.zzdt) new com.google.android.gms.ads.internal.client.zzae(this, context, zzbvcVar).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzcem zzi(android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        return (com.google.android.gms.internal.ads.zzcem) new com.google.android.gms.ads.internal.client.zzag(this, context, zzbvcVar).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbyu zzj(android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        return (com.google.android.gms.internal.ads.zzbyu) new com.google.android.gms.ads.internal.client.zzai(this, context, zzbvcVar).zzd(context, false);
    }

    public final com.google.android.gms.internal.ads.zzbqt zzk(android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar, com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        return (com.google.android.gms.internal.ads.zzbqt) new com.google.android.gms.ads.internal.client.zzak(this, context, zzbvcVar, onH5AdsEventListener).zzd(context, false);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzk zzm() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzi zzn() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfc zzo() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbnx zzp() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbyy zzq() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcaa zzr() {
        return this.zzf;
    }

    final /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzcaa zzcaaVar) {
        this.zzf = zzcaaVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzl zzt() {
        return this.zzg;
    }
}
