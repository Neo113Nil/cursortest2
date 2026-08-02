package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzt extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzu {
    public static com.google.android.gms.internal.maps.zzu zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzu ? (com.google.android.gms.internal.maps.zzu) queryLocalInterface : new com.google.android.gms.internal.maps.zzs(iBinder);
    }
}
