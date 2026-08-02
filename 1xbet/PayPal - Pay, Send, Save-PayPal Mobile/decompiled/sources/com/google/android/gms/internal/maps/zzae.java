package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzae extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzag {
    zzae(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(1, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
