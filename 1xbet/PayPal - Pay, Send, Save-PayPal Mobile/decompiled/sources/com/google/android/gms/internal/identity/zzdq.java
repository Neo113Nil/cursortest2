package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdq extends com.google.android.gms.location.zzs {
    private com.google.android.gms.common.api.internal.ListenerHolder zza;

    zzdq(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    final void zzc(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        synchronized (this) {
            com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2 = this.zza;
            if (listenerHolder2 != listenerHolder) {
                listenerHolder2.clear();
                this.zza = listenerHolder;
            }
        }
    }

    @Override // com.google.android.gms.location.zzt
    public final void zzd(com.google.android.gms.location.DeviceOrientation deviceOrientation) {
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zza;
        }
        listenerHolder.notifyListener(new com.google.android.gms.internal.identity.zzdp(this, deviceOrientation));
    }

    final void zze() {
        synchronized (this) {
            this.zza.clear();
        }
    }
}
