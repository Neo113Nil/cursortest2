package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbxm implements com.google.android.gms.ads.mediation.rtb.SignalCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbxe zza;

    zzbxm(com.google.android.gms.internal.ads.zzbxo zzbxoVar, com.google.android.gms.internal.ads.zzbxe zzbxeVar) {
        this.zza = zzbxeVar;
        java.util.Objects.requireNonNull(zzbxoVar);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(com.google.android.gms.ads.AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(java.lang.String str) {
        try {
            this.zza.zze(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
