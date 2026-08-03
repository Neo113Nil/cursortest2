package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbvw implements com.google.android.gms.ads.mediation.InitializationCompleteCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrt zza;

    zzbvw(com.google.android.gms.internal.ads.zzbwd zzbwdVar, com.google.android.gms.internal.ads.zzbrt zzbrtVar) {
        this.zza = zzbrtVar;
        java.util.Objects.requireNonNull(zzbwdVar);
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(java.lang.String str) {
        try {
            this.zza.zzf(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
