package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzaq extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzar {
    public static com.google.android.gms.internal.maps.zzar zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzar ? (com.google.android.gms.internal.maps.zzar) queryLocalInterface : new com.google.android.gms.internal.maps.zzap(iBinder);
    }
}
