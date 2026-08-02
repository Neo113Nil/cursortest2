package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzds implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ com.google.android.gms.location.LocationResult zza;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.location.LocationCallback) obj).onLocationResult(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    zzds(com.google.android.gms.internal.identity.zzdv zzdvVar, com.google.android.gms.location.LocationResult locationResult) {
        this.zza = locationResult;
    }
}
