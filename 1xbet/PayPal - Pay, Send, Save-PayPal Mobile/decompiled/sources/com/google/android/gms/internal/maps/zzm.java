package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzm extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzn {
    public static com.google.android.gms.internal.maps.zzn zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzn ? (com.google.android.gms.internal.maps.zzn) queryLocalInterface : new com.google.android.gms.internal.maps.zzl(iBinder);
    }
}
