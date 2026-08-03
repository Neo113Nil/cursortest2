package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcch extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzcci {
    public zzcch() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static com.google.android.gms.internal.ads.zzcci zzt(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzcci ? (com.google.android.gms.internal.ads.zzcci) queryLocalInterface : new com.google.android.gms.internal.ads.zzccg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzccp zzccpVar = null;
        com.google.android.gms.internal.ads.zzccp zzccpVar2 = null;
        com.google.android.gms.internal.ads.zzccq zzccqVar = null;
        com.google.android.gms.internal.ads.zzccl zzcclVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccpVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzccp ? (com.google.android.gms.internal.ads.zzccp) queryLocalInterface : new com.google.android.gms.internal.ads.zzccn(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzc(zzmVar, zzccpVar);
                parcel2.writeNoException();
                return true;
            case 2:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcclVar = queryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzccl ? (com.google.android.gms.internal.ads.zzccl) queryLocalInterface2 : new com.google.android.gms.internal.ads.zzccj(readStrongBinder2);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zze(zzcclVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzi = zzi();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzi ? 1 : 0);
                return true;
            case 4:
                java.lang.String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzb(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    android.os.IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzccqVar = queryLocalInterface3 instanceof com.google.android.gms.internal.ads.zzccq ? (com.google.android.gms.internal.ads.zzccq) queryLocalInterface3 : new com.google.android.gms.internal.ads.zzccq(readStrongBinder3);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzs(zzccqVar);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.internal.ads.zzccw zzccwVar = (com.google.android.gms.internal.ads.zzccw) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzccw.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(zzccwVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                android.os.Bundle zzg = zzg();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzg);
                return true;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzk(asInterface2, zza);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.internal.ads.zzccf zzl = zzl();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdx zzm = zzm();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zzb2 = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzo(zzb2);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    android.os.IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccpVar2 = queryLocalInterface4 instanceof com.google.android.gms.internal.ads.zzccp ? (com.google.android.gms.internal.ads.zzccp) queryLocalInterface4 : new com.google.android.gms.internal.ads.zzccn(readStrongBinder4);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzd(zzmVar2, zzccpVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzp(zza2);
                parcel2.writeNoException();
                return true;
            case 16:
                java.lang.String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 17:
                long zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(zzq);
                return true;
            case 18:
                long readLong = parcel.readLong();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzr(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
