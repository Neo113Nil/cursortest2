package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbod extends com.google.android.gms.internal.ads.zzbnl {
    private final com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener zza;

    public zzbod(com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (zzbuVar == null || iObjectWrapper == null) {
            return;
        }
        com.google.android.gms.ads.admanager.AdManagerAdView adManagerAdView = new com.google.android.gms.ads.admanager.AdManagerAdView((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbuVar.zzw() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzw();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzk() : null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        try {
            if (zzbuVar.zzv() instanceof com.google.android.gms.internal.ads.zzbff) {
                com.google.android.gms.internal.ads.zzbff zzbffVar = (com.google.android.gms.internal.ads.zzbff) zzbuVar.zzv();
                adManagerAdView.setAppEventListener(zzbffVar != null ? zzbffVar.zzc() : null);
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzboc(this, adManagerAdView, zzbuVar));
    }
}
