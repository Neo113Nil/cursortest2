package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcbr extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzcbs {
    public zzcbr() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.ads.zzcbw zzcbwVar = (com.google.android.gms.internal.ads.zzcbw) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.internal.ads.zzcbw.CREATOR);
            com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
            zzb(zzcbwVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            com.google.android.gms.internal.ads.zzcbv zzcbvVar = null;
            com.google.android.gms.internal.ads.zzcbq zzcbqVar = null;
            if (i == 3) {
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcbvVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzcbv ? (com.google.android.gms.internal.ads.zzcbv) queryLocalInterface : new com.google.android.gms.internal.ads.zzcbt(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzd(zzcbvVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zze = zze();
                        parcel2.writeNoException();
                        int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                        parcel2.writeInt(zze ? 1 : 0);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        zzi(asInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        zzj(asInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        zzk(asInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        java.lang.String zzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(zzl);
                        break;
                    case 13:
                        java.lang.String readString = parcel.readString();
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        zzm(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzby zzb = com.google.android.gms.ads.internal.client.zzbx.zzb(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        zzn(zzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        android.os.Bundle zzo = zzo();
                        parcel2.writeNoException();
                        com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzo);
                        break;
                    case 16:
                        android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcbqVar = queryLocalInterface2 instanceof com.google.android.gms.internal.ads.zzcbq ? (com.google.android.gms.internal.ads.zzcbq) queryLocalInterface2 : new com.google.android.gms.internal.ads.zzcbq(readStrongBinder2);
                        }
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        zzu(zzcbqVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        zzp(asInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        java.lang.String readString2 = parcel.readString();
                        com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                        zzq(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        int i4 = com.google.android.gms.internal.ads.zzbeg.zza;
                        parcel2.writeInt(zzs ? 1 : 0);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdx zzt = zzt();
                        parcel2.writeNoException();
                        com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzt);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzr(zza);
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
