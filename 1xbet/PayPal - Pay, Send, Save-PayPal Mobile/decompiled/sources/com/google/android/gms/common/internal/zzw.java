package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public abstract class zzw extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzx {
    public zzw() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static com.google.android.gms.common.internal.zzx zzf(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof com.google.android.gms.common.internal.zzx ? (com.google.android.gms.common.internal.zzx) queryLocalInterface : new com.google.android.gms.common.internal.zzv(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper zzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zze(parcel2, zzd);
        } else {
            if (i != 2) {
                return false;
            }
            int zze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(zze);
        }
        return true;
    }
}
