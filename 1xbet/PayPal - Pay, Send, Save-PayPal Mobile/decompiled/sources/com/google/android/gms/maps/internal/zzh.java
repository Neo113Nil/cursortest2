package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzh extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzi {
    public zzh() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.maps.zzaj zzb = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            com.google.android.gms.dynamic.IObjectWrapper zzc = zzc(zzb);
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zzg(parcel2, zzc);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.internal.maps.zzaj zzb2 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            com.google.android.gms.dynamic.IObjectWrapper zzb3 = zzb(zzb2);
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zzg(parcel2, zzb3);
        }
        return true;
    }
}
