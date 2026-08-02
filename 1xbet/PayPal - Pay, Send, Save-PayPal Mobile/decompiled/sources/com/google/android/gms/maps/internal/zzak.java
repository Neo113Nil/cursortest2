package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzak extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzal {
    public zzak() {
        super("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzag zzb = com.google.android.gms.internal.maps.zzaf.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzb);
        parcel2.writeNoException();
        return true;
    }
}
