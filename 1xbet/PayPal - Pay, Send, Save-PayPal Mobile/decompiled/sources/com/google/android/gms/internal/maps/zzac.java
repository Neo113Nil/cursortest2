package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzac extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzad {
    public static com.google.android.gms.internal.maps.zzad zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzad ? (com.google.android.gms.internal.maps.zzad) queryLocalInterface : new com.google.android.gms.internal.maps.zzab(iBinder);
    }
}
