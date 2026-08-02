package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public abstract class zzas extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.auth.zzc.zzb(parcel);
                zzh(status);
                return true;
            case 2:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.auth.api.accounttransfer.zzw zzwVar = (com.google.android.gms.auth.api.accounttransfer.zzw) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR);
                com.google.android.gms.internal.auth.zzc.zzb(parcel);
                zzf(status2, zzwVar);
                return true;
            case 3:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.auth.api.accounttransfer.zzo zzoVar = (com.google.android.gms.auth.api.accounttransfer.zzo) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR);
                com.google.android.gms.internal.auth.zzc.zzb(parcel);
                zzg(status3, zzoVar);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                com.google.android.gms.common.api.Status status4 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.auth.zzc.zzb(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                com.google.android.gms.internal.auth.zzc.zzb(parcel);
                zzb(createByteArray);
                return true;
            case 7:
                com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData = (com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR);
                com.google.android.gms.internal.auth.zzc.zzb(parcel);
                zzc(deviceMetaData);
                return true;
            default:
                return false;
        }
    }
}
