package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzav extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzaw {
    public static com.google.android.gms.internal.maps.zzaw zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzaw ? (com.google.android.gms.internal.maps.zzaw) queryLocalInterface : new com.google.android.gms.internal.maps.zzau(iBinder);
    }
}
