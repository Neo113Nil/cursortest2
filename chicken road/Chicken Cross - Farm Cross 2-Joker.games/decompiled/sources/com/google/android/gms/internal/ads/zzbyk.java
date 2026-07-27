package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbyk implements com.google.android.gms.ads.internal.overlay.zzr {
    final /* synthetic */ zzbym zza;

    zzbyk(zzbym zzbymVar) {
        Objects.requireNonNull(zzbymVar);
        this.zza = zzbymVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is closed.");
        zzbym zzbymVar = this.zza;
        zzbymVar.zzb().onAdClosed(zzbymVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Opening AdMobCustomTabsAdapter overlay.");
        zzbym zzbymVar = this.zza;
        zzbymVar.zzb().onAdOpened(zzbymVar);
    }
}
