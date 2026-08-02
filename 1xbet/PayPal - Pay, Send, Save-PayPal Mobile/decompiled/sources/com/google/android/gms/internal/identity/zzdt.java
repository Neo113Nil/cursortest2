package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdt implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ com.google.android.gms.location.LocationAvailability zza;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.location.LocationCallback) obj).onLocationAvailability(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    zzdt(com.google.android.gms.internal.identity.zzdv zzdvVar, com.google.android.gms.location.LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }
}
