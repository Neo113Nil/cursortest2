package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzcg extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzch {
    public zzcg() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = null;
        com.google.android.gms.ads.internal.client.zzce zzceVar = null;
        switch (i) {
            case 1:
                java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.ads.internal.client.zzfp.CREATOR);
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzcbVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcb ? (com.google.android.gms.ads.internal.client.zzcb) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbz(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zze(createTypedArrayList, zzcbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                java.lang.String readString = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzf = zzf(readString);
                parcel2.writeNoException();
                parcel2.writeInt(zzf ? 1 : 0);
                return true;
            case 3:
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzcci zzg = zzg(readString2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzg);
                return true;
            case 4:
                java.lang.String readString3 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzh = zzh(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zzh ? 1 : 0);
                return true;
            case 5:
                java.lang.String readString4 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzbgj zzi = zzi(readString4);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzi);
                return true;
            case 6:
                java.lang.String readString5 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzj = zzj(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzj ? 1 : 0);
                return true;
            case 7:
                java.lang.String readString6 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzbu zzk = zzk(readString6);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzk);
                return true;
            case 8:
                com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                java.lang.String readString7 = parcel.readString();
                com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzfp.CREATOR);
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzceVar = queryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzce ? (com.google.android.gms.ads.internal.client.zzce) queryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzcc(readStrongBinder2);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzm = zzm(readString7, zzfpVar, zzceVar);
                parcel2.writeNoException();
                parcel2.writeInt(zzm ? 1 : 0);
                return true;
            case 10:
                int readInt = parcel.readInt();
                java.lang.String readString8 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzn = zzn(readInt, readString8);
                parcel2.writeNoException();
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                java.lang.String readString9 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzbu zzo = zzo(readString9);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzo);
                return true;
            case 12:
                java.lang.String readString10 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzbgj zzp = zzp(readString10);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzp);
                return true;
            case 13:
                java.lang.String readString11 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzcci zzq = zzq(readString11);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzq);
                return true;
            case 14:
                int readInt2 = parcel.readInt();
                java.lang.String readString12 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.ads.internal.client.zzfp zzr = zzr(readInt2, readString12);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzr);
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                android.os.Bundle zzs = zzs(readInt3);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zzd(parcel2, zzs);
                return true;
            case 16:
                int readInt4 = parcel.readInt();
                java.lang.String readString13 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                int zzt = zzt(readInt4, readString13);
                parcel2.writeNoException();
                parcel2.writeInt(zzt);
                return true;
            case 17:
                int readInt5 = parcel.readInt();
                java.lang.String readString14 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzu = zzu(readInt5, readString14);
                parcel2.writeNoException();
                parcel2.writeInt(zzu ? 1 : 0);
                return true;
            case 18:
                int readInt6 = parcel.readInt();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzv(readInt6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
