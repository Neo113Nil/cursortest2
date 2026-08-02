package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdw implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ android.location.Location zza;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.location.LocationListener) obj).onLocationChanged(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    zzdw(com.google.android.gms.internal.identity.zzdy zzdyVar, android.location.Location location) {
        this.zza = location;
    }
}
