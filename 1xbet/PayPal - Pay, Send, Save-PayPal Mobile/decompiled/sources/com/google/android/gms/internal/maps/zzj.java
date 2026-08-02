package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzj extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzk {
    public static com.google.android.gms.internal.maps.zzk zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzk ? (com.google.android.gms.internal.maps.zzk) queryLocalInterface : new com.google.android.gms.internal.maps.zzi(iBinder);
    }
}
