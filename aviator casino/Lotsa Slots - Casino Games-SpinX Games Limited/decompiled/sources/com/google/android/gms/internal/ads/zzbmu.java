package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbmu extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbmv {
    public zzbmu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static com.google.android.gms.internal.ads.zzbmv zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmv ? (com.google.android.gms.internal.ads.zzbmv) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                java.lang.String readString = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                java.lang.String zze = zze(readString);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 2:
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                com.google.android.gms.internal.ads.zzbme zzf = zzf(readString2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzf);
                return true;
            case 3:
                java.util.List<java.lang.String> zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(zzg);
                return true;
            case 4:
                java.lang.String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 5:
                java.lang.String readString3 = parcel.readString();
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzi(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea zzk = zzk();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.IObjectWrapper zzm = zzm();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzm);
                return true;
            case 10:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzn = zzn(asInterface);
                parcel2.writeNoException();
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, null);
                return true;
            case 12:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 13:
                boolean zzp = zzp();
                parcel2.writeNoException();
                int i4 = com.google.android.gms.internal.ads.zzbeg.zza;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                zzq(asInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                com.google.android.gms.internal.ads.zzbmb zzs = zzs();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.zzbeg.zze(parcel2, zzs);
                return true;
            case 17:
                com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.zzbeg.zzh(parcel);
                boolean zzt = zzt(asInterface3);
                parcel2.writeNoException();
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
