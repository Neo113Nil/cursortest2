package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzaz implements com.google.android.gms.internal.identity.zzdr {
    private com.google.android.gms.common.api.internal.ListenerHolder zza;

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzb(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        synchronized (this) {
            com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2 = this.zza;
            if (listenerHolder2 != listenerHolder) {
                listenerHolder2.clear();
                this.zza = listenerHolder;
            }
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final com.google.android.gms.common.api.internal.ListenerHolder zza() {
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zza;
        }
        return listenerHolder;
    }

    zzaz(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }
}
