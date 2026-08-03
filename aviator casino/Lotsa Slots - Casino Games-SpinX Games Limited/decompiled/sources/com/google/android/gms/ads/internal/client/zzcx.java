package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class zzcx extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.ads.internal.client.zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzdk zzdiVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzf(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                java.lang.String readString = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzg(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzh(zza);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(asInterface, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                java.lang.String readString3 = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzj(readString3, asInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(zzk);
                return true;
            case 8:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 9:
                java.lang.String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 10:
                java.lang.String readString4 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzn(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.internal.ads.zzbvc zzf = com.google.android.gms.internal.ads.zzbvb.zzf(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzo(zzf);
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.gms.internal.ads.zzbrw zzc = com.google.android.gms.internal.ads.zzbrv.zzc(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzp(zzc);
                parcel2.writeNoException();
                return true;
            case 13:
                java.util.List zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzq);
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzfr zzfrVar = (com.google.android.gms.ads.internal.client.zzfr) com.google.android.gms.internal.ads.zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zzfr.CREATOR);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzr(zzfrVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdiVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdiVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdk ? (com.google.android.gms.ads.internal.client.zzdk) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzdi(readStrongBinder);
                }
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzt(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(parcel);
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzu(zza2);
                parcel2.writeNoException();
                return true;
            case 18:
                java.lang.String readString5 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzv(readString5);
                parcel2.writeNoException();
                return true;
            case 19:
                zzw();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
