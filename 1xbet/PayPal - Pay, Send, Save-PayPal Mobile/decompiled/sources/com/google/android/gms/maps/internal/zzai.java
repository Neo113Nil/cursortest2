package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zzai extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.zzaj {
    zzai(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    @Override // com.google.android.gms.maps.internal.zzaj
    public final void zzd(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, location);
        zzc(2, zza);
    }
}
