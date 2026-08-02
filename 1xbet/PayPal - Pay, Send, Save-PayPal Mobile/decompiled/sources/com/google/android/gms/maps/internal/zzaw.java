package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzaw extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzax {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.maps.zzaj zzb = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzd(zzb);
        } else if (i == 2) {
            com.google.android.gms.internal.maps.zzaj zzb2 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzb(zzb2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.internal.maps.zzaj zzb3 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzb3);
        }
        parcel2.writeNoException();
        return true;
    }
}
