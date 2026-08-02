package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzab {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzb();
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.internal.maps.zzaa zzb = com.google.android.gms.internal.maps.zzz.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
