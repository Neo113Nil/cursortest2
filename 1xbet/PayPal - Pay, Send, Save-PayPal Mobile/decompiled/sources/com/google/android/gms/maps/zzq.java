package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzq extends com.google.android.gms.maps.internal.zzbv {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback zza;

    zzq(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        this.zza = snapshotReadyCallback;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzbw
    public final void zzb(android.graphics.Bitmap bitmap) throws android.os.RemoteException {
        this.zza.onSnapshotReady(bitmap);
    }

    @Override // com.google.android.gms.maps.internal.zzbw
    public final void zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        this.zza.onSnapshotReady((android.graphics.Bitmap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
