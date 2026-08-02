package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzbi extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbj {
    public zzbi() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzar zzb = com.google.android.gms.internal.maps.zzaq.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzb);
        parcel2.writeNoException();
        return true;
    }
}
