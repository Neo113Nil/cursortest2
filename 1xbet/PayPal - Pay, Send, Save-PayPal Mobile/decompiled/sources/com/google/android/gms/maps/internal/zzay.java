package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzay extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzaz {
    public zzay() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzb = zzb();
        parcel2.writeNoException();
        int i3 = com.google.android.gms.internal.maps.zzc.zza;
        parcel2.writeInt(zzb ? 1 : 0);
        return true;
    }
}
