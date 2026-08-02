package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdp implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ com.google.android.gms.location.DeviceOrientation zza;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.location.DeviceOrientationListener) obj).onDeviceOrientationChanged(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    zzdp(com.google.android.gms.internal.identity.zzdq zzdqVar, com.google.android.gms.location.DeviceOrientation deviceOrientation) {
        this.zza = deviceOrientation;
    }
}
