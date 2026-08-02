package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzab extends com.google.android.gms.maps.internal.zzc {
    private final com.google.android.gms.maps.GoogleMap.CancelableCallback zza;

    zzab(com.google.android.gms.maps.GoogleMap.CancelableCallback cancelableCallback) {
        this.zza = cancelableCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzb() {
        this.zza.onCancel();
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzc() {
        this.zza.onFinish();
    }
}
