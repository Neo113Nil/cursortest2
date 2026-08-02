package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzai extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzaj {
    public static com.google.android.gms.internal.maps.zzaj zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzaj ? (com.google.android.gms.internal.maps.zzaj) queryLocalInterface : new com.google.android.gms.internal.maps.zzah(iBinder);
    }
}
