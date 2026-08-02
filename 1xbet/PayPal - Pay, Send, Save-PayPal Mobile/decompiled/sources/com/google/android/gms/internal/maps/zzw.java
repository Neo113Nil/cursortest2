package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzw extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzx {
    public static com.google.android.gms.internal.maps.zzx zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzx ? (com.google.android.gms.internal.maps.zzx) queryLocalInterface : new com.google.android.gms.internal.maps.zzv(iBinder);
    }
}
