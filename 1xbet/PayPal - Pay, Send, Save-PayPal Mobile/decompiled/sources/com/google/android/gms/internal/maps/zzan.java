package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzan extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzao {
    public static com.google.android.gms.internal.maps.zzao zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return queryLocalInterface instanceof com.google.android.gms.internal.maps.zzao ? (com.google.android.gms.internal.maps.zzao) queryLocalInterface : new com.google.android.gms.internal.maps.zzam(iBinder);
    }
}
